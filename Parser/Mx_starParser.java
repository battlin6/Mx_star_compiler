// Generated from D:/Project/Clion Project/Mx_star_compiler/Parser\Mx_star.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Mx_starParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, DecimalInteger=33, Stringconst=34, Boolconst=35, Nullconst=36, 
		Whitespace=37, Newline=38, BlockComment=39, LineComment=40, Identifier=41, 
		Bool=42, Int=43, String=44, Void=45, If=46, Else=47, For=48, While=49, 
		Break=50, Continue=51, Return=52, New=53, Class=54, This=55;
	public static final int
		RULE_program = 0, RULE_varList = 1, RULE_var = 2, RULE_parameterList = 3, 
		RULE_parameter = 4, RULE_type = 5, RULE_def = 6, RULE_varDef = 7, RULE_classDef = 8, 
		RULE_funcDef = 9, RULE_suite = 10, RULE_statement = 11, RULE_expression = 12, 
		RULE_creator = 13, RULE_constant = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "varList", "var", "parameterList", "parameter", "type", "def", 
			"varDef", "classDef", "funcDef", "suite", "statement", "expression", 
			"creator", "constant"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'='", "'['", "']'", "';'", "'{'", "'('", "')'", "'}'", 
			"'.'", "'++'", "'--'", "'+'", "'-'", "'~'", "'!'", "'*'", "'/'", "'%'", 
			"'>>'", "'<<'", "'<'", "'>'", "'<='", "'>='", "'!='", "'=='", "'&'", 
			"'^'", "'|'", "'&&'", "'||'", null, null, null, "'null'", null, null, 
			null, null, null, "'bool'", "'int'", "'string'", "'void'", "'if'", "'else'", 
			"'for'", "'while'", "'break'", "'continue'", "'return'", "'new'", "'class'", 
			"'this'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "DecimalInteger", 
			"Stringconst", "Boolconst", "Nullconst", "Whitespace", "Newline", "BlockComment", 
			"LineComment", "Identifier", "Bool", "Int", "String", "Void", "If", "Else", 
			"For", "While", "Break", "Continue", "Return", "New", "Class", "This"
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

	@Override
	public String getGrammarFileName() { return "Mx_star.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Mx_starParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<DefContext> def() {
			return getRuleContexts(DefContext.class);
		}
		public DefContext def(int i) {
			return getRuleContext(DefContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mx_starVisitor ) return ((Mx_starVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Identifier) | (1L << Bool) | (1L << Int) | (1L << String) | (1L << Void) | (1L << Class))) != 0)) {
				{
				{
				setState(30);
				def();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarListContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public VarListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).enterVarList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).exitVarList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mx_starVisitor ) return ((Mx_starVisitor<? extends T>)visitor).visitVarList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarListContext varList() throws RecognitionException {
		VarListContext _localctx = new VarListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_varList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			var();
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(37);
				match(T__0);
				setState(38);
				var();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Mx_starParser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mx_starVisitor ) return ((Mx_starVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(Identifier);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(45);
				match(T__1);
				setState(46);
				expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mx_starVisitor ) return ((Mx_starVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			parameter();
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(50);
				match(T__0);
				setState(51);
				parameter();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Mx_starParser.Identifier, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mx_starVisitor ) return ((Mx_starVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			type(0);
			setState(58);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode Bool() { return getToken(Mx_starParser.Bool, 0); }
		public TerminalNode Int() { return getToken(Mx_starParser.Int, 0); }
		public TerminalNode String() { return getToken(Mx_starParser.String, 0); }
		public TerminalNode Identifier() { return getToken(Mx_starParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mx_starVisitor ) return ((Mx_starVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Bool:
				{
				setState(61);
				match(Bool);
				}
				break;
			case Int:
				{
				setState(62);
				match(Int);
				}
				break;
			case String:
				{
				setState(63);
				match(String);
				}
				break;
			case Identifier:
				{
				setState(64);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(72);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(67);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(68);
					match(T__2);
					setState(69);
					match(T__3);
					}
					} 
				}
				setState(74);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DefContext extends ParserRuleContext {
		public VarDefContext varDef() {
			return getRuleContext(VarDefContext.class,0);
		}
		public ClassDefContext classDef() {
			return getRuleContext(ClassDefContext.class,0);
		}
		public FuncDefContext funcDef() {
			return getRuleContext(FuncDefContext.class,0);
		}
		public DefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).enterDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).exitDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mx_starVisitor ) return ((Mx_starVisitor<? extends T>)visitor).visitDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_def);
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				varDef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				classDef();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				funcDef();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDefContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarListContext varList() {
			return getRuleContext(VarListContext.class,0);
		}
		public VarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).enterVarDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).exitVarDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mx_starVisitor ) return ((Mx_starVisitor<? extends T>)visitor).visitVarDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefContext varDef() throws RecognitionException {
		VarDefContext _localctx = new VarDefContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_varDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			type(0);
			setState(81);
			varList();
			setState(82);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDefContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(Mx_starParser.Class, 0); }
		public List<TerminalNode> Identifier() { return getTokens(Mx_starParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(Mx_starParser.Identifier, i);
		}
		public List<VarDefContext> varDef() {
			return getRuleContexts(VarDefContext.class);
		}
		public VarDefContext varDef(int i) {
			return getRuleContext(VarDefContext.class,i);
		}
		public List<FuncDefContext> funcDef() {
			return getRuleContexts(FuncDefContext.class);
		}
		public FuncDefContext funcDef(int i) {
			return getRuleContext(FuncDefContext.class,i);
		}
		public List<SuiteContext> suite() {
			return getRuleContexts(SuiteContext.class);
		}
		public SuiteContext suite(int i) {
			return getRuleContext(SuiteContext.class,i);
		}
		public List<ParameterListContext> parameterList() {
			return getRuleContexts(ParameterListContext.class);
		}
		public ParameterListContext parameterList(int i) {
			return getRuleContext(ParameterListContext.class,i);
		}
		public ClassDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).enterClassDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).exitClassDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mx_starVisitor ) return ((Mx_starVisitor<? extends T>)visitor).visitClassDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefContext classDef() throws RecognitionException {
		ClassDefContext _localctx = new ClassDefContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(Class);
			setState(85);
			match(Identifier);
			setState(86);
			match(T__5);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Identifier) | (1L << Bool) | (1L << Int) | (1L << String) | (1L << Void))) != 0)) {
				{
				setState(96);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(87);
					varDef();
					}
					break;
				case 2:
					{
					setState(88);
					funcDef();
					}
					break;
				case 3:
					{
					setState(89);
					match(Identifier);
					setState(90);
					match(T__6);
					setState(92);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Identifier) | (1L << Bool) | (1L << Int) | (1L << String))) != 0)) {
						{
						setState(91);
						parameterList();
						}
					}

					setState(94);
					match(T__7);
					setState(95);
					suite();
					}
					break;
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
			match(T__8);
			setState(102);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncDefContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Mx_starParser.Identifier, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Void() { return getToken(Mx_starParser.Void, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public FuncDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).enterFuncDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).exitFuncDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mx_starVisitor ) return ((Mx_starVisitor<? extends T>)visitor).visitFuncDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDefContext funcDef() throws RecognitionException {
		FuncDefContext _localctx = new FuncDefContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_funcDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
			case Bool:
			case Int:
			case String:
				{
				setState(104);
				type(0);
				}
				break;
			case Void:
				{
				setState(105);
				match(Void);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(108);
			match(Identifier);
			setState(109);
			match(T__6);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Identifier) | (1L << Bool) | (1L << Int) | (1L << String))) != 0)) {
				{
				setState(110);
				parameterList();
				}
			}

			setState(113);
			match(T__7);
			setState(114);
			suite();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuiteContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SuiteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).enterSuite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).exitSuite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mx_starVisitor ) return ((Mx_starVisitor<? extends T>)visitor).visitSuite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuiteContext suite() throws RecognitionException {
		SuiteContext _localctx = new SuiteContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_suite);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(T__5);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << DecimalInteger) | (1L << Stringconst) | (1L << Boolconst) | (1L << Nullconst) | (1L << Identifier) | (1L << Bool) | (1L << Int) | (1L << String) | (1L << If) | (1L << For) | (1L << While) | (1L << Break) | (1L << Continue) | (1L << Return) | (1L << New) | (1L << This))) != 0)) {
				{
				{
				setState(117);
				statement();
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForStmtContext extends StatementContext {
		public ExpressionContext init;
		public ExpressionContext cond;
		public ExpressionContext step;
		public TerminalNode For() { return getToken(Mx_starParser.For, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ForStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).exitForStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mx_starVisitor ) return ((Mx_starVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprStmtContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).enterExprStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).exitExprStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mx_starVisitor ) return ((Mx_starVisitor<? extends T>)visitor).visitExprStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileStmtContext extends StatementContext {
		public TerminalNode While() { return getToken(Mx_starParser.While, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mx_starVisitor ) return ((Mx_starVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStmtContext extends StatementContext {
		public StatementContext trueStmt;
		public StatementContext falseStmt;
		public TerminalNode If() { return getToken(Mx_starParser.If, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(Mx_starParser.Else, 0); }
		public IfStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mx_starVisitor ) return ((Mx_starVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BreakStmtContext extends StatementContext {
		public TerminalNode Break() { return getToken(Mx_starParser.Break, 0); }
		public BreakStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).enterBreakStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).exitBreakStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mx_starVisitor ) return ((Mx_starVisitor<? extends T>)visitor).visitBreakStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EmptyStmtContext extends StatementContext {
		public EmptyStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).enterEmptyStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).exitEmptyStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mx_starVisitor ) return ((Mx_starVisitor<? extends T>)visitor).visitEmptyStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnStmtContext extends StatementContext {
		public TerminalNode Return() { return getToken(Mx_starParser.Return, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).exitReturnStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mx_starVisitor ) return ((Mx_starVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContinueStmtContext extends StatementContext {
		public TerminalNode Continue() { return getToken(Mx_starParser.Continue, 0); }
		public ContinueStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).enterContinueStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).exitContinueStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mx_starVisitor ) return ((Mx_starVisitor<? extends T>)visitor).visitContinueStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VardefStmtContext extends StatementContext {
		public VarDefContext varDef() {
			return getRuleContext(VarDefContext.class,0);
		}
		public VardefStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).enterVardefStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).exitVardefStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mx_starVisitor ) return ((Mx_starVisitor<? extends T>)visitor).visitVardefStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SuiteStmtContext extends StatementContext {
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public SuiteStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).enterSuiteStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).exitSuiteStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mx_starVisitor ) return ((Mx_starVisitor<? extends T>)visitor).visitSuiteStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement);
		int _la;
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new VardefStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				varDef();
				}
				break;
			case 2:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				match(If);
				setState(127);
				match(T__6);
				setState(128);
				expression(0);
				setState(129);
				match(T__7);
				setState(130);
				((IfStmtContext)_localctx).trueStmt = statement();
				setState(133);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(131);
					match(Else);
					setState(132);
					((IfStmtContext)_localctx).falseStmt = statement();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new WhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				match(While);
				setState(136);
				match(T__6);
				setState(137);
				expression(0);
				setState(138);
				match(T__7);
				setState(139);
				statement();
				}
				break;
			case 4:
				_localctx = new ForStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(141);
				match(For);
				setState(142);
				match(T__6);
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << DecimalInteger) | (1L << Stringconst) | (1L << Boolconst) | (1L << Nullconst) | (1L << Identifier) | (1L << New) | (1L << This))) != 0)) {
					{
					setState(143);
					((ForStmtContext)_localctx).init = expression(0);
					}
				}

				setState(146);
				match(T__4);
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << DecimalInteger) | (1L << Stringconst) | (1L << Boolconst) | (1L << Nullconst) | (1L << Identifier) | (1L << New) | (1L << This))) != 0)) {
					{
					setState(147);
					((ForStmtContext)_localctx).cond = expression(0);
					}
				}

				setState(150);
				match(T__4);
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << DecimalInteger) | (1L << Stringconst) | (1L << Boolconst) | (1L << Nullconst) | (1L << Identifier) | (1L << New) | (1L << This))) != 0)) {
					{
					setState(151);
					((ForStmtContext)_localctx).step = expression(0);
					}
				}

				setState(154);
				match(T__7);
				setState(155);
				statement();
				}
				break;
			case 5:
				_localctx = new ReturnStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(156);
				match(Return);
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << DecimalInteger) | (1L << Stringconst) | (1L << Boolconst) | (1L << Nullconst) | (1L << Identifier) | (1L << New) | (1L << This))) != 0)) {
					{
					setState(157);
					expression(0);
					}
				}

				setState(160);
				match(T__4);
				}
				break;
			case 6:
				_localctx = new BreakStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(161);
				match(Break);
				setState(162);
				match(T__4);
				}
				break;
			case 7:
				_localctx = new ContinueStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(163);
				match(Continue);
				setState(164);
				match(T__4);
				}
				break;
			case 8:
				_localctx = new ExprStmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(165);
				expression(0);
				setState(166);
				match(T__4);
				}
				break;
			case 9:
				_localctx = new SuiteStmtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(168);
				suite();
				}
				break;
			case 10:
				_localctx = new EmptyStmtContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(169);
				match(T__4);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NewExprContext extends ExpressionContext {
		public TerminalNode New() { return getToken(Mx_starParser.New, 0); }
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public NewExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).enterNewExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).exitNewExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mx_starVisitor ) return ((Mx_starVisitor<? extends T>)visitor).visitNewExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ThisExprContext extends ExpressionContext {
		public TerminalNode This() { return getToken(Mx_starParser.This, 0); }
		public ThisExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).enterThisExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).exitThisExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mx_starVisitor ) return ((Mx_starVisitor<? extends T>)visitor).visitThisExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrefixExprContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrefixExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).enterPrefixExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).exitPrefixExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mx_starVisitor ) return ((Mx_starVisitor<? extends T>)visitor).visitPrefixExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FuncExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).enterFuncExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).exitFuncExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mx_starVisitor ) return ((Mx_starVisitor<? extends T>)visitor).visitFuncExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayExprContext extends ExpressionContext {
		public ExpressionContext array;
		public ExpressionContext cnt;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).enterArrayExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).exitArrayExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mx_starVisitor ) return ((Mx_starVisitor<? extends T>)visitor).visitArrayExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MemberExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Mx_starParser.Identifier, 0); }
		public MemberExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).enterMemberExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).exitMemberExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mx_starVisitor ) return ((Mx_starVisitor<? extends T>)visitor).visitMemberExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryExprContext extends ExpressionContext {
		public ExpressionContext left;
		public Token bop;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BinaryExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).enterBinaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).exitBinaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mx_starVisitor ) return ((Mx_starVisitor<? extends T>)visitor).visitBinaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PostfixExprContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PostfixExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).enterPostfixExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).exitPostfixExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mx_starVisitor ) return ((Mx_starVisitor<? extends T>)visitor).visitPostfixExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).exitParenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mx_starVisitor ) return ((Mx_starVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierExprContext extends ExpressionContext {
		public TerminalNode Identifier() { return getToken(Mx_starParser.Identifier, 0); }
		public IdentifierExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).enterIdentifierExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).exitIdentifierExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mx_starVisitor ) return ((Mx_starVisitor<? extends T>)visitor).visitIdentifierExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstExprContext extends ExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).enterConstExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).exitConstExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mx_starVisitor ) return ((Mx_starVisitor<? extends T>)visitor).visitConstExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				_localctx = new IdentifierExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(173);
				match(Identifier);
				}
				break;
			case This:
				{
				_localctx = new ThisExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174);
				match(This);
				}
				break;
			case DecimalInteger:
			case Stringconst:
			case Boolconst:
			case Nullconst:
				{
				_localctx = new ConstExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(175);
				constant();
				}
				break;
			case T__6:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(176);
				match(T__6);
				setState(177);
				expression(0);
				setState(178);
				match(T__7);
				}
				break;
			case New:
				{
				_localctx = new NewExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(180);
				match(New);
				setState(181);
				creator();
				}
				break;
			case T__10:
			case T__11:
				{
				_localctx = new PrefixExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(182);
				((PrefixExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__10 || _la==T__11) ) {
					((PrefixExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(183);
				expression(14);
				}
				break;
			case T__12:
			case T__13:
				{
				_localctx = new PrefixExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(184);
				((PrefixExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__12 || _la==T__13) ) {
					((PrefixExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(185);
				expression(13);
				}
				break;
			case T__14:
			case T__15:
				{
				_localctx = new PrefixExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(186);
				((PrefixExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__14 || _la==T__15) ) {
					((PrefixExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(187);
				expression(12);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(248);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(246);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(190);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(191);
						((BinaryExprContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18))) != 0)) ) {
							((BinaryExprContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(192);
						((BinaryExprContext)_localctx).right = expression(12);
						}
						break;
					case 2:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(193);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(194);
						((BinaryExprContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__12 || _la==T__13) ) {
							((BinaryExprContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(195);
						((BinaryExprContext)_localctx).right = expression(11);
						}
						break;
					case 3:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(196);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(197);
						((BinaryExprContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__19 || _la==T__20) ) {
							((BinaryExprContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(198);
						((BinaryExprContext)_localctx).right = expression(10);
						}
						break;
					case 4:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(199);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(200);
						((BinaryExprContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24))) != 0)) ) {
							((BinaryExprContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(201);
						((BinaryExprContext)_localctx).right = expression(9);
						}
						break;
					case 5:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(202);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(203);
						((BinaryExprContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__25 || _la==T__26) ) {
							((BinaryExprContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(204);
						((BinaryExprContext)_localctx).right = expression(8);
						}
						break;
					case 6:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(205);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(206);
						((BinaryExprContext)_localctx).bop = match(T__27);
						setState(207);
						((BinaryExprContext)_localctx).right = expression(7);
						}
						break;
					case 7:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(208);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(209);
						((BinaryExprContext)_localctx).bop = match(T__28);
						setState(210);
						((BinaryExprContext)_localctx).right = expression(6);
						}
						break;
					case 8:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(211);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(212);
						((BinaryExprContext)_localctx).bop = match(T__29);
						setState(213);
						((BinaryExprContext)_localctx).right = expression(5);
						}
						break;
					case 9:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(214);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(215);
						((BinaryExprContext)_localctx).bop = match(T__30);
						setState(216);
						((BinaryExprContext)_localctx).right = expression(4);
						}
						break;
					case 10:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(217);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(218);
						((BinaryExprContext)_localctx).bop = match(T__31);
						setState(219);
						((BinaryExprContext)_localctx).right = expression(3);
						}
						break;
					case 11:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(220);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(221);
						((BinaryExprContext)_localctx).bop = match(T__1);
						setState(222);
						((BinaryExprContext)_localctx).right = expression(1);
						}
						break;
					case 12:
						{
						_localctx = new MemberExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(223);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(224);
						match(T__9);
						setState(225);
						match(Identifier);
						}
						break;
					case 13:
						{
						_localctx = new ArrayExprContext(new ExpressionContext(_parentctx, _parentState));
						((ArrayExprContext)_localctx).array = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(226);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(227);
						match(T__2);
						setState(228);
						((ArrayExprContext)_localctx).cnt = expression(0);
						setState(229);
						match(T__3);
						}
						break;
					case 14:
						{
						_localctx = new FuncExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(231);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(232);
						match(T__6);
						setState(241);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << DecimalInteger) | (1L << Stringconst) | (1L << Boolconst) | (1L << Nullconst) | (1L << Identifier) | (1L << New) | (1L << This))) != 0)) {
							{
							setState(233);
							expression(0);
							setState(238);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__0) {
								{
								{
								setState(234);
								match(T__0);
								setState(235);
								expression(0);
								}
								}
								setState(240);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(243);
						match(T__7);
						}
						break;
					case 15:
						{
						_localctx = new PostfixExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(244);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(245);
						((PostfixExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__10 || _la==T__11) ) {
							((PostfixExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(250);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CreatorContext extends ParserRuleContext {
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
	 
		public CreatorContext() { }
		public void copyFrom(CreatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NonArrayCreatorContext extends CreatorContext {
		public TerminalNode Bool() { return getToken(Mx_starParser.Bool, 0); }
		public TerminalNode Int() { return getToken(Mx_starParser.Int, 0); }
		public TerminalNode String() { return getToken(Mx_starParser.String, 0); }
		public TerminalNode Identifier() { return getToken(Mx_starParser.Identifier, 0); }
		public NonArrayCreatorContext(CreatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).enterNonArrayCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).exitNonArrayCreator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mx_starVisitor ) return ((Mx_starVisitor<? extends T>)visitor).visitNonArrayCreator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayCreatorContext extends CreatorContext {
		public TerminalNode Bool() { return getToken(Mx_starParser.Bool, 0); }
		public TerminalNode Int() { return getToken(Mx_starParser.Int, 0); }
		public TerminalNode String() { return getToken(Mx_starParser.String, 0); }
		public TerminalNode Identifier() { return getToken(Mx_starParser.Identifier, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayCreatorContext(CreatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).enterArrayCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).exitArrayCreator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mx_starVisitor ) return ((Mx_starVisitor<? extends T>)visitor).visitArrayCreator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ErrorCreatorContext extends CreatorContext {
		public TerminalNode Bool() { return getToken(Mx_starParser.Bool, 0); }
		public TerminalNode Int() { return getToken(Mx_starParser.Int, 0); }
		public TerminalNode String() { return getToken(Mx_starParser.String, 0); }
		public TerminalNode Identifier() { return getToken(Mx_starParser.Identifier, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ErrorCreatorContext(CreatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).enterErrorCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).exitErrorCreator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mx_starVisitor ) return ((Mx_starVisitor<? extends T>)visitor).visitErrorCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_creator);
		int _la;
		try {
			int _alt;
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				_localctx = new ErrorCreatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Identifier) | (1L << Bool) | (1L << Int) | (1L << String))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(252);
						match(T__2);
						setState(253);
						expression(0);
						setState(254);
						match(T__3);
						}
						} 
					}
					setState(260);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				setState(263); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(261);
						match(T__2);
						setState(262);
						match(T__3);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(265); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(271); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(267);
						match(T__2);
						setState(268);
						expression(0);
						setState(269);
						match(T__3);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(273); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				_localctx = new ArrayCreatorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Identifier) | (1L << Bool) | (1L << Int) | (1L << String))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(280); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(276);
						match(T__2);
						setState(277);
						expression(0);
						setState(278);
						match(T__3);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(282); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(288);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(284);
						match(T__2);
						setState(285);
						match(T__3);
						}
						} 
					}
					setState(290);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				}
				break;
			case 3:
				_localctx = new NonArrayCreatorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(291);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Identifier) | (1L << Bool) | (1L << Int) | (1L << String))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(294);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(292);
					match(T__6);
					setState(293);
					match(T__7);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode Boolconst() { return getToken(Mx_starParser.Boolconst, 0); }
		public TerminalNode DecimalInteger() { return getToken(Mx_starParser.DecimalInteger, 0); }
		public TerminalNode Stringconst() { return getToken(Mx_starParser.Stringconst, 0); }
		public TerminalNode Nullconst() { return getToken(Mx_starParser.Nullconst, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Mx_starListener ) ((Mx_starListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Mx_starVisitor ) return ((Mx_starVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DecimalInteger) | (1L << Stringconst) | (1L << Boolconst) | (1L << Nullconst))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return type_sempred((TypeContext)_localctx, predIndex);
		case 12:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 4);
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 1);
		case 12:
			return precpred(_ctx, 19);
		case 13:
			return precpred(_ctx, 18);
		case 14:
			return precpred(_ctx, 17);
		case 15:
			return precpred(_ctx, 15);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u012f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\7\2\"\n\2\f\2\16"+
		"\2%\13\2\3\3\3\3\3\3\7\3*\n\3\f\3\16\3-\13\3\3\4\3\4\3\4\5\4\62\n\4\3"+
		"\5\3\5\3\5\7\5\67\n\5\f\5\16\5:\13\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5"+
		"\7D\n\7\3\7\3\7\3\7\7\7I\n\7\f\7\16\7L\13\7\3\b\3\b\3\b\5\bQ\n\b\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n_\n\n\3\n\3\n\7\nc\n\n\f"+
		"\n\16\nf\13\n\3\n\3\n\3\n\3\13\3\13\5\13m\n\13\3\13\3\13\3\13\5\13r\n"+
		"\13\3\13\3\13\3\13\3\f\3\f\7\fy\n\f\f\f\16\f|\13\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\5\r\u0088\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\5\r\u0093\n\r\3\r\3\r\5\r\u0097\n\r\3\r\3\r\5\r\u009b\n\r\3\r\3\r\3\r"+
		"\3\r\5\r\u00a1\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ad\n"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\5\16\u00bf\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00ef\n\16\f\16"+
		"\16\16\u00f2\13\16\5\16\u00f4\n\16\3\16\3\16\3\16\7\16\u00f9\n\16\f\16"+
		"\16\16\u00fc\13\16\3\17\3\17\3\17\3\17\3\17\7\17\u0103\n\17\f\17\16\17"+
		"\u0106\13\17\3\17\3\17\6\17\u010a\n\17\r\17\16\17\u010b\3\17\3\17\3\17"+
		"\3\17\6\17\u0112\n\17\r\17\16\17\u0113\3\17\3\17\3\17\3\17\3\17\6\17\u011b"+
		"\n\17\r\17\16\17\u011c\3\17\3\17\7\17\u0121\n\17\f\17\16\17\u0124\13\17"+
		"\3\17\3\17\3\17\5\17\u0129\n\17\5\17\u012b\n\17\3\20\3\20\3\20\2\4\f\32"+
		"\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\13\3\2\r\16\3\2\17\20\3\2"+
		"\21\22\3\2\23\25\3\2\26\27\3\2\30\33\3\2\34\35\3\2+.\3\2#&\2\u015e\2#"+
		"\3\2\2\2\4&\3\2\2\2\6.\3\2\2\2\b\63\3\2\2\2\n;\3\2\2\2\fC\3\2\2\2\16P"+
		"\3\2\2\2\20R\3\2\2\2\22V\3\2\2\2\24l\3\2\2\2\26v\3\2\2\2\30\u00ac\3\2"+
		"\2\2\32\u00be\3\2\2\2\34\u012a\3\2\2\2\36\u012c\3\2\2\2 \"\5\16\b\2! "+
		"\3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$\3\3\2\2\2%#\3\2\2\2&+\5\6\4\2"+
		"\'(\7\3\2\2(*\5\6\4\2)\'\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\5\3\2"+
		"\2\2-+\3\2\2\2.\61\7+\2\2/\60\7\4\2\2\60\62\5\32\16\2\61/\3\2\2\2\61\62"+
		"\3\2\2\2\62\7\3\2\2\2\638\5\n\6\2\64\65\7\3\2\2\65\67\5\n\6\2\66\64\3"+
		"\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29\t\3\2\2\2:8\3\2\2\2;<\5\f\7"+
		"\2<=\7+\2\2=\13\3\2\2\2>?\b\7\1\2?D\7,\2\2@D\7-\2\2AD\7.\2\2BD\7+\2\2"+
		"C>\3\2\2\2C@\3\2\2\2CA\3\2\2\2CB\3\2\2\2DJ\3\2\2\2EF\f\7\2\2FG\7\5\2\2"+
		"GI\7\6\2\2HE\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\r\3\2\2\2LJ\3\2\2"+
		"\2MQ\5\20\t\2NQ\5\22\n\2OQ\5\24\13\2PM\3\2\2\2PN\3\2\2\2PO\3\2\2\2Q\17"+
		"\3\2\2\2RS\5\f\7\2ST\5\4\3\2TU\7\7\2\2U\21\3\2\2\2VW\78\2\2WX\7+\2\2X"+
		"d\7\b\2\2Yc\5\20\t\2Zc\5\24\13\2[\\\7+\2\2\\^\7\t\2\2]_\5\b\5\2^]\3\2"+
		"\2\2^_\3\2\2\2_`\3\2\2\2`a\7\n\2\2ac\5\26\f\2bY\3\2\2\2bZ\3\2\2\2b[\3"+
		"\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2eg\3\2\2\2fd\3\2\2\2gh\7\13\2\2hi"+
		"\7\7\2\2i\23\3\2\2\2jm\5\f\7\2km\7/\2\2lj\3\2\2\2lk\3\2\2\2mn\3\2\2\2"+
		"no\7+\2\2oq\7\t\2\2pr\5\b\5\2qp\3\2\2\2qr\3\2\2\2rs\3\2\2\2st\7\n\2\2"+
		"tu\5\26\f\2u\25\3\2\2\2vz\7\b\2\2wy\5\30\r\2xw\3\2\2\2y|\3\2\2\2zx\3\2"+
		"\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~\7\13\2\2~\27\3\2\2\2\177\u00ad\5"+
		"\20\t\2\u0080\u0081\7\60\2\2\u0081\u0082\7\t\2\2\u0082\u0083\5\32\16\2"+
		"\u0083\u0084\7\n\2\2\u0084\u0087\5\30\r\2\u0085\u0086\7\61\2\2\u0086\u0088"+
		"\5\30\r\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u00ad\3\2\2\2"+
		"\u0089\u008a\7\63\2\2\u008a\u008b\7\t\2\2\u008b\u008c\5\32\16\2\u008c"+
		"\u008d\7\n\2\2\u008d\u008e\5\30\r\2\u008e\u00ad\3\2\2\2\u008f\u0090\7"+
		"\62\2\2\u0090\u0092\7\t\2\2\u0091\u0093\5\32\16\2\u0092\u0091\3\2\2\2"+
		"\u0092\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\7\7\2\2\u0095\u0097"+
		"\5\32\16\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2"+
		"\u0098\u009a\7\7\2\2\u0099\u009b\5\32\16\2\u009a\u0099\3\2\2\2\u009a\u009b"+
		"\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\7\n\2\2\u009d\u00ad\5\30\r\2"+
		"\u009e\u00a0\7\66\2\2\u009f\u00a1\5\32\16\2\u00a0\u009f\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00ad\7\7\2\2\u00a3\u00a4\7\64"+
		"\2\2\u00a4\u00ad\7\7\2\2\u00a5\u00a6\7\65\2\2\u00a6\u00ad\7\7\2\2\u00a7"+
		"\u00a8\5\32\16\2\u00a8\u00a9\7\7\2\2\u00a9\u00ad\3\2\2\2\u00aa\u00ad\5"+
		"\26\f\2\u00ab\u00ad\7\7\2\2\u00ac\177\3\2\2\2\u00ac\u0080\3\2\2\2\u00ac"+
		"\u0089\3\2\2\2\u00ac\u008f\3\2\2\2\u00ac\u009e\3\2\2\2\u00ac\u00a3\3\2"+
		"\2\2\u00ac\u00a5\3\2\2\2\u00ac\u00a7\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac"+
		"\u00ab\3\2\2\2\u00ad\31\3\2\2\2\u00ae\u00af\b\16\1\2\u00af\u00bf\7+\2"+
		"\2\u00b0\u00bf\79\2\2\u00b1\u00bf\5\36\20\2\u00b2\u00b3\7\t\2\2\u00b3"+
		"\u00b4\5\32\16\2\u00b4\u00b5\7\n\2\2\u00b5\u00bf\3\2\2\2\u00b6\u00b7\7"+
		"\67\2\2\u00b7\u00bf\5\34\17\2\u00b8\u00b9\t\2\2\2\u00b9\u00bf\5\32\16"+
		"\20\u00ba\u00bb\t\3\2\2\u00bb\u00bf\5\32\16\17\u00bc\u00bd\t\4\2\2\u00bd"+
		"\u00bf\5\32\16\16\u00be\u00ae\3\2\2\2\u00be\u00b0\3\2\2\2\u00be\u00b1"+
		"\3\2\2\2\u00be\u00b2\3\2\2\2\u00be\u00b6\3\2\2\2\u00be\u00b8\3\2\2\2\u00be"+
		"\u00ba\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00fa\3\2\2\2\u00c0\u00c1\f\r"+
		"\2\2\u00c1\u00c2\t\5\2\2\u00c2\u00f9\5\32\16\16\u00c3\u00c4\f\f\2\2\u00c4"+
		"\u00c5\t\3\2\2\u00c5\u00f9\5\32\16\r\u00c6\u00c7\f\13\2\2\u00c7\u00c8"+
		"\t\6\2\2\u00c8\u00f9\5\32\16\f\u00c9\u00ca\f\n\2\2\u00ca\u00cb\t\7\2\2"+
		"\u00cb\u00f9\5\32\16\13\u00cc\u00cd\f\t\2\2\u00cd\u00ce\t\b\2\2\u00ce"+
		"\u00f9\5\32\16\n\u00cf\u00d0\f\b\2\2\u00d0\u00d1\7\36\2\2\u00d1\u00f9"+
		"\5\32\16\t\u00d2\u00d3\f\7\2\2\u00d3\u00d4\7\37\2\2\u00d4\u00f9\5\32\16"+
		"\b\u00d5\u00d6\f\6\2\2\u00d6\u00d7\7 \2\2\u00d7\u00f9\5\32\16\7\u00d8"+
		"\u00d9\f\5\2\2\u00d9\u00da\7!\2\2\u00da\u00f9\5\32\16\6\u00db\u00dc\f"+
		"\4\2\2\u00dc\u00dd\7\"\2\2\u00dd\u00f9\5\32\16\5\u00de\u00df\f\3\2\2\u00df"+
		"\u00e0\7\4\2\2\u00e0\u00f9\5\32\16\3\u00e1\u00e2\f\25\2\2\u00e2\u00e3"+
		"\7\f\2\2\u00e3\u00f9\7+\2\2\u00e4\u00e5\f\24\2\2\u00e5\u00e6\7\5\2\2\u00e6"+
		"\u00e7\5\32\16\2\u00e7\u00e8\7\6\2\2\u00e8\u00f9\3\2\2\2\u00e9\u00ea\f"+
		"\23\2\2\u00ea\u00f3\7\t\2\2\u00eb\u00f0\5\32\16\2\u00ec\u00ed\7\3\2\2"+
		"\u00ed\u00ef\5\32\16\2\u00ee\u00ec\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee"+
		"\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3"+
		"\u00eb\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f9\7\n"+
		"\2\2\u00f6\u00f7\f\21\2\2\u00f7\u00f9\t\2\2\2\u00f8\u00c0\3\2\2\2\u00f8"+
		"\u00c3\3\2\2\2\u00f8\u00c6\3\2\2\2\u00f8\u00c9\3\2\2\2\u00f8\u00cc\3\2"+
		"\2\2\u00f8\u00cf\3\2\2\2\u00f8\u00d2\3\2\2\2\u00f8\u00d5\3\2\2\2\u00f8"+
		"\u00d8\3\2\2\2\u00f8\u00db\3\2\2\2\u00f8\u00de\3\2\2\2\u00f8\u00e1\3\2"+
		"\2\2\u00f8\u00e4\3\2\2\2\u00f8\u00e9\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9"+
		"\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\33\3\2\2"+
		"\2\u00fc\u00fa\3\2\2\2\u00fd\u0104\t\t\2\2\u00fe\u00ff\7\5\2\2\u00ff\u0100"+
		"\5\32\16\2\u0100\u0101\7\6\2\2\u0101\u0103\3\2\2\2\u0102\u00fe\3\2\2\2"+
		"\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0109"+
		"\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0108\7\5\2\2\u0108\u010a\7\6\2\2\u0109"+
		"\u0107\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2"+
		"\2\2\u010c\u0111\3\2\2\2\u010d\u010e\7\5\2\2\u010e\u010f\5\32\16\2\u010f"+
		"\u0110\7\6\2\2\u0110\u0112\3\2\2\2\u0111\u010d\3\2\2\2\u0112\u0113\3\2"+
		"\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u012b\3\2\2\2\u0115"+
		"\u011a\t\t\2\2\u0116\u0117\7\5\2\2\u0117\u0118\5\32\16\2\u0118\u0119\7"+
		"\6\2\2\u0119\u011b\3\2\2\2\u011a\u0116\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u0122\3\2\2\2\u011e\u011f\7\5"+
		"\2\2\u011f\u0121\7\6\2\2\u0120\u011e\3\2\2\2\u0121\u0124\3\2\2\2\u0122"+
		"\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u012b\3\2\2\2\u0124\u0122\3\2"+
		"\2\2\u0125\u0128\t\t\2\2\u0126\u0127\7\t\2\2\u0127\u0129\7\n\2\2\u0128"+
		"\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012b\3\2\2\2\u012a\u00fd\3\2"+
		"\2\2\u012a\u0115\3\2\2\2\u012a\u0125\3\2\2\2\u012b\35\3\2\2\2\u012c\u012d"+
		"\t\n\2\2\u012d\37\3\2\2\2!#+\618CJP^bdlqz\u0087\u0092\u0096\u009a\u00a0"+
		"\u00ac\u00be\u00f0\u00f3\u00f8\u00fa\u0104\u010b\u0113\u011c\u0122\u0128"+
		"\u012a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}