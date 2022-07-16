// Generated from c:\Users\mario\OneDrive\Documentos\GitHub\Compis2\grammarYAPL.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class grammarYAPLLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"TRUE", "FALSE", "FI", "IF", "ELSE", "WHILE", "IN", "LOOP", "POOL", "THEN", 
			"NEW", "NOT", "ISVOID", "INHERITS", "CLASS", "TYPE", "ID", "INT", "SEMICOLON", 
			"STRING", "ESC", "UNICODE", "HEX", "SMALLCOMMENT", "BIGCOMMENT", "WHITESPACE", 
			"POINT", "ERROR"
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


	public grammarYAPLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "grammarYAPL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u0164\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\5\25\u0093\n\25\3\26\3\26"+
		"\3\26\3\26\5\26\u0099\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27"+
		"\u00a3\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00af"+
		"\n\30\3\31\3\31\3\31\3\31\5\31\u00b5\n\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\5\32\u00bf\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33"+
		"\u00c9\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u00d3\n\34\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\5\35\u00db\n\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\5\36\u00e3\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\5\37\u00f1\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \5 \u0103\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u010f\n!\3\"\3\"\7\""+
		"\u0113\n\"\f\"\16\"\u0116\13\"\3#\3#\7#\u011a\n#\f#\16#\u011d\13#\3$\3"+
		"$\7$\u0121\n$\f$\16$\u0124\13$\3%\3%\3&\3&\3&\7&\u012b\n&\f&\16&\u012e"+
		"\13&\3&\3&\3\'\3\'\3\'\5\'\u0135\n\'\3(\3(\3(\3(\3(\3(\3)\3)\3*\3*\3*"+
		"\3*\7*\u0143\n*\f*\16*\u0146\13*\3*\3*\3+\3+\3+\3+\7+\u014e\n+\f+\16+"+
		"\u0151\13+\3+\3+\3+\3+\3+\3,\6,\u0159\n,\r,\16,\u015a\3,\3,\3-\3-\3.\3"+
		".\3.\3.\2\2/\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E$G%I&K\'M\2O\2Q\2S(U)W*Y+[,\3\2\f\4\2C\\aa\6\2"+
		"\62;C\\aac|\4\2aac|\3\2\62;\4\2$$^^\n\2$$\61\61^^ddhhppttvv\5\2\62;CH"+
		"ch\4\2\f\f\17\17\b\2\f\f\17\17\62;C\\aac|\5\2\13\f\16\17\"\"\2\u0176\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\3]\3\2\2\2\5_\3\2\2\2\7a\3\2\2\2\tc\3\2\2\2\13e\3\2\2\2\rg\3"+
		"\2\2\2\17i\3\2\2\2\21l\3\2\2\2\23n\3\2\2\2\25r\3\2\2\2\27t\3\2\2\2\31"+
		"v\3\2\2\2\33x\3\2\2\2\35z\3\2\2\2\37|\3\2\2\2!~\3\2\2\2#\u0081\3\2\2\2"+
		"%\u0083\3\2\2\2\'\u0088\3\2\2\2)\u0092\3\2\2\2+\u0098\3\2\2\2-\u00a2\3"+
		"\2\2\2/\u00ae\3\2\2\2\61\u00b4\3\2\2\2\63\u00be\3\2\2\2\65\u00c8\3\2\2"+
		"\2\67\u00d2\3\2\2\29\u00da\3\2\2\2;\u00e2\3\2\2\2=\u00f0\3\2\2\2?\u0102"+
		"\3\2\2\2A\u010e\3\2\2\2C\u0110\3\2\2\2E\u0117\3\2\2\2G\u011e\3\2\2\2I"+
		"\u0125\3\2\2\2K\u0127\3\2\2\2M\u0131\3\2\2\2O\u0136\3\2\2\2Q\u013c\3\2"+
		"\2\2S\u013e\3\2\2\2U\u0149\3\2\2\2W\u0158\3\2\2\2Y\u015e\3\2\2\2[\u0160"+
		"\3\2\2\2]^\7}\2\2^\4\3\2\2\2_`\7\177\2\2`\6\3\2\2\2ab\7*\2\2b\b\3\2\2"+
		"\2cd\7.\2\2d\n\3\2\2\2ef\7+\2\2f\f\3\2\2\2gh\7<\2\2h\16\3\2\2\2ij\7>\2"+
		"\2jk\7/\2\2k\20\3\2\2\2lm\7B\2\2m\22\3\2\2\2no\7n\2\2op\7g\2\2pq\7v\2"+
		"\2q\24\3\2\2\2rs\7,\2\2s\26\3\2\2\2tu\7\61\2\2u\30\3\2\2\2vw\7-\2\2w\32"+
		"\3\2\2\2xy\7/\2\2y\34\3\2\2\2z{\7\u0080\2\2{\36\3\2\2\2|}\7>\2\2} \3\2"+
		"\2\2~\177\7>\2\2\177\u0080\7?\2\2\u0080\"\3\2\2\2\u0081\u0082\7?\2\2\u0082"+
		"$\3\2\2\2\u0083\u0084\7v\2\2\u0084\u0085\7t\2\2\u0085\u0086\7w\2\2\u0086"+
		"\u0087\7g\2\2\u0087&\3\2\2\2\u0088\u0089\7h\2\2\u0089\u008a\7c\2\2\u008a"+
		"\u008b\7n\2\2\u008b\u008c\7u\2\2\u008c\u008d\7g\2\2\u008d(\3\2\2\2\u008e"+
		"\u008f\7h\2\2\u008f\u0093\7k\2\2\u0090\u0091\7H\2\2\u0091\u0093\7K\2\2"+
		"\u0092\u008e\3\2\2\2\u0092\u0090\3\2\2\2\u0093*\3\2\2\2\u0094\u0095\7"+
		"k\2\2\u0095\u0099\7h\2\2\u0096\u0097\7K\2\2\u0097\u0099\7H\2\2\u0098\u0094"+
		"\3\2\2\2\u0098\u0096\3\2\2\2\u0099,\3\2\2\2\u009a\u009b\7g\2\2\u009b\u009c"+
		"\7n\2\2\u009c\u009d\7u\2\2\u009d\u00a3\7g\2\2\u009e\u009f\7G\2\2\u009f"+
		"\u00a0\7N\2\2\u00a0\u00a1\7U\2\2\u00a1\u00a3\7G\2\2\u00a2\u009a\3\2\2"+
		"\2\u00a2\u009e\3\2\2\2\u00a3.\3\2\2\2\u00a4\u00a5\7y\2\2\u00a5\u00a6\7"+
		"j\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8\7n\2\2\u00a8\u00af\7g\2\2\u00a9\u00aa"+
		"\7Y\2\2\u00aa\u00ab\7J\2\2\u00ab\u00ac\7K\2\2\u00ac\u00ad\7N\2\2\u00ad"+
		"\u00af\7G\2\2\u00ae\u00a4\3\2\2\2\u00ae\u00a9\3\2\2\2\u00af\60\3\2\2\2"+
		"\u00b0\u00b1\7k\2\2\u00b1\u00b5\7p\2\2\u00b2\u00b3\7K\2\2\u00b3\u00b5"+
		"\7P\2\2\u00b4\u00b0\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\62\3\2\2\2\u00b6"+
		"\u00b7\7n\2\2\u00b7\u00b8\7q\2\2\u00b8\u00b9\7q\2\2\u00b9\u00bf\7r\2\2"+
		"\u00ba\u00bb\7N\2\2\u00bb\u00bc\7Q\2\2\u00bc\u00bd\7Q\2\2\u00bd\u00bf"+
		"\7R\2\2\u00be\u00b6\3\2\2\2\u00be\u00ba\3\2\2\2\u00bf\64\3\2\2\2\u00c0"+
		"\u00c1\7r\2\2\u00c1\u00c2\7q\2\2\u00c2\u00c3\7q\2\2\u00c3\u00c9\7n\2\2"+
		"\u00c4\u00c5\7R\2\2\u00c5\u00c6\7Q\2\2\u00c6\u00c7\7Q\2\2\u00c7\u00c9"+
		"\7N\2\2\u00c8\u00c0\3\2\2\2\u00c8\u00c4\3\2\2\2\u00c9\66\3\2\2\2\u00ca"+
		"\u00cb\7v\2\2\u00cb\u00cc\7j\2\2\u00cc\u00cd\7g\2\2\u00cd\u00d3\7p\2\2"+
		"\u00ce\u00cf\7V\2\2\u00cf\u00d0\7J\2\2\u00d0\u00d1\7G\2\2\u00d1\u00d3"+
		"\7P\2\2\u00d2\u00ca\3\2\2\2\u00d2\u00ce\3\2\2\2\u00d38\3\2\2\2\u00d4\u00d5"+
		"\7p\2\2\u00d5\u00d6\7g\2\2\u00d6\u00db\7y\2\2\u00d7\u00d8\7P\2\2\u00d8"+
		"\u00d9\7G\2\2\u00d9\u00db\7Y\2\2\u00da\u00d4\3\2\2\2\u00da\u00d7\3\2\2"+
		"\2\u00db:\3\2\2\2\u00dc\u00dd\7p\2\2\u00dd\u00de\7q\2\2\u00de\u00e3\7"+
		"v\2\2\u00df\u00e0\7P\2\2\u00e0\u00e1\7Q\2\2\u00e1\u00e3\7V\2\2\u00e2\u00dc"+
		"\3\2\2\2\u00e2\u00df\3\2\2\2\u00e3<\3\2\2\2\u00e4\u00e5\7k\2\2\u00e5\u00e6"+
		"\7u\2\2\u00e6\u00e7\7x\2\2\u00e7\u00e8\7q\2\2\u00e8\u00e9\7k\2\2\u00e9"+
		"\u00f1\7f\2\2\u00ea\u00eb\7K\2\2\u00eb\u00ec\7U\2\2\u00ec\u00ed\7X\2\2"+
		"\u00ed\u00ee\7Q\2\2\u00ee\u00ef\7K\2\2\u00ef\u00f1\7F\2\2\u00f0\u00e4"+
		"\3\2\2\2\u00f0\u00ea\3\2\2\2\u00f1>\3\2\2\2\u00f2\u00f3\7k\2\2\u00f3\u00f4"+
		"\7p\2\2\u00f4\u00f5\7j\2\2\u00f5\u00f6\7g\2\2\u00f6\u00f7\7t\2\2\u00f7"+
		"\u00f8\7k\2\2\u00f8\u00f9\7v\2\2\u00f9\u0103\7u\2\2\u00fa\u00fb\7K\2\2"+
		"\u00fb\u00fc\7P\2\2\u00fc\u00fd\7J\2\2\u00fd\u00fe\7G\2\2\u00fe\u00ff"+
		"\7T\2\2\u00ff\u0100\7K\2\2\u0100\u0101\7V\2\2\u0101\u0103\7U\2\2\u0102"+
		"\u00f2\3\2\2\2\u0102\u00fa\3\2\2\2\u0103@\3\2\2\2\u0104\u0105\7e\2\2\u0105"+
		"\u0106\7n\2\2\u0106\u0107\7c\2\2\u0107\u0108\7u\2\2\u0108\u010f\7u\2\2"+
		"\u0109\u010a\7E\2\2\u010a\u010b\7N\2\2\u010b\u010c\7C\2\2\u010c\u010d"+
		"\7U\2\2\u010d\u010f\7U\2\2\u010e\u0104\3\2\2\2\u010e\u0109\3\2\2\2\u010f"+
		"B\3\2\2\2\u0110\u0114\t\2\2\2\u0111\u0113\t\3\2\2\u0112\u0111\3\2\2\2"+
		"\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115D\3"+
		"\2\2\2\u0116\u0114\3\2\2\2\u0117\u011b\t\4\2\2\u0118\u011a\t\3\2\2\u0119"+
		"\u0118\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2"+
		"\2\2\u011cF\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u0122\t\5\2\2\u011f\u0121"+
		"\t\5\2\2\u0120\u011f\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123H\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0126\7=\2\2\u0126"+
		"J\3\2\2\2\u0127\u012c\7$\2\2\u0128\u012b\5M\'\2\u0129\u012b\n\6\2\2\u012a"+
		"\u0128\3\2\2\2\u012a\u0129\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2"+
		"\2\2\u012c\u012d\3\2\2\2\u012d\u012f\3\2\2\2\u012e\u012c\3\2\2\2\u012f"+
		"\u0130\7$\2\2\u0130L\3\2\2\2\u0131\u0134\7^\2\2\u0132\u0135\t\7\2\2\u0133"+
		"\u0135\5O(\2\u0134\u0132\3\2\2\2\u0134\u0133\3\2\2\2\u0135N\3\2\2\2\u0136"+
		"\u0137\7w\2\2\u0137\u0138\5Q)\2\u0138\u0139\5Q)\2\u0139\u013a\5Q)\2\u013a"+
		"\u013b\5Q)\2\u013bP\3\2\2\2\u013c\u013d\t\b\2\2\u013dR\3\2\2\2\u013e\u013f"+
		"\7/\2\2\u013f\u0140\7/\2\2\u0140\u0144\3\2\2\2\u0141\u0143\n\t\2\2\u0142"+
		"\u0141\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2"+
		"\2\2\u0145\u0147\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0148\b*\2\2\u0148"+
		"T\3\2\2\2\u0149\u014a\7*\2\2\u014a\u014b\7,\2\2\u014b\u014f\3\2\2\2\u014c"+
		"\u014e\n\n\2\2\u014d\u014c\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2"+
		"\2\2\u014f\u0150\3\2\2\2\u0150\u0152\3\2\2\2\u0151\u014f\3\2\2\2\u0152"+
		"\u0153\7,\2\2\u0153\u0154\7+\2\2\u0154\u0155\3\2\2\2\u0155\u0156\b+\2"+
		"\2\u0156V\3\2\2\2\u0157\u0159\t\13\2\2\u0158\u0157\3\2\2\2\u0159\u015a"+
		"\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\3\2\2\2\u015c"+
		"\u015d\b,\2\2\u015dX\3\2\2\2\u015e\u015f\7\60\2\2\u015fZ\3\2\2\2\u0160"+
		"\u0161\13\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163\b.\2\2\u0163\\\3\2\2\2"+
		"\31\2\u0092\u0098\u00a2\u00ae\u00b4\u00be\u00c8\u00d2\u00da\u00e2\u00f0"+
		"\u0102\u010e\u0114\u011b\u0122\u012a\u012c\u0134\u0144\u014f\u015a\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}