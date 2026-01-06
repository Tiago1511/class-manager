// Generated from C:/Users/phenr/github-classroom/Departamento-de-Engenharia-Informatica/sem4pi-22-23-55/base.core/src/main/java/eapli/base/examManagement/src\createExam.g4 by ANTLR 4.12.0
package eapli.base.examManagement.src;

    import java.util.HashMap;

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
		NUMBER=1, STRING=2, NEWLINE=3, WS=4;
	public static final int
		RULE_start = 0, RULE_exam = 1, RULE_exam_name = 2, RULE_total_marks = 3, 
		RULE_passing_marks = 4, RULE_duration_ = 5, RULE_section = 6, RULE_section_name = 7, 
		RULE_question_block = 8, RULE_question = 9, RULE_answer_block = 10, RULE_answer = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "exam", "exam_name", "total_marks", "passing_marks", "duration_", 
			"section", "section_name", "question_block", "question", "answer_block", 
			"answer"
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
			null, "NUMBER", "STRING", "NEWLINE", "WS"
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


	    int totalMarks;
	    int passingMarks;
	    int duration;
	    String examName;
	    HashMap<String, Integer> sectionMarks = new HashMap<>();

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
			setState(24);
			exam();
			setState(25);
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
		public List<TerminalNode> STRING() { return getTokens(createExamParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(createExamParser.STRING, i);
		}
		public Exam_nameContext exam_name() {
			return getRuleContext(Exam_nameContext.class,0);
		}
		public Total_marksContext total_marks() {
			return getRuleContext(Total_marksContext.class,0);
		}
		public Passing_marksContext passing_marks() {
			return getRuleContext(Passing_marksContext.class,0);
		}
		public Duration_Context duration_() {
			return getRuleContext(Duration_Context.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(createExamParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(createExamParser.NEWLINE, i);
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
			setState(27);
			match(STRING);
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(28);
				match(NEWLINE);
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
			exam_name();
			setState(35);
			match(STRING);
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(36);
				match(NEWLINE);
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
			total_marks();
			setState(43);
			match(STRING);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(44);
				match(NEWLINE);
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			passing_marks();
			setState(51);
			match(STRING);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(52);
				match(NEWLINE);
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
			duration_();
			setState(60); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(59);
				section();
				}
				}
				setState(62); 
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
	public static class Exam_nameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(createExamParser.STRING, 0); }
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
			setState(64);
			match(STRING);
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
	public static class Total_marksContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(createExamParser.STRING, 0); }
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
		enterRule(_localctx, 6, RULE_total_marks);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(STRING);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(72);
				match(NEWLINE);
				}
				}
				setState(77);
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
		public TerminalNode STRING() { return getToken(createExamParser.STRING, 0); }
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
		enterRule(_localctx, 8, RULE_passing_marks);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(STRING);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(79);
				match(NEWLINE);
				}
				}
				setState(84);
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
		public List<TerminalNode> STRING() { return getTokens(createExamParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(createExamParser.STRING, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(createExamParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(createExamParser.NEWLINE, i);
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
		enterRule(_localctx, 10, RULE_duration_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(STRING);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(86);
				match(NEWLINE);
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
			match(STRING);
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
	public static class SectionContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(createExamParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(createExamParser.STRING, i);
		}
		public Section_nameContext section_name() {
			return getRuleContext(Section_nameContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(createExamParser.NUMBER, 0); }
		public Question_blockContext question_block() {
			return getRuleContext(Question_blockContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(createExamParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(createExamParser.NEWLINE, i);
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
		enterRule(_localctx, 12, RULE_section);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(STRING);
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
			setState(101);
			section_name();
			setState(102);
			match(STRING);
			setState(103);
			match(NUMBER);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(104);
				match(NEWLINE);
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
			match(STRING);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(111);
				match(NEWLINE);
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
			question_block();
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
		public TerminalNode STRING() { return getToken(createExamParser.STRING, 0); }
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
		enterRule(_localctx, 14, RULE_section_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(STRING);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(120);
				match(NEWLINE);
				}
				}
				setState(125);
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
	public static class Question_blockContext extends ParserRuleContext {
		public List<QuestionContext> question() {
			return getRuleContexts(QuestionContext.class);
		}
		public QuestionContext question(int i) {
			return getRuleContext(QuestionContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(createExamParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(createExamParser.NEWLINE, i);
		}
		public Question_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof createExamListener ) ((createExamListener)listener).enterQuestion_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof createExamListener ) ((createExamListener)listener).exitQuestion_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof createExamVisitor ) return ((createExamVisitor<? extends T>)visitor).visitQuestion_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Question_blockContext question_block() throws RecognitionException {
		Question_blockContext _localctx = new Question_blockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_question_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(127); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(126);
					question();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(129); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(131);
				match(NEWLINE);
				}
				}
				setState(136);
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
	public static class QuestionContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(createExamParser.STRING, 0); }
		public Answer_blockContext answer_block() {
			return getRuleContext(Answer_blockContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(createExamParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(createExamParser.NEWLINE, i);
		}
		public QuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof createExamListener ) ((createExamListener)listener).enterQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof createExamListener ) ((createExamListener)listener).exitQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof createExamVisitor ) return ((createExamVisitor<? extends T>)visitor).visitQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionContext question() throws RecognitionException {
		QuestionContext _localctx = new QuestionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_question);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(STRING);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(138);
				match(NEWLINE);
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(144);
			answer_block();
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
	public static class Answer_blockContext extends ParserRuleContext {
		public List<AnswerContext> answer() {
			return getRuleContexts(AnswerContext.class);
		}
		public AnswerContext answer(int i) {
			return getRuleContext(AnswerContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(createExamParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(createExamParser.NEWLINE, i);
		}
		public Answer_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_answer_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof createExamListener ) ((createExamListener)listener).enterAnswer_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof createExamListener ) ((createExamListener)listener).exitAnswer_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof createExamVisitor ) return ((createExamVisitor<? extends T>)visitor).visitAnswer_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Answer_blockContext answer_block() throws RecognitionException {
		Answer_blockContext _localctx = new Answer_blockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_answer_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(147); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(146);
					answer();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(149); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(151);
					match(NEWLINE);
					}
					} 
				}
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
	public static class AnswerContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(createExamParser.STRING, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(createExamParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(createExamParser.NEWLINE, i);
		}
		public AnswerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_answer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof createExamListener ) ((createExamListener)listener).enterAnswer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof createExamListener ) ((createExamListener)listener).exitAnswer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof createExamVisitor ) return ((createExamVisitor<? extends T>)visitor).visitAnswer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnswerContext answer() throws RecognitionException {
		AnswerContext _localctx = new AnswerContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_answer);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(STRING);
			setState(161);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(158);
					match(NEWLINE);
					}
					} 
				}
				setState(163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0004\u00a5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0005\u0001"+
		"\u001e\b\u0001\n\u0001\f\u0001!\t\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u0001&\b\u0001\n\u0001\f\u0001)\t\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u0001.\b\u0001\n\u0001\f\u00011\t\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u00016\b\u0001\n\u0001\f\u00019\t"+
		"\u0001\u0001\u0001\u0001\u0001\u0004\u0001=\b\u0001\u000b\u0001\f\u0001"+
		">\u0001\u0002\u0001\u0002\u0005\u0002C\b\u0002\n\u0002\f\u0002F\t\u0002"+
		"\u0001\u0003\u0001\u0003\u0005\u0003J\b\u0003\n\u0003\f\u0003M\t\u0003"+
		"\u0001\u0004\u0001\u0004\u0005\u0004Q\b\u0004\n\u0004\f\u0004T\t\u0004"+
		"\u0001\u0005\u0001\u0005\u0005\u0005X\b\u0005\n\u0005\f\u0005[\t\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0005\u0006a\b\u0006"+
		"\n\u0006\f\u0006d\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006j\b\u0006\n\u0006\f\u0006m\t\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006q\b\u0006\n\u0006\f\u0006t\t\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0005\u0007z\b\u0007\n\u0007\f\u0007}\t\u0007"+
		"\u0001\b\u0004\b\u0080\b\b\u000b\b\f\b\u0081\u0001\b\u0005\b\u0085\b\b"+
		"\n\b\f\b\u0088\t\b\u0001\t\u0001\t\u0005\t\u008c\b\t\n\t\f\t\u008f\t\t"+
		"\u0001\t\u0001\t\u0001\n\u0004\n\u0094\b\n\u000b\n\f\n\u0095\u0001\n\u0005"+
		"\n\u0099\b\n\n\n\f\n\u009c\t\n\u0001\u000b\u0001\u000b\u0005\u000b\u00a0"+
		"\b\u000b\n\u000b\f\u000b\u00a3\t\u000b\u0001\u000b\u0000\u0000\f\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000\u0000\u00ab"+
		"\u0000\u0018\u0001\u0000\u0000\u0000\u0002\u001b\u0001\u0000\u0000\u0000"+
		"\u0004@\u0001\u0000\u0000\u0000\u0006G\u0001\u0000\u0000\u0000\bN\u0001"+
		"\u0000\u0000\u0000\nU\u0001\u0000\u0000\u0000\f^\u0001\u0000\u0000\u0000"+
		"\u000ew\u0001\u0000\u0000\u0000\u0010\u007f\u0001\u0000\u0000\u0000\u0012"+
		"\u0089\u0001\u0000\u0000\u0000\u0014\u0093\u0001\u0000\u0000\u0000\u0016"+
		"\u009d\u0001\u0000\u0000\u0000\u0018\u0019\u0003\u0002\u0001\u0000\u0019"+
		"\u001a\u0005\u0000\u0000\u0001\u001a\u0001\u0001\u0000\u0000\u0000\u001b"+
		"\u001f\u0005\u0002\u0000\u0000\u001c\u001e\u0005\u0003\u0000\u0000\u001d"+
		"\u001c\u0001\u0000\u0000\u0000\u001e!\u0001\u0000\u0000\u0000\u001f\u001d"+
		"\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000 \"\u0001\u0000"+
		"\u0000\u0000!\u001f\u0001\u0000\u0000\u0000\"#\u0003\u0004\u0002\u0000"+
		"#\'\u0005\u0002\u0000\u0000$&\u0005\u0003\u0000\u0000%$\u0001\u0000\u0000"+
		"\u0000&)\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000\'(\u0001\u0000"+
		"\u0000\u0000(*\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000*+\u0003"+
		"\u0006\u0003\u0000+/\u0005\u0002\u0000\u0000,.\u0005\u0003\u0000\u0000"+
		"-,\u0001\u0000\u0000\u0000.1\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000"+
		"\u0000/0\u0001\u0000\u0000\u000002\u0001\u0000\u0000\u00001/\u0001\u0000"+
		"\u0000\u000023\u0003\b\u0004\u000037\u0005\u0002\u0000\u000046\u0005\u0003"+
		"\u0000\u000054\u0001\u0000\u0000\u000069\u0001\u0000\u0000\u000075\u0001"+
		"\u0000\u0000\u000078\u0001\u0000\u0000\u00008:\u0001\u0000\u0000\u0000"+
		"97\u0001\u0000\u0000\u0000:<\u0003\n\u0005\u0000;=\u0003\f\u0006\u0000"+
		"<;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000><\u0001\u0000\u0000"+
		"\u0000>?\u0001\u0000\u0000\u0000?\u0003\u0001\u0000\u0000\u0000@D\u0005"+
		"\u0002\u0000\u0000AC\u0005\u0003\u0000\u0000BA\u0001\u0000\u0000\u0000"+
		"CF\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000"+
		"\u0000E\u0005\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000GK\u0005"+
		"\u0002\u0000\u0000HJ\u0005\u0003\u0000\u0000IH\u0001\u0000\u0000\u0000"+
		"JM\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000"+
		"\u0000L\u0007\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000NR\u0005"+
		"\u0002\u0000\u0000OQ\u0005\u0003\u0000\u0000PO\u0001\u0000\u0000\u0000"+
		"QT\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000"+
		"\u0000S\t\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000UY\u0005\u0002"+
		"\u0000\u0000VX\u0005\u0003\u0000\u0000WV\u0001\u0000\u0000\u0000X[\u0001"+
		"\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000"+
		"Z\\\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000\\]\u0005\u0002\u0000"+
		"\u0000]\u000b\u0001\u0000\u0000\u0000^b\u0005\u0002\u0000\u0000_a\u0005"+
		"\u0003\u0000\u0000`_\u0001\u0000\u0000\u0000ad\u0001\u0000\u0000\u0000"+
		"b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000ce\u0001\u0000\u0000"+
		"\u0000db\u0001\u0000\u0000\u0000ef\u0003\u000e\u0007\u0000fg\u0005\u0002"+
		"\u0000\u0000gk\u0005\u0001\u0000\u0000hj\u0005\u0003\u0000\u0000ih\u0001"+
		"\u0000\u0000\u0000jm\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000"+
		"kl\u0001\u0000\u0000\u0000ln\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000"+
		"\u0000nr\u0005\u0002\u0000\u0000oq\u0005\u0003\u0000\u0000po\u0001\u0000"+
		"\u0000\u0000qt\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001"+
		"\u0000\u0000\u0000su\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000"+
		"uv\u0003\u0010\b\u0000v\r\u0001\u0000\u0000\u0000w{\u0005\u0002\u0000"+
		"\u0000xz\u0005\u0003\u0000\u0000yx\u0001\u0000\u0000\u0000z}\u0001\u0000"+
		"\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|\u000f"+
		"\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000~\u0080\u0003\u0012"+
		"\t\u0000\u007f~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000"+
		"\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000"+
		"\u0000\u0082\u0086\u0001\u0000\u0000\u0000\u0083\u0085\u0005\u0003\u0000"+
		"\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0085\u0088\u0001\u0000\u0000"+
		"\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000"+
		"\u0000\u0087\u0011\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000"+
		"\u0000\u0089\u008d\u0005\u0002\u0000\u0000\u008a\u008c\u0005\u0003\u0000"+
		"\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008c\u008f\u0001\u0000\u0000"+
		"\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000"+
		"\u0000\u008e\u0090\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0003\u0014\n\u0000\u0091\u0013\u0001\u0000\u0000\u0000"+
		"\u0092\u0094\u0003\u0016\u000b\u0000\u0093\u0092\u0001\u0000\u0000\u0000"+
		"\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000"+
		"\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u009a\u0001\u0000\u0000\u0000"+
		"\u0097\u0099\u0005\u0003\u0000\u0000\u0098\u0097\u0001\u0000\u0000\u0000"+
		"\u0099\u009c\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000"+
		"\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u0015\u0001\u0000\u0000\u0000"+
		"\u009c\u009a\u0001\u0000\u0000\u0000\u009d\u00a1\u0005\u0002\u0000\u0000"+
		"\u009e\u00a0\u0005\u0003\u0000\u0000\u009f\u009e\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a3\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u0017\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a1\u0001\u0000\u0000\u0000\u0013\u001f\'/7>DKRYbkr{\u0081\u0086"+
		"\u008d\u0095\u009a\u00a1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}