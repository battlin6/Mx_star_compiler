// Generated from D:/Code/Compiler/mynext2/src\MXgrammar.g4 by ANTLR 4.8
package Semantic.ParserAndLexer;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MXgrammarLexer extends Lexer {
    static {
        RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
            T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, T__14 = 15, T__15 = 16, T__16 = 17,
            T__17 = 18, T__18 = 19, T__19 = 20, T__20 = 21, T__21 = 22, T__22 = 23, T__23 = 24,
            T__24 = 25, T__25 = 26, T__26 = 27, T__27 = 28, T__28 = 29, T__29 = 30, T__30 = 31,
            T__31 = 32, Int_constant = 33, Bool_constant = 34, String_constant = 35, INT = 36,
            BOOL = 37, STRING = 38, NULL = 39, VOID = 40, TRUE = 41, FALSE = 42, IF = 43, ELSE = 44,
            FOR = 45, WHILE = 46, BREAK = 47, CONTINUE = 48, RETURN = 49, NEW = 50, CLASS = 51,
            THIS = 52, ID = 53, WS = 54, BlockComment = 55, LineComment = 56;
    public static String[] channelNames = {
            "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    };

    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

    private static String[] makeRuleNames() {
        return new String[]{
                "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8",
                "T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16",
                "T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24",
                "T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "Int_constant",
                "Bool_constant", "String_constant", "ESC", "INT", "BOOL", "STRING", "NULL",
                "VOID", "TRUE", "FALSE", "IF", "ELSE", "FOR", "WHILE", "BREAK", "CONTINUE",
                "RETURN", "NEW", "CLASS", "THIS", "ID", "WS", "BlockComment", "LineComment"
        };
    }

    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "';'", "'{'", "'}'", "'('", "','", "')'", "'['", "']'", "'='",
                "'++'", "'--'", "'.'", "'+'", "'-'", "'!'", "'~'", "'*'", "'/'", "'%'",
                "'<<'", "'>>'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'&'",
                "'^'", "'|'", "'&&'", "'||'", null, null, null, "'int'", "'bool'", "'string'",
                "'null'", "'void'", "'true'", "'false'", "'if'", "'else'", "'for'", "'while'",
                "'break'", "'continue'", "'return'", "'new'", "'class'", "'this'"
        };
    }

    private static final String[] _LITERAL_NAMES = makeLiteralNames();

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, "Int_constant",
                "Bool_constant", "String_constant", "INT", "BOOL", "STRING", "NULL",
                "VOID", "TRUE", "FALSE", "IF", "ELSE", "FOR", "WHILE", "BREAK", "CONTINUE",
                "RETURN", "NEW", "CLASS", "THIS", "ID", "WS", "BlockComment", "LineComment"
        };
    }

    private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;

    static {
        tokenNames = new String[_SYMBOLIC_NAMES.length];
        for (int i = 0; i < tokenNames.length; i++) {
            tokenNames[i] = VOCABULARY.getLiteralName(i);
            if (tokenNames[i] == null) {
                tokenNames[i] = VOCABULARY.getSymbolicName(i);
            }

            if (tokenNames[i] == null) {
                tokenNames[i] = "<INVALID>";
            }
        }
    }

    @Override
    @Deprecated
    public String[] getTokenNames() {
        return tokenNames;
    }

    @Override

    public Vocabulary getVocabulary() {
        return VOCABULARY;
    }


    public MXgrammarLexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @Override
    public String getGrammarFileName() {
        return "MXgrammar.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public String[] getChannelNames() {
        return channelNames;
    }

    @Override
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2:\u0162\b\1\4\2\t" +
                    "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
                    "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4" +
                    ",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t" +
                    "\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\3\3\3\3" +
                    "\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13" +
                    "\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22" +
                    "\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30" +
                    "\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35" +
                    "\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\7\"\u00c3\n\"\f\"\16" +
                    "\"\u00c6\13\"\5\"\u00c8\n\"\3#\3#\5#\u00cc\n#\3$\3$\3$\7$\u00d1\n$\f$" +
                    "\16$\u00d4\13$\3$\3$\3%\3%\3%\3%\3%\3%\5%\u00de\n%\3&\3&\3&\3&\3\'\3\'" +
                    "\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+" +
                    "\3+\3+\3+\3,\3,\3,\3,\3,\3,\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3\60\3" +
                    "\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3" +
                    "\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3" +
                    "\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3" +
                    "\67\3\67\7\67\u013e\n\67\f\67\16\67\u0141\13\67\38\68\u0144\n8\r8\168" +
                    "\u0145\38\38\39\39\39\39\79\u014e\n9\f9\169\u0151\139\39\39\39\39\39\3" +
                    ":\3:\3:\3:\7:\u015c\n:\f:\16:\u015f\13:\3:\3:\4\u00d2\u014f\2;\3\3\5\4" +
                    "\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22" +
                    "#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C" +
                    "#E$G%I\2K&M\'O(Q)S*U+W,Y-[.]/_\60a\61c\62e\63g\64i\65k\66m\67o8q9s:\3" +
                    "\2\b\3\2\63;\3\2\62;\4\2C\\c|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\4\2\f" +
                    "\f\17\17\2\u016b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13" +
                    "\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2" +
                    "\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2" +
                    "!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3" +
                    "\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2" +
                    "\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E" +
                    "\3\2\2\2\2G\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2" +
                    "\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2" +
                    "\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m" +
                    "\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\3u\3\2\2\2\5w\3\2\2\2\7y\3\2" +
                    "\2\2\t{\3\2\2\2\13}\3\2\2\2\r\177\3\2\2\2\17\u0081\3\2\2\2\21\u0083\3" +
                    "\2\2\2\23\u0085\3\2\2\2\25\u0087\3\2\2\2\27\u008a\3\2\2\2\31\u008d\3\2" +
                    "\2\2\33\u008f\3\2\2\2\35\u0091\3\2\2\2\37\u0093\3\2\2\2!\u0095\3\2\2\2" +
                    "#\u0097\3\2\2\2%\u0099\3\2\2\2\'\u009b\3\2\2\2)\u009d\3\2\2\2+\u00a0\3" +
                    "\2\2\2-\u00a3\3\2\2\2/\u00a5\3\2\2\2\61\u00a7\3\2\2\2\63\u00aa\3\2\2\2" +
                    "\65\u00ad\3\2\2\2\67\u00b0\3\2\2\29\u00b3\3\2\2\2;\u00b5\3\2\2\2=\u00b7" +
                    "\3\2\2\2?\u00b9\3\2\2\2A\u00bc\3\2\2\2C\u00c7\3\2\2\2E\u00cb\3\2\2\2G" +
                    "\u00cd\3\2\2\2I\u00dd\3\2\2\2K\u00df\3\2\2\2M\u00e3\3\2\2\2O\u00e8\3\2" +
                    "\2\2Q\u00ef\3\2\2\2S\u00f4\3\2\2\2U\u00f9\3\2\2\2W\u00fe\3\2\2\2Y\u0104" +
                    "\3\2\2\2[\u0107\3\2\2\2]\u010c\3\2\2\2_\u0110\3\2\2\2a\u0116\3\2\2\2c" +
                    "\u011c\3\2\2\2e\u0125\3\2\2\2g\u012c\3\2\2\2i\u0130\3\2\2\2k\u0136\3\2" +
                    "\2\2m\u013b\3\2\2\2o\u0143\3\2\2\2q\u0149\3\2\2\2s\u0157\3\2\2\2uv\7=" +
                    "\2\2v\4\3\2\2\2wx\7}\2\2x\6\3\2\2\2yz\7\177\2\2z\b\3\2\2\2{|\7*\2\2|\n" +
                    "\3\2\2\2}~\7.\2\2~\f\3\2\2\2\177\u0080\7+\2\2\u0080\16\3\2\2\2\u0081\u0082" +
                    "\7]\2\2\u0082\20\3\2\2\2\u0083\u0084\7_\2\2\u0084\22\3\2\2\2\u0085\u0086" +
                    "\7?\2\2\u0086\24\3\2\2\2\u0087\u0088\7-\2\2\u0088\u0089\7-\2\2\u0089\26" +
                    "\3\2\2\2\u008a\u008b\7/\2\2\u008b\u008c\7/\2\2\u008c\30\3\2\2\2\u008d" +
                    "\u008e\7\60\2\2\u008e\32\3\2\2\2\u008f\u0090\7-\2\2\u0090\34\3\2\2\2\u0091" +
                    "\u0092\7/\2\2\u0092\36\3\2\2\2\u0093\u0094\7#\2\2\u0094 \3\2\2\2\u0095" +
                    "\u0096\7\u0080\2\2\u0096\"\3\2\2\2\u0097\u0098\7,\2\2\u0098$\3\2\2\2\u0099" +
                    "\u009a\7\61\2\2\u009a&\3\2\2\2\u009b\u009c\7\'\2\2\u009c(\3\2\2\2\u009d" +
                    "\u009e\7>\2\2\u009e\u009f\7>\2\2\u009f*\3\2\2\2\u00a0\u00a1\7@\2\2\u00a1" +
                    "\u00a2\7@\2\2\u00a2,\3\2\2\2\u00a3\u00a4\7>\2\2\u00a4.\3\2\2\2\u00a5\u00a6" +
                    "\7@\2\2\u00a6\60\3\2\2\2\u00a7\u00a8\7>\2\2\u00a8\u00a9\7?\2\2\u00a9\62" +
                    "\3\2\2\2\u00aa\u00ab\7@\2\2\u00ab\u00ac\7?\2\2\u00ac\64\3\2\2\2\u00ad" +
                    "\u00ae\7?\2\2\u00ae\u00af\7?\2\2\u00af\66\3\2\2\2\u00b0\u00b1\7#\2\2\u00b1" +
                    "\u00b2\7?\2\2\u00b28\3\2\2\2\u00b3\u00b4\7(\2\2\u00b4:\3\2\2\2\u00b5\u00b6" +
                    "\7`\2\2\u00b6<\3\2\2\2\u00b7\u00b8\7~\2\2\u00b8>\3\2\2\2\u00b9\u00ba\7" +
                    "(\2\2\u00ba\u00bb\7(\2\2\u00bb@\3\2\2\2\u00bc\u00bd\7~\2\2\u00bd\u00be" +
                    "\7~\2\2\u00beB\3\2\2\2\u00bf\u00c8\7\62\2\2\u00c0\u00c4\t\2\2\2\u00c1" +
                    "\u00c3\t\3\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2" +
                    "\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7" +
                    "\u00bf\3\2\2\2\u00c7\u00c0\3\2\2\2\u00c8D\3\2\2\2\u00c9\u00cc\5U+\2\u00ca" +
                    "\u00cc\5W,\2\u00cb\u00c9\3\2\2\2\u00cb\u00ca\3\2\2\2\u00ccF\3\2\2\2\u00cd" +
                    "\u00d2\7$\2\2\u00ce\u00d1\5I%\2\u00cf\u00d1\13\2\2\2\u00d0\u00ce\3\2\2" +
                    "\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d2\u00d0" +
                    "\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\7$\2\2\u00d6" +
                    "H\3\2\2\2\u00d7\u00d8\7^\2\2\u00d8\u00de\7$\2\2\u00d9\u00da\7^\2\2\u00da" +
                    "\u00de\7p\2\2\u00db\u00dc\7^\2\2\u00dc\u00de\7^\2\2\u00dd\u00d7\3\2\2" +
                    "\2\u00dd\u00d9\3\2\2\2\u00dd\u00db\3\2\2\2\u00deJ\3\2\2\2\u00df\u00e0" +
                    "\7k\2\2\u00e0\u00e1\7p\2\2\u00e1\u00e2\7v\2\2\u00e2L\3\2\2\2\u00e3\u00e4" +
                    "\7d\2\2\u00e4\u00e5\7q\2\2\u00e5\u00e6\7q\2\2\u00e6\u00e7\7n\2\2\u00e7" +
                    "N\3\2\2\2\u00e8\u00e9\7u\2\2\u00e9\u00ea\7v\2\2\u00ea\u00eb\7t\2\2\u00eb" +
                    "\u00ec\7k\2\2\u00ec\u00ed\7p\2\2\u00ed\u00ee\7i\2\2\u00eeP\3\2\2\2\u00ef" +
                    "\u00f0\7p\2\2\u00f0\u00f1\7w\2\2\u00f1\u00f2\7n\2\2\u00f2\u00f3\7n\2\2" +
                    "\u00f3R\3\2\2\2\u00f4\u00f5\7x\2\2\u00f5\u00f6\7q\2\2\u00f6\u00f7\7k\2" +
                    "\2\u00f7\u00f8\7f\2\2\u00f8T\3\2\2\2\u00f9\u00fa\7v\2\2\u00fa\u00fb\7" +
                    "t\2\2\u00fb\u00fc\7w\2\2\u00fc\u00fd\7g\2\2\u00fdV\3\2\2\2\u00fe\u00ff" +
                    "\7h\2\2\u00ff\u0100\7c\2\2\u0100\u0101\7n\2\2\u0101\u0102\7u\2\2\u0102" +
                    "\u0103\7g\2\2\u0103X\3\2\2\2\u0104\u0105\7k\2\2\u0105\u0106\7h\2\2\u0106" +
                    "Z\3\2\2\2\u0107\u0108\7g\2\2\u0108\u0109\7n\2\2\u0109\u010a\7u\2\2\u010a" +
                    "\u010b\7g\2\2\u010b\\\3\2\2\2\u010c\u010d\7h\2\2\u010d\u010e\7q\2\2\u010e" +
                    "\u010f\7t\2\2\u010f^\3\2\2\2\u0110\u0111\7y\2\2\u0111\u0112\7j\2\2\u0112" +
                    "\u0113\7k\2\2\u0113\u0114\7n\2\2\u0114\u0115\7g\2\2\u0115`\3\2\2\2\u0116" +
                    "\u0117\7d\2\2\u0117\u0118\7t\2\2\u0118\u0119\7g\2\2\u0119\u011a\7c\2\2" +
                    "\u011a\u011b\7m\2\2\u011bb\3\2\2\2\u011c\u011d\7e\2\2\u011d\u011e\7q\2" +
                    "\2\u011e\u011f\7p\2\2\u011f\u0120\7v\2\2\u0120\u0121\7k\2\2\u0121\u0122" +
                    "\7p\2\2\u0122\u0123\7w\2\2\u0123\u0124\7g\2\2\u0124d\3\2\2\2\u0125\u0126" +
                    "\7t\2\2\u0126\u0127\7g\2\2\u0127\u0128\7v\2\2\u0128\u0129\7w\2\2\u0129" +
                    "\u012a\7t\2\2\u012a\u012b\7p\2\2\u012bf\3\2\2\2\u012c\u012d\7p\2\2\u012d" +
                    "\u012e\7g\2\2\u012e\u012f\7y\2\2\u012fh\3\2\2\2\u0130\u0131\7e\2\2\u0131" +
                    "\u0132\7n\2\2\u0132\u0133\7c\2\2\u0133\u0134\7u\2\2\u0134\u0135\7u\2\2" +
                    "\u0135j\3\2\2\2\u0136\u0137\7v\2\2\u0137\u0138\7j\2\2\u0138\u0139\7k\2" +
                    "\2\u0139\u013a\7u\2\2\u013al\3\2\2\2\u013b\u013f\t\4\2\2\u013c\u013e\t" +
                    "\5\2\2\u013d\u013c\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f" +
                    "\u0140\3\2\2\2\u0140n\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0144\t\6\2\2" +
                    "\u0143\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146" +
                    "\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\b8\2\2\u0148p\3\2\2\2\u0149\u014a" +
                    "\7\61\2\2\u014a\u014b\7,\2\2\u014b\u014f\3\2\2\2\u014c\u014e\13\2\2\2" +
                    "\u014d\u014c\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u0150\3\2\2\2\u014f\u014d" +
                    "\3\2\2\2\u0150\u0152\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0153\7,\2\2\u0153" +
                    "\u0154\7\61\2\2\u0154\u0155\3\2\2\2\u0155\u0156\b9\2\2\u0156r\3\2\2\2" +
                    "\u0157\u0158\7\61\2\2\u0158\u0159\7\61\2\2\u0159\u015d\3\2\2\2\u015a\u015c" +
                    "\n\7\2\2\u015b\u015a\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015d" +
                    "\u015e\3\2\2\2\u015e\u0160\3\2\2\2\u015f\u015d\3\2\2\2\u0160\u0161\b:" +
                    "\2\2\u0161t\3\2\2\2\r\2\u00c4\u00c7\u00cb\u00d0\u00d2\u00dd\u013f\u0145" +
                    "\u014f\u015d\3\b\2\2";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}