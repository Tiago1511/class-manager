// Generated from C:/Users/phenr/github-classroom/Departamento-de-Engenharia-Informatica/sem4pi-22-23-55/base.core/src/main/java/eapli/base/examManagement/exam\createExam.g4 by ANTLR 4.12.0
package eapli.base.examManagement.exam.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class createExamParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EXAM=1, CODE=2, TOTAL_MARKS=3, PASSING_MARKS=4, DURATION=5, SECTION=6, 
		MARKS=7, QUESTIONS=8, QUESTION_TYPE=9, MULTIPLE_CHOICE=10, BOOLEAN=11, 
		TEXT_ANSWER=12, CORRECT_ANSWER=13, NUMBER=14, STRING=15, NEWLINE=16, WS=17;
	public static final int
		RULE_start = 0, RULE_exam = 1, RULE_exam_name = 2, RULE_code_name = 3, 
		RULE_total_marks = 4, RULE_passing_marks = 5, RULE_duration_ = 6, RULE_text = 7, 
		RULE_section = 8, RULE_question_section = 9, RULE_section_name = 10, RULE_section_marks = 11, 
		RULE_mc_question_block = 12, RULE_tf_question_block = 13, RULE_ta_question_block = 14, 
		RULE_mc_question = 15, RULE_mc_answer_block = 16, RULE_mc_answer = 17, 
		RULE_tf_question = 18, RULE_ta_question = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "exam", "exam_name", "code_name", "total_marks", "passing_marks", 
			"duration_", "text", "section", "question_section", "section_name", "section_marks", 
			"mc_question_block", "tf_question_block", "ta_question_block", "mc_question", 
			"mc_answer_block", "mc_answer", "tf_question", "ta_question"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EXAM", "CODE", "TOTAL_MARKS", "PASSING_MARKS", "DURATION", "SECTION", 
			"MARKS", "QUESTIONS", "QUESTION_TYPE", "MULTIPLE_CHOICE", "BOOLEAN", 
			"TEXT_ANSWER", "CORRECT_ANSWER", "NUMBER", "STRING", "NEWLINE", "WS"
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
	public String getGrammarFileName() { return "createExam.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public createExamParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public ExamContext exam() {
			return getRuleContext(ExamContext.class,0);
		}
		public TerminalNode EOF() { return getToken(createExamParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof createExamListener ) ((createExamListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof createExamListener ) ((createExamListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof createExamVisitor ) return ((createExamVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			exam();
			setState(41);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExamContext extends ParserRuleContext {
		public TerminalNode EXAM() { return getToken(createExamParser.EXAM, 0); }
		public Exam_nameContext exam_name() {
			return getRuleContext(Exam_nameContext.class,0);
		}
		public TerminalNode CODE() { return getToken(createExamParser.CODE, 0); }
		public Code_nameContext code_name() {
			return getRuleContext(Code_nameContext.class,0);
		}
		public TerminalNode TOTAL_MARKS() { return getToken(createExamParser.TOTAL_MARKS, 0); }
		public Total_marksContext total_marks() {
			return getRuleContext(Total_marksContext.class,0);
		}
		public TerminalNode PASSING_MARKS() { return getToken(createExamParser.PASSING_MARKS, 0); }
		public Passing_marksContext passing_marks() {
			return getRuleContext(Passing_marksContext.class,0);
		}
		public TerminalNode DURATION() { return getToken(createExamParser.DURATION, 0); }
		public Duration_Context duration_() {
			return getRuleContext(Duration_Context.class,0);
		}
		public List<SectionContext> section() {
			return getRuleContexts(SectionContext.class);
		}
		public SectionContext section(int i) {
			return getRuleContext(SectionContext.class,i);
		}
		public ExamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof createExamListener ) ((createExamListener)listener).enterExam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof createExamListener ) ((createExamListener)listener).exitExam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof createExamVisitor ) return ((createExamVisitor<? extends T>)visitor).visitExam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExamContext exam() throws RecognitionException {
		ExamContext _localctx = new ExamContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_exam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(EXAM);
			setState(44);
			exam_name();
			setState(45);
			match(CODE);
			setState(46);
			code_name();
			setState(47);
			match(TOTAL_MARKS);
			setState(48);
			total_marks();
			setState(49);
			match(PASSING_MARKS);
			setState(50);
			passing_marks();
			setState(51);
			match(DURATION);
			setState(52);
			duration_();
			setState(54); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(53);
				section();
				}
				}
				setState(56); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SECTION );
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

	@SuppressWarnings("CheckReturnValue")
	public static class Exam_nameContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(createExamParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(createExamParser.STRING, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(createExamParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(createExamParser.NEWLINE, i);
		}
		public Exam_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exam_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof createExamListener ) ((createExamListener)listener).enterExam_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof createExamListener ) ((createExamListener)listener).exitExam_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof createExamVisitor ) return ((createExamVisitor<? extends T>)visitor).visitExam_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exam_nameContext exam_name() throws RecognitionException {
		Exam_nameContext _localctx = new Exam_nameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_exam_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(58);
				match(STRING);
				}
				}
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(63);
				match(NEWLINE);
				}
				}
				setState(68);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Code_nameContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(createExamParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(createExamParser.STRING, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(createExamParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(createExamParser.NEWLINE, i);
		}
		public Code_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof createExamListener ) ((createExamListener)listener).enterCode_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof createExamListener ) ((createExamListener)listener).exitCode_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof createExamVisitor ) return ((createExamVisitor<? extends T>)visitor).visitCode_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Code_nameContext code_name() throws RecognitionException {
		Code_nameContext _localctx = new Code_nameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_code_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(69);
				match(STRING);
				}
				}
				setState(72); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(74);
				match(NEWLINE);
				}
				}
				setState(79);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Total_marksContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(createExamParser.NUMBER, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(createExamParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(createExamParser.NEWLINE, i);
		}
		public Total_marksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_total_marks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof createExamListener ) ((createExamListener)listener).enterTotal_marks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof createExamListener ) ((createExamListener)listener).exitTotal_marks(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof createExamVisitor ) return ((createExamVisitor<? extends T>)visitor).visitTotal_marks(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Total_marksContext total_marks() throws RecognitionException {
		Total_marksContext _localctx = new Total_marksContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_total_marks);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(NUMBER);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(81);
				match(NEWLINE);
				}
				}
				setState(86);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Passing_marksContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(createExamParser.NUMBER, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(createExamParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(createExamParser.NEWLINE, i);
		}
		public Passing_marksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_passing_marks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof createExamListener ) ((createExamListener)listener).enterPassing_marks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof createExamListener ) ((createExamListener)listener).exitPassing_marks(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof createExamVisitor ) return ((createExamVisitor<? extends T>)visitor).visitPassing_marks(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Passing_marksContext passing_marks() throws RecognitionException {
		Passing_marksContext _localctx = new Passing_marksContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_passing_marks);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(NUMBER);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(88);
				match(NEWLINE);
				}
				}
				setState(93);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Duration_Context extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(createExamParser.NUMBER, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(createExamParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(createExamParser.NEWLINE, i);
		}
		public List<TerminalNode> STRING() { return getTokens(createExamParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(createExamParser.STRING, i);
		}
		public Duration_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_duration_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof createExamListener ) ((createExamListener)listener).enterDuration_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof createExamListener ) ((createExamListener)listener).exitDuration_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof createExamVisitor ) return ((createExamVisitor<? extends T>)visitor).visitDuration_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Duration_Context duration_() throws RecognitionException {
		Duration_Context _localctx = new Duration_Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_duration_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(NUMBER);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(95);
				match(NEWLINE);
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(101);
				match(STRING);
				}
				}
				setState(104); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(106);
				match(NEWLINE);
				}
				}
				setState(111);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TextContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(createExamParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(createExamParser.STRING, i);
		}
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof createExamListener ) ((createExamListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof createExamListener ) ((createExamListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof createExamVisitor ) return ((createExamVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		return text(0);
	}

	private TextContext text(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TextContext _localctx = new TextContext(_ctx, _parentState);
		TextContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_text, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(113);
			match(STRING);
			}
			_ctx.stop = _input.LT(-1);
			setState(123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TextContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_text);
					setState(115);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(117); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(116);
							match(STRING);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(119); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(125);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SectionContext extends ParserRuleContext {
		public TerminalNode SECTION() { return getToken(createExamParser.SECTION, 0); }
		public Section_nameContext section_name() {
			return getRuleContext(Section_nameContext.class,0);
		}
		public TerminalNode MARKS() { return getToken(createExamParser.MARKS, 0); }
		public Section_marksContext section_marks() {
			return getRuleContext(Section_marksContext.class,0);
		}
		public TerminalNode QUESTIONS() { return getToken(createExamParser.QUESTIONS, 0); }
		public List<Question_sectionContext> question_section() {
			return getRuleContexts(Question_sectionContext.class);
		}
		public Question_sectionContext question_section(int i) {
			return getRuleContext(Question_sectionContext.class,i);
		}
		public SectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof createExamListener ) ((createExamListener)listener).enterSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof createExamListener ) ((createExamListener)listener).exitSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof createExamVisitor ) return ((createExamVisitor<? extends T>)visitor).visitSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SectionContext section() throws RecognitionException {
		SectionContext _localctx = new SectionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_section);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(SECTION);
			setState(127);
			section_name();
			setState(128);
			match(MARKS);
			setState(129);
			section_marks();
			setState(130);
			match(QUESTIONS);
			setState(132); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(131);
				question_section();
				}
				}
				setState(134); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==QUESTION_TYPE );
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

	@SuppressWarnings("CheckReturnValue")
	public static class Question_sectionContext extends ParserRuleContext {
		public Mc_question_blockContext mc_question_block() {
			return getRuleContext(Mc_question_blockContext.class,0);
		}
		public Tf_question_blockContext tf_question_block() {
			return getRuleContext(Tf_question_blockContext.class,0);
		}
		public Ta_question_blockContext ta_question_block() {
			return getRuleContext(Ta_question_blockContext.class,0);
		}
		public Question_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof createExamListener ) ((createExamListener)listener).enterQuestion_section(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof createExamListener ) ((createExamListener)listener).exitQuestion_section(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof createExamVisitor ) return ((createExamVisitor<? extends T>)visitor).visitQuestion_section(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Question_sectionContext question_section() throws RecognitionException {
		Question_sectionContext _localctx = new Question_sectionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_question_section);
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				mc_question_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				tf_question_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				ta_question_block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Section_nameContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(createExamParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(createExamParser.NEWLINE, i);
		}
		public Section_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof createExamListener ) ((createExamListener)listener).enterSection_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof createExamListener ) ((createExamListener)listener).exitSection_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof createExamVisitor ) return ((createExamVisitor<? extends T>)visitor).visitSection_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Section_nameContext section_name() throws RecognitionException {
		Section_nameContext _localctx = new Section_nameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_section_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			text(0);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(142);
				match(NEWLINE);
				}
				}
				setState(147);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Section_marksContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(createExamParser.NUMBER, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(createExamParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(createExamParser.NEWLINE, i);
		}
		public Section_marksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section_marks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof createExamListener ) ((createExamListener)listener).enterSection_marks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof createExamListener ) ((createExamListener)listener).exitSection_marks(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof createExamVisitor ) return ((createExamVisitor<? extends T>)visitor).visitSection_marks(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Section_marksContext section_marks() throws RecognitionException {
		Section_marksContext _localctx = new Section_marksContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_section_marks);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(NUMBER);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(149);
				match(NEWLINE);
				}
				}
				setState(154);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Mc_question_blockContext extends ParserRuleContext {
		public TerminalNode QUESTION_TYPE() { return getToken(createExamParser.QUESTION_TYPE, 0); }
		public TerminalNode MULTIPLE_CHOICE() { return getToken(createExamParser.MULTIPLE_CHOICE, 0); }
		public TerminalNode MARKS() { return getToken(createExamParser.MARKS, 0); }
		public TerminalNode NUMBER() { return getToken(createExamParser.NUMBER, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(createExamParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(createExamParser.NEWLINE, i);
		}
		public List<Mc_questionContext> mc_question() {
			return getRuleContexts(Mc_questionContext.class);
		}
		public Mc_questionContext mc_question(int i) {
			return getRuleContext(Mc_questionContext.class,i);
		}
		public Mc_question_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mc_question_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof createExamListener ) ((createExamListener)listener).enterMc_question_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof createExamListener ) ((createExamListener)listener).exitMc_question_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof createExamVisitor ) return ((createExamVisitor<? extends T>)visitor).visitMc_question_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mc_question_blockContext mc_question_block() throws RecognitionException {
		Mc_question_blockContext _localctx = new Mc_question_blockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_mc_question_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(QUESTION_TYPE);
			setState(156);
			match(MULTIPLE_CHOICE);
			setState(157);
			match(MARKS);
			setState(158);
			match(NUMBER);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(159);
				match(NEWLINE);
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(166); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(165);
				mc_question();
				}
				}
				setState(168); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(170);
				match(NEWLINE);
				}
				}
				setState(175);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Tf_question_blockContext extends ParserRuleContext {
		public TerminalNode QUESTION_TYPE() { return getToken(createExamParser.QUESTION_TYPE, 0); }
		public TerminalNode BOOLEAN() { return getToken(createExamParser.BOOLEAN, 0); }
		public TerminalNode MARKS() { return getToken(createExamParser.MARKS, 0); }
		public TerminalNode NUMBER() { return getToken(createExamParser.NUMBER, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(createExamParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(createExamParser.NEWLINE, i);
		}
		public List<Tf_questionContext> tf_question() {
			return getRuleContexts(Tf_questionContext.class);
		}
		public Tf_questionContext tf_question(int i) {
			return getRuleContext(Tf_questionContext.class,i);
		}
		public Tf_question_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tf_question_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof createExamListener ) ((createExamListener)listener).enterTf_question_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof createExamListener ) ((createExamListener)listener).exitTf_question_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof createExamVisitor ) return ((createExamVisitor<? extends T>)visitor).visitTf_question_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tf_question_blockContext tf_question_block() throws RecognitionException {
		Tf_question_blockContext _localctx = new Tf_question_blockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tf_question_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(QUESTION_TYPE);
			setState(177);
			match(BOOLEAN);
			setState(178);
			match(MARKS);
			setState(179);
			match(NUMBER);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(180);
				match(NEWLINE);
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(187); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(186);
				tf_question();
				}
				}
				setState(189); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(191);
				match(NEWLINE);
				}
				}
				setState(196);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Ta_question_blockContext extends ParserRuleContext {
		public TerminalNode QUESTION_TYPE() { return getToken(createExamParser.QUESTION_TYPE, 0); }
		public TerminalNode TEXT_ANSWER() { return getToken(createExamParser.TEXT_ANSWER, 0); }
		public TerminalNode MARKS() { return getToken(createExamParser.MARKS, 0); }
		public TerminalNode NUMBER() { return getToken(createExamParser.NUMBER, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(createExamParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(createExamParser.NEWLINE, i);
		}
		public List<Ta_questionContext> ta_question() {
			return getRuleContexts(Ta_questionContext.class);
		}
		public Ta_questionContext ta_question(int i) {
			return getRuleContext(Ta_questionContext.class,i);
		}
		public Ta_question_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ta_question_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof createExamListener ) ((createExamListener)listener).enterTa_question_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof createExamListener ) ((createExamListener)listener).exitTa_question_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof createExamVisitor ) return ((createExamVisitor<? extends T>)visitor).visitTa_question_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ta_question_blockContext ta_question_block() throws RecognitionException {
		Ta_question_blockContext _localctx = new Ta_question_blockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ta_question_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(QUESTION_TYPE);
			setState(198);
			match(TEXT_ANSWER);
			setState(199);
			match(MARKS);
			setState(200);
			match(NUMBER);
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(201);
				match(NEWLINE);
				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(208); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(207);
				ta_question();
				}
				}
				setState(210); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(212);
				match(NEWLINE);
				}
				}
				setState(217);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Mc_questionContext extends ParserRuleContext {
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public Mc_answer_blockContext mc_answer_block() {
			return getRuleContext(Mc_answer_blockContext.class,0);
		}
		public TerminalNode CORRECT_ANSWER() { return getToken(createExamParser.CORRECT_ANSWER, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(createExamParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(createExamParser.NEWLINE, i);
		}
		public Mc_questionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mc_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof createExamListener ) ((createExamListener)listener).enterMc_question(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof createExamListener ) ((createExamListener)listener).exitMc_question(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof createExamVisitor ) return ((createExamVisitor<? extends T>)visitor).visitMc_question(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mc_questionContext mc_question() throws RecognitionException {
		Mc_questionContext _localctx = new Mc_questionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_mc_question);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			text(0);
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(219);
				match(NEWLINE);
				}
				}
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(225);
			mc_answer_block();
			setState(226);
			match(CORRECT_ANSWER);
			setState(227);
			text(0);
			setState(231);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(228);
					match(NEWLINE);
					}
					} 
				}
				setState(233);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Mc_answer_blockContext extends ParserRuleContext {
		public List<Mc_answerContext> mc_answer() {
			return getRuleContexts(Mc_answerContext.class);
		}
		public Mc_answerContext mc_answer(int i) {
			return getRuleContext(Mc_answerContext.class,i);
		}
		public Mc_answer_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mc_answer_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof createExamListener ) ((createExamListener)listener).enterMc_answer_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof createExamListener ) ((createExamListener)listener).exitMc_answer_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof createExamVisitor ) return ((createExamVisitor<? extends T>)visitor).visitMc_answer_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mc_answer_blockContext mc_answer_block() throws RecognitionException {
		Mc_answer_blockContext _localctx = new Mc_answer_blockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_mc_answer_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(234);
				mc_answer();
				}
				}
				setState(237); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
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

	@SuppressWarnings("CheckReturnValue")
	public static class Mc_answerContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(createExamParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(createExamParser.NEWLINE, i);
		}
		public TerminalNode NUMBER() { return getToken(createExamParser.NUMBER, 0); }
		public Mc_answerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mc_answer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof createExamListener ) ((createExamListener)listener).enterMc_answer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof createExamListener ) ((createExamListener)listener).exitMc_answer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof createExamVisitor ) return ((createExamVisitor<? extends T>)visitor).visitMc_answer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mc_answerContext mc_answer() throws RecognitionException {
		Mc_answerContext _localctx = new Mc_answerContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_mc_answer);
		int _la;
		try {
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				text(0);
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(240);
					match(NEWLINE);
					}
					}
					setState(245);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				text(0);
				setState(247);
				match(NUMBER);
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(248);
					match(NEWLINE);
					}
					}
					setState(253);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Tf_questionContext extends ParserRuleContext {
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public TerminalNode CORRECT_ANSWER() { return getToken(createExamParser.CORRECT_ANSWER, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(createExamParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(createExamParser.NEWLINE, i);
		}
		public Tf_questionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tf_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof createExamListener ) ((createExamListener)listener).enterTf_question(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof createExamListener ) ((createExamListener)listener).exitTf_question(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof createExamVisitor ) return ((createExamVisitor<? extends T>)visitor).visitTf_question(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tf_questionContext tf_question() throws RecognitionException {
		Tf_questionContext _localctx = new Tf_questionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_tf_question);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			text(0);
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(257);
				match(NEWLINE);
				}
				}
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(263);
			match(CORRECT_ANSWER);
			setState(264);
			text(0);
			setState(268);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(265);
					match(NEWLINE);
					}
					} 
				}
				setState(270);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Ta_questionContext extends ParserRuleContext {
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public TerminalNode CORRECT_ANSWER() { return getToken(createExamParser.CORRECT_ANSWER, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(createExamParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(createExamParser.NEWLINE, i);
		}
		public Ta_questionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ta_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof createExamListener ) ((createExamListener)listener).enterTa_question(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof createExamListener ) ((createExamListener)listener).exitTa_question(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof createExamVisitor ) return ((createExamVisitor<? extends T>)visitor).visitTa_question(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ta_questionContext ta_question() throws RecognitionException {
		Ta_questionContext _localctx = new Ta_questionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ta_question);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			text(0);
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(272);
				match(NEWLINE);
				}
				}
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(278);
			match(CORRECT_ANSWER);
			setState(279);
			text(0);
			setState(283);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(280);
					match(NEWLINE);
					}
					} 
				}
				setState(285);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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
		case 7:
			return text_sempred((TextContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean text_sempred(TextContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0011\u011f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u00017\b"+
		"\u0001\u000b\u0001\f\u00018\u0001\u0002\u0004\u0002<\b\u0002\u000b\u0002"+
		"\f\u0002=\u0001\u0002\u0005\u0002A\b\u0002\n\u0002\f\u0002D\t\u0002\u0001"+
		"\u0003\u0004\u0003G\b\u0003\u000b\u0003\f\u0003H\u0001\u0003\u0005\u0003"+
		"L\b\u0003\n\u0003\f\u0003O\t\u0003\u0001\u0004\u0001\u0004\u0005\u0004"+
		"S\b\u0004\n\u0004\f\u0004V\t\u0004\u0001\u0005\u0001\u0005\u0005\u0005"+
		"Z\b\u0005\n\u0005\f\u0005]\t\u0005\u0001\u0006\u0001\u0006\u0005\u0006"+
		"a\b\u0006\n\u0006\f\u0006d\t\u0006\u0001\u0006\u0004\u0006g\b\u0006\u000b"+
		"\u0006\f\u0006h\u0001\u0006\u0005\u0006l\b\u0006\n\u0006\f\u0006o\t\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007"+
		"v\b\u0007\u000b\u0007\f\u0007w\u0005\u0007z\b\u0007\n\u0007\f\u0007}\t"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004\b\u0085\b"+
		"\b\u000b\b\f\b\u0086\u0001\t\u0001\t\u0001\t\u0003\t\u008c\b\t\u0001\n"+
		"\u0001\n\u0005\n\u0090\b\n\n\n\f\n\u0093\t\n\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u0097\b\u000b\n\u000b\f\u000b\u009a\t\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0005\f\u00a1\b\f\n\f\f\f\u00a4\t\f\u0001\f\u0004\f"+
		"\u00a7\b\f\u000b\f\f\f\u00a8\u0001\f\u0005\f\u00ac\b\f\n\f\f\f\u00af\t"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00b6\b\r\n\r\f\r\u00b9"+
		"\t\r\u0001\r\u0004\r\u00bc\b\r\u000b\r\f\r\u00bd\u0001\r\u0005\r\u00c1"+
		"\b\r\n\r\f\r\u00c4\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0005\u000e\u00cb\b\u000e\n\u000e\f\u000e\u00ce\t\u000e\u0001"+
		"\u000e\u0004\u000e\u00d1\b\u000e\u000b\u000e\f\u000e\u00d2\u0001\u000e"+
		"\u0005\u000e\u00d6\b\u000e\n\u000e\f\u000e\u00d9\t\u000e\u0001\u000f\u0001"+
		"\u000f\u0005\u000f\u00dd\b\u000f\n\u000f\f\u000f\u00e0\t\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00e6\b\u000f\n\u000f"+
		"\f\u000f\u00e9\t\u000f\u0001\u0010\u0004\u0010\u00ec\b\u0010\u000b\u0010"+
		"\f\u0010\u00ed\u0001\u0011\u0001\u0011\u0005\u0011\u00f2\b\u0011\n\u0011"+
		"\f\u0011\u00f5\t\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011"+
		"\u00fa\b\u0011\n\u0011\f\u0011\u00fd\t\u0011\u0003\u0011\u00ff\b\u0011"+
		"\u0001\u0012\u0001\u0012\u0005\u0012\u0103\b\u0012\n\u0012\f\u0012\u0106"+
		"\t\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u010b\b\u0012"+
		"\n\u0012\f\u0012\u010e\t\u0012\u0001\u0013\u0001\u0013\u0005\u0013\u0112"+
		"\b\u0013\n\u0013\f\u0013\u0115\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0005\u0013\u011a\b\u0013\n\u0013\f\u0013\u011d\t\u0013\u0001\u0013\u0000"+
		"\u0001\u000e\u0014\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&\u0000\u0000\u012e\u0000(\u0001\u0000"+
		"\u0000\u0000\u0002+\u0001\u0000\u0000\u0000\u0004;\u0001\u0000\u0000\u0000"+
		"\u0006F\u0001\u0000\u0000\u0000\bP\u0001\u0000\u0000\u0000\nW\u0001\u0000"+
		"\u0000\u0000\f^\u0001\u0000\u0000\u0000\u000ep\u0001\u0000\u0000\u0000"+
		"\u0010~\u0001\u0000\u0000\u0000\u0012\u008b\u0001\u0000\u0000\u0000\u0014"+
		"\u008d\u0001\u0000\u0000\u0000\u0016\u0094\u0001\u0000\u0000\u0000\u0018"+
		"\u009b\u0001\u0000\u0000\u0000\u001a\u00b0\u0001\u0000\u0000\u0000\u001c"+
		"\u00c5\u0001\u0000\u0000\u0000\u001e\u00da\u0001\u0000\u0000\u0000 \u00eb"+
		"\u0001\u0000\u0000\u0000\"\u00fe\u0001\u0000\u0000\u0000$\u0100\u0001"+
		"\u0000\u0000\u0000&\u010f\u0001\u0000\u0000\u0000()\u0003\u0002\u0001"+
		"\u0000)*\u0005\u0000\u0000\u0001*\u0001\u0001\u0000\u0000\u0000+,\u0005"+
		"\u0001\u0000\u0000,-\u0003\u0004\u0002\u0000-.\u0005\u0002\u0000\u0000"+
		"./\u0003\u0006\u0003\u0000/0\u0005\u0003\u0000\u000001\u0003\b\u0004\u0000"+
		"12\u0005\u0004\u0000\u000023\u0003\n\u0005\u000034\u0005\u0005\u0000\u0000"+
		"46\u0003\f\u0006\u000057\u0003\u0010\b\u000065\u0001\u0000\u0000\u0000"+
		"78\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u000089\u0001\u0000\u0000"+
		"\u00009\u0003\u0001\u0000\u0000\u0000:<\u0005\u000f\u0000\u0000;:\u0001"+
		"\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000"+
		"=>\u0001\u0000\u0000\u0000>B\u0001\u0000\u0000\u0000?A\u0005\u0010\u0000"+
		"\u0000@?\u0001\u0000\u0000\u0000AD\u0001\u0000\u0000\u0000B@\u0001\u0000"+
		"\u0000\u0000BC\u0001\u0000\u0000\u0000C\u0005\u0001\u0000\u0000\u0000"+
		"DB\u0001\u0000\u0000\u0000EG\u0005\u000f\u0000\u0000FE\u0001\u0000\u0000"+
		"\u0000GH\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000"+
		"\u0000\u0000IM\u0001\u0000\u0000\u0000JL\u0005\u0010\u0000\u0000KJ\u0001"+
		"\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000"+
		"MN\u0001\u0000\u0000\u0000N\u0007\u0001\u0000\u0000\u0000OM\u0001\u0000"+
		"\u0000\u0000PT\u0005\u000e\u0000\u0000QS\u0005\u0010\u0000\u0000RQ\u0001"+
		"\u0000\u0000\u0000SV\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000"+
		"TU\u0001\u0000\u0000\u0000U\t\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000"+
		"\u0000W[\u0005\u000e\u0000\u0000XZ\u0005\u0010\u0000\u0000YX\u0001\u0000"+
		"\u0000\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001"+
		"\u0000\u0000\u0000\\\u000b\u0001\u0000\u0000\u0000][\u0001\u0000\u0000"+
		"\u0000^b\u0005\u000e\u0000\u0000_a\u0005\u0010\u0000\u0000`_\u0001\u0000"+
		"\u0000\u0000ad\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000bc\u0001"+
		"\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000"+
		"eg\u0005\u000f\u0000\u0000fe\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000"+
		"\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000im\u0001\u0000"+
		"\u0000\u0000jl\u0005\u0010\u0000\u0000kj\u0001\u0000\u0000\u0000lo\u0001"+
		"\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000"+
		"n\r\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000pq\u0006\u0007\uffff"+
		"\uffff\u0000qr\u0005\u000f\u0000\u0000r{\u0001\u0000\u0000\u0000su\n\u0001"+
		"\u0000\u0000tv\u0005\u000f\u0000\u0000ut\u0001\u0000\u0000\u0000vw\u0001"+
		"\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000"+
		"xz\u0001\u0000\u0000\u0000ys\u0001\u0000\u0000\u0000z}\u0001\u0000\u0000"+
		"\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|\u000f\u0001"+
		"\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000~\u007f\u0005\u0006\u0000"+
		"\u0000\u007f\u0080\u0003\u0014\n\u0000\u0080\u0081\u0005\u0007\u0000\u0000"+
		"\u0081\u0082\u0003\u0016\u000b\u0000\u0082\u0084\u0005\b\u0000\u0000\u0083"+
		"\u0085\u0003\u0012\t\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0087"+
		"\u0001\u0000\u0000\u0000\u0087\u0011\u0001\u0000\u0000\u0000\u0088\u008c"+
		"\u0003\u0018\f\u0000\u0089\u008c\u0003\u001a\r\u0000\u008a\u008c\u0003"+
		"\u001c\u000e\u0000\u008b\u0088\u0001\u0000\u0000\u0000\u008b\u0089\u0001"+
		"\u0000\u0000\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008c\u0013\u0001"+
		"\u0000\u0000\u0000\u008d\u0091\u0003\u000e\u0007\u0000\u008e\u0090\u0005"+
		"\u0010\u0000\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u0090\u0093\u0001"+
		"\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001"+
		"\u0000\u0000\u0000\u0092\u0015\u0001\u0000\u0000\u0000\u0093\u0091\u0001"+
		"\u0000\u0000\u0000\u0094\u0098\u0005\u000e\u0000\u0000\u0095\u0097\u0005"+
		"\u0010\u0000\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0097\u009a\u0001"+
		"\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001"+
		"\u0000\u0000\u0000\u0099\u0017\u0001\u0000\u0000\u0000\u009a\u0098\u0001"+
		"\u0000\u0000\u0000\u009b\u009c\u0005\t\u0000\u0000\u009c\u009d\u0005\n"+
		"\u0000\u0000\u009d\u009e\u0005\u0007\u0000\u0000\u009e\u00a2\u0005\u000e"+
		"\u0000\u0000\u009f\u00a1\u0005\u0010\u0000\u0000\u00a0\u009f\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a4\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a5\u00a7\u0003\u001e"+
		"\u000f\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000"+
		"\u0000\u0000\u00a9\u00ad\u0001\u0000\u0000\u0000\u00aa\u00ac\u0005\u0010"+
		"\u0000\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ac\u00af\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000"+
		"\u0000\u0000\u00ae\u0019\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b1\u0005\t\u0000\u0000\u00b1\u00b2\u0005\u000b\u0000"+
		"\u0000\u00b2\u00b3\u0005\u0007\u0000\u0000\u00b3\u00b7\u0005\u000e\u0000"+
		"\u0000\u00b4\u00b6\u0005\u0010\u0000\u0000\u00b5\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b9\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00bb\u0001\u0000\u0000"+
		"\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00ba\u00bc\u0003$\u0012\u0000"+
		"\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000"+
		"\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000"+
		"\u00be\u00c2\u0001\u0000\u0000\u0000\u00bf\u00c1\u0005\u0010\u0000\u0000"+
		"\u00c0\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c4\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c3\u001b\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c6\u0005\t\u0000\u0000\u00c6\u00c7\u0005\f\u0000\u0000\u00c7"+
		"\u00c8\u0005\u0007\u0000\u0000\u00c8\u00cc\u0005\u000e\u0000\u0000\u00c9"+
		"\u00cb\u0005\u0010\u0000\u0000\u00ca\u00c9\u0001\u0000\u0000\u0000\u00cb"+
		"\u00ce\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc"+
		"\u00cd\u0001\u0000\u0000\u0000\u00cd\u00d0\u0001\u0000\u0000\u0000\u00ce"+
		"\u00cc\u0001\u0000\u0000\u0000\u00cf\u00d1\u0003&\u0013\u0000\u00d0\u00cf"+
		"\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d0"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d7"+
		"\u0001\u0000\u0000\u0000\u00d4\u00d6\u0005\u0010\u0000\u0000\u00d5\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d9\u0001\u0000\u0000\u0000\u00d7\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u001d"+
		"\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00da\u00de"+
		"\u0003\u000e\u0007\u0000\u00db\u00dd\u0005\u0010\u0000\u0000\u00dc\u00db"+
		"\u0001\u0000\u0000\u0000\u00dd\u00e0\u0001\u0000\u0000\u0000\u00de\u00dc"+
		"\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e1"+
		"\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e1\u00e2"+
		"\u0003 \u0010\u0000\u00e2\u00e3\u0005\r\u0000\u0000\u00e3\u00e7\u0003"+
		"\u000e\u0007\u0000\u00e4\u00e6\u0005\u0010\u0000\u0000\u00e5\u00e4\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e9\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u001f\u0001"+
		"\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00ea\u00ec\u0003"+
		"\"\u0011\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000"+
		"\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000"+
		"\u0000\u0000\u00ee!\u0001\u0000\u0000\u0000\u00ef\u00f3\u0003\u000e\u0007"+
		"\u0000\u00f0\u00f2\u0005\u0010\u0000\u0000\u00f1\u00f0\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f5\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00ff\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f6\u00f7\u0003\u000e\u0007"+
		"\u0000\u00f7\u00fb\u0005\u000e\u0000\u0000\u00f8\u00fa\u0005\u0010\u0000"+
		"\u0000\u00f9\u00f8\u0001\u0000\u0000\u0000\u00fa\u00fd\u0001\u0000\u0000"+
		"\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000"+
		"\u0000\u00fc\u00ff\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000"+
		"\u0000\u00fe\u00ef\u0001\u0000\u0000\u0000\u00fe\u00f6\u0001\u0000\u0000"+
		"\u0000\u00ff#\u0001\u0000\u0000\u0000\u0100\u0104\u0003\u000e\u0007\u0000"+
		"\u0101\u0103\u0005\u0010\u0000\u0000\u0102\u0101\u0001\u0000\u0000\u0000"+
		"\u0103\u0106\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000\u0000\u0000"+
		"\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u0107\u0001\u0000\u0000\u0000"+
		"\u0106\u0104\u0001\u0000\u0000\u0000\u0107\u0108\u0005\r\u0000\u0000\u0108"+
		"\u010c\u0003\u000e\u0007\u0000\u0109\u010b\u0005\u0010\u0000\u0000\u010a"+
		"\u0109\u0001\u0000\u0000\u0000\u010b\u010e\u0001\u0000\u0000\u0000\u010c"+
		"\u010a\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d"+
		"%\u0001\u0000\u0000\u0000\u010e\u010c\u0001\u0000\u0000\u0000\u010f\u0113"+
		"\u0003\u000e\u0007\u0000\u0110\u0112\u0005\u0010\u0000\u0000\u0111\u0110"+
		"\u0001\u0000\u0000\u0000\u0112\u0115\u0001\u0000\u0000\u0000\u0113\u0111"+
		"\u0001\u0000\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u0116"+
		"\u0001\u0000\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0116\u0117"+
		"\u0005\r\u0000\u0000\u0117\u011b\u0003\u000e\u0007\u0000\u0118\u011a\u0005"+
		"\u0010\u0000\u0000\u0119\u0118\u0001\u0000\u0000\u0000\u011a\u011d\u0001"+
		"\u0000\u0000\u0000\u011b\u0119\u0001\u0000\u0000\u0000\u011b\u011c\u0001"+
		"\u0000\u0000\u0000\u011c\'\u0001\u0000\u0000\u0000\u011d\u011b\u0001\u0000"+
		"\u0000\u0000#8=BHMT[bhmw{\u0086\u008b\u0091\u0098\u00a2\u00a8\u00ad\u00b7"+
		"\u00bd\u00c2\u00cc\u00d2\u00d7\u00de\u00e7\u00ed\u00f3\u00fb\u00fe\u0104"+
		"\u010c\u0113\u011b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}