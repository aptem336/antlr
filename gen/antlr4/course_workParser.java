// Generated from C:/Users/Artem/OneDrive/CODE/_GIT/antlr/src/main/java/antlr4\course_work.g4 by ANTLR 4.7.2
package antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class course_workParser extends Parser {
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
	public static final int
		RULE_parse = 0, RULE_block = 1, RULE_stat = 2, RULE_declaration = 3, RULE_assignment = 4, 
		RULE_stat_block = 5, RULE_if_stat = 6, RULE_switch_stat = 7, RULE_option = 8, 
		RULE_while_stat = 9, RULE_expr = 10, RULE_atom = 11, RULE_logic_expr = 12, 
		RULE_logic_atom = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "block", "stat", "declaration", "assignment", "stat_block", 
			"if_stat", "switch_stat", "option", "while_stat", "expr", "atom", "logic_expr", 
			"logic_atom"
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

	@Override
	public String getGrammarFileName() { return "course_work.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	Emitter emitter;
	public course_workParser(CommonTokenStream input, Emitter emitter){
	    this(input);
	    this.emitter = emitter;
	}

	public course_workParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(course_workParser.EOF, 0); }
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof course_workListener ) ((course_workListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof course_workListener ) ((course_workListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof course_workVisitor ) return ((course_workVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			block();
			setState(29);
			match(EOF);
			emitter.addLine("HALT");
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof course_workListener ) ((course_workListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof course_workListener ) ((course_workListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof course_workVisitor ) return ((course_workVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER_KW) | (1L << FLOAT_KW) | (1L << CHAR_KW) | (1L << BOOLEAN_KW) | (1L << QMARK) | (1L << SWITCH) | (1L << WHILE) | (1L << ID))) != 0)) {
				{
				{
				setState(32);
				stat();
				}
				}
				setState(37);
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

	public static class StatContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(course_workParser.SCOL, 0); }
		public If_statContext if_stat() {
			return getRuleContext(If_statContext.class,0);
		}
		public Switch_statContext switch_stat() {
			return getRuleContext(Switch_statContext.class,0);
		}
		public While_statContext while_stat() {
			return getRuleContext(While_statContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof course_workListener ) ((course_workListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof course_workListener ) ((course_workListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof course_workVisitor ) return ((course_workVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stat);
		try {
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_KW:
			case FLOAT_KW:
			case CHAR_KW:
			case BOOLEAN_KW:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				declaration();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				assignment();
				setState(40);
				match(SCOL);
				}
				break;
			case QMARK:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				if_stat();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 4);
				{
				setState(43);
				switch_stat();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(44);
				while_stat();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode SCOL() { return getToken(course_workParser.SCOL, 0); }
		public TerminalNode INTEGER_KW() { return getToken(course_workParser.INTEGER_KW, 0); }
		public TerminalNode FLOAT_KW() { return getToken(course_workParser.FLOAT_KW, 0); }
		public TerminalNode CHAR_KW() { return getToken(course_workParser.CHAR_KW, 0); }
		public TerminalNode BOOLEAN_KW() { return getToken(course_workParser.BOOLEAN_KW, 0); }
		public TerminalNode ID() { return getToken(course_workParser.ID, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof course_workListener ) ((course_workListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof course_workListener ) ((course_workListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof course_workVisitor ) return ((course_workVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER_KW) | (1L << FLOAT_KW) | (1L << CHAR_KW) | (1L << BOOLEAN_KW))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(51);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(48);
				match(ID);
				emitter.addVariable(_localctx.getText());
				}
				break;
			case 2:
				{
				setState(50);
				assignment();
				}
				break;
			}
			setState(53);
			match(SCOL);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(course_workParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(course_workParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Logic_exprContext logic_expr() {
			return getRuleContext(Logic_exprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof course_workListener ) ((course_workListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof course_workListener ) ((course_workListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof course_workVisitor ) return ((course_workVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(ID);
			emitter.addVariable(_localctx.getText());emitter.addLine("LVALUE "+_localctx.ID().getText());
			setState(57);
			match(ASSIGN);
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(58);
				expr(0);
				}
				break;
			case 2:
				{
				setState(59);
				logic_expr(0);
				}
				break;
			}
			emitter.addLine(":=");
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

	public static class Stat_blockContext extends ParserRuleContext {
		public TerminalNode OBRACE() { return getToken(course_workParser.OBRACE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode CBRACE() { return getToken(course_workParser.CBRACE, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public Stat_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof course_workListener ) ((course_workListener)listener).enterStat_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof course_workListener ) ((course_workListener)listener).exitStat_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof course_workVisitor ) return ((course_workVisitor<? extends T>)visitor).visitStat_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stat_blockContext stat_block() throws RecognitionException {
		Stat_blockContext _localctx = new Stat_blockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stat_block);
		try {
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				match(OBRACE);
				setState(65);
				block();
				setState(66);
				match(CBRACE);
				}
				break;
			case INTEGER_KW:
			case FLOAT_KW:
			case CHAR_KW:
			case BOOLEAN_KW:
			case QMARK:
			case SWITCH:
			case WHILE:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				stat();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class If_statContext extends ParserRuleContext {
		public TerminalNode QMARK() { return getToken(course_workParser.QMARK, 0); }
		public Logic_exprContext logic_expr() {
			return getRuleContext(Logic_exprContext.class,0);
		}
		public TerminalNode SHARP() { return getToken(course_workParser.SHARP, 0); }
		public List<Stat_blockContext> stat_block() {
			return getRuleContexts(Stat_blockContext.class);
		}
		public Stat_blockContext stat_block(int i) {
			return getRuleContext(Stat_blockContext.class,i);
		}
		public TerminalNode COL() { return getToken(course_workParser.COL, 0); }
		public If_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof course_workListener ) ((course_workListener)listener).enterIf_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof course_workListener ) ((course_workListener)listener).exitIf_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof course_workVisitor ) return ((course_workVisitor<? extends T>)visitor).visitIf_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statContext if_stat() throws RecognitionException {
		If_statContext _localctx = new If_statContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(QMARK);
			setState(72);
			logic_expr(0);
			setState(73);
			match(SHARP);
			setState(74);
			stat_block();
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(75);
				match(COL);
				setState(76);
				stat_block();
				}
				break;
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

	public static class Switch_statContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(course_workParser.SWITCH, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode OBRACE() { return getToken(course_workParser.OBRACE, 0); }
		public TerminalNode CBRACE() { return getToken(course_workParser.CBRACE, 0); }
		public List<OptionContext> option() {
			return getRuleContexts(OptionContext.class);
		}
		public OptionContext option(int i) {
			return getRuleContext(OptionContext.class,i);
		}
		public Switch_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof course_workListener ) ((course_workListener)listener).enterSwitch_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof course_workListener ) ((course_workListener)listener).exitSwitch_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof course_workVisitor ) return ((course_workVisitor<? extends T>)visitor).visitSwitch_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_statContext switch_stat() throws RecognitionException {
		Switch_statContext _localctx = new Switch_statContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_switch_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(SWITCH);
			setState(80);
			expr(0);
			emitter.addLine("RVALUE memory");emitter.addLine(":=");
			setState(82);
			match(OBRACE);
			setState(84); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(83);
				option();
				}
				}
				setState(86); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BY );
			setState(88);
			match(CBRACE);
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

	public static class OptionContext extends ParserRuleContext {
		public TerminalNode BY() { return getToken(course_workParser.BY, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode COL() { return getToken(course_workParser.COL, 0); }
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public OptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof course_workListener ) ((course_workListener)listener).enterOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof course_workListener ) ((course_workListener)listener).exitOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof course_workVisitor ) return ((course_workVisitor<? extends T>)visitor).visitOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionContext option() throws RecognitionException {
		OptionContext _localctx = new OptionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_option);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(BY);
			emitter.addLine("LVALUE memory");
			setState(92);
			atom();
			emitter.addLine("=");
			setState(94);
			match(COL);
			setState(95);
			stat_block();
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

	public static class While_statContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(course_workParser.WHILE, 0); }
		public Logic_exprContext logic_expr() {
			return getRuleContext(Logic_exprContext.class,0);
		}
		public TerminalNode DO() { return getToken(course_workParser.DO, 0); }
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public While_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof course_workListener ) ((course_workListener)listener).enterWhile_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof course_workListener ) ((course_workListener)listener).exitWhile_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof course_workVisitor ) return ((course_workVisitor<? extends T>)visitor).visitWhile_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statContext while_stat() throws RecognitionException {
		While_statContext _localctx = new While_statContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_while_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(WHILE);
			setState(98);
			logic_expr(0);
			setState(99);
			match(DO);
			setState(100);
			stat_block();
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
	public static class ParExprContext extends ExprContext {
		public TerminalNode OPAR() { return getToken(course_workParser.OPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(course_workParser.CPAR, 0); }
		public ParExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof course_workListener ) ((course_workListener)listener).enterParExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof course_workListener ) ((course_workListener)listener).exitParExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof course_workVisitor ) return ((course_workVisitor<? extends T>)visitor).visitParExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryMinusExprContext extends ExprContext {
		public TerminalNode MINUS() { return getToken(course_workParser.MINUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnaryMinusExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof course_workListener ) ((course_workListener)listener).enterUnaryMinusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof course_workListener ) ((course_workListener)listener).exitUnaryMinusExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof course_workVisitor ) return ((course_workVisitor<? extends T>)visitor).visitUnaryMinusExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicationExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(course_workParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(course_workParser.DIV, 0); }
		public MultiplicationExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof course_workListener ) ((course_workListener)listener).enterMultiplicationExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof course_workListener ) ((course_workListener)listener).exitMultiplicationExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof course_workVisitor ) return ((course_workVisitor<? extends T>)visitor).visitMultiplicationExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomExprContext extends ExprContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof course_workListener ) ((course_workListener)listener).enterAtomExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof course_workListener ) ((course_workListener)listener).exitAtomExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof course_workVisitor ) return ((course_workVisitor<? extends T>)visitor).visitAtomExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends ExprContext {
		public TerminalNode ID() { return getToken(course_workParser.ID, 0); }
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof course_workListener ) ((course_workListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof course_workListener ) ((course_workListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof course_workVisitor ) return ((course_workVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditiveExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(course_workParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(course_workParser.MINUS, 0); }
		public AdditiveExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof course_workListener ) ((course_workListener)listener).enterAdditiveExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof course_workListener ) ((course_workListener)listener).exitAdditiveExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof course_workVisitor ) return ((course_workVisitor<? extends T>)visitor).visitAdditiveExpr(this);
			else return visitor.visitChildren(this);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPAR:
				{
				_localctx = new ParExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(103);
				match(OPAR);
				setState(104);
				expr(0);
				setState(105);
				match(CPAR);
				}
				break;
			case MINUS:
				{
				_localctx = new UnaryMinusExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(107);
				match(MINUS);
				setState(108);
				expr(3);
				}
				break;
			case NULL:
			case INT:
			case INT4:
			case FLOAT:
			case CHAR:
			case STRING:
				{
				_localctx = new AtomExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(109);
				atom();
				}
				break;
			case ID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(110);
				match(ID);
				emitter.addLine("RVALUE "+((IdContext) _localctx).ID().getText());
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(126);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(124);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(114);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(115);
						((MultiplicationExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
							((MultiplicationExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(116);
						expr(6);
						emitter.addOp(((MultiplicationExprContext)_localctx).op.getText());
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(119);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(120);
						((AdditiveExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((AdditiveExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(121);
						expr(5);
						emitter.addOp(((AdditiveExprContext)_localctx).op.getText());
						}
						break;
					}
					} 
				}
				setState(128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class AtomContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(course_workParser.INT, 0); }
		public TerminalNode INT4() { return getToken(course_workParser.INT4, 0); }
		public TerminalNode FLOAT() { return getToken(course_workParser.FLOAT, 0); }
		public TerminalNode CHAR() { return getToken(course_workParser.CHAR, 0); }
		public TerminalNode STRING() { return getToken(course_workParser.STRING, 0); }
		public TerminalNode NULL() { return getToken(course_workParser.NULL, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof course_workListener ) ((course_workListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof course_workListener ) ((course_workListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof course_workVisitor ) return ((course_workVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_atom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << INT) | (1L << INT4) | (1L << FLOAT) | (1L << CHAR) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			emitter.addLine("PUSH "+_localctx.getText());
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

	public static class Logic_exprContext extends ParserRuleContext {
		public Logic_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_expr; }
	 
		public Logic_exprContext() { }
		public void copyFrom(Logic_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParExprLogicContext extends Logic_exprContext {
		public TerminalNode OPAR() { return getToken(course_workParser.OPAR, 0); }
		public Logic_exprContext logic_expr() {
			return getRuleContext(Logic_exprContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(course_workParser.CPAR, 0); }
		public ParExprLogicContext(Logic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof course_workListener ) ((course_workListener)listener).enterParExprLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof course_workListener ) ((course_workListener)listener).exitParExprLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof course_workVisitor ) return ((course_workVisitor<? extends T>)visitor).visitParExprLogic(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExprLogicContext extends Logic_exprContext {
		public List<Logic_exprContext> logic_expr() {
			return getRuleContexts(Logic_exprContext.class);
		}
		public Logic_exprContext logic_expr(int i) {
			return getRuleContext(Logic_exprContext.class,i);
		}
		public TerminalNode OR() { return getToken(course_workParser.OR, 0); }
		public OrExprLogicContext(Logic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof course_workListener ) ((course_workListener)listener).enterOrExprLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof course_workListener ) ((course_workListener)listener).exitOrExprLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof course_workVisitor ) return ((course_workVisitor<? extends T>)visitor).visitOrExprLogic(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdLogicContext extends Logic_exprContext {
		public TerminalNode ID() { return getToken(course_workParser.ID, 0); }
		public IdLogicContext(Logic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof course_workListener ) ((course_workListener)listener).enterIdLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof course_workListener ) ((course_workListener)listener).exitIdLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof course_workVisitor ) return ((course_workVisitor<? extends T>)visitor).visitIdLogic(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualityExprLogicContext extends Logic_exprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(course_workParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(course_workParser.NEQ, 0); }
		public EqualityExprLogicContext(Logic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof course_workListener ) ((course_workListener)listener).enterEqualityExprLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof course_workListener ) ((course_workListener)listener).exitEqualityExprLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof course_workVisitor ) return ((course_workVisitor<? extends T>)visitor).visitEqualityExprLogic(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExprLogicContext extends Logic_exprContext {
		public List<Logic_exprContext> logic_expr() {
			return getRuleContexts(Logic_exprContext.class);
		}
		public Logic_exprContext logic_expr(int i) {
			return getRuleContext(Logic_exprContext.class,i);
		}
		public TerminalNode AND() { return getToken(course_workParser.AND, 0); }
		public AndExprLogicContext(Logic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof course_workListener ) ((course_workListener)listener).enterAndExprLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof course_workListener ) ((course_workListener)listener).exitAndExprLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof course_workVisitor ) return ((course_workVisitor<? extends T>)visitor).visitAndExprLogic(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExprLogicContext extends Logic_exprContext {
		public TerminalNode NOT() { return getToken(course_workParser.NOT, 0); }
		public Logic_exprContext logic_expr() {
			return getRuleContext(Logic_exprContext.class,0);
		}
		public NotExprLogicContext(Logic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof course_workListener ) ((course_workListener)listener).enterNotExprLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof course_workListener ) ((course_workListener)listener).exitNotExprLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof course_workVisitor ) return ((course_workVisitor<? extends T>)visitor).visitNotExprLogic(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalExprLogicContext extends Logic_exprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LTEQ() { return getToken(course_workParser.LTEQ, 0); }
		public TerminalNode GTEQ() { return getToken(course_workParser.GTEQ, 0); }
		public TerminalNode LT() { return getToken(course_workParser.LT, 0); }
		public TerminalNode GT() { return getToken(course_workParser.GT, 0); }
		public RelationalExprLogicContext(Logic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof course_workListener ) ((course_workListener)listener).enterRelationalExprLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof course_workListener ) ((course_workListener)listener).exitRelationalExprLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof course_workVisitor ) return ((course_workVisitor<? extends T>)visitor).visitRelationalExprLogic(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomExprLogicContext extends Logic_exprContext {
		public Logic_atomContext logic_atom() {
			return getRuleContext(Logic_atomContext.class,0);
		}
		public AtomExprLogicContext(Logic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof course_workListener ) ((course_workListener)listener).enterAtomExprLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof course_workListener ) ((course_workListener)listener).exitAtomExprLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof course_workVisitor ) return ((course_workVisitor<? extends T>)visitor).visitAtomExprLogic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_exprContext logic_expr() throws RecognitionException {
		return logic_expr(0);
	}

	private Logic_exprContext logic_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Logic_exprContext _localctx = new Logic_exprContext(_ctx, _parentState);
		Logic_exprContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_logic_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new ParExprLogicContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(133);
				match(OPAR);
				setState(134);
				logic_expr(0);
				setState(135);
				match(CPAR);
				}
				break;
			case 2:
				{
				_localctx = new RelationalExprLogicContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(137);
				expr(0);
				setState(138);
				((RelationalExprLogicContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GTEQ) | (1L << LTEQ))) != 0)) ) {
					((RelationalExprLogicContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(139);
				expr(0);
				emitter.addLine(((RelationalExprLogicContext)_localctx).op.getText());
				}
				break;
			case 3:
				{
				_localctx = new EqualityExprLogicContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(142);
				expr(0);
				setState(143);
				((EqualityExprLogicContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==EQ || _la==NEQ) ) {
					((EqualityExprLogicContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(144);
				expr(0);
				emitter.addLine(((EqualityExprLogicContext)_localctx).op.getText());
				}
				break;
			case 4:
				{
				_localctx = new NotExprLogicContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(147);
				match(NOT);
				setState(148);
				logic_expr(3);
				}
				break;
			case 5:
				{
				_localctx = new AtomExprLogicContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(149);
				logic_atom();
				}
				break;
			case 6:
				{
				_localctx = new IdLogicContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(150);
				match(ID);
				emitter.addLine("RVALUE "+((IdLogicContext) _localctx).ID().getText());
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(166);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(164);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new AndExprLogicContext(new Logic_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logic_expr);
						setState(154);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(155);
						match(AND);
						setState(156);
						logic_expr(6);
						emitter.addLine("OR");
						}
						break;
					case 2:
						{
						_localctx = new OrExprLogicContext(new Logic_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logic_expr);
						setState(159);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(160);
						match(OR);
						setState(161);
						logic_expr(5);
						emitter.addLine("AND");
						}
						break;
					}
					} 
				}
				setState(168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class Logic_atomContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(course_workParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(course_workParser.FALSE, 0); }
		public Logic_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof course_workListener ) ((course_workListener)listener).enterLogic_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof course_workListener ) ((course_workListener)listener).exitLogic_atom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof course_workVisitor ) return ((course_workVisitor<? extends T>)visitor).visitLogic_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_atomContext logic_atom() throws RecognitionException {
		Logic_atomContext _localctx = new Logic_atomContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_logic_atom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			emitter.addLine("PUSH "+_localctx.getText());
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
		case 10:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 12:
			return logic_expr_sempred((Logic_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean logic_expr_sempred(Logic_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u00af\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\3\7\3$\n\3\f"+
		"\3\16\3\'\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\60\n\4\3\5\3\5\3\5\3\5"+
		"\5\5\66\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6?\n\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\5\7H\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bP\n\b\3\t\3\t\3\t\3\t\3\t\6"+
		"\tW\n\t\r\t\16\tX\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fs\n\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\177\n\f\f\f\16\f\u0082\13\f\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u009b\n\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00a7\n\16\f\16\16\16\u00aa\13\16"+
		"\3\17\3\17\3\17\3\17\2\4\26\32\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\2\t\3\2\3\6\3\2\21\22\3\2\17\20\4\2\34\34%)\3\2\13\16\3\2\t\n\3\2\32"+
		"\33\2\u00b6\2\36\3\2\2\2\4%\3\2\2\2\6/\3\2\2\2\b\61\3\2\2\2\n9\3\2\2\2"+
		"\fG\3\2\2\2\16I\3\2\2\2\20Q\3\2\2\2\22\\\3\2\2\2\24c\3\2\2\2\26r\3\2\2"+
		"\2\30\u0083\3\2\2\2\32\u009a\3\2\2\2\34\u00ab\3\2\2\2\36\37\5\4\3\2\37"+
		" \7\2\2\3 !\b\2\1\2!\3\3\2\2\2\"$\5\6\4\2#\"\3\2\2\2$\'\3\2\2\2%#\3\2"+
		"\2\2%&\3\2\2\2&\5\3\2\2\2\'%\3\2\2\2(\60\5\b\5\2)*\5\n\6\2*+\7\24\2\2"+
		"+\60\3\2\2\2,\60\5\16\b\2-\60\5\20\t\2.\60\5\24\13\2/(\3\2\2\2/)\3\2\2"+
		"\2/,\3\2\2\2/-\3\2\2\2/.\3\2\2\2\60\7\3\2\2\2\61\65\t\2\2\2\62\63\7$\2"+
		"\2\63\66\b\5\1\2\64\66\5\n\6\2\65\62\3\2\2\2\65\64\3\2\2\2\66\67\3\2\2"+
		"\2\678\7\24\2\28\t\3\2\2\29:\7$\2\2:;\b\6\1\2;>\7\25\2\2<?\5\26\f\2=?"+
		"\5\32\16\2><\3\2\2\2>=\3\2\2\2?@\3\2\2\2@A\b\6\1\2A\13\3\2\2\2BC\7\30"+
		"\2\2CD\5\4\3\2DE\7\31\2\2EH\3\2\2\2FH\5\6\4\2GB\3\2\2\2GF\3\2\2\2H\r\3"+
		"\2\2\2IJ\7\35\2\2JK\5\32\16\2KL\7\36\2\2LO\5\f\7\2MN\7\37\2\2NP\5\f\7"+
		"\2OM\3\2\2\2OP\3\2\2\2P\17\3\2\2\2QR\7 \2\2RS\5\26\f\2ST\b\t\1\2TV\7\30"+
		"\2\2UW\5\22\n\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z[\7"+
		"\31\2\2[\21\3\2\2\2\\]\7!\2\2]^\b\n\1\2^_\5\30\r\2_`\b\n\1\2`a\7\37\2"+
		"\2ab\5\f\7\2b\23\3\2\2\2cd\7\"\2\2de\5\32\16\2ef\7#\2\2fg\5\f\7\2g\25"+
		"\3\2\2\2hi\b\f\1\2ij\7\26\2\2jk\5\26\f\2kl\7\27\2\2ls\3\2\2\2mn\7\20\2"+
		"\2ns\5\26\f\5os\5\30\r\2pq\7$\2\2qs\b\f\1\2rh\3\2\2\2rm\3\2\2\2ro\3\2"+
		"\2\2rp\3\2\2\2s\u0080\3\2\2\2tu\f\7\2\2uv\t\3\2\2vw\5\26\f\bwx\b\f\1\2"+
		"x\177\3\2\2\2yz\f\6\2\2z{\t\4\2\2{|\5\26\f\7|}\b\f\1\2}\177\3\2\2\2~t"+
		"\3\2\2\2~y\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2"+
		"\2\u0081\27\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\t\5\2\2\u0084\u0085"+
		"\b\r\1\2\u0085\31\3\2\2\2\u0086\u0087\b\16\1\2\u0087\u0088\7\26\2\2\u0088"+
		"\u0089\5\32\16\2\u0089\u008a\7\27\2\2\u008a\u009b\3\2\2\2\u008b\u008c"+
		"\5\26\f\2\u008c\u008d\t\6\2\2\u008d\u008e\5\26\f\2\u008e\u008f\b\16\1"+
		"\2\u008f\u009b\3\2\2\2\u0090\u0091\5\26\f\2\u0091\u0092\t\7\2\2\u0092"+
		"\u0093\5\26\f\2\u0093\u0094\b\16\1\2\u0094\u009b\3\2\2\2\u0095\u0096\7"+
		"\23\2\2\u0096\u009b\5\32\16\5\u0097\u009b\5\34\17\2\u0098\u0099\7$\2\2"+
		"\u0099\u009b\b\16\1\2\u009a\u0086\3\2\2\2\u009a\u008b\3\2\2\2\u009a\u0090"+
		"\3\2\2\2\u009a\u0095\3\2\2\2\u009a\u0097\3\2\2\2\u009a\u0098\3\2\2\2\u009b"+
		"\u00a8\3\2\2\2\u009c\u009d\f\7\2\2\u009d\u009e\7\b\2\2\u009e\u009f\5\32"+
		"\16\b\u009f\u00a0\b\16\1\2\u00a0\u00a7\3\2\2\2\u00a1\u00a2\f\6\2\2\u00a2"+
		"\u00a3\7\7\2\2\u00a3\u00a4\5\32\16\7\u00a4\u00a5\b\16\1\2\u00a5\u00a7"+
		"\3\2\2\2\u00a6\u009c\3\2\2\2\u00a6\u00a1\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\33\3\2\2\2\u00aa\u00a8\3\2\2"+
		"\2\u00ab\u00ac\t\b\2\2\u00ac\u00ad\b\17\1\2\u00ad\35\3\2\2\2\17%/\65>"+
		"GOXr~\u0080\u009a\u00a6\u00a8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}