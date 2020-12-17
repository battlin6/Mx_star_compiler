grammar Mx_star;

program: 'int main()' suite EOF;

//var
varList
    : var (',' var)*
    ;
var
    : Identifier ('=' expression)?
    ;

//param
parameterList
    : parameter (',' parameter)*
    ;
parameter
    : type Identifier
    ;

//type
type
    : type '[' ']'
    | Bool
    | Int
    | String
    | Identifier
    ;

//definition
def
    : varDef
    | classDef
    | funcDef
    ;

varDef
    : type varList ';'
    ;

classDef
    : Class Identifier
      '{'
      (varDef | funcDef | Identifier '(' parameterList? ')' suite)*
      '}'
      ';'
     ;


funcDef
    : (type| Void) Identifier '(' ( parameterList)? ')' suite
    ;

suite : '{' statement* '}';

statement
    : suite                                                 #blockStmt
    | varDef                                                #vardefStmt
    | If '(' expression ')' trueStmt=statement 
        (Else falseStmt=statement)?                         #ifStmt
    | While '(' expression ')' statement                    #whileStmt
    | For '(' init = expression? ';'
        cond = expression? ';'
        step = expression? ')'
        statement                                           #forStmt
    | Return expression? ';'                                #returnStmt
    | expression ';'                                        #pureExprStmt
    | ';'                                                   #emptyStmt
    ;

expression
    : primary                                               #atomExpr
    | expression op=('+' | '-') expression                  #binaryExpr
    | expression op=('==' | '!=' ) expression               #binaryExpr
    | <assoc=right> expression '=' expression               #assignExpr
    ;

primary
    : '(' expression ')'
    | Identifier 
    | literal 
    ;

literal
    : DecimalInteger
    ;

/*
Int : 'int';
If : 'if';
Else : 'else';
Return : 'return';

LeftParen : '(';
RightParen : ')';
LeftBracket : '[';
RightBracket : ']';
LeftBrace : '{';
RightBrace : '}';

Less : '<';
LessEqual : '<=';
Greater : '>';
GreaterEqual : '>=';
LeftShift : '<<';
RightShift : '>>';

Plus : '+';
Minus : '-';

And : '&';
Or : '|';
AndAnd : '&&';
OrOr : '||';
Caret : '^';
Not : '!';
Tilde : '~';

Question : '?';
Colon : ':';
Semi : ';';
Comma : ',';

Assign : '=';
Equal : '==';
NotEqual : '!=';
*/

//const
DecimalInteger
    : [1-9] [0-9]*
    | '0'
    ;

Stringconst
    : '"'
    (~["\\\r\n] | '\\' ["n\\])*
      '"'
    ;

Boolconst
    : 'true'
    | 'false'
    ;



//whitespace
Whitespace
    :   [ \t]+
        -> skip
    ;

//newline
Newline
    :   (   '\r' '\n'?
        |   '\n'
        )
        -> skip
    ;

//comment
BlockComment
    :   '/*' .*? '*/'
        -> skip
    ;
LineComment
    :   '//' ~[\r\n]*
        -> skip
    ;

//identifier
Identifier
    : [a-zA-Z] [a-zA-Z_0-9]*
    ;


//reserved keyword
Bool: 'bool';
Int: 'int';
String: 'string';
Void: 'void';
If: 'if';
Else: 'else';
For: 'for';
While: 'while';
Break: 'break';
Continue: 'continue';
Return: 'return';
New: 'new';
Class: 'class';
This: 'this';
//