// Generated from .\grammarYAPL.g4 by ANTLR 4.10.1
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
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

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
		public List<TerminalNode> SEMICOLON() { return getTokens(grammarYAPLParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(grammarYAPLParser.SEMICOLON, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarYAPLListener ) ((grammarYAPLListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarYAPLListener ) ((grammarYAPLListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				create_class();
				setState(11);
				match(SEMICOLON);
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CLASS );
			setState(17);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarYAPLListener ) ((grammarYAPLListener)listener).enterCreate_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarYAPLListener ) ((grammarYAPLListener)listener).exitCreate_class(this);
		}
	}

	public final Create_classContext create_class() throws RecognitionException {
		Create_classContext _localctx = new Create_classContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_create_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			match(CLASS);
			setState(20);
			match(TYPE);
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INHERITS) {
				{
				setState(21);
				match(INHERITS);
				setState(22);
				match(TYPE);
				}
			}

			setState(25);
			match(T__0);
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26);
				feature();
				setState(27);
				match(SEMICOLON);
				}
				}
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(33);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarYAPLListener ) ((grammarYAPLListener)listener).enterFeature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarYAPLListener ) ((grammarYAPLListener)listener).exitFeature(this);
		}
	}

	public final FeatureContext feature() throws RecognitionException {
		FeatureContext _localctx = new FeatureContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_feature);
		int _la;
		try {
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(35);
				match(ID);
				setState(36);
				match(T__2);
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(37);
					formal();
					setState(39);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__3) {
						{
						setState(38);
						match(T__3);
						}
					}

					}
					}
					setState(45);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(46);
				match(T__4);
				setState(47);
				match(T__5);
				setState(48);
				match(TYPE);
				setState(49);
				match(T__0);
				setState(50);
				expr(0);
				setState(51);
				match(T__1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				match(ID);
				setState(54);
				match(T__5);
				setState(55);
				match(TYPE);
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(56);
					match(T__6);
					setState(57);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarYAPLListener ) ((grammarYAPLListener)listener).enterFormal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarYAPLListener ) ((grammarYAPLListener)listener).exitFormal(this);
		}
	}

	public final FormalContext formal() throws RecognitionException {
		FormalContext _localctx = new FormalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_formal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(ID);
			setState(63);
			match(T__5);
			setState(64);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarYAPLListener ) ((grammarYAPLListener)listener).enterDispatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarYAPLListener ) ((grammarYAPLListener)listener).exitDispatch(this);
		}
	}
	public static class ParanthesisContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParanthesisContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarYAPLListener ) ((grammarYAPLListener)listener).enterParanthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarYAPLListener ) ((grammarYAPLListener)listener).exitParanthesis(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarYAPLListener ) ((grammarYAPLListener)listener).enterSumandMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarYAPLListener ) ((grammarYAPLListener)listener).exitSumandMinus(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarYAPLListener ) ((grammarYAPLListener)listener).enterLoops(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarYAPLListener ) ((grammarYAPLListener)listener).exitLoops(this);
		}
	}
	public static class InverseBitsContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InverseBitsContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarYAPLListener ) ((grammarYAPLListener)listener).enterInverseBits(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarYAPLListener ) ((grammarYAPLListener)listener).exitInverseBits(this);
		}
	}
	public static class NewTypeContext extends ExprContext {
		public TerminalNode NEW() { return getToken(grammarYAPLParser.NEW, 0); }
		public TerminalNode TYPE() { return getToken(grammarYAPLParser.TYPE, 0); }
		public NewTypeContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarYAPLListener ) ((grammarYAPLListener)listener).enterNewType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarYAPLListener ) ((grammarYAPLListener)listener).exitNewType(this);
		}
	}
	public static class INTContext extends ExprContext {
		public TerminalNode INT() { return getToken(grammarYAPLParser.INT, 0); }
		public INTContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarYAPLListener ) ((grammarYAPLListener)listener).enterINT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarYAPLListener ) ((grammarYAPLListener)listener).exitINT(this);
		}
	}
	public static class NotContext extends ExprContext {
		public TerminalNode NOT() { return getToken(grammarYAPLParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarYAPLListener ) ((grammarYAPLListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarYAPLListener ) ((grammarYAPLListener)listener).exitNot(this);
		}
	}
	public static class GreaterThanorEqualContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public GreaterThanorEqualContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarYAPLListener ) ((grammarYAPLListener)listener).enterGreaterThanorEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarYAPLListener ) ((grammarYAPLListener)listener).exitGreaterThanorEqual(this);
		}
	}
	public static class BoolFalContext extends ExprContext {
		public TerminalNode FALSE() { return getToken(grammarYAPLParser.FALSE, 0); }
		public BoolFalContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarYAPLListener ) ((grammarYAPLListener)listener).enterBoolFal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarYAPLListener ) ((grammarYAPLListener)listener).exitBoolFal(this);
		}
	}
	public static class GreaterThanContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public GreaterThanContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarYAPLListener ) ((grammarYAPLListener)listener).enterGreaterThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarYAPLListener ) ((grammarYAPLListener)listener).exitGreaterThan(this);
		}
	}
	public static class EqualContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public EqualContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarYAPLListener ) ((grammarYAPLListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarYAPLListener ) ((grammarYAPLListener)listener).exitEqual(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarYAPLListener ) ((grammarYAPLListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarYAPLListener ) ((grammarYAPLListener)listener).exitContent(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarYAPLListener ) ((grammarYAPLListener)listener).enterIFs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarYAPLListener ) ((grammarYAPLListener)listener).exitIFs(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarYAPLListener ) ((grammarYAPLListener)listener).enterCreateVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarYAPLListener ) ((grammarYAPLListener)listener).exitCreateVar(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarYAPLListener ) ((grammarYAPLListener)listener).enterMultandDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarYAPLListener ) ((grammarYAPLListener)listener).exitMultandDiv(this);
		}
	}
	public static class STRINGContext extends ExprContext {
		public TerminalNode STRING() { return getToken(grammarYAPLParser.STRING, 0); }
		public STRINGContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarYAPLListener ) ((grammarYAPLListener)listener).enterSTRING(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarYAPLListener ) ((grammarYAPLListener)listener).exitSTRING(this);
		}
	}
	public static class SelfContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SelfContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarYAPLListener ) ((grammarYAPLListener)listener).enterSelf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarYAPLListener ) ((grammarYAPLListener)listener).exitSelf(this);
		}
	}
	public static class AssignContext extends ExprContext {
		public TerminalNode ID() { return getToken(grammarYAPLParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarYAPLListener ) ((grammarYAPLListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarYAPLListener ) ((grammarYAPLListener)listener).exitAssign(this);
		}
	}
	public static class IDContext extends ExprContext {
		public TerminalNode ID() { return getToken(grammarYAPLParser.ID, 0); }
		public IDContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarYAPLListener ) ((grammarYAPLListener)listener).enterID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarYAPLListener ) ((grammarYAPLListener)listener).exitID(this);
		}
	}
	public static class VoidContext extends ExprContext {
		public TerminalNode ISVOID() { return getToken(grammarYAPLParser.ISVOID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VoidContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarYAPLListener ) ((grammarYAPLListener)listener).enterVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarYAPLListener ) ((grammarYAPLListener)listener).exitVoid(this);
		}
	}
	public static class BoolTruContext extends ExprContext {
		public TerminalNode TRUE() { return getToken(grammarYAPLParser.TRUE, 0); }
		public BoolTruContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarYAPLListener ) ((grammarYAPLListener)listener).enterBoolTru(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarYAPLListener ) ((grammarYAPLListener)listener).exitBoolTru(this);
		}
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
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new AssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(67);
				match(ID);
				setState(68);
				match(T__6);
				setState(69);
				expr(22);
				}
				break;
			case 2:
				{
				_localctx = new IFsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(70);
				match(IF);
				setState(71);
				expr(0);
				setState(72);
				match(THEN);
				setState(73);
				expr(0);
				setState(74);
				match(ELSE);
				setState(75);
				expr(0);
				setState(76);
				match(FI);
				}
				break;
			case 3:
				{
				_localctx = new LoopsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(78);
				match(WHILE);
				setState(79);
				expr(0);
				setState(80);
				match(LOOP);
				setState(81);
				expr(0);
				setState(82);
				match(POOL);
				}
				break;
			case 4:
				{
				_localctx = new ContentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(84);
				match(T__0);
				setState(88); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(85);
					expr(0);
					setState(86);
					match(SEMICOLON);
					}
					}
					setState(90); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__8) | (1L << T__13) | (1L << TRUE) | (1L << FALSE) | (1L << IF) | (1L << WHILE) | (1L << NEW) | (1L << NOT) | (1L << ISVOID) | (1L << ID) | (1L << INT) | (1L << STRING))) != 0) );
				setState(92);
				match(T__1);
				}
				break;
			case 5:
				{
				_localctx = new CreateVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(94);
				match(T__8);
				setState(95);
				match(ID);
				setState(96);
				match(T__5);
				setState(97);
				match(TYPE);
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(98);
					match(T__6);
					setState(99);
					expr(0);
					}
				}

				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(102);
					match(T__3);
					setState(103);
					match(ID);
					setState(104);
					match(T__5);
					setState(105);
					match(TYPE);
					setState(106);
					match(T__6);
					setState(107);
					expr(0);
					}
					}
					setState(112);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(113);
				match(IN);
				setState(114);
				expr(16);
				}
				break;
			case 6:
				{
				_localctx = new NewTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(115);
				match(NEW);
				setState(116);
				match(TYPE);
				}
				break;
			case 7:
				{
				_localctx = new VoidContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(117);
				match(ISVOID);
				setState(118);
				expr(14);
				}
				break;
			case 8:
				{
				_localctx = new InverseBitsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(119);
				match(T__13);
				setState(120);
				expr(11);
				}
				break;
			case 9:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(121);
				match(NOT);
				setState(122);
				expr(7);
				}
				break;
			case 10:
				{
				_localctx = new ParanthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(123);
				match(T__2);
				setState(124);
				expr(0);
				setState(125);
				match(T__4);
				}
				break;
			case 11:
				{
				_localctx = new IDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(127);
				match(ID);
				}
				break;
			case 12:
				{
				_localctx = new INTContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(128);
				match(INT);
				}
				break;
			case 13:
				{
				_localctx = new STRINGContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(129);
				match(STRING);
				}
				break;
			case 14:
				{
				_localctx = new BoolTruContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(130);
				match(TRUE);
				}
				break;
			case 15:
				{
				_localctx = new BoolFalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(131);
				match(FALSE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(181);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(179);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new MultandDivContext(new ExprContext(_parentctx, _parentState));
						((MultandDivContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(134);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(135);
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
						setState(136);
						((MultandDivContext)_localctx).right = expr(14);
						}
						break;
					case 2:
						{
						_localctx = new SumandMinusContext(new ExprContext(_parentctx, _parentState));
						((SumandMinusContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(137);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(138);
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
						setState(139);
						((SumandMinusContext)_localctx).right = expr(13);
						}
						break;
					case 3:
						{
						_localctx = new GreaterThanContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(140);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(141);
						match(T__14);
						setState(142);
						expr(11);
						}
						break;
					case 4:
						{
						_localctx = new GreaterThanorEqualContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(143);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(144);
						match(T__15);
						setState(145);
						expr(10);
						}
						break;
					case 5:
						{
						_localctx = new EqualContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(146);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(147);
						match(T__16);
						setState(148);
						expr(9);
						}
						break;
					case 6:
						{
						_localctx = new SelfContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(149);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(150);
						match(T__2);
						setState(155); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(151);
							expr(0);
							setState(153);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==T__3) {
								{
								setState(152);
								match(T__3);
								}
							}

							}
							}
							setState(157); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__8) | (1L << T__13) | (1L << TRUE) | (1L << FALSE) | (1L << IF) | (1L << WHILE) | (1L << NEW) | (1L << NOT) | (1L << ISVOID) | (1L << ID) | (1L << INT) | (1L << STRING))) != 0) );
						setState(159);
						match(T__4);
						}
						break;
					case 7:
						{
						_localctx = new DispatchContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(161);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(164);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__7) {
							{
							setState(162);
							match(T__7);
							setState(163);
							match(TYPE);
							}
						}

						setState(166);
						match(POINT);
						setState(167);
						match(ID);
						setState(168);
						match(T__2);
						setState(169);
						expr(0);
						setState(174);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__3) {
							{
							{
							setState(170);
							match(T__3);
							setState(171);
							expr(0);
							}
							}
							setState(176);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(177);
						match(T__4);
						}
						break;
					}
					} 
				}
				setState(183);
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
		"\u0004\u0001*\u00b9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u000e\b\u0000\u000b\u0000\f"+
		"\u0000\u000f\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u0018\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0004\u0001\u001e\b\u0001\u000b\u0001\f\u0001\u001f\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002(\b\u0002\u0005\u0002*\b\u0002\n\u0002\f\u0002-\t\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		";\b\u0002\u0003\u0002=\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004Y\b"+
		"\u0004\u000b\u0004\f\u0004Z\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004e\b"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004m\b\u0004\n\u0004\f\u0004p\t\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004\u0085\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u009a\b\u0004\u0004\u0004\u009c"+
		"\b\u0004\u000b\u0004\f\u0004\u009d\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u00a5\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00ad\b\u0004"+
		"\n\u0004\f\u0004\u00b0\t\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00b4"+
		"\b\u0004\n\u0004\f\u0004\u00b7\t\u0004\u0001\u0004\u0000\u0001\b\u0005"+
		"\u0000\u0002\u0004\u0006\b\u0000\u0002\u0001\u0000\n\u000b\u0001\u0000"+
		"\f\r\u00d6\u0000\r\u0001\u0000\u0000\u0000\u0002\u0013\u0001\u0000\u0000"+
		"\u0000\u0004<\u0001\u0000\u0000\u0000\u0006>\u0001\u0000\u0000\u0000\b"+
		"\u0084\u0001\u0000\u0000\u0000\n\u000b\u0003\u0002\u0001\u0000\u000b\f"+
		"\u0005$\u0000\u0000\f\u000e\u0001\u0000\u0000\u0000\r\n\u0001\u0000\u0000"+
		"\u0000\u000e\u000f\u0001\u0000\u0000\u0000\u000f\r\u0001\u0000\u0000\u0000"+
		"\u000f\u0010\u0001\u0000\u0000\u0000\u0010\u0011\u0001\u0000\u0000\u0000"+
		"\u0011\u0012\u0005\u0000\u0000\u0001\u0012\u0001\u0001\u0000\u0000\u0000"+
		"\u0013\u0014\u0005 \u0000\u0000\u0014\u0017\u0005!\u0000\u0000\u0015\u0016"+
		"\u0005\u001f\u0000\u0000\u0016\u0018\u0005!\u0000\u0000\u0017\u0015\u0001"+
		"\u0000\u0000\u0000\u0017\u0018\u0001\u0000\u0000\u0000\u0018\u0019\u0001"+
		"\u0000\u0000\u0000\u0019\u001d\u0005\u0001\u0000\u0000\u001a\u001b\u0003"+
		"\u0004\u0002\u0000\u001b\u001c\u0005$\u0000\u0000\u001c\u001e\u0001\u0000"+
		"\u0000\u0000\u001d\u001a\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000"+
		"\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000"+
		"\u0000 !\u0001\u0000\u0000\u0000!\"\u0005\u0002\u0000\u0000\"\u0003\u0001"+
		"\u0000\u0000\u0000#$\u0005\"\u0000\u0000$+\u0005\u0003\u0000\u0000%\'"+
		"\u0003\u0006\u0003\u0000&(\u0005\u0004\u0000\u0000\'&\u0001\u0000\u0000"+
		"\u0000\'(\u0001\u0000\u0000\u0000(*\u0001\u0000\u0000\u0000)%\u0001\u0000"+
		"\u0000\u0000*-\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000+,\u0001"+
		"\u0000\u0000\u0000,.\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000"+
		"./\u0005\u0005\u0000\u0000/0\u0005\u0006\u0000\u000001\u0005!\u0000\u0000"+
		"12\u0005\u0001\u0000\u000023\u0003\b\u0004\u000034\u0005\u0002\u0000\u0000"+
		"4=\u0001\u0000\u0000\u000056\u0005\"\u0000\u000067\u0005\u0006\u0000\u0000"+
		"7:\u0005!\u0000\u000089\u0005\u0007\u0000\u00009;\u0003\b\u0004\u0000"+
		":8\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;=\u0001\u0000\u0000"+
		"\u0000<#\u0001\u0000\u0000\u0000<5\u0001\u0000\u0000\u0000=\u0005\u0001"+
		"\u0000\u0000\u0000>?\u0005\"\u0000\u0000?@\u0005\u0006\u0000\u0000@A\u0005"+
		"!\u0000\u0000A\u0007\u0001\u0000\u0000\u0000BC\u0006\u0004\uffff\uffff"+
		"\u0000CD\u0005\"\u0000\u0000DE\u0005\u0007\u0000\u0000E\u0085\u0003\b"+
		"\u0004\u0016FG\u0005\u0015\u0000\u0000GH\u0003\b\u0004\u0000HI\u0005\u001b"+
		"\u0000\u0000IJ\u0003\b\u0004\u0000JK\u0005\u0016\u0000\u0000KL\u0003\b"+
		"\u0004\u0000LM\u0005\u0014\u0000\u0000M\u0085\u0001\u0000\u0000\u0000"+
		"NO\u0005\u0017\u0000\u0000OP\u0003\b\u0004\u0000PQ\u0005\u0019\u0000\u0000"+
		"QR\u0003\b\u0004\u0000RS\u0005\u001a\u0000\u0000S\u0085\u0001\u0000\u0000"+
		"\u0000TX\u0005\u0001\u0000\u0000UV\u0003\b\u0004\u0000VW\u0005$\u0000"+
		"\u0000WY\u0001\u0000\u0000\u0000XU\u0001\u0000\u0000\u0000YZ\u0001\u0000"+
		"\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\\\u0001"+
		"\u0000\u0000\u0000\\]\u0005\u0002\u0000\u0000]\u0085\u0001\u0000\u0000"+
		"\u0000^_\u0005\t\u0000\u0000_`\u0005\"\u0000\u0000`a\u0005\u0006\u0000"+
		"\u0000ad\u0005!\u0000\u0000bc\u0005\u0007\u0000\u0000ce\u0003\b\u0004"+
		"\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000en\u0001\u0000"+
		"\u0000\u0000fg\u0005\u0004\u0000\u0000gh\u0005\"\u0000\u0000hi\u0005\u0006"+
		"\u0000\u0000ij\u0005!\u0000\u0000jk\u0005\u0007\u0000\u0000km\u0003\b"+
		"\u0004\u0000lf\u0001\u0000\u0000\u0000mp\u0001\u0000\u0000\u0000nl\u0001"+
		"\u0000\u0000\u0000no\u0001\u0000\u0000\u0000oq\u0001\u0000\u0000\u0000"+
		"pn\u0001\u0000\u0000\u0000qr\u0005\u0018\u0000\u0000r\u0085\u0003\b\u0004"+
		"\u0010st\u0005\u001c\u0000\u0000t\u0085\u0005!\u0000\u0000uv\u0005\u001e"+
		"\u0000\u0000v\u0085\u0003\b\u0004\u000ewx\u0005\u000e\u0000\u0000x\u0085"+
		"\u0003\b\u0004\u000byz\u0005\u001d\u0000\u0000z\u0085\u0003\b\u0004\u0007"+
		"{|\u0005\u0003\u0000\u0000|}\u0003\b\u0004\u0000}~\u0005\u0005\u0000\u0000"+
		"~\u0085\u0001\u0000\u0000\u0000\u007f\u0085\u0005\"\u0000\u0000\u0080"+
		"\u0085\u0005#\u0000\u0000\u0081\u0085\u0005%\u0000\u0000\u0082\u0085\u0005"+
		"\u0012\u0000\u0000\u0083\u0085\u0005\u0013\u0000\u0000\u0084B\u0001\u0000"+
		"\u0000\u0000\u0084F\u0001\u0000\u0000\u0000\u0084N\u0001\u0000\u0000\u0000"+
		"\u0084T\u0001\u0000\u0000\u0000\u0084^\u0001\u0000\u0000\u0000\u0084s"+
		"\u0001\u0000\u0000\u0000\u0084u\u0001\u0000\u0000\u0000\u0084w\u0001\u0000"+
		"\u0000\u0000\u0084y\u0001\u0000\u0000\u0000\u0084{\u0001\u0000\u0000\u0000"+
		"\u0084\u007f\u0001\u0000\u0000\u0000\u0084\u0080\u0001\u0000\u0000\u0000"+
		"\u0084\u0081\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000"+
		"\u0084\u0083\u0001\u0000\u0000\u0000\u0085\u00b5\u0001\u0000\u0000\u0000"+
		"\u0086\u0087\n\r\u0000\u0000\u0087\u0088\u0007\u0000\u0000\u0000\u0088"+
		"\u00b4\u0003\b\u0004\u000e\u0089\u008a\n\f\u0000\u0000\u008a\u008b\u0007"+
		"\u0001\u0000\u0000\u008b\u00b4\u0003\b\u0004\r\u008c\u008d\n\n\u0000\u0000"+
		"\u008d\u008e\u0005\u000f\u0000\u0000\u008e\u00b4\u0003\b\u0004\u000b\u008f"+
		"\u0090\n\t\u0000\u0000\u0090\u0091\u0005\u0010\u0000\u0000\u0091\u00b4"+
		"\u0003\b\u0004\n\u0092\u0093\n\b\u0000\u0000\u0093\u0094\u0005\u0011\u0000"+
		"\u0000\u0094\u00b4\u0003\b\u0004\t\u0095\u0096\n\u0015\u0000\u0000\u0096"+
		"\u009b\u0005\u0003\u0000\u0000\u0097\u0099\u0003\b\u0004\u0000\u0098\u009a"+
		"\u0005\u0004\u0000\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u0099\u009a"+
		"\u0001\u0000\u0000\u0000\u009a\u009c\u0001\u0000\u0000\u0000\u009b\u0097"+
		"\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009b"+
		"\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u009f"+
		"\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\u0005\u0000\u0000\u00a0\u00b4"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a4\n\u0014\u0000\u0000\u00a2\u00a3\u0005"+
		"\b\u0000\u0000\u00a3\u00a5\u0005!\u0000\u0000\u00a4\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a7\u0005)\u0000\u0000\u00a7\u00a8\u0005\"\u0000"+
		"\u0000\u00a8\u00a9\u0005\u0003\u0000\u0000\u00a9\u00ae\u0003\b\u0004\u0000"+
		"\u00aa\u00ab\u0005\u0004\u0000\u0000\u00ab\u00ad\u0003\b\u0004\u0000\u00ac"+
		"\u00aa\u0001\u0000\u0000\u0000\u00ad\u00b0\u0001\u0000\u0000\u0000\u00ae"+
		"\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1"+
		"\u00b2\u0005\u0005\u0000\u0000\u00b2\u00b4\u0001\u0000\u0000\u0000\u00b3"+
		"\u0086\u0001\u0000\u0000\u0000\u00b3\u0089\u0001\u0000\u0000\u0000\u00b3"+
		"\u008c\u0001\u0000\u0000\u0000\u00b3\u008f\u0001\u0000\u0000\u0000\u00b3"+
		"\u0092\u0001\u0000\u0000\u0000\u00b3\u0095\u0001\u0000\u0000\u0000\u00b3"+
		"\u00a1\u0001\u0000\u0000\u0000\u00b4\u00b7\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6"+
		"\t\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u0011\u000f"+
		"\u0017\u001f\'+:<Zdn\u0084\u0099\u009d\u00a4\u00ae\u00b3\u00b5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}