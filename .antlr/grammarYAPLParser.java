// Generated from c:\Users\mario\OneDrive\Documentos\GitHub\Compis2\grammarYAPL.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class grammarYAPLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		TRUE=18, FALSE=19, FI=20, IF=21, ELSE=22, WHILE=23, IN=24, LOOP=25, POOL=26, 
		THEN=27, NEW=28, NOT=29, ISVOID=30, INHERITS=31, CLASS=32, TYPE=33, ID=34, 
		INT=35, SEMICOLON=36, STRING=37, SMALLCOMMENT=38, BIGCOMMENT=39, WHITESPACE=40, 
		POINT=41, ERROR=42;
	public static final int
		RULE_program = 0, RULE_create_class = 1, RULE_feature = 2, RULE_formal = 3, 
		RULE_expr = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "create_class", "feature", "formal", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'('", "','", "')'", "':'", "'<-'", "'@'", "'let'", 
			"'*'", "'/'", "'+'", "'-'", "'~'", "'<'", "'<='", "'='", "'true'", "'false'", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "';'", null, null, null, null, "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "TRUE", "FALSE", "FI", "IF", "ELSE", 
			"WHILE", "IN", "LOOP", "POOL", "THEN", "NEW", "NOT", "ISVOID", "INHERITS", 
			"CLASS", "TYPE", "ID", "INT", "SEMICOLON", "STRING", "SMALLCOMMENT", 
			"BIGCOMMENT", "WHITESPACE", "POINT", "ERROR"
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
	public String getGrammarFileName() { return "grammarYAPL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public grammarYAPLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(grammarYAPLParser.EOF, 0); }
		public List<Create_classContext> create_class() {
			return getRuleContexts(Create_classContext.class);
		}
		public Create_classContext create_class(int i) {
			return getRuleContext(Create_classContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				create_class();
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CLASS );
			setState(15);
			match(EOF);
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

	public static class Create_classContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(grammarYAPLParser.CLASS, 0); }
		public List<TerminalNode> TYPE() { return getTokens(grammarYAPLParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(grammarYAPLParser.TYPE, i);
		}
		public TerminalNode INHERITS() { return getToken(grammarYAPLParser.INHERITS, 0); }
		public List<FeatureContext> feature() {
			return getRuleContexts(FeatureContext.class);
		}
		public FeatureContext feature(int i) {
			return getRuleContext(FeatureContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(grammarYAPLParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(grammarYAPLParser.SEMICOLON, i);
		}
		public Create_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_class; }
	}

	public final Create_classContext create_class() throws RecognitionException {
		Create_classContext _localctx = new Create_classContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_create_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			match(CLASS);
			setState(18);
			match(TYPE);
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INHERITS) {
				{
				setState(19);
				match(INHERITS);
				setState(20);
				match(TYPE);
				}
			}

			setState(23);
			match(T__0);
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24);
				feature();
				setState(25);
				match(SEMICOLON);
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(31);
			match(T__1);
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

	public static class FeatureContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(grammarYAPLParser.ID, 0); }
		public TerminalNode TYPE() { return getToken(grammarYAPLParser.TYPE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<FormalContext> formal() {
			return getRuleContexts(FormalContext.class);
		}
		public FormalContext formal(int i) {
			return getRuleContext(FormalContext.class,i);
		}
		public FeatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature; }
	}

	public final FeatureContext feature() throws RecognitionException {
		FeatureContext _localctx = new FeatureContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_feature);
		int _la;
		try {
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(33);
				match(ID);
				setState(34);
				match(T__2);
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(35);
					formal();
					setState(37);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__3) {
						{
						setState(36);
						match(T__3);
						}
					}

					}
					}
					setState(43);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(44);
				match(T__4);
				setState(45);
				match(T__5);
				setState(46);
				match(TYPE);
				setState(47);
				match(T__0);
				setState(48);
				expr(0);
				setState(49);
				match(T__1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				match(ID);
				setState(52);
				match(T__5);
				setState(53);
				match(TYPE);
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(54);
					match(T__6);
					setState(55);
					expr(0);
					}
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

	public static class FormalContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(grammarYAPLParser.ID, 0); }
		public TerminalNode TYPE() { return getToken(grammarYAPLParser.TYPE, 0); }
		public FormalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal; }
	}

	public final FormalContext formal() throws RecognitionException {
		FormalContext _localctx = new FormalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_formal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(ID);
			setState(61);
			match(T__5);
			setState(62);
			match(TYPE);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DispatchContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode POINT() { return getToken(grammarYAPLParser.POINT, 0); }
		public TerminalNode ID() { return getToken(grammarYAPLParser.ID, 0); }
		public TerminalNode TYPE() { return getToken(grammarYAPLParser.TYPE, 0); }
		public DispatchContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ParanthesisContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParanthesisContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class SumandMinusContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SumandMinusContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class LoopsContext extends ExprContext {
		public TerminalNode WHILE() { return getToken(grammarYAPLParser.WHILE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LOOP() { return getToken(grammarYAPLParser.LOOP, 0); }
		public TerminalNode POOL() { return getToken(grammarYAPLParser.POOL, 0); }
		public LoopsContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class InverseBitsContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InverseBitsContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class NewTypeContext extends ExprContext {
		public TerminalNode NEW() { return getToken(grammarYAPLParser.NEW, 0); }
		public TerminalNode TYPE() { return getToken(grammarYAPLParser.TYPE, 0); }
		public NewTypeContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class INTContext extends ExprContext {
		public TerminalNode INT() { return getToken(grammarYAPLParser.INT, 0); }
		public INTContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class NotContext extends ExprContext {
		public TerminalNode NOT() { return getToken(grammarYAPLParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class GreaterThanorEqualContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public GreaterThanorEqualContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class BoolFalContext extends ExprContext {
		public TerminalNode FALSE() { return getToken(grammarYAPLParser.FALSE, 0); }
		public BoolFalContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class GreaterThanContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public GreaterThanContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class EqualContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public EqualContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ContentContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(grammarYAPLParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(grammarYAPLParser.SEMICOLON, i);
		}
		public ContentContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class IFsContext extends ExprContext {
		public TerminalNode IF() { return getToken(grammarYAPLParser.IF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode THEN() { return getToken(grammarYAPLParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(grammarYAPLParser.ELSE, 0); }
		public TerminalNode FI() { return getToken(grammarYAPLParser.FI, 0); }
		public IFsContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class CreateVarContext extends ExprContext {
		public List<TerminalNode> ID() { return getTokens(grammarYAPLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(grammarYAPLParser.ID, i);
		}
		public List<TerminalNode> TYPE() { return getTokens(grammarYAPLParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(grammarYAPLParser.TYPE, i);
		}
		public TerminalNode IN() { return getToken(grammarYAPLParser.IN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CreateVarContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class MultandDivContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MultandDivContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class STRINGContext extends ExprContext {
		public TerminalNode STRING() { return getToken(grammarYAPLParser.STRING, 0); }
		public STRINGContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class SelfContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SelfContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class AssignContext extends ExprContext {
		public TerminalNode ID() { return getToken(grammarYAPLParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class IDContext extends ExprContext {
		public TerminalNode ID() { return getToken(grammarYAPLParser.ID, 0); }
		public IDContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class VoidContext extends ExprContext {
		public TerminalNode ISVOID() { return getToken(grammarYAPLParser.ISVOID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VoidContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class BoolTruContext extends ExprContext {
		public TerminalNode TRUE() { return getToken(grammarYAPLParser.TRUE, 0); }
		public BoolTruContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new AssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(65);
				match(ID);
				setState(66);
				match(T__6);
				setState(67);
				expr(22);
				}
				break;
			case 2:
				{
				_localctx = new IFsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(68);
				match(IF);
				setState(69);
				expr(0);
				setState(70);
				match(THEN);
				setState(71);
				expr(0);
				setState(72);
				match(ELSE);
				setState(73);
				expr(0);
				setState(74);
				match(FI);
				}
				break;
			case 3:
				{
				_localctx = new LoopsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(76);
				match(WHILE);
				setState(77);
				expr(0);
				setState(78);
				match(LOOP);
				setState(79);
				expr(0);
				setState(80);
				match(POOL);
				}
				break;
			case 4:
				{
				_localctx = new ContentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(82);
				match(T__0);
				setState(86); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(83);
					expr(0);
					setState(84);
					match(SEMICOLON);
					}
					}
					setState(88); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__8) | (1L << T__13) | (1L << TRUE) | (1L << FALSE) | (1L << IF) | (1L << WHILE) | (1L << NEW) | (1L << NOT) | (1L << ISVOID) | (1L << ID) | (1L << INT) | (1L << STRING))) != 0) );
				setState(90);
				match(T__1);
				}
				break;
			case 5:
				{
				_localctx = new CreateVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(92);
				match(T__8);
				setState(93);
				match(ID);
				setState(94);
				match(T__5);
				setState(95);
				match(TYPE);
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(96);
					match(T__6);
					setState(97);
					expr(0);
					}
				}

				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(100);
					match(T__3);
					setState(101);
					match(ID);
					setState(102);
					match(T__5);
					setState(103);
					match(TYPE);
					setState(104);
					match(T__6);
					setState(105);
					expr(0);
					}
					}
					setState(110);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(111);
				match(IN);
				setState(112);
				expr(16);
				}
				break;
			case 6:
				{
				_localctx = new NewTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(113);
				match(NEW);
				setState(114);
				match(TYPE);
				}
				break;
			case 7:
				{
				_localctx = new VoidContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(115);
				match(ISVOID);
				setState(116);
				expr(14);
				}
				break;
			case 8:
				{
				_localctx = new InverseBitsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(117);
				match(T__13);
				setState(118);
				expr(11);
				}
				break;
			case 9:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(119);
				match(NOT);
				setState(120);
				expr(7);
				}
				break;
			case 10:
				{
				_localctx = new ParanthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(121);
				match(T__2);
				setState(122);
				expr(0);
				setState(123);
				match(T__4);
				}
				break;
			case 11:
				{
				_localctx = new IDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(125);
				match(ID);
				}
				break;
			case 12:
				{
				_localctx = new INTContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(126);
				match(INT);
				}
				break;
			case 13:
				{
				_localctx = new STRINGContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(127);
				match(STRING);
				}
				break;
			case 14:
				{
				_localctx = new BoolTruContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(128);
				match(TRUE);
				}
				break;
			case 15:
				{
				_localctx = new BoolFalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(129);
				match(FALSE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(177);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new MultandDivContext(new ExprContext(_parentctx, _parentState));
						((MultandDivContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(132);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(133);
						((MultandDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__9 || _la==T__10) ) {
							((MultandDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(134);
						((MultandDivContext)_localctx).right = expr(14);
						}
						break;
					case 2:
						{
						_localctx = new SumandMinusContext(new ExprContext(_parentctx, _parentState));
						((SumandMinusContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(135);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(136);
						((SumandMinusContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__11 || _la==T__12) ) {
							((SumandMinusContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(137);
						((SumandMinusContext)_localctx).right = expr(13);
						}
						break;
					case 3:
						{
						_localctx = new GreaterThanContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(138);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(139);
						match(T__14);
						setState(140);
						expr(11);
						}
						break;
					case 4:
						{
						_localctx = new GreaterThanorEqualContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(141);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(142);
						match(T__15);
						setState(143);
						expr(10);
						}
						break;
					case 5:
						{
						_localctx = new EqualContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(144);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(145);
						match(T__16);
						setState(146);
						expr(9);
						}
						break;
					case 6:
						{
						_localctx = new SelfContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(147);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(148);
						match(T__2);
						setState(153); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(149);
							expr(0);
							setState(151);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==T__3) {
								{
								setState(150);
								match(T__3);
								}
							}

							}
							}
							setState(155); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__8) | (1L << T__13) | (1L << TRUE) | (1L << FALSE) | (1L << IF) | (1L << WHILE) | (1L << NEW) | (1L << NOT) | (1L << ISVOID) | (1L << ID) | (1L << INT) | (1L << STRING))) != 0) );
						setState(157);
						match(T__4);
						}
						break;
					case 7:
						{
						_localctx = new DispatchContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(159);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(162);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__7) {
							{
							setState(160);
							match(T__7);
							setState(161);
							match(TYPE);
							}
						}

						setState(164);
						match(POINT);
						setState(165);
						match(ID);
						setState(166);
						match(T__2);
						setState(167);
						expr(0);
						setState(172);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__3) {
							{
							{
							setState(168);
							match(T__3);
							setState(169);
							expr(0);
							}
							}
							setState(174);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(175);
						match(T__4);
						}
						break;
					}
					} 
				}
				setState(181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 21);
		case 6:
			return precpred(_ctx, 20);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u00b9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\6\2\16\n\2\r\2\16\2\17\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\5\3\30\n\3\3\3\3\3\3\3\3\3\6\3\36\n\3\r\3\16\3\37\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\5\4(\n\4\7\4*\n\4\f\4\16\4-\13\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4;\n\4\5\4=\n\4\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\6\6Y\n\6\r\6\16\6Z\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6e\n\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\7\6m\n\6\f\6\16\6p\13\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0085\n\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6\u009a\n\6\6\6\u009c\n\6\r\6\16\6\u009d\3\6\3\6\3\6\3\6\3\6\5"+
		"\6\u00a5\n\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00ad\n\6\f\6\16\6\u00b0\13\6"+
		"\3\6\3\6\7\6\u00b4\n\6\f\6\16\6\u00b7\13\6\3\6\2\3\n\7\2\4\6\b\n\2\4\3"+
		"\2\f\r\3\2\16\17\2\u00d6\2\r\3\2\2\2\4\23\3\2\2\2\6<\3\2\2\2\b>\3\2\2"+
		"\2\n\u0084\3\2\2\2\f\16\5\4\3\2\r\f\3\2\2\2\16\17\3\2\2\2\17\r\3\2\2\2"+
		"\17\20\3\2\2\2\20\21\3\2\2\2\21\22\7\2\2\3\22\3\3\2\2\2\23\24\7\"\2\2"+
		"\24\27\7#\2\2\25\26\7!\2\2\26\30\7#\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30"+
		"\31\3\2\2\2\31\35\7\3\2\2\32\33\5\6\4\2\33\34\7&\2\2\34\36\3\2\2\2\35"+
		"\32\3\2\2\2\36\37\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 !\3\2\2\2!\"\7\4\2"+
		"\2\"\5\3\2\2\2#$\7$\2\2$+\7\5\2\2%\'\5\b\5\2&(\7\6\2\2\'&\3\2\2\2\'(\3"+
		"\2\2\2(*\3\2\2\2)%\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,.\3\2\2\2-+\3"+
		"\2\2\2./\7\7\2\2/\60\7\b\2\2\60\61\7#\2\2\61\62\7\3\2\2\62\63\5\n\6\2"+
		"\63\64\7\4\2\2\64=\3\2\2\2\65\66\7$\2\2\66\67\7\b\2\2\67:\7#\2\289\7\t"+
		"\2\29;\5\n\6\2:8\3\2\2\2:;\3\2\2\2;=\3\2\2\2<#\3\2\2\2<\65\3\2\2\2=\7"+
		"\3\2\2\2>?\7$\2\2?@\7\b\2\2@A\7#\2\2A\t\3\2\2\2BC\b\6\1\2CD\7$\2\2DE\7"+
		"\t\2\2E\u0085\5\n\6\30FG\7\27\2\2GH\5\n\6\2HI\7\35\2\2IJ\5\n\6\2JK\7\30"+
		"\2\2KL\5\n\6\2LM\7\26\2\2M\u0085\3\2\2\2NO\7\31\2\2OP\5\n\6\2PQ\7\33\2"+
		"\2QR\5\n\6\2RS\7\34\2\2S\u0085\3\2\2\2TX\7\3\2\2UV\5\n\6\2VW\7&\2\2WY"+
		"\3\2\2\2XU\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\7\4\2\2"+
		"]\u0085\3\2\2\2^_\7\13\2\2_`\7$\2\2`a\7\b\2\2ad\7#\2\2bc\7\t\2\2ce\5\n"+
		"\6\2db\3\2\2\2de\3\2\2\2en\3\2\2\2fg\7\6\2\2gh\7$\2\2hi\7\b\2\2ij\7#\2"+
		"\2jk\7\t\2\2km\5\n\6\2lf\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2oq\3\2\2"+
		"\2pn\3\2\2\2qr\7\32\2\2r\u0085\5\n\6\22st\7\36\2\2t\u0085\7#\2\2uv\7 "+
		"\2\2v\u0085\5\n\6\20wx\7\20\2\2x\u0085\5\n\6\ryz\7\37\2\2z\u0085\5\n\6"+
		"\t{|\7\5\2\2|}\5\n\6\2}~\7\7\2\2~\u0085\3\2\2\2\177\u0085\7$\2\2\u0080"+
		"\u0085\7%\2\2\u0081\u0085\7\'\2\2\u0082\u0085\7\24\2\2\u0083\u0085\7\25"+
		"\2\2\u0084B\3\2\2\2\u0084F\3\2\2\2\u0084N\3\2\2\2\u0084T\3\2\2\2\u0084"+
		"^\3\2\2\2\u0084s\3\2\2\2\u0084u\3\2\2\2\u0084w\3\2\2\2\u0084y\3\2\2\2"+
		"\u0084{\3\2\2\2\u0084\177\3\2\2\2\u0084\u0080\3\2\2\2\u0084\u0081\3\2"+
		"\2\2\u0084\u0082\3\2\2\2\u0084\u0083\3\2\2\2\u0085\u00b5\3\2\2\2\u0086"+
		"\u0087\f\17\2\2\u0087\u0088\t\2\2\2\u0088\u00b4\5\n\6\20\u0089\u008a\f"+
		"\16\2\2\u008a\u008b\t\3\2\2\u008b\u00b4\5\n\6\17\u008c\u008d\f\f\2\2\u008d"+
		"\u008e\7\21\2\2\u008e\u00b4\5\n\6\r\u008f\u0090\f\13\2\2\u0090\u0091\7"+
		"\22\2\2\u0091\u00b4\5\n\6\f\u0092\u0093\f\n\2\2\u0093\u0094\7\23\2\2\u0094"+
		"\u00b4\5\n\6\13\u0095\u0096\f\27\2\2\u0096\u009b\7\5\2\2\u0097\u0099\5"+
		"\n\6\2\u0098\u009a\7\6\2\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009c\3\2\2\2\u009b\u0097\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009b\3\2"+
		"\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\7\7\2\2\u00a0"+
		"\u00b4\3\2\2\2\u00a1\u00a4\f\26\2\2\u00a2\u00a3\7\n\2\2\u00a3\u00a5\7"+
		"#\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\u00a7\7+\2\2\u00a7\u00a8\7$\2\2\u00a8\u00a9\7\5\2\2\u00a9\u00ae\5\n\6"+
		"\2\u00aa\u00ab\7\6\2\2\u00ab\u00ad\5\n\6\2\u00ac\u00aa\3\2\2\2\u00ad\u00b0"+
		"\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b1\u00b2\7\7\2\2\u00b2\u00b4\3\2\2\2\u00b3\u0086\3\2"+
		"\2\2\u00b3\u0089\3\2\2\2\u00b3\u008c\3\2\2\2\u00b3\u008f\3\2\2\2\u00b3"+
		"\u0092\3\2\2\2\u00b3\u0095\3\2\2\2\u00b3\u00a1\3\2\2\2\u00b4\u00b7\3\2"+
		"\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\13\3\2\2\2\u00b7\u00b5"+
		"\3\2\2\2\23\17\27\37\'+:<Zdn\u0084\u0099\u009d\u00a4\u00ae\u00b3\u00b5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}