// Generated from C:/Users/phenr/github-classroom/Departamento-de-Engenharia-Informatica/sem4pi-22-23-55/base.core/src/main/java/eapli/base/examManagement/exam\createExam.g4 by ANTLR 4.12.0
package eapli.base.examManagement.exam;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class createExamParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EXAM=1, EXAM_CODE=2, COURSE_CODE=3, TOTAL_MARKS=4, PASSING_MARKS=5, DURATION=6, 
		SECTION=7, MARKS=8, QUESTIONS=9, QUESTION_TYPE=10, MULTIPLE_CHOICE=11, 
		BOOLEAN=12, TEXT_ANSWER=13, CORRECT_ANSWER=14, NUMBER=15, STRING=16, NEWLINE=17, 
		WS=18;
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
			null, "EXAM", "EXAM_CODE", "COURSE_CODE", "TOTAL_MARKS", "PASSING_MARKS", 
			"DURATION", "SECTION", "MARKS", "QUESTIONS", "QUESTION_TYPE", "MULTIPLE_CHOICE", 
			"BOOLEAN", "TEXT_ANSWER", "CORRECT_ANSWER", "NUMBER", "STRING", "NEWLINE", 
			"WS"
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
		public TerminalNode EXAM_CODE() { return getToken(createExamParser.EXAM_CODE, 0); }
		public List<Code_nameContext> code_name() {
			return getRuleContexts(Code_nameContext.class);
		}
		public Code_nameContext code_name(int i) {
			return getRuleContext(Code_nameContext.class,i);
		}
		public TerminalNode COURSE_CODE() { return getToken(createExamParser.COURSE_CODE, 0); }
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
			match(EXAM_CODE);
			setState(46);
			code_name();
			setState(47);
			match(COURSE_CODE);
			setState(48);
			code_name();
			setState(49);
			match(TOTAL_MARKS);
			setState(50);
			total_marks();
			setState(51);
			match(PASSING_MARKS);
			setState(52);
			passing_marks();
			setState(53);
			match(DURATION);
			setState(54);
			duration_();
			setState(56); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(55);
				section();
				}
				}
				setState(58); 
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
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(60);
				match(STRING);
				}
				}
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(65);
				match(NEWLINE);
				}
				}
				setState(70);
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
			setState(72); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(71);
				match(STRING);
				}
				}
				setState(74); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(76);
				match(NEWLINE);
				}
				}
				setState(81);
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
			setState(82);
			match(NUMBER);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(83);
				match(NEWLINE);
				}
				}
				setState(88);
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
			setState(89);
			match(NUMBER);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(90);
				match(NEWLINE);
				}
				}
				setState(95);
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
			setState(96);
			match(NUMBER);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(97);
				match(NEWLINE);
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(103);
				match(STRING);
				}
				}
				setState(106); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(108);
				match(NEWLINE);
				}
				}
				setState(113);
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
		public List<TerminalNode> NEWLINE() { return getTokens(createExamParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(createExamParser.NEWLINE, i);
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
			setState(115);
			match(STRING);
			setState(119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(116);
					match(NEWLINE);
					}
					} 
				}
				setState(121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(136);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TextContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_text);
					setState(122);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(124); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(123);
							match(STRING);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(126); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(131);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(128);
							match(NEWLINE);
							}
							} 
						}
						setState(133);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
					}
					}
					} 
				}
				setState(138);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
			setState(139);
			match(SECTION);
			setState(140);
			section_name();
			setState(141);
			match(MARKS);
			setState(142);
			section_marks();
			setState(143);
			match(QUESTIONS);
			setState(145); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(144);
				question_section();
				}
				}
				setState(147); 
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
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				mc_question_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				tf_question_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			text(0);
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
			setState(156);
			match(NUMBER);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(157);
				match(NEWLINE);
				}
				}
				setState(162);
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
		public List<Mc_questionContext> mc_question() {
			return getRuleContexts(Mc_questionContext.class);
		}
		public Mc_questionContext mc_question(int i) {
			return getRuleContext(Mc_questionContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(createExamParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(createExamParser.NEWLINE, i);
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
			setState(163);
			match(QUESTION_TYPE);
			setState(164);
			match(MULTIPLE_CHOICE);
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
		public List<Tf_questionContext> tf_question() {
			return getRuleContexts(Tf_questionContext.class);
		}
		public Tf_questionContext tf_question(int i) {
			return getRuleContext(Tf_questionContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(createExamParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(createExamParser.NEWLINE, i);
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
			setState(179); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(178);
				tf_question();
				}
				}
				setState(181); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(183);
				match(NEWLINE);
				}
				}
				setState(188);
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
		public List<Ta_questionContext> ta_question() {
			return getRuleContexts(Ta_questionContext.class);
		}
		public Ta_questionContext ta_question(int i) {
			return getRuleContext(Ta_questionContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(createExamParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(createExamParser.NEWLINE, i);
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
			setState(189);
			match(QUESTION_TYPE);
			setState(190);
			match(TEXT_ANSWER);
			setState(192); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(191);
				ta_question();
				}
				}
				setState(194); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(196);
				match(NEWLINE);
				}
				}
				setState(201);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			text(0);
			setState(203);
			mc_answer_block();
			setState(204);
			match(CORRECT_ANSWER);
			setState(205);
			text(0);
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
			setState(208); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(207);
				mc_answer();
				}
				}
				setState(210); 
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
		public TerminalNode NUMBER() { return getToken(createExamParser.NUMBER, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(createExamParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(createExamParser.NEWLINE, i);
		}
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
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				text(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				text(0);
				setState(214);
				match(NUMBER);
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(215);
					match(NEWLINE);
					}
					}
					setState(220);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			text(0);
			setState(224);
			match(CORRECT_ANSWER);
			setState(225);
			text(0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			text(0);
			setState(228);
			match(CORRECT_ANSWER);
			setState(229);
			text(0);
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
		"\u0004\u0001\u0012\u00e8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0004\u00019\b\u0001\u000b\u0001\f\u0001:\u0001\u0002\u0004\u0002"+
		">\b\u0002\u000b\u0002\f\u0002?\u0001\u0002\u0005\u0002C\b\u0002\n\u0002"+
		"\f\u0002F\t\u0002\u0001\u0003\u0004\u0003I\b\u0003\u000b\u0003\f\u0003"+
		"J\u0001\u0003\u0005\u0003N\b\u0003\n\u0003\f\u0003Q\t\u0003\u0001\u0004"+
		"\u0001\u0004\u0005\u0004U\b\u0004\n\u0004\f\u0004X\t\u0004\u0001\u0005"+
		"\u0001\u0005\u0005\u0005\\\b\u0005\n\u0005\f\u0005_\t\u0005\u0001\u0006"+
		"\u0001\u0006\u0005\u0006c\b\u0006\n\u0006\f\u0006f\t\u0006\u0001\u0006"+
		"\u0004\u0006i\b\u0006\u000b\u0006\f\u0006j\u0001\u0006\u0005\u0006n\b"+
		"\u0006\n\u0006\f\u0006q\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007v\b\u0007\n\u0007\f\u0007y\t\u0007\u0001\u0007\u0001\u0007\u0004"+
		"\u0007}\b\u0007\u000b\u0007\f\u0007~\u0001\u0007\u0005\u0007\u0082\b\u0007"+
		"\n\u0007\f\u0007\u0085\t\u0007\u0005\u0007\u0087\b\u0007\n\u0007\f\u0007"+
		"\u008a\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004\b"+
		"\u0092\b\b\u000b\b\f\b\u0093\u0001\t\u0001\t\u0001\t\u0003\t\u0099\b\t"+
		"\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0005\u000b\u009f\b\u000b\n\u000b"+
		"\f\u000b\u00a2\t\u000b\u0001\f\u0001\f\u0001\f\u0004\f\u00a7\b\f\u000b"+
		"\f\f\f\u00a8\u0001\f\u0005\f\u00ac\b\f\n\f\f\f\u00af\t\f\u0001\r\u0001"+
		"\r\u0001\r\u0004\r\u00b4\b\r\u000b\r\f\r\u00b5\u0001\r\u0005\r\u00b9\b"+
		"\r\n\r\f\r\u00bc\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0004\u000e\u00c1"+
		"\b\u000e\u000b\u000e\f\u000e\u00c2\u0001\u000e\u0005\u000e\u00c6\b\u000e"+
		"\n\u000e\f\u000e\u00c9\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0004\u0010\u00d1\b\u0010\u000b\u0010\f"+
		"\u0010\u00d2\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011"+
		"\u00d9\b\u0011\n\u0011\f\u0011\u00dc\t\u0011\u0003\u0011\u00de\b\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0000\u0001\u000e\u0014\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&\u0000\u0000\u00ee\u0000(\u0001\u0000\u0000\u0000\u0002+\u0001\u0000"+
		"\u0000\u0000\u0004=\u0001\u0000\u0000\u0000\u0006H\u0001\u0000\u0000\u0000"+
		"\bR\u0001\u0000\u0000\u0000\nY\u0001\u0000\u0000\u0000\f`\u0001\u0000"+
		"\u0000\u0000\u000er\u0001\u0000\u0000\u0000\u0010\u008b\u0001\u0000\u0000"+
		"\u0000\u0012\u0098\u0001\u0000\u0000\u0000\u0014\u009a\u0001\u0000\u0000"+
		"\u0000\u0016\u009c\u0001\u0000\u0000\u0000\u0018\u00a3\u0001\u0000\u0000"+
		"\u0000\u001a\u00b0\u0001\u0000\u0000\u0000\u001c\u00bd\u0001\u0000\u0000"+
		"\u0000\u001e\u00ca\u0001\u0000\u0000\u0000 \u00d0\u0001\u0000\u0000\u0000"+
		"\"\u00dd\u0001\u0000\u0000\u0000$\u00df\u0001\u0000\u0000\u0000&\u00e3"+
		"\u0001\u0000\u0000\u0000()\u0003\u0002\u0001\u0000)*\u0005\u0000\u0000"+
		"\u0001*\u0001\u0001\u0000\u0000\u0000+,\u0005\u0001\u0000\u0000,-\u0003"+
		"\u0004\u0002\u0000-.\u0005\u0002\u0000\u0000./\u0003\u0006\u0003\u0000"+
		"/0\u0005\u0003\u0000\u000001\u0003\u0006\u0003\u000012\u0005\u0004\u0000"+
		"\u000023\u0003\b\u0004\u000034\u0005\u0005\u0000\u000045\u0003\n\u0005"+
		"\u000056\u0005\u0006\u0000\u000068\u0003\f\u0006\u000079\u0003\u0010\b"+
		"\u000087\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:8\u0001\u0000"+
		"\u0000\u0000:;\u0001\u0000\u0000\u0000;\u0003\u0001\u0000\u0000\u0000"+
		"<>\u0005\u0010\u0000\u0000=<\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000"+
		"\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@D\u0001\u0000"+
		"\u0000\u0000AC\u0005\u0011\u0000\u0000BA\u0001\u0000\u0000\u0000CF\u0001"+
		"\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000"+
		"E\u0005\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000GI\u0005\u0010"+
		"\u0000\u0000HG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JH\u0001"+
		"\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KO\u0001\u0000\u0000\u0000"+
		"LN\u0005\u0011\u0000\u0000ML\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000"+
		"\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000P\u0007\u0001"+
		"\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000RV\u0005\u000f\u0000\u0000"+
		"SU\u0005\u0011\u0000\u0000TS\u0001\u0000\u0000\u0000UX\u0001\u0000\u0000"+
		"\u0000VT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000W\t\u0001\u0000"+
		"\u0000\u0000XV\u0001\u0000\u0000\u0000Y]\u0005\u000f\u0000\u0000Z\\\u0005"+
		"\u0011\u0000\u0000[Z\u0001\u0000\u0000\u0000\\_\u0001\u0000\u0000\u0000"+
		"][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^\u000b\u0001\u0000"+
		"\u0000\u0000_]\u0001\u0000\u0000\u0000`d\u0005\u000f\u0000\u0000ac\u0005"+
		"\u0011\u0000\u0000ba\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000"+
		"db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000"+
		"\u0000fd\u0001\u0000\u0000\u0000gi\u0005\u0010\u0000\u0000hg\u0001\u0000"+
		"\u0000\u0000ij\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001"+
		"\u0000\u0000\u0000ko\u0001\u0000\u0000\u0000ln\u0005\u0011\u0000\u0000"+
		"ml\u0001\u0000\u0000\u0000nq\u0001\u0000\u0000\u0000om\u0001\u0000\u0000"+
		"\u0000op\u0001\u0000\u0000\u0000p\r\u0001\u0000\u0000\u0000qo\u0001\u0000"+
		"\u0000\u0000rs\u0006\u0007\uffff\uffff\u0000sw\u0005\u0010\u0000\u0000"+
		"tv\u0005\u0011\u0000\u0000ut\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000"+
		"\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000x\u0088\u0001"+
		"\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000z|\n\u0001\u0000\u0000{}\u0005"+
		"\u0010\u0000\u0000|{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000"+
		"~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0083"+
		"\u0001\u0000\u0000\u0000\u0080\u0082\u0005\u0011\u0000\u0000\u0081\u0080"+
		"\u0001\u0000\u0000\u0000\u0082\u0085\u0001\u0000\u0000\u0000\u0083\u0081"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0087"+
		"\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0086z\u0001"+
		"\u0000\u0000\u0000\u0087\u008a\u0001\u0000\u0000\u0000\u0088\u0086\u0001"+
		"\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u000f\u0001"+
		"\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008b\u008c\u0005"+
		"\u0007\u0000\u0000\u008c\u008d\u0003\u0014\n\u0000\u008d\u008e\u0005\b"+
		"\u0000\u0000\u008e\u008f\u0003\u0016\u000b\u0000\u008f\u0091\u0005\t\u0000"+
		"\u0000\u0090\u0092\u0003\u0012\t\u0000\u0091\u0090\u0001\u0000\u0000\u0000"+
		"\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000"+
		"\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0011\u0001\u0000\u0000\u0000"+
		"\u0095\u0099\u0003\u0018\f\u0000\u0096\u0099\u0003\u001a\r\u0000\u0097"+
		"\u0099\u0003\u001c\u000e\u0000\u0098\u0095\u0001\u0000\u0000\u0000\u0098"+
		"\u0096\u0001\u0000\u0000\u0000\u0098\u0097\u0001\u0000\u0000\u0000\u0099"+
		"\u0013\u0001\u0000\u0000\u0000\u009a\u009b\u0003\u000e\u0007\u0000\u009b"+
		"\u0015\u0001\u0000\u0000\u0000\u009c\u00a0\u0005\u000f\u0000\u0000\u009d"+
		"\u009f\u0005\u0011\u0000\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009f"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a1\u0017\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005\n\u0000\u0000\u00a4\u00a6"+
		"\u0005\u000b\u0000\u0000\u00a5\u00a7\u0003\u001e\u000f\u0000\u00a6\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00ad"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ac\u0005\u0011\u0000\u0000\u00ab\u00aa"+
		"\u0001\u0000\u0000\u0000\u00ac\u00af\u0001\u0000\u0000\u0000\u00ad\u00ab"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u0019"+
		"\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00b0\u00b1"+
		"\u0005\n\u0000\u0000\u00b1\u00b3\u0005\f\u0000\u0000\u00b2\u00b4\u0003"+
		"$\u0012\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b6\u00ba\u0001\u0000\u0000\u0000\u00b7\u00b9\u0005\u0011"+
		"\u0000\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b9\u00bc\u0001\u0000"+
		"\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000"+
		"\u0000\u0000\u00bb\u001b\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000"+
		"\u0000\u0000\u00bd\u00be\u0005\n\u0000\u0000\u00be\u00c0\u0005\r\u0000"+
		"\u0000\u00bf\u00c1\u0003&\u0013\u0000\u00c0\u00bf\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c7\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c6\u0005\u0011\u0000\u0000\u00c5\u00c4\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u001d\u0001\u0000\u0000\u0000"+
		"\u00c9\u00c7\u0001\u0000\u0000\u0000\u00ca\u00cb\u0003\u000e\u0007\u0000"+
		"\u00cb\u00cc\u0003 \u0010\u0000\u00cc\u00cd\u0005\u000e\u0000\u0000\u00cd"+
		"\u00ce\u0003\u000e\u0007\u0000\u00ce\u001f\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d1\u0003\"\u0011\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d3!\u0001\u0000\u0000\u0000\u00d4\u00de\u0003"+
		"\u000e\u0007\u0000\u00d5\u00d6\u0003\u000e\u0007\u0000\u00d6\u00da\u0005"+
		"\u000f\u0000\u0000\u00d7\u00d9\u0005\u0011\u0000\u0000\u00d8\u00d7\u0001"+
		"\u0000\u0000\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000\u00da\u00d8\u0001"+
		"\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00de\u0001"+
		"\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dd\u00d4\u0001"+
		"\u0000\u0000\u0000\u00dd\u00d5\u0001\u0000\u0000\u0000\u00de#\u0001\u0000"+
		"\u0000\u0000\u00df\u00e0\u0003\u000e\u0007\u0000\u00e0\u00e1\u0005\u000e"+
		"\u0000\u0000\u00e1\u00e2\u0003\u000e\u0007\u0000\u00e2%\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e4\u0003\u000e\u0007\u0000\u00e4\u00e5\u0005\u000e\u0000"+
		"\u0000\u00e5\u00e6\u0003\u000e\u0007\u0000\u00e6\'\u0001\u0000\u0000\u0000"+
		"\u001a:?DJOV]djow~\u0083\u0088\u0093\u0098\u00a0\u00a8\u00ad\u00b5\u00ba"+
		"\u00c2\u00c7\u00d2\u00da\u00dd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}