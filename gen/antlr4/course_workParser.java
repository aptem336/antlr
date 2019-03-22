// Generated from D:/OneDrive/CODE/_GIT/antlr/src/main/java/antlr4\course_work.g4 by ANTLR 4.7.2
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
		QMARK=1, SHARP=2, SWITCH=3, BY=4, REPEAT=5, WHEN=6, NUMBER_KW=7, REAL_KW=8, 
		CHAR_KW=9, BOOLEAN_KW=10, PLUS=11, MINUS=12, MULT=13, DIV=14, LTEQ=15, 
		GTEQ=16, LT=17, GT=18, EQ=19, NEQ=20, AND=21, OR=22, ID=23, INT=24, FLOAT=25, 
		CHAR=26, INT5=27, YES=28, NO=29, NULL=30, COL=31, SCOL=32, OPAR=33, CPAR=34, 
		OBRACE=35, CBRACE=36, SPACE=37;
	public static final int
		RULE_programm = 0, RULE_stat = 1, RULE_assignment = 2, RULE_if_stat = 3, 
		RULE_stat_block = 4, RULE_switch_stat = 5, RULE_repeat_stat = 6, RULE_declaration = 7, 
		RULE_expr = 8, RULE_atom = 9, RULE_logic_expr = 10, RULE_logic_atom = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"programm", "stat", "assignment", "if_stat", "stat_block", "switch_stat", 
			"repeat_stat", "declaration", "expr", "atom", "logic_expr", "logic_atom"
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

	@Override
	public String getGrammarFileName() { return "course_work.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	int if_label_counter = 0;
	int switch_label_counter = 0;
	int repeat_label_counter = 0;

	public course_workParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgrammContext extends ParserRuleContext {
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
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QMARK) | (1L << SWITCH) | (1L << REPEAT) | (1L << NUMBER_KW) | (1L << REAL_KW) | (1L << CHAR_KW) | (1L << BOOLEAN_KW) | (1L << ID) | (1L << SCOL))) != 0)) {
				{
				{
				setState(24);
				stat();
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
		public Repeat_statContext repeat_stat() {
			return getRuleContext(Repeat_statContext.class,0);
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
			setState(38);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER_KW:
			case REAL_KW:
			case CHAR_KW:
			case BOOLEAN_KW:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				declaration();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				assignment();
				}
				break;
			case QMARK:
				enterOuterAlt(_localctx, 3);
				{
				setState(34);
				if_stat();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 4);
				{
				setState(35);
				switch_stat();
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 5);
				{
				setState(36);
				repeat_stat();
				}
				break;
			case SCOL:
				enterOuterAlt(_localctx, 6);
				{
				setState(37);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(course_workParser.ID, 0); }
		public TerminalNode LTEQ() { return getToken(course_workParser.LTEQ, 0); }
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
		enterRule(_localctx, 4, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(ID);
			Emitter.addLine("LVALUE "+_localctx.ID().getText());
			setState(42);
			match(LTEQ);
			setState(45);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(43);
				expr(0);
				}
				break;
			case 2:
				{
				setState(44);
				logic_expr(0);
				}
				break;
			}
			Emitter.addLine(":=");
			setState(48);
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
		enterRule(_localctx, 6, RULE_if_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			String IEL=" IE"+if_label_counter; String IBL = " IB"+if_label_counter; if_label_counter++;
			setState(51);
			match(QMARK);
			setState(52);
			logic_expr(0);
			Emitter.addLine("GOFALSE "+IEL);
			setState(54);
			match(SHARP);
			setState(55);
			stat_block();
			Emitter.addLine("GOTO "+IBL);Emitter.addLine("LABEL "+IEL+":");
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(57);
				match(COL);
				setState(58);
				stat_block();
				}
				break;
			}
			Emitter.addLine("LABEL "+IBL+":");
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
		public TerminalNode CBRACE() { return getToken(course_workParser.CBRACE, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
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
		int _la;
		try {
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				match(OBRACE);
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QMARK) | (1L << SWITCH) | (1L << REPEAT) | (1L << NUMBER_KW) | (1L << REAL_KW) | (1L << CHAR_KW) | (1L << BOOLEAN_KW) | (1L << ID) | (1L << SCOL))) != 0)) {
					{
					{
					setState(64);
					stat();
					}
					}
					setState(69);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(70);
				match(CBRACE);
				}
				break;
			case QMARK:
			case SWITCH:
			case REPEAT:
			case NUMBER_KW:
			case REAL_KW:
			case CHAR_KW:
			case BOOLEAN_KW:
			case ID:
			case SCOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
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

	public static class Switch_statContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(course_workParser.SWITCH, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode OBRACE() { return getToken(course_workParser.OBRACE, 0); }
		public TerminalNode CBRACE() { return getToken(course_workParser.CBRACE, 0); }
		public List<TerminalNode> BY() { return getTokens(course_workParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(course_workParser.BY, i);
		}
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public List<TerminalNode> COL() { return getTokens(course_workParser.COL); }
		public TerminalNode COL(int i) {
			return getToken(course_workParser.COL, i);
		}
		public List<Stat_blockContext> stat_block() {
			return getRuleContexts(Stat_blockContext.class);
		}
		public Stat_blockContext stat_block(int i) {
			return getRuleContext(Stat_blockContext.class,i);
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
		enterRule(_localctx, 10, RULE_switch_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			int case_label_counter=0;
			setState(75);
			match(SWITCH);
			setState(76);
			expr(0);
			Emitter.addLine("LVALUE memory");Emitter.addLine(":=");
			setState(78);
			match(OBRACE);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BY) {
				{
				{
				setState(79);
				match(BY);
				setState(80);
				atom();
				Emitter.addLine("RVALUE memory");Emitter.addLine("PUSH "+_localctx.atom().get(0).getText());Emitter.addLine("=");Emitter.addLine("GOFALSE SC"+switch_label_counter+""+case_label_counter);
				setState(82);
				match(COL);
				setState(83);
				stat_block();
				Emitter.addLine("GOTO SB"+switch_label_counter);Emitter.addLine("LABEL SC"+switch_label_counter+""+case_label_counter+":");case_label_counter++;
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			match(CBRACE);
			Emitter.addLine("LABEL SB"+switch_label_counter+":");switch_label_counter++;
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

	public static class Repeat_statContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(course_workParser.REPEAT, 0); }
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public TerminalNode WHEN() { return getToken(course_workParser.WHEN, 0); }
		public Logic_exprContext logic_expr() {
			return getRuleContext(Logic_exprContext.class,0);
		}
		public Repeat_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof course_workListener ) ((course_workListener)listener).enterRepeat_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof course_workListener ) ((course_workListener)listener).exitRepeat_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof course_workVisitor ) return ((course_workVisitor<? extends T>)visitor).visitRepeat_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Repeat_statContext repeat_stat() throws RecognitionException {
		Repeat_statContext _localctx = new Repeat_statContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_repeat_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			String RSL="RS"+repeat_label_counter;repeat_label_counter++;
			setState(95);
			match(REPEAT);
			Emitter.addLine("LABEL "+RSL+":");
			setState(97);
			stat_block();
			setState(98);
			match(WHEN);
			setState(99);
			logic_expr(0);
			Emitter.addLine("GOTRUE "+RSL);
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
		public TerminalNode NUMBER_KW() { return getToken(course_workParser.NUMBER_KW, 0); }
		public TerminalNode REAL_KW() { return getToken(course_workParser.REAL_KW, 0); }
		public TerminalNode CHAR_KW() { return getToken(course_workParser.CHAR_KW, 0); }
		public TerminalNode BOOLEAN_KW() { return getToken(course_workParser.BOOLEAN_KW, 0); }
		public TerminalNode LTEQ() { return getToken(course_workParser.LTEQ, 0); }
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
		enterRule(_localctx, 14, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			String type="";
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER_KW:
				{
				setState(103);
				match(NUMBER_KW);
				type="DW";
				}
				break;
			case REAL_KW:
				{
				setState(105);
				match(REAL_KW);
				type="DD";
				}
				break;
			case CHAR_KW:
				{
				setState(107);
				match(CHAR_KW);
				type="DB";
				}
				break;
			case BOOLEAN_KW:
				{
				setState(109);
				match(BOOLEAN_KW);
				type="DW";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(113);
			match(ID);
			String name=_localctx.ID().getText();Emitter.addVariable(name, type);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LTEQ) {
				{
				Emitter.addLine("LVALUE "+_localctx.ID().getText());
				setState(116);
				match(LTEQ);
				setState(119);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(117);
					expr(0);
					}
					break;
				case 2:
					{
					setState(118);
					logic_expr(0);
					}
					break;
				}
				Emitter.addLine(":=");
				}
			}

			setState(125);
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

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPAR:
				{
				_localctx = new ParExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(128);
				match(OPAR);
				setState(129);
				expr(0);
				setState(130);
				match(CPAR);
				}
				break;
			case INT:
			case FLOAT:
			case CHAR:
			case INT5:
			case NULL:
				{
				_localctx = new AtomExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(132);
				atom();
				Emitter.addLine("PUSH "+_localctx.getText());
				}
				break;
			case ID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(135);
				match(ID);
				Emitter.addLine("RVALUE "+_localctx.getText());
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(151);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(149);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(139);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(140);
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
						setState(141);
						expr(5);
						Emitter.addOp(((MultiplicationExprContext) _localctx).op.getText());
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(144);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(145);
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
						setState(146);
						expr(4);
						Emitter.addOp(((AdditiveExprContext) _localctx).op.getText());
						}
						break;
					}
					} 
				}
				setState(153);
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

	public static class AtomContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(course_workParser.INT, 0); }
		public TerminalNode INT5() { return getToken(course_workParser.INT5, 0); }
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
		enterRule(_localctx, 18, RULE_atom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << INT5) | (1L << NULL))) != 0)) ) {
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_logic_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				_localctx = new ParExprLogicContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(157);
				match(OPAR);
				setState(158);
				logic_expr(0);
				setState(159);
				match(CPAR);
				}
				break;
			case 2:
				{
				_localctx = new RelationalExprLogicContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(161);
				expr(0);
				setState(162);
				((RelationalExprLogicContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LTEQ) | (1L << GTEQ) | (1L << LT) | (1L << GT))) != 0)) ) {
					((RelationalExprLogicContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(163);
				expr(0);
				Emitter.addLine(((RelationalExprLogicContext) _localctx).op.getText());
				}
				break;
			case 3:
				{
				_localctx = new EqualityExprLogicContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166);
				expr(0);
				setState(167);
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
				setState(168);
				expr(0);
				Emitter.addLine(((EqualityExprLogicContext) _localctx).op.getText());
				}
				break;
			case 4:
				{
				_localctx = new AtomExprLogicContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(171);
				logic_atom();
				Emitter.addLine("PUSH "+_localctx.getText());
				}
				break;
			case 5:
				{
				_localctx = new IdLogicContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174);
				match(ID);
				Emitter.addLine("RVALUE "+_localctx.getText());
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(188);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new AndExprLogicContext(new Logic_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logic_expr);
						setState(178);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(179);
						match(AND);
						setState(180);
						logic_expr(5);
						Emitter.addLine("AND");
						}
						break;
					case 2:
						{
						_localctx = new OrExprLogicContext(new Logic_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logic_expr);
						setState(183);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(184);
						match(OR);
						setState(185);
						logic_expr(4);
						Emitter.addLine("OR");
						}
						break;
					}
					} 
				}
				setState(192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		public TerminalNode YES() { return getToken(course_workParser.YES, 0); }
		public TerminalNode NO() { return getToken(course_workParser.NO, 0); }
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
		enterRule(_localctx, 22, RULE_logic_atom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_la = _input.LA(1);
			if ( !(_la==YES || _la==NO) ) {
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
		case 8:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 10:
			return logic_expr_sempred((Logic_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean logic_expr_sempred(Logic_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u00c6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3)\n\3\3\4\3\4\3\4\3\4\3\4\5\4\60\n\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5>\n\5\3\5\3\5\3\6\3\6\7\6D\n\6\f\6"+
		"\16\6G\13\6\3\6\3\6\5\6K\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\7\7Y\n\7\f\7\16\7\\\13\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tr\n\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\tz\n\t\3\t\3\t\5\t~\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\5\n\u008c\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0098"+
		"\n\n\f\n\16\n\u009b\13\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b3\n\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00bf\n\f\f\f\16\f\u00c2\13\f\3\r\3\r"+
		"\3\r\2\4\22\26\16\2\4\6\b\n\f\16\20\22\24\26\30\2\b\3\2\17\20\3\2\r\16"+
		"\4\2\32\35  \3\2\21\24\3\2\25\26\3\2\36\37\2\u00d3\2\35\3\2\2\2\4(\3\2"+
		"\2\2\6*\3\2\2\2\b\64\3\2\2\2\nJ\3\2\2\2\fL\3\2\2\2\16`\3\2\2\2\20h\3\2"+
		"\2\2\22\u008b\3\2\2\2\24\u009c\3\2\2\2\26\u00b2\3\2\2\2\30\u00c3\3\2\2"+
		"\2\32\34\5\4\3\2\33\32\3\2\2\2\34\37\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2"+
		"\2\36 \3\2\2\2\37\35\3\2\2\2 !\b\2\1\2!\3\3\2\2\2\")\5\20\t\2#)\5\6\4"+
		"\2$)\5\b\5\2%)\5\f\7\2&)\5\16\b\2\')\7\"\2\2(\"\3\2\2\2(#\3\2\2\2($\3"+
		"\2\2\2(%\3\2\2\2(&\3\2\2\2(\'\3\2\2\2)\5\3\2\2\2*+\7\31\2\2+,\b\4\1\2"+
		",/\7\21\2\2-\60\5\22\n\2.\60\5\26\f\2/-\3\2\2\2/.\3\2\2\2\60\61\3\2\2"+
		"\2\61\62\b\4\1\2\62\63\7\"\2\2\63\7\3\2\2\2\64\65\b\5\1\2\65\66\7\3\2"+
		"\2\66\67\5\26\f\2\678\b\5\1\289\7\4\2\29:\5\n\6\2:=\b\5\1\2;<\7!\2\2<"+
		">\5\n\6\2=;\3\2\2\2=>\3\2\2\2>?\3\2\2\2?@\b\5\1\2@\t\3\2\2\2AE\7%\2\2"+
		"BD\5\4\3\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2"+
		"HK\7&\2\2IK\5\4\3\2JA\3\2\2\2JI\3\2\2\2K\13\3\2\2\2LM\b\7\1\2MN\7\5\2"+
		"\2NO\5\22\n\2OP\b\7\1\2PZ\7%\2\2QR\7\6\2\2RS\5\24\13\2ST\b\7\1\2TU\7!"+
		"\2\2UV\5\n\6\2VW\b\7\1\2WY\3\2\2\2XQ\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3"+
		"\2\2\2[]\3\2\2\2\\Z\3\2\2\2]^\7&\2\2^_\b\7\1\2_\r\3\2\2\2`a\b\b\1\2ab"+
		"\7\7\2\2bc\b\b\1\2cd\5\n\6\2de\7\b\2\2ef\5\26\f\2fg\b\b\1\2g\17\3\2\2"+
		"\2hq\b\t\1\2ij\7\t\2\2jr\b\t\1\2kl\7\n\2\2lr\b\t\1\2mn\7\13\2\2nr\b\t"+
		"\1\2op\7\f\2\2pr\b\t\1\2qi\3\2\2\2qk\3\2\2\2qm\3\2\2\2qo\3\2\2\2rs\3\2"+
		"\2\2st\7\31\2\2t}\b\t\1\2uv\b\t\1\2vy\7\21\2\2wz\5\22\n\2xz\5\26\f\2y"+
		"w\3\2\2\2yx\3\2\2\2z{\3\2\2\2{|\b\t\1\2|~\3\2\2\2}u\3\2\2\2}~\3\2\2\2"+
		"~\177\3\2\2\2\177\u0080\7\"\2\2\u0080\21\3\2\2\2\u0081\u0082\b\n\1\2\u0082"+
		"\u0083\7#\2\2\u0083\u0084\5\22\n\2\u0084\u0085\7$\2\2\u0085\u008c\3\2"+
		"\2\2\u0086\u0087\5\24\13\2\u0087\u0088\b\n\1\2\u0088\u008c\3\2\2\2\u0089"+
		"\u008a\7\31\2\2\u008a\u008c\b\n\1\2\u008b\u0081\3\2\2\2\u008b\u0086\3"+
		"\2\2\2\u008b\u0089\3\2\2\2\u008c\u0099\3\2\2\2\u008d\u008e\f\6\2\2\u008e"+
		"\u008f\t\2\2\2\u008f\u0090\5\22\n\7\u0090\u0091\b\n\1\2\u0091\u0098\3"+
		"\2\2\2\u0092\u0093\f\5\2\2\u0093\u0094\t\3\2\2\u0094\u0095\5\22\n\6\u0095"+
		"\u0096\b\n\1\2\u0096\u0098\3\2\2\2\u0097\u008d\3\2\2\2\u0097\u0092\3\2"+
		"\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\23\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\t\4\2\2\u009d\25\3\2\2\2\u009e"+
		"\u009f\b\f\1\2\u009f\u00a0\7#\2\2\u00a0\u00a1\5\26\f\2\u00a1\u00a2\7$"+
		"\2\2\u00a2\u00b3\3\2\2\2\u00a3\u00a4\5\22\n\2\u00a4\u00a5\t\5\2\2\u00a5"+
		"\u00a6\5\22\n\2\u00a6\u00a7\b\f\1\2\u00a7\u00b3\3\2\2\2\u00a8\u00a9\5"+
		"\22\n\2\u00a9\u00aa\t\6\2\2\u00aa\u00ab\5\22\n\2\u00ab\u00ac\b\f\1\2\u00ac"+
		"\u00b3\3\2\2\2\u00ad\u00ae\5\30\r\2\u00ae\u00af\b\f\1\2\u00af\u00b3\3"+
		"\2\2\2\u00b0\u00b1\7\31\2\2\u00b1\u00b3\b\f\1\2\u00b2\u009e\3\2\2\2\u00b2"+
		"\u00a3\3\2\2\2\u00b2\u00a8\3\2\2\2\u00b2\u00ad\3\2\2\2\u00b2\u00b0\3\2"+
		"\2\2\u00b3\u00c0\3\2\2\2\u00b4\u00b5\f\6\2\2\u00b5\u00b6\7\27\2\2\u00b6"+
		"\u00b7\5\26\f\7\u00b7\u00b8\b\f\1\2\u00b8\u00bf\3\2\2\2\u00b9\u00ba\f"+
		"\5\2\2\u00ba\u00bb\7\30\2\2\u00bb\u00bc\5\26\f\6\u00bc\u00bd\b\f\1\2\u00bd"+
		"\u00bf\3\2\2\2\u00be\u00b4\3\2\2\2\u00be\u00b9\3\2\2\2\u00bf\u00c2\3\2"+
		"\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\27\3\2\2\2\u00c2\u00c0"+
		"\3\2\2\2\u00c3\u00c4\t\7\2\2\u00c4\31\3\2\2\2\22\35(/=EJZqy}\u008b\u0097"+
		"\u0099\u00b2\u00be\u00c0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}