// Generated from C:/Users/Artem/OneDrive/CODE/_GIT/antlr/src/main/java/antlr4\course_work.g4 by ANTLR 4.7.2
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
		NOT=17, SCOL=18, ASSIGN=19, OPAR=20, CPAR=21, OBRACE=22, CBRACE=23, TRUE=24, 
		FALSE=25, NULL=26, QMARK=27, SHARP=28, COL=29, SWITCH=30, BY=31, WHILE=32, 
		DO=33, ID=34, INT=35, INT4=36, FLOAT=37, CHAR=38, STRING=39, COMMENT=40, 
		SPACE=41;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INTEGER_KW", "FLOAT_KW", "CHAR_KW", "BOOLEAN_KW", "OR", "AND", "EQ", 
			"NEQ", "GT", "LT", "GTEQ", "LTEQ", "PLUS", "MINUS", "MULT", "DIV", "NOT", 
			"SCOL", "ASSIGN", "OPAR", "CPAR", "OBRACE", "CBRACE", "TRUE", "FALSE", 
			"NULL", "QMARK", "SHARP", "COL", "SWITCH", "BY", "WHILE", "DO", "ID", 
			"INT", "INT4", "FLOAT", "CHAR", "STRING", "COMMENT", "SPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'float'", "'char'", "'bool'", "'||'", "'&&'", "'=='", "'!='", 
			"'>'", "'<'", "'>='", "'<='", "'+'", "'-'", "'*'", "'/'", "'!'", "';'", 
			"':='", "'('", "')'", "'{'", "'}'", "'true'", "'false'", "'null'", "'?'", 
			"'#'", "':'", "'switch'", "'by'", "'while'", "'do'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INTEGER_KW", "FLOAT_KW", "CHAR_KW", "BOOLEAN_KW", "OR", "AND", 
			"EQ", "NEQ", "GT", "LT", "GTEQ", "LTEQ", "PLUS", "MINUS", "MULT", "DIV", 
			"NOT", "SCOL", "ASSIGN", "OPAR", "CPAR", "OBRACE", "CBRACE", "TRUE", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u0110\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\5\2^\n\2\5\2`\n\2\5\2b\n\2\5\2d\n\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3"+
		"!\3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\6#\u00ce\n#\r#\16#\u00cf\3#\3#\3$\6$\u00d5"+
		"\n$\r$\16$\u00d6\3%\3%\3%\3%\6%\u00dd\n%\r%\16%\u00de\3&\6&\u00e2\n&\r"+
		"&\16&\u00e3\3&\3&\7&\u00e8\n&\f&\16&\u00eb\13&\3&\3&\6&\u00ef\n&\r&\16"+
		"&\u00f0\5&\u00f3\n&\3\'\3\'\3\'\3\'\3(\3(\7(\u00fb\n(\f(\16(\u00fe\13"+
		"(\3(\3(\3)\3)\3)\3)\7)\u0106\n)\f)\16)\u0109\13)\3)\3)\3*\3*\3*\3*\2\2"+
		"+\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'M(O)Q*S+\3\2\t\5\2C\\aac|\3\2\62;\3\2\62\66\5\2\f\f"+
		"\17\17))\5\2\f\f\17\17$$\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u011c\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3U\3"+
		"\2\2\2\5e\3\2\2\2\7k\3\2\2\2\tp\3\2\2\2\13u\3\2\2\2\rx\3\2\2\2\17{\3\2"+
		"\2\2\21~\3\2\2\2\23\u0081\3\2\2\2\25\u0083\3\2\2\2\27\u0085\3\2\2\2\31"+
		"\u0088\3\2\2\2\33\u008b\3\2\2\2\35\u008d\3\2\2\2\37\u008f\3\2\2\2!\u0091"+
		"\3\2\2\2#\u0093\3\2\2\2%\u0095\3\2\2\2\'\u0097\3\2\2\2)\u009a\3\2\2\2"+
		"+\u009c\3\2\2\2-\u009e\3\2\2\2/\u00a0\3\2\2\2\61\u00a2\3\2\2\2\63\u00a7"+
		"\3\2\2\2\65\u00ad\3\2\2\2\67\u00b2\3\2\2\29\u00b4\3\2\2\2;\u00b6\3\2\2"+
		"\2=\u00b8\3\2\2\2?\u00bf\3\2\2\2A\u00c2\3\2\2\2C\u00c8\3\2\2\2E\u00cb"+
		"\3\2\2\2G\u00d4\3\2\2\2I\u00d8\3\2\2\2K\u00f2\3\2\2\2M\u00f4\3\2\2\2O"+
		"\u00f8\3\2\2\2Q\u0101\3\2\2\2S\u010c\3\2\2\2UV\7k\2\2VW\7p\2\2WX\7v\2"+
		"\2Xc\3\2\2\2Ya\7g\2\2Z_\7i\2\2[]\7g\2\2\\^\7t\2\2]\\\3\2\2\2]^\3\2\2\2"+
		"^`\3\2\2\2_[\3\2\2\2_`\3\2\2\2`b\3\2\2\2aZ\3\2\2\2ab\3\2\2\2bd\3\2\2\2"+
		"cY\3\2\2\2cd\3\2\2\2d\4\3\2\2\2ef\7h\2\2fg\7n\2\2gh\7q\2\2hi\7c\2\2ij"+
		"\7v\2\2j\6\3\2\2\2kl\7e\2\2lm\7j\2\2mn\7c\2\2no\7t\2\2o\b\3\2\2\2pq\7"+
		"d\2\2qr\7q\2\2rs\7q\2\2st\7n\2\2t\n\3\2\2\2uv\7~\2\2vw\7~\2\2w\f\3\2\2"+
		"\2xy\7(\2\2yz\7(\2\2z\16\3\2\2\2{|\7?\2\2|}\7?\2\2}\20\3\2\2\2~\177\7"+
		"#\2\2\177\u0080\7?\2\2\u0080\22\3\2\2\2\u0081\u0082\7@\2\2\u0082\24\3"+
		"\2\2\2\u0083\u0084\7>\2\2\u0084\26\3\2\2\2\u0085\u0086\7@\2\2\u0086\u0087"+
		"\7?\2\2\u0087\30\3\2\2\2\u0088\u0089\7>\2\2\u0089\u008a\7?\2\2\u008a\32"+
		"\3\2\2\2\u008b\u008c\7-\2\2\u008c\34\3\2\2\2\u008d\u008e\7/\2\2\u008e"+
		"\36\3\2\2\2\u008f\u0090\7,\2\2\u0090 \3\2\2\2\u0091\u0092\7\61\2\2\u0092"+
		"\"\3\2\2\2\u0093\u0094\7#\2\2\u0094$\3\2\2\2\u0095\u0096\7=\2\2\u0096"+
		"&\3\2\2\2\u0097\u0098\7<\2\2\u0098\u0099\7?\2\2\u0099(\3\2\2\2\u009a\u009b"+
		"\7*\2\2\u009b*\3\2\2\2\u009c\u009d\7+\2\2\u009d,\3\2\2\2\u009e\u009f\7"+
		"}\2\2\u009f.\3\2\2\2\u00a0\u00a1\7\177\2\2\u00a1\60\3\2\2\2\u00a2\u00a3"+
		"\7v\2\2\u00a3\u00a4\7t\2\2\u00a4\u00a5\7w\2\2\u00a5\u00a6\7g\2\2\u00a6"+
		"\62\3\2\2\2\u00a7\u00a8\7h\2\2\u00a8\u00a9\7c\2\2\u00a9\u00aa\7n\2\2\u00aa"+
		"\u00ab\7u\2\2\u00ab\u00ac\7g\2\2\u00ac\64\3\2\2\2\u00ad\u00ae\7p\2\2\u00ae"+
		"\u00af\7w\2\2\u00af\u00b0\7n\2\2\u00b0\u00b1\7n\2\2\u00b1\66\3\2\2\2\u00b2"+
		"\u00b3\7A\2\2\u00b38\3\2\2\2\u00b4\u00b5\7%\2\2\u00b5:\3\2\2\2\u00b6\u00b7"+
		"\7<\2\2\u00b7<\3\2\2\2\u00b8\u00b9\7u\2\2\u00b9\u00ba\7y\2\2\u00ba\u00bb"+
		"\7k\2\2\u00bb\u00bc\7v\2\2\u00bc\u00bd\7e\2\2\u00bd\u00be\7j\2\2\u00be"+
		">\3\2\2\2\u00bf\u00c0\7d\2\2\u00c0\u00c1\7{\2\2\u00c1@\3\2\2\2\u00c2\u00c3"+
		"\7y\2\2\u00c3\u00c4\7j\2\2\u00c4\u00c5\7k\2\2\u00c5\u00c6\7n\2\2\u00c6"+
		"\u00c7\7g\2\2\u00c7B\3\2\2\2\u00c8\u00c9\7f\2\2\u00c9\u00ca\7q\2\2\u00ca"+
		"D\3\2\2\2\u00cb\u00cd\t\2\2\2\u00cc\u00ce\t\3\2\2\u00cd\u00cc\3\2\2\2"+
		"\u00ce\u00cf\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1"+
		"\3\2\2\2\u00d1\u00d2\t\2\2\2\u00d2F\3\2\2\2\u00d3\u00d5\t\3\2\2\u00d4"+
		"\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2"+
		"\2\2\u00d7H\3\2\2\2\u00d8\u00d9\7\66\2\2\u00d9\u00da\7z\2\2\u00da\u00dc"+
		"\3\2\2\2\u00db\u00dd\t\4\2\2\u00dc\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00dfJ\3\2\2\2\u00e0\u00e2\t\3\2\2"+
		"\u00e1\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4"+
		"\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e9\7\60\2\2\u00e6\u00e8\t\3\2\2"+
		"\u00e7\u00e6\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea"+
		"\3\2\2\2\u00ea\u00f3\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ee\7\60\2\2"+
		"\u00ed\u00ef\t\3\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00ee"+
		"\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00e1\3\2\2\2\u00f2"+
		"\u00ec\3\2\2\2\u00f3L\3\2\2\2\u00f4\u00f5\7)\2\2\u00f5\u00f6\n\5\2\2\u00f6"+
		"\u00f7\7)\2\2\u00f7N\3\2\2\2\u00f8\u00fc\7$\2\2\u00f9\u00fb\n\6\2\2\u00fa"+
		"\u00f9\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2"+
		"\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0100\7$\2\2\u0100"+
		"P\3\2\2\2\u0101\u0102\7\61\2\2\u0102\u0103\7\61\2\2\u0103\u0107\3\2\2"+
		"\2\u0104\u0106\n\7\2\2\u0105\u0104\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105"+
		"\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010a\3\2\2\2\u0109\u0107\3\2\2\2\u010a"+
		"\u010b\b)\2\2\u010bR\3\2\2\2\u010c\u010d\t\b\2\2\u010d\u010e\3\2\2\2\u010e"+
		"\u010f\b*\2\2\u010fT\3\2\2\2\20\2]_ac\u00cf\u00d6\u00de\u00e3\u00e9\u00f0"+
		"\u00f2\u00fc\u0107\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}