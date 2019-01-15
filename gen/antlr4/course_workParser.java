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
		INTEGER_KW=1, FLOAT_KW=2, CHAR_KW=3, BOOLEAN_KW=4, NOT=5, OR=6, AND=7, 
		EQ=8, NEQ=9, GT=10, LT=11, GTEQ=12, LTEQ=13, PLUS=14, MINUS=15, MULT=16, 
		DIV=17, OPAR=18, CPAR=19, OBRACE=20, CBRACE=21, SCOL=22, ASSIGN=23, TRUE=24, 
		FALSE=25, NULL=26, QMARK=27, SHARP=28, COL=29, SWITCH=30, BY=31, WHILE=32, 
		DO=33, ID=34, INT=35, INT4=36, FLOAT=37, CHAR=38, SPACE=39;
	public static final int
		RULE_programm = 0, RULE_stat = 1, RULE_declaration = 2, RULE_assignment = 3, 
		RULE_stat_block = 4, RULE_if_stat = 5, RULE_switch_stat = 6, RULE_option = 7, 
		RULE_while_stat = 8, RULE_expr = 9, RULE_atom = 10, RULE_logic_expr = 11, 
		RULE_logic_atom = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"programm", "stat", "declaration", "assignment", "stat_block", "if_stat", 
			"switch_stat", "option", "while_stat", "expr", "atom", "logic_expr", 
			"logic_atom"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'float'", "'char'", "'bool'", "'!'", "'||'", "'&&'", "'=='", 
			"'!='", "'>'", "'<'", "'>='", "'<='", "'+'", "'-'", "'*'", "'/'", "'('", 
			"')'", "'{'", "'}'", "';'", "':='", "'true'", "'false'", "'null'", "'?'", 
			"'#'", "':'", "'switch'", "'by'", "'while'", "'do'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INTEGER_KW", "FLOAT_KW", "CHAR_KW", "BOOLEAN_KW", "NOT", "OR", 
			"AND", "EQ", "NEQ", "GT", "LT", "GTEQ", "LTEQ", "PLUS", "MINUS", "MULT", 
			"DIV", "OPAR", "CPAR", "OBRACE", "CBRACE", "SCOL", "ASSIGN", "TRUE", 
			"FALSE", "NULL", "QMARK", "SHARP", "COL", "SWITCH", "BY", "WHILE", "DO", 
			"ID", "INT", "INT4", "FLOAT", "CHAR", "SPACE"
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


	private int if_label_counter = 0;
	private int while_label_counter = 0;
	private int switch_label_counter = 0;

	public course_workParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgrammContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(course_workParser.EOF, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgrammContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof course_workListener ) ((course_workListener)listener).enterProgramm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof course_workListener ) ((course_workListener)listener).exitProgramm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof course_workVisitor ) return ((course_workVisitor<? extends T>)visitor).visitProgramm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgrammContext programm() throws RecognitionException {
		ProgrammContext _localctx = new ProgrammContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER_KW) | (1L << FLOAT_KW) | (1L << CHAR_KW) | (1L << BOOLEAN_KW) | (1L << SCOL) | (1L << QMARK) | (1L << SWITCH) | (1L << WHILE) | (1L << ID))) != 0)) {
				{
				{
				setState(26);
				stat();
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
			match(EOF);
			Emitter.addLine("HALT");
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
		public If_statContext if_stat() {
			return getRuleContext(If_statContext.class,0);
		}
		public Switch_statContext switch_stat() {
			return getRuleContext(Switch_statContext.class,0);
		}
		public While_statContext while_stat() {
			return getRuleContext(While_statContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(course_workParser.SCOL, 0); }
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
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(41);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_KW:
			case FLOAT_KW:
			case CHAR_KW:
			case BOOLEAN_KW:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				declaration();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				assignment();
				}
				break;
			case QMARK:
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				if_stat();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 4);
				{
				setState(38);
				switch_stat();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(39);
				while_stat();
				}
				break;
			case SCOL:
				enterOuterAlt(_localctx, 6);
				{
				setState(40);
				match(SCOL);
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
		public TerminalNode ID() { return getToken(course_workParser.ID, 0); }
		public TerminalNode SCOL() { return getToken(course_workParser.SCOL, 0); }
		public TerminalNode INTEGER_KW() { return getToken(course_workParser.INTEGER_KW, 0); }
		public TerminalNode FLOAT_KW() { return getToken(course_workParser.FLOAT_KW, 0); }
		public TerminalNode CHAR_KW() { return getToken(course_workParser.CHAR_KW, 0); }
		public TerminalNode BOOLEAN_KW() { return getToken(course_workParser.BOOLEAN_KW, 0); }
		public TerminalNode ASSIGN() { return getToken(course_workParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Logic_exprContext logic_expr() {
			return getRuleContext(Logic_exprContext.class,0);
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
		enterRule(_localctx, 4, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			String type;
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_KW:
				{
				setState(44);
				match(INTEGER_KW);
				type="DW";
				}
				break;
			case FLOAT_KW:
				{
				setState(46);
				match(FLOAT_KW);
				type="DD";
				}
				break;
			case CHAR_KW:
				{
				setState(48);
				match(CHAR_KW);
				type="DB";
				}
				break;
			case BOOLEAN_KW:
				{
				setState(50);
				match(BOOLEAN_KW);
				type="DW";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(54);
			match(ID);
			Emitter.addVariable(_localctx.ID().getText(), type);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				Emitter.addLine("LVALUE "+_localctx.ID().getText());
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
				Emitter.addLine(":=");
				}
			}

			setState(66);
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
		public TerminalNode SCOL() { return getToken(course_workParser.SCOL, 0); }
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
		enterRule(_localctx, 6, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(ID);
			Emitter.addLine("LVALUE "+_localctx.ID().getText());
			setState(70);
			match(ASSIGN);
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(71);
				expr(0);
				}
				break;
			case 2:
				{
				setState(72);
				logic_expr(0);
				}
				break;
			}
			Emitter.addLine(":=");
			setState(76);
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

	public static class Stat_blockContext extends ParserRuleContext {
		public TerminalNode OBRACE() { return getToken(course_workParser.OBRACE, 0); }
		public ProgrammContext programm() {
			return getRuleContext(ProgrammContext.class,0);
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
		enterRule(_localctx, 8, RULE_stat_block);
		try {
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(OBRACE);
				setState(79);
				programm();
				setState(80);
				match(CBRACE);
				}
				break;
			case INTEGER_KW:
			case FLOAT_KW:
			case CHAR_KW:
			case BOOLEAN_KW:
			case SCOL:
			case QMARK:
			case SWITCH:
			case WHILE:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
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
		enterRule(_localctx, 10, RULE_if_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(QMARK);
			setState(86);
			logic_expr(0);
			String if_break_label=" IF_"+if_label_counter;if_label_counter++;Emitter.addLine("GOFALSE"+if_break_label);
			setState(88);
			match(SHARP);
			setState(89);
			stat_block();
			Emitter.addLine("LABEL"+if_break_label+":");
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(91);
				match(COL);
				setState(92);
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
		enterRule(_localctx, 12, RULE_switch_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(SWITCH);
			setState(96);
			expr(0);
			Emitter.addLine("LVALUE mem");Emitter.addLine(":=");
			setState(98);
			match(OBRACE);
			setState(100); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(99);
				option();
				}
				}
				setState(102); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BY );
			setState(104);
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
		enterRule(_localctx, 14, RULE_option);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(BY);
			String option_label=" OP_"+switch_label_counter;switch_label_counter++;Emitter.addLine("RVALUE mem");
			setState(108);
			atom();
			Emitter.addLine("=");Emitter.addLine("GOFALSE"+option_label);
			setState(110);
			match(COL);
			setState(111);
			stat_block();
			Emitter.addLine("LABEL"+option_label+":");
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
		public TerminalNode OPAR() { return getToken(course_workParser.OPAR, 0); }
		public Logic_exprContext logic_expr() {
			return getRuleContext(Logic_exprContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(course_workParser.CPAR, 0); }
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
		enterRule(_localctx, 16, RULE_while_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(WHILE);
			String while_start_label=" WS_"+while_label_counter;String while_break_label=" WB_"+while_label_counter;while_label_counter++;
			setState(116);
			match(OPAR);
			setState(117);
			logic_expr(0);
			setState(118);
			match(CPAR);
			Emitter.addLine("GOFALSE"+while_break_label);Emitter.addLine("LABEL"+while_start_label+":");
			setState(120);
			match(DO);
			setState(121);
			stat_block();
			Emitter.addLine("GOTO"+while_start_label);Emitter.addLine("LABEL"+while_break_label+":");
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
	public static class MinusExprContext extends ExprContext {
		public TerminalNode MINUS() { return getToken(course_workParser.MINUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MinusExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof course_workListener ) ((course_workListener)listener).enterMinusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof course_workListener ) ((course_workListener)listener).exitMinusExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof course_workVisitor ) return ((course_workVisitor<? extends T>)visitor).visitMinusExpr(this);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPAR:
				{
				_localctx = new ParExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(125);
				match(OPAR);
				setState(126);
				expr(0);
				setState(127);
				match(CPAR);
				}
				break;
			case NULL:
			case INT:
			case INT4:
			case FLOAT:
			case CHAR:
				{
				_localctx = new AtomExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(129);
				atom();
				}
				break;
			case MINUS:
				{
				_localctx = new MinusExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(130);
				match(MINUS);
				setState(131);
				expr(2);
				}
				break;
			case ID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(132);
				match(ID);
				Emitter.addLine("RVALUE "+((IdContext) _localctx).ID().getText());
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(148);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(146);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(136);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(137);
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
						setState(138);
						expr(6);
						Emitter.addOp(((MultiplicationExprContext)_localctx).op.getText());
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(141);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(142);
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
						setState(143);
						expr(5);
						Emitter.addOp(((AdditiveExprContext)_localctx).op.getText());
						}
						break;
					}
					} 
				}
				setState(150);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		enterRule(_localctx, 20, RULE_atom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << INT) | (1L << INT4) | (1L << FLOAT) | (1L << CHAR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			Emitter.addLine("PUSH "+_localctx.getText());
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_logic_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new ParExprLogicContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(155);
				match(OPAR);
				setState(156);
				logic_expr(0);
				setState(157);
				match(CPAR);
				}
				break;
			case 2:
				{
				_localctx = new RelationalExprLogicContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(159);
				expr(0);
				setState(160);
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
				setState(161);
				expr(0);
				Emitter.addLine(((RelationalExprLogicContext)_localctx).op.getText());
				}
				break;
			case 3:
				{
				_localctx = new EqualityExprLogicContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(164);
				expr(0);
				setState(165);
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
				setState(166);
				expr(0);
				Emitter.addLine(((EqualityExprLogicContext)_localctx).op.getText());
				}
				break;
			case 4:
				{
				_localctx = new AtomExprLogicContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(169);
				logic_atom();
				}
				break;
			case 5:
				{
				_localctx = new NotExprLogicContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(170);
				match(NOT);
				setState(171);
				logic_expr(2);
				}
				break;
			case 6:
				{
				_localctx = new IdLogicContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172);
				match(ID);
				Emitter.addLine("RVALUE "+((IdLogicContext) _localctx).ID().getText());
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(188);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(186);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new AndExprLogicContext(new Logic_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logic_expr);
						setState(176);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(177);
						match(AND);
						setState(178);
						logic_expr(6);
						Emitter.addLine("OR");
						}
						break;
					case 2:
						{
						_localctx = new OrExprLogicContext(new Logic_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logic_expr);
						setState(181);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(182);
						match(OR);
						setState(183);
						logic_expr(5);
						Emitter.addLine("AND");
						}
						break;
					}
					} 
				}
				setState(190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		enterRule(_localctx, 24, RULE_logic_atom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			Emitter.addLine("PUSH "+_localctx.getText());
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
		case 9:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 11:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u00c5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\7\2\36\n\2\f\2\16\2!\13\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3,\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4\67\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4?\n\4\3\4\3\4\5\4C\n\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\5\5L\n\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6V\n"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7`\n\7\3\b\3\b\3\b\3\b\3\b\6\bg\n"+
		"\b\r\b\16\bh\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\5\13\u0089\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\7\13\u0095\n\13\f\13\16\13\u0098\13\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00b1"+
		"\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00bd\n\r\f\r\16\r\u00c0"+
		"\13\r\3\16\3\16\3\16\3\16\2\4\24\30\17\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\2\b\3\2\22\23\3\2\20\21\4\2\34\34%(\3\2\f\17\3\2\n\13\3\2\32\33\2\u00d2"+
		"\2\37\3\2\2\2\4+\3\2\2\2\6-\3\2\2\2\bF\3\2\2\2\nU\3\2\2\2\fW\3\2\2\2\16"+
		"a\3\2\2\2\20l\3\2\2\2\22t\3\2\2\2\24\u0088\3\2\2\2\26\u0099\3\2\2\2\30"+
		"\u00b0\3\2\2\2\32\u00c1\3\2\2\2\34\36\5\4\3\2\35\34\3\2\2\2\36!\3\2\2"+
		"\2\37\35\3\2\2\2\37 \3\2\2\2 \"\3\2\2\2!\37\3\2\2\2\"#\7\2\2\3#$\b\2\1"+
		"\2$\3\3\2\2\2%,\5\6\4\2&,\5\b\5\2\',\5\f\7\2(,\5\16\b\2),\5\22\n\2*,\7"+
		"\30\2\2+%\3\2\2\2+&\3\2\2\2+\'\3\2\2\2+(\3\2\2\2+)\3\2\2\2+*\3\2\2\2,"+
		"\5\3\2\2\2-\66\b\4\1\2./\7\3\2\2/\67\b\4\1\2\60\61\7\4\2\2\61\67\b\4\1"+
		"\2\62\63\7\5\2\2\63\67\b\4\1\2\64\65\7\6\2\2\65\67\b\4\1\2\66.\3\2\2\2"+
		"\66\60\3\2\2\2\66\62\3\2\2\2\66\64\3\2\2\2\678\3\2\2\289\7$\2\29B\b\4"+
		"\1\2:;\b\4\1\2;>\7\31\2\2<?\5\24\13\2=?\5\30\r\2><\3\2\2\2>=\3\2\2\2?"+
		"@\3\2\2\2@A\b\4\1\2AC\3\2\2\2B:\3\2\2\2BC\3\2\2\2CD\3\2\2\2DE\7\30\2\2"+
		"E\7\3\2\2\2FG\7$\2\2GH\b\5\1\2HK\7\31\2\2IL\5\24\13\2JL\5\30\r\2KI\3\2"+
		"\2\2KJ\3\2\2\2LM\3\2\2\2MN\b\5\1\2NO\7\30\2\2O\t\3\2\2\2PQ\7\26\2\2QR"+
		"\5\2\2\2RS\7\27\2\2SV\3\2\2\2TV\5\4\3\2UP\3\2\2\2UT\3\2\2\2V\13\3\2\2"+
		"\2WX\7\35\2\2XY\5\30\r\2YZ\b\7\1\2Z[\7\36\2\2[\\\5\n\6\2\\_\b\7\1\2]^"+
		"\7\37\2\2^`\5\n\6\2_]\3\2\2\2_`\3\2\2\2`\r\3\2\2\2ab\7 \2\2bc\5\24\13"+
		"\2cd\b\b\1\2df\7\26\2\2eg\5\20\t\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2"+
		"\2\2ij\3\2\2\2jk\7\27\2\2k\17\3\2\2\2lm\7!\2\2mn\b\t\1\2no\5\26\f\2op"+
		"\b\t\1\2pq\7\37\2\2qr\5\n\6\2rs\b\t\1\2s\21\3\2\2\2tu\7\"\2\2uv\b\n\1"+
		"\2vw\7\24\2\2wx\5\30\r\2xy\7\25\2\2yz\b\n\1\2z{\7#\2\2{|\5\n\6\2|}\b\n"+
		"\1\2}\23\3\2\2\2~\177\b\13\1\2\177\u0080\7\24\2\2\u0080\u0081\5\24\13"+
		"\2\u0081\u0082\7\25\2\2\u0082\u0089\3\2\2\2\u0083\u0089\5\26\f\2\u0084"+
		"\u0085\7\21\2\2\u0085\u0089\5\24\13\4\u0086\u0087\7$\2\2\u0087\u0089\b"+
		"\13\1\2\u0088~\3\2\2\2\u0088\u0083\3\2\2\2\u0088\u0084\3\2\2\2\u0088\u0086"+
		"\3\2\2\2\u0089\u0096\3\2\2\2\u008a\u008b\f\7\2\2\u008b\u008c\t\2\2\2\u008c"+
		"\u008d\5\24\13\b\u008d\u008e\b\13\1\2\u008e\u0095\3\2\2\2\u008f\u0090"+
		"\f\6\2\2\u0090\u0091\t\3\2\2\u0091\u0092\5\24\13\7\u0092\u0093\b\13\1"+
		"\2\u0093\u0095\3\2\2\2\u0094\u008a\3\2\2\2\u0094\u008f\3\2\2\2\u0095\u0098"+
		"\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\25\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0099\u009a\t\4\2\2\u009a\u009b\b\f\1\2\u009b\27\3\2\2"+
		"\2\u009c\u009d\b\r\1\2\u009d\u009e\7\24\2\2\u009e\u009f\5\30\r\2\u009f"+
		"\u00a0\7\25\2\2\u00a0\u00b1\3\2\2\2\u00a1\u00a2\5\24\13\2\u00a2\u00a3"+
		"\t\5\2\2\u00a3\u00a4\5\24\13\2\u00a4\u00a5\b\r\1\2\u00a5\u00b1\3\2\2\2"+
		"\u00a6\u00a7\5\24\13\2\u00a7\u00a8\t\6\2\2\u00a8\u00a9\5\24\13\2\u00a9"+
		"\u00aa\b\r\1\2\u00aa\u00b1\3\2\2\2\u00ab\u00b1\5\32\16\2\u00ac\u00ad\7"+
		"\7\2\2\u00ad\u00b1\5\30\r\4\u00ae\u00af\7$\2\2\u00af\u00b1\b\r\1\2\u00b0"+
		"\u009c\3\2\2\2\u00b0\u00a1\3\2\2\2\u00b0\u00a6\3\2\2\2\u00b0\u00ab\3\2"+
		"\2\2\u00b0\u00ac\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00be\3\2\2\2\u00b2"+
		"\u00b3\f\7\2\2\u00b3\u00b4\7\t\2\2\u00b4\u00b5\5\30\r\b\u00b5\u00b6\b"+
		"\r\1\2\u00b6\u00bd\3\2\2\2\u00b7\u00b8\f\6\2\2\u00b8\u00b9\7\b\2\2\u00b9"+
		"\u00ba\5\30\r\7\u00ba\u00bb\b\r\1\2\u00bb\u00bd\3\2\2\2\u00bc\u00b2\3"+
		"\2\2\2\u00bc\u00b7\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\31\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2\t\7\2"+
		"\2\u00c2\u00c3\b\16\1\2\u00c3\33\3\2\2\2\21\37+\66>BKU_h\u0088\u0094\u0096"+
		"\u00b0\u00bc\u00be";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}