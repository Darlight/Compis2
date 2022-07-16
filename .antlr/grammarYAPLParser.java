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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, TRUE=8, FALSE=9, 
		FI=10, IF=11, ELSE=12, WHILE=13, IN=14, LOOP=15, POOL=16, THEN=17, NEW=18, 
		NOT=19, ISVOID=20, INHERITS=21, CLASS=22, TYPE=23, ID=24, INT=25, SEMICOLON=26, 
		STRING=27, SMALLCOMMENT=28, BIGCOMMENT=29, WHITESPACE=30;
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
			null, "'{'", "'}'", "'('", "','", "')'", "':'", "'<-'", "'true'", "'false'", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "TRUE", "FALSE", "FI", 
			"IF", "ELSE", "WHILE", "IN", "LOOP", "POOL", "THEN", "NEW", "NOT", "ISVOID", 
			"INHERITS", "CLASS", "TYPE", "ID", "INT", "SEMICOLON", "STRING", "SMALLCOMMENT", 
			"BIGCOMMENT", "WHITESPACE"
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
				expr();
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
					expr();
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
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr);
		try {
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 T\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\3\2\6\2\16\n\2\r\2\16\2\17\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\5\3\30\n\3\3\3\3\3\3\3\3\3\6\3\36\n\3\r\3\16\3\37\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\5\4(\n\4\7\4*\n\4\f\4\16\4-\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\5\4;\n\4\5\4=\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6R\n\6\3\6\2\2\7\2\4"+
		"\6\b\n\2\2\2c\2\r\3\2\2\2\4\23\3\2\2\2\6<\3\2\2\2\b>\3\2\2\2\nQ\3\2\2"+
		"\2\f\16\5\4\3\2\r\f\3\2\2\2\16\17\3\2\2\2\17\r\3\2\2\2\17\20\3\2\2\2\20"+
		"\21\3\2\2\2\21\22\7\2\2\3\22\3\3\2\2\2\23\24\7\30\2\2\24\27\7\31\2\2\25"+
		"\26\7\27\2\2\26\30\7\31\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\31\3\2\2\2"+
		"\31\35\7\3\2\2\32\33\5\6\4\2\33\34\7\34\2\2\34\36\3\2\2\2\35\32\3\2\2"+
		"\2\36\37\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 !\3\2\2\2!\"\7\4\2\2\"\5\3"+
		"\2\2\2#$\7\32\2\2$+\7\5\2\2%\'\5\b\5\2&(\7\6\2\2\'&\3\2\2\2\'(\3\2\2\2"+
		"(*\3\2\2\2)%\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,.\3\2\2\2-+\3\2\2\2"+
		"./\7\7\2\2/\60\7\b\2\2\60\61\7\31\2\2\61\62\7\3\2\2\62\63\5\n\6\2\63\64"+
		"\7\4\2\2\64=\3\2\2\2\65\66\7\32\2\2\66\67\7\b\2\2\67:\7\31\2\289\7\t\2"+
		"\29;\5\n\6\2:8\3\2\2\2:;\3\2\2\2;=\3\2\2\2<#\3\2\2\2<\65\3\2\2\2=\7\3"+
		"\2\2\2>?\7\32\2\2?@\7\b\2\2@A\7\31\2\2A\t\3\2\2\2BR\3\2\2\2CR\3\2\2\2"+
		"DR\3\2\2\2ER\3\2\2\2FR\3\2\2\2GR\3\2\2\2HR\3\2\2\2IR\3\2\2\2JR\3\2\2\2"+
		"KR\3\2\2\2LR\3\2\2\2MR\3\2\2\2NR\3\2\2\2OR\3\2\2\2PR\3\2\2\2QB\3\2\2\2"+
		"QC\3\2\2\2QD\3\2\2\2QE\3\2\2\2QF\3\2\2\2QG\3\2\2\2QH\3\2\2\2QI\3\2\2\2"+
		"QJ\3\2\2\2QK\3\2\2\2QL\3\2\2\2QM\3\2\2\2QN\3\2\2\2QO\3\2\2\2QP\3\2\2\2"+
		"R\13\3\2\2\2\n\17\27\37\'+:<Q";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}