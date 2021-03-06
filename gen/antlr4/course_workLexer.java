// Generated from D:/OneDrive/CODE/_GIT/antlr/src/main/java/antlr4\course_work.g4 by ANTLR 4.7.2
package antlr4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class course_workLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		QMARK=1, SHARP=2, SWITCH=3, BY=4, REPEAT=5, WHEN=6, NUMBER_KW=7, REAL_KW=8, 
		CHAR_KW=9, BOOLEAN_KW=10, PLUS=11, MINUS=12, MULT=13, DIV=14, LTEQ=15, 
		GTEQ=16, LT=17, GT=18, EQ=19, NEQ=20, AND=21, OR=22, ID=23, INT=24, FLOAT=25, 
		CHAR=26, INT5=27, YES=28, NO=29, NULL=30, COL=31, SCOL=32, OPAR=33, CPAR=34, 
		OBRACE=35, CBRACE=36, SPACE=37;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"QMARK", "SHARP", "SWITCH", "BY", "REPEAT", "WHEN", "NUMBER_KW", "REAL_KW", 
			"CHAR_KW", "BOOLEAN_KW", "PLUS", "MINUS", "MULT", "DIV", "LTEQ", "GTEQ", 
			"LT", "GT", "EQ", "NEQ", "AND", "OR", "ID", "INT", "FLOAT", "CHAR", "INT5", 
			"YES", "NO", "NULL", "COL", "SCOL", "OPAR", "CPAR", "OBRACE", "CBRACE", 
			"SPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'?'", "'#'", "'switch'", "'by'", "'repeat'", "'when'", "'number'", 
			"'real'", null, "'bool'", "'+'", "'-'", "'*'", "'/'", "'<='", "'>='", 
			"'<'", "'>'", "'='", "'<>'", "'&&'", "'||'", null, null, null, null, 
			null, "'YES'", "'NO'", "'null'", "':'", "';'", "'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "QMARK", "SHARP", "SWITCH", "BY", "REPEAT", "WHEN", "NUMBER_KW", 
			"REAL_KW", "CHAR_KW", "BOOLEAN_KW", "PLUS", "MINUS", "MULT", "DIV", "LTEQ", 
			"GTEQ", "LT", "GT", "EQ", "NEQ", "AND", "OR", "ID", "INT", "FLOAT", "CHAR", 
			"INT5", "YES", "NO", "NULL", "COL", "SCOL", "OPAR", "CPAR", "OBRACE", 
			"CBRACE", "SPACE"
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


	public course_workLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "course_work.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u00e6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\5\n~\n\n\5\n\u0080\n\n\5\n\u0082\n\n\5\n\u0084\n\n"+
		"\5\n\u0086\n\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\6\31"+
		"\u00af\n\31\r\31\16\31\u00b0\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u00ba"+
		"\n\32\3\32\5\32\u00bd\n\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\6\34"+
		"\u00c7\n\34\r\34\16\34\u00c8\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3"+
		"\37\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3&\2"+
		"\2\'\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'\3\2\7\5\2C\\aac|\3\2\62;\5\2\f\f\17\17))\3\2\62"+
		"\66\5\2\13\f\17\17\"\"\2\u00ef\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\3M\3\2\2\2\5O\3"+
		"\2\2\2\7Q\3\2\2\2\tX\3\2\2\2\13[\3\2\2\2\rb\3\2\2\2\17g\3\2\2\2\21n\3"+
		"\2\2\2\23s\3\2\2\2\25\u0087\3\2\2\2\27\u008c\3\2\2\2\31\u008e\3\2\2\2"+
		"\33\u0090\3\2\2\2\35\u0092\3\2\2\2\37\u0094\3\2\2\2!\u0097\3\2\2\2#\u009a"+
		"\3\2\2\2%\u009c\3\2\2\2\'\u009e\3\2\2\2)\u00a0\3\2\2\2+\u00a3\3\2\2\2"+
		"-\u00a6\3\2\2\2/\u00a9\3\2\2\2\61\u00ae\3\2\2\2\63\u00b9\3\2\2\2\65\u00be"+
		"\3\2\2\2\67\u00c2\3\2\2\29\u00ca\3\2\2\2;\u00ce\3\2\2\2=\u00d1\3\2\2\2"+
		"?\u00d6\3\2\2\2A\u00d8\3\2\2\2C\u00da\3\2\2\2E\u00dc\3\2\2\2G\u00de\3"+
		"\2\2\2I\u00e0\3\2\2\2K\u00e2\3\2\2\2MN\7A\2\2N\4\3\2\2\2OP\7%\2\2P\6\3"+
		"\2\2\2QR\7u\2\2RS\7y\2\2ST\7k\2\2TU\7v\2\2UV\7e\2\2VW\7j\2\2W\b\3\2\2"+
		"\2XY\7d\2\2YZ\7{\2\2Z\n\3\2\2\2[\\\7t\2\2\\]\7g\2\2]^\7r\2\2^_\7g\2\2"+
		"_`\7c\2\2`a\7v\2\2a\f\3\2\2\2bc\7y\2\2cd\7j\2\2de\7g\2\2ef\7p\2\2f\16"+
		"\3\2\2\2gh\7p\2\2hi\7w\2\2ij\7o\2\2jk\7d\2\2kl\7g\2\2lm\7t\2\2m\20\3\2"+
		"\2\2no\7t\2\2op\7g\2\2pq\7c\2\2qr\7n\2\2r\22\3\2\2\2st\7e\2\2tu\7j\2\2"+
		"uv\7c\2\2vw\7t\2\2w\u0085\3\2\2\2x\u0083\7c\2\2y\u0081\7e\2\2z\177\7v"+
		"\2\2{}\7g\2\2|~\7t\2\2}|\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177{\3\2\2\2"+
		"\177\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081z\3\2\2\2\u0081\u0082\3\2"+
		"\2\2\u0082\u0084\3\2\2\2\u0083y\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086"+
		"\3\2\2\2\u0085x\3\2\2\2\u0085\u0086\3\2\2\2\u0086\24\3\2\2\2\u0087\u0088"+
		"\7d\2\2\u0088\u0089\7q\2\2\u0089\u008a\7q\2\2\u008a\u008b\7n\2\2\u008b"+
		"\26\3\2\2\2\u008c\u008d\7-\2\2\u008d\30\3\2\2\2\u008e\u008f\7/\2\2\u008f"+
		"\32\3\2\2\2\u0090\u0091\7,\2\2\u0091\34\3\2\2\2\u0092\u0093\7\61\2\2\u0093"+
		"\36\3\2\2\2\u0094\u0095\7>\2\2\u0095\u0096\7?\2\2\u0096 \3\2\2\2\u0097"+
		"\u0098\7@\2\2\u0098\u0099\7?\2\2\u0099\"\3\2\2\2\u009a\u009b\7>\2\2\u009b"+
		"$\3\2\2\2\u009c\u009d\7@\2\2\u009d&\3\2\2\2\u009e\u009f\7?\2\2\u009f("+
		"\3\2\2\2\u00a0\u00a1\7>\2\2\u00a1\u00a2\7@\2\2\u00a2*\3\2\2\2\u00a3\u00a4"+
		"\7(\2\2\u00a4\u00a5\7(\2\2\u00a5,\3\2\2\2\u00a6\u00a7\7~\2\2\u00a7\u00a8"+
		"\7~\2\2\u00a8.\3\2\2\2\u00a9\u00aa\t\2\2\2\u00aa\u00ab\5\61\31\2\u00ab"+
		"\u00ac\t\2\2\2\u00ac\60\3\2\2\2\u00ad\u00af\t\3\2\2\u00ae\u00ad\3\2\2"+
		"\2\u00af\u00b0\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\62"+
		"\3\2\2\2\u00b2\u00ba\5\61\31\2\u00b3\u00b4\7\60\2\2\u00b4\u00ba\5\61\31"+
		"\2\u00b5\u00b6\5\61\31\2\u00b6\u00b7\7\60\2\2\u00b7\u00b8\5\61\31\2\u00b8"+
		"\u00ba\3\2\2\2\u00b9\u00b2\3\2\2\2\u00b9\u00b3\3\2\2\2\u00b9\u00b5\3\2"+
		"\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00bd\7h\2\2\u00bc\u00bb\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\64\3\2\2\2\u00be\u00bf\7)\2\2\u00bf\u00c0\n\4\2\2"+
		"\u00c0\u00c1\7)\2\2\u00c1\66\3\2\2\2\u00c2\u00c3\7\67\2\2\u00c3\u00c4"+
		"\7z\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c7\t\5\2\2\u00c6\u00c5\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c98\3\2\2\2"+
		"\u00ca\u00cb\7[\2\2\u00cb\u00cc\7G\2\2\u00cc\u00cd\7U\2\2\u00cd:\3\2\2"+
		"\2\u00ce\u00cf\7P\2\2\u00cf\u00d0\7Q\2\2\u00d0<\3\2\2\2\u00d1\u00d2\7"+
		"p\2\2\u00d2\u00d3\7w\2\2\u00d3\u00d4\7n\2\2\u00d4\u00d5\7n\2\2\u00d5>"+
		"\3\2\2\2\u00d6\u00d7\7<\2\2\u00d7@\3\2\2\2\u00d8\u00d9\7=\2\2\u00d9B\3"+
		"\2\2\2\u00da\u00db\7*\2\2\u00dbD\3\2\2\2\u00dc\u00dd\7+\2\2\u00ddF\3\2"+
		"\2\2\u00de\u00df\7}\2\2\u00dfH\3\2\2\2\u00e0\u00e1\7\177\2\2\u00e1J\3"+
		"\2\2\2\u00e2\u00e3\t\6\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\b&\2\2\u00e5"+
		"L\3\2\2\2\f\2}\177\u0081\u0083\u0085\u00b0\u00b9\u00bc\u00c8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}