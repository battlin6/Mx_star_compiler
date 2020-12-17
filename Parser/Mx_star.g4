grammar Mx_star;

program: def*;

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

//suite
suite : '{' statement* '}';

//stmt
statement
    : varDef                                                #vardefStmt
    | If '(' expression ')' trueStmt=statement
        (Else falseStmt=statement)?                         #ifStmt
    | While '(' expression ')' statement                    #whileStmt
    | For '(' init = expression? ';'
        cond = expression? ';'
        step = expression? ')'
        statement                                           #forStmt
    | Return expression? ';'                                #returnStmt
    | Break ';'                                             #breakStmt
    | Continue ';'                                          #continueStmt
    | expression ';'                                        #exprStmt
    | suite                                                 #suiteStmt
    | ';'                                                   #emptyStmt
    ;

//expr
// <assoc=right> combine from right
expression
        : Identifier												        #identifierExpr
    	| This													            #thisExpr
    	| constant												            #constExpr
    	| '(' expression ')'											    #parenExpr
    	| expression '.' Identifier									        #memberExpr
    	| array = expression '[' cnt = expression ']'						#arrayExpr
    	| expression '(' (expression (',' expression)*)? ')'		        #funcExpr
    	| <assoc = right> New creator							            #newExpr
    	| expression op = ('++' | '--')								        #postfixExpr
    	| <assoc = right> op = ('++' | '--') expression				        #prefixExpr
    	| <assoc = right> op = ('+' | '-') expression					    #prefixExpr
    	| <assoc = right> op = ('~' | '!') expression					    #prefixExpr
    	| left = expression bop = ('*' | '/' | '%') right = expression			#binaryExpr
    	| left = expression bop = ('+' | '-') right = expression				#binaryExpr
    	| left = expression bop = ('>>' | '<<') right = expression				#binaryExpr
    	| left = expression bop = ('<' | '>' | '<=' | '>=') right = expression	#binaryExpr
    	| left = expression bop = ('!=' | '==') right = expression				#binaryExpr
    	| left = expression bop = '&' right = expression						#binaryExpr
    	| left = expression bop = '^' right = expression						#binaryExpr
    	| left = expression bop = '|' right = expression						#binaryExpr
    	| left = expression bop = '&&' right = expression						#binaryExpr
    	| left = expression bop = '||' right = expression						#binaryExpr
    	| <assoc = right> left = expression bop = '=' right = expression		#binaryExpr
    	;

//creator
creator
    : (Bool | Int | String | Identifier) ('[' expression ']')* ('[' ']')+ ('[' expression ']')+	    #errorCreator
    | (Bool | Int | String | Identifier) ('[' expression ']')+ ('[' ']')*					        #arrayCreator
    | (Bool | Int | String | Identifier) ('(' ')')?								                    #nonArrayCreator;

//const
constant
    : Boolconst
    | DecimalInteger
    | Stringconst
    | Nullconst
    ;

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
Nullconst
    : 'null'
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