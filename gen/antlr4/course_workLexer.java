// Generated from C:/Users/Artem/Desktop/antlr/src/main/java/antlr4\course_work.g4 by ANTLR 4.7.2
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
		INTEGER_KW=1, FLOAT_KW=2, CHAR_KW=3, BOOLEAN_KW=4, OR=5, AND=6, EQ=7, 
		NEQ=8, GT=9, LT=10, GTEQ=11, LTEQ=12, PLUS=13, MINUS=14, MULT=15, DIV=16, 
		MOD=17, NOT=18, SCOL=19, ASSIGN=20, OPAR=21, CPAR=22, OBRACE=23, CBRACE=24, 
		TRUE=25, FALSE=26, NULL=27, QMARK=28, SHARP=29, COL=30, SWITCH=31, BY=32, 
		WHILE=33, DO=34, ID=35, INT=36, INT4=37, FLOAT=38, CHAR=39, STRING=40, 
		COMMENT=41, SPACE=42;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INTEGER_KW", "FLOAT_KW", "CHAR_KW", "BOOLEAN_KW", "OR", "AND", "EQ", 
			"NEQ", "GT", "LT", "GTEQ", "LTEQ", "PLUS", "MINUS", "MULT", "DIV", "MOD", 
			"NOT", "SCOL", "ASSIGN", "OPAR", "CPAR", "OBRACE", "CBRACE", "TRUE", 
			"FALSE", "NULL", "QMARK", "SHARP", "COL", "SWITCH", "BY", "WHILE", "DO", 
			"ID", "INT", "INT4", "FLOAT", "CHAR", "STRING", "COMMENT", "SPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'float'", "'char'", "'bool'", "'||'", "'&&'", "'=='", "'!='", 
			"'>'", "'<'", "'>='", "'<='", "'+'", "'-'", "'*'", "'/'", "'%'", "'!'", 
			"';'", "':='", "'('", "')'", "'{'", "'}'", "'true'", "'false'", "'null'", 
			"'?'", "'#'", "':'", "'switch'", "'by'", "'while'", "'do'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INTEGER_KW", "FLOAT_KW", "CHAR_KW", "BOOLEAN_KW", "OR", "AND", 
			"EQ", "NEQ", "GT", "LT", "GTEQ", "LTEQ", "PLUS", "MINUS", "MULT", "DIV", 
			"MOD", "NOT", "SCOL", "ASSIGN", "OPAR", "CPAR", "OBRACE", "CBRACE", "TRUE", 
			"FALSE", "NULL", "QMARK", "SHARP", "COL", "SWITCH", "BY", "WHILE", "DO", 
			"ID", "INT", "INT4", "FLOAT", "CHAR", "STRING", "COMMENT", "SPACE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u0114\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2`\n\2\5\2b\n\2\5\2d\n\2\5\2f\n\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\6$\u00d2\n$\r$\16$\u00d3\3$\3$\3%"+
		"\6%\u00d9\n%\r%\16%\u00da\3&\3&\3&\3&\6&\u00e1\n&\r&\16&\u00e2\3\'\6\'"+
		"\u00e6\n\'\r\'\16\'\u00e7\3\'\3\'\7\'\u00ec\n\'\f\'\16\'\u00ef\13\'\3"+
		"\'\3\'\6\'\u00f3\n\'\r\'\16\'\u00f4\5\'\u00f7\n\'\3(\3(\3(\3(\3)\3)\7"+
		")\u00ff\n)\f)\16)\u0102\13)\3)\3)\3*\3*\3*\3*\7*\u010a\n*\f*\16*\u010d"+
		"\13*\3*\3*\3+\3+\3+\3+\2\2,\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,\3\2\t\5\2C\\aa"+
		"c|\3\2\62;\3\2\62\66\5\2\f\f\17\17))\5\2\f\f\17\17$$\4\2\f\f\17\17\5\2"+
		"\13\f\17\17\"\"\2\u0120\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\3W\3\2\2\2\5g\3\2\2\2\7m\3\2\2\2\tr\3"+
		"\2\2\2\13w\3\2\2\2\rz\3\2\2\2\17}\3\2\2\2\21\u0080\3\2\2\2\23\u0083\3"+
		"\2\2\2\25\u0085\3\2\2\2\27\u0087\3\2\2\2\31\u008a\3\2\2\2\33\u008d\3\2"+
		"\2\2\35\u008f\3\2\2\2\37\u0091\3\2\2\2!\u0093\3\2\2\2#\u0095\3\2\2\2%"+
		"\u0097\3\2\2\2\'\u0099\3\2\2\2)\u009b\3\2\2\2+\u009e\3\2\2\2-\u00a0\3"+
		"\2\2\2/\u00a2\3\2\2\2\61\u00a4\3\2\2\2\63\u00a6\3\2\2\2\65\u00ab\3\2\2"+
		"\2\67\u00b1\3\2\2\29\u00b6\3\2\2\2;\u00b8\3\2\2\2=\u00ba\3\2\2\2?\u00bc"+
		"\3\2\2\2A\u00c3\3\2\2\2C\u00c6\3\2\2\2E\u00cc\3\2\2\2G\u00cf\3\2\2\2I"+
		"\u00d8\3\2\2\2K\u00dc\3\2\2\2M\u00f6\3\2\2\2O\u00f8\3\2\2\2Q\u00fc\3\2"+
		"\2\2S\u0105\3\2\2\2U\u0110\3\2\2\2WX\7k\2\2XY\7p\2\2YZ\7v\2\2Ze\3\2\2"+
		"\2[c\7g\2\2\\a\7i\2\2]_\7g\2\2^`\7t\2\2_^\3\2\2\2_`\3\2\2\2`b\3\2\2\2"+
		"a]\3\2\2\2ab\3\2\2\2bd\3\2\2\2c\\\3\2\2\2cd\3\2\2\2df\3\2\2\2e[\3\2\2"+
		"\2ef\3\2\2\2f\4\3\2\2\2gh\7h\2\2hi\7n\2\2ij\7q\2\2jk\7c\2\2kl\7v\2\2l"+
		"\6\3\2\2\2mn\7e\2\2no\7j\2\2op\7c\2\2pq\7t\2\2q\b\3\2\2\2rs\7d\2\2st\7"+
		"q\2\2tu\7q\2\2uv\7n\2\2v\n\3\2\2\2wx\7~\2\2xy\7~\2\2y\f\3\2\2\2z{\7(\2"+
		"\2{|\7(\2\2|\16\3\2\2\2}~\7?\2\2~\177\7?\2\2\177\20\3\2\2\2\u0080\u0081"+
		"\7#\2\2\u0081\u0082\7?\2\2\u0082\22\3\2\2\2\u0083\u0084\7@\2\2\u0084\24"+
		"\3\2\2\2\u0085\u0086\7>\2\2\u0086\26\3\2\2\2\u0087\u0088\7@\2\2\u0088"+
		"\u0089\7?\2\2\u0089\30\3\2\2\2\u008a\u008b\7>\2\2\u008b\u008c\7?\2\2\u008c"+
		"\32\3\2\2\2\u008d\u008e\7-\2\2\u008e\34\3\2\2\2\u008f\u0090\7/\2\2\u0090"+
		"\36\3\2\2\2\u0091\u0092\7,\2\2\u0092 \3\2\2\2\u0093\u0094\7\61\2\2\u0094"+
		"\"\3\2\2\2\u0095\u0096\7\'\2\2\u0096$\3\2\2\2\u0097\u0098\7#\2\2\u0098"+
		"&\3\2\2\2\u0099\u009a\7=\2\2\u009a(\3\2\2\2\u009b\u009c\7<\2\2\u009c\u009d"+
		"\7?\2\2\u009d*\3\2\2\2\u009e\u009f\7*\2\2\u009f,\3\2\2\2\u00a0\u00a1\7"+
		"+\2\2\u00a1.\3\2\2\2\u00a2\u00a3\7}\2\2\u00a3\60\3\2\2\2\u00a4\u00a5\7"+
		"\177\2\2\u00a5\62\3\2\2\2\u00a6\u00a7\7v\2\2\u00a7\u00a8\7t\2\2\u00a8"+
		"\u00a9\7w\2\2\u00a9\u00aa\7g\2\2\u00aa\64\3\2\2\2\u00ab\u00ac\7h\2\2\u00ac"+
		"\u00ad\7c\2\2\u00ad\u00ae\7n\2\2\u00ae\u00af\7u\2\2\u00af\u00b0\7g\2\2"+
		"\u00b0\66\3\2\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3\7w\2\2\u00b3\u00b4\7"+
		"n\2\2\u00b4\u00b5\7n\2\2\u00b58\3\2\2\2\u00b6\u00b7\7A\2\2\u00b7:\3\2"+
		"\2\2\u00b8\u00b9\7%\2\2\u00b9<\3\2\2\2\u00ba\u00bb\7<\2\2\u00bb>\3\2\2"+
		"\2\u00bc\u00bd\7u\2\2\u00bd\u00be\7y\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0"+
		"\7v\2\2\u00c0\u00c1\7e\2\2\u00c1\u00c2\7j\2\2\u00c2@\3\2\2\2\u00c3\u00c4"+
		"\7d\2\2\u00c4\u00c5\7{\2\2\u00c5B\3\2\2\2\u00c6\u00c7\7y\2\2\u00c7\u00c8"+
		"\7j\2\2\u00c8\u00c9\7k\2\2\u00c9\u00ca\7n\2\2\u00ca\u00cb\7g\2\2\u00cb"+
		"D\3\2\2\2\u00cc\u00cd\7f\2\2\u00cd\u00ce\7q\2\2\u00ceF\3\2\2\2\u00cf\u00d1"+
		"\t\2\2\2\u00d0\u00d2\t\3\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\t\2"+
		"\2\2\u00d6H\3\2\2\2\u00d7\u00d9\t\3\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00da"+
		"\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00dbJ\3\2\2\2\u00dc"+
		"\u00dd\7\66\2\2\u00dd\u00de\7z\2\2\u00de\u00e0\3\2\2\2\u00df\u00e1\t\4"+
		"\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2"+
		"\u00e3\3\2\2\2\u00e3L\3\2\2\2\u00e4\u00e6\t\3\2\2\u00e5\u00e4\3\2\2\2"+
		"\u00e6\u00e7\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9"+
		"\3\2\2\2\u00e9\u00ed\7\60\2\2\u00ea\u00ec\t\3\2\2\u00eb\u00ea\3\2\2\2"+
		"\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f7"+
		"\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f2\7\60\2\2\u00f1\u00f3\t\3\2\2"+
		"\u00f2\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5"+
		"\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00e5\3\2\2\2\u00f6\u00f0\3\2\2\2\u00f7"+
		"N\3\2\2\2\u00f8\u00f9\7)\2\2\u00f9\u00fa\n\5\2\2\u00fa\u00fb\7)\2\2\u00fb"+
		"P\3\2\2\2\u00fc\u0100\7$\2\2\u00fd\u00ff\n\6\2\2\u00fe\u00fd\3\2\2\2\u00ff"+
		"\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\3\2"+
		"\2\2\u0102\u0100\3\2\2\2\u0103\u0104\7$\2\2\u0104R\3\2\2\2\u0105\u0106"+
		"\7\61\2\2\u0106\u0107\7\61\2\2\u0107\u010b\3\2\2\2\u0108\u010a\n\7\2\2"+
		"\u0109\u0108\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c"+
		"\3\2\2\2\u010c\u010e\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u010f\b*\2\2\u010f"+
		"T\3\2\2\2\u0110\u0111\t\b\2\2\u0111\u0112\3\2\2\2\u0112\u0113\b+\2\2\u0113"+
		"V\3\2\2\2\20\2_ace\u00d3\u00da\u00e2\u00e7\u00ed\u00f4\u00f6\u0100\u010b"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}