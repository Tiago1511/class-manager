// Generated from C:/Users/phenr/github-classroom/Departamento-de-Engenharia-Informatica/sem4pi-22-23-55/base.core/src/main/java/eapli/base/examManagement/src/eapli/base/examManagement/src\createExam.g4 by ANTLR 4.12.0
package eapli.base.examManagement.src.eapli.base.examManagement.src;

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
		EXAM=1, TOTAL_MARKS=2, PASSING_MARKS=3, DURATION=4, SECTION=5, MARKS=6, 
		QUESTIONS=7, NUMBER=8, STRING=9, NEWLINE=10, WS=11;
	public static final int
		RULE_start = 0, RULE_exam = 1, RULE_exam_name = 2, RULE_total_marks = 3, 
		RULE_passing_marks = 4, RULE_duration_ = 5, RULE_text = 6, RULE_section = 7, 
		RULE_section_name = 8, RULE_section_marks = 9, RULE_question_block = 10, 
		RULE_question = 11, RULE_answer_block = 12, RULE_answer = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "exam", "exam_name", "total_marks", "passing_marks", "duration_", 
			"text", "section", "section_name", "section_marks", "question_block", 
			"question", "answer_block", "answer"
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
			null, "EXAM", "TOTAL_MARKS", "PASSING_MARKS", "DURATION", "SECTION", 
			"MARKS", "QUESTIONS", "NUMBER", "STRING", "NEWLINE", "WS"
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
			setState(28);
			exam();
			setState(29);
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
			setState(31);
			match(EXAM);
			setState(32);
			exam_name();
			setState(33);
			match(TOTAL_MARKS);
			setState(34);
			total_marks();
			setState(35);
			match(PASSING_MARKS);
			setState(36);
			passing_marks();
			setState(37);
			match(DURATION);
			setState(38);
			duration_();
			setState(40); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(39);
				section();
				}
				}
				setState(42); 
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
			setState(45); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(44);
				match(STRING);
				}
				}
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(49);
				match(NEWLINE);
				}
				}
				setState(54);
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
		enterRule(_localctx, 6, RULE_total_marks);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(NUMBER);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(56);
				match(NEWLINE);
				}
				}
				setState(61);
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
		enterRule(_localctx, 8, RULE_passing_marks);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(NUMBER);
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
		enterRule(_localctx, 10, RULE_duration_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(NUMBER);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(70);
				match(NEWLINE);
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(76);
				match(STRING);
				}
				}
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_text, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(88);
			match(STRING);
			setState(92);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(89);
					match(NEWLINE);
					}
					} 
				}
				setState(94);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(109);
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
					setState(95);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(97); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(96);
							match(STRING);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(99); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(104);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(101);
							match(NEWLINE);
							}
							} 
						}
						setState(106);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
					}
					}
					} 
				}
				setState(111);
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
		public Question_blockContext question_block() {
			return getRuleContext(Question_blockContext.class,0);
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
		enterRule(_localctx, 14, RULE_section);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(SECTION);
			setState(113);
			section_name();
			setState(114);
			match(MARKS);
			setState(115);
			section_marks();
			setState(116);
			match(QUESTIONS);
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
		enterRule(_localctx, 16, RULE_section_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
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
		enterRule(_localctx, 18, RULE_section_marks);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(NUMBER);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(122);
				match(NEWLINE);
				}
				}
				setState(127);
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
		enterRule(_localctx, 20, RULE_question_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(128);
				question();
				}
				}
				setState(131); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(133);
				match(NEWLINE);
				}
				}
				setState(138);
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
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public Answer_blockContext answer_block() {
			return getRuleContext(Answer_blockContext.class,0);
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
		enterRule(_localctx, 22, RULE_question);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			text(0);
			setState(140);
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
		enterRule(_localctx, 24, RULE_answer_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(143); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(142);
					answer();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(145); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(createExamParser.NUMBER, 0); }
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
		enterRule(_localctx, 26, RULE_answer);
		try {
			int _alt;
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				text(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				text(0);
				setState(149);
				match(NUMBER);
				setState(153);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(150);
						match(NEWLINE);
						}
						} 
					}
					setState(155);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
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
		"\u0004\u0001\u000b\u009f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0004\u0001)\b\u0001\u000b\u0001\f\u0001"+
		"*\u0001\u0002\u0004\u0002.\b\u0002\u000b\u0002\f\u0002/\u0001\u0002\u0005"+
		"\u00023\b\u0002\n\u0002\f\u00026\t\u0002\u0001\u0003\u0001\u0003\u0005"+
		"\u0003:\b\u0003\n\u0003\f\u0003=\t\u0003\u0001\u0004\u0001\u0004\u0005"+
		"\u0004A\b\u0004\n\u0004\f\u0004D\t\u0004\u0001\u0005\u0001\u0005\u0005"+
		"\u0005H\b\u0005\n\u0005\f\u0005K\t\u0005\u0001\u0005\u0004\u0005N\b\u0005"+
		"\u000b\u0005\f\u0005O\u0001\u0005\u0005\u0005S\b\u0005\n\u0005\f\u0005"+
		"V\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006[\b\u0006\n\u0006"+
		"\f\u0006^\t\u0006\u0001\u0006\u0001\u0006\u0004\u0006b\b\u0006\u000b\u0006"+
		"\f\u0006c\u0001\u0006\u0005\u0006g\b\u0006\n\u0006\f\u0006j\t\u0006\u0005"+
		"\u0006l\b\u0006\n\u0006\f\u0006o\t\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0005\t|\b\t\n\t\f\t\u007f\t\t\u0001\n\u0004\n\u0082"+
		"\b\n\u000b\n\f\n\u0083\u0001\n\u0005\n\u0087\b\n\n\n\f\n\u008a\t\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0004\f\u0090\b\f\u000b\f\f\f\u0091"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u0098\b\r\n\r\f\r\u009b\t\r\u0003"+
		"\r\u009d\b\r\u0001\r\u0000\u0001\f\u000e\u0000\u0002\u0004\u0006\b\n\f"+
		"\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u0000\u0000\u00a2\u0000\u001c"+
		"\u0001\u0000\u0000\u0000\u0002\u001f\u0001\u0000\u0000\u0000\u0004-\u0001"+
		"\u0000\u0000\u0000\u00067\u0001\u0000\u0000\u0000\b>\u0001\u0000\u0000"+
		"\u0000\nE\u0001\u0000\u0000\u0000\fW\u0001\u0000\u0000\u0000\u000ep\u0001"+
		"\u0000\u0000\u0000\u0010w\u0001\u0000\u0000\u0000\u0012y\u0001\u0000\u0000"+
		"\u0000\u0014\u0081\u0001\u0000\u0000\u0000\u0016\u008b\u0001\u0000\u0000"+
		"\u0000\u0018\u008f\u0001\u0000\u0000\u0000\u001a\u009c\u0001\u0000\u0000"+
		"\u0000\u001c\u001d\u0003\u0002\u0001\u0000\u001d\u001e\u0005\u0000\u0000"+
		"\u0001\u001e\u0001\u0001\u0000\u0000\u0000\u001f \u0005\u0001\u0000\u0000"+
		" !\u0003\u0004\u0002\u0000!\"\u0005\u0002\u0000\u0000\"#\u0003\u0006\u0003"+
		"\u0000#$\u0005\u0003\u0000\u0000$%\u0003\b\u0004\u0000%&\u0005\u0004\u0000"+
		"\u0000&(\u0003\n\u0005\u0000\')\u0003\u000e\u0007\u0000(\'\u0001\u0000"+
		"\u0000\u0000)*\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000*+\u0001"+
		"\u0000\u0000\u0000+\u0003\u0001\u0000\u0000\u0000,.\u0005\t\u0000\u0000"+
		"-,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000"+
		"\u0000/0\u0001\u0000\u0000\u000004\u0001\u0000\u0000\u000013\u0005\n\u0000"+
		"\u000021\u0001\u0000\u0000\u000036\u0001\u0000\u0000\u000042\u0001\u0000"+
		"\u0000\u000045\u0001\u0000\u0000\u00005\u0005\u0001\u0000\u0000\u0000"+
		"64\u0001\u0000\u0000\u00007;\u0005\b\u0000\u00008:\u0005\n\u0000\u0000"+
		"98\u0001\u0000\u0000\u0000:=\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000"+
		"\u0000;<\u0001\u0000\u0000\u0000<\u0007\u0001\u0000\u0000\u0000=;\u0001"+
		"\u0000\u0000\u0000>B\u0005\b\u0000\u0000?A\u0005\n\u0000\u0000@?\u0001"+
		"\u0000\u0000\u0000AD\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000"+
		"BC\u0001\u0000\u0000\u0000C\t\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000"+
		"\u0000EI\u0005\b\u0000\u0000FH\u0005\n\u0000\u0000GF\u0001\u0000\u0000"+
		"\u0000HK\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000"+
		"\u0000\u0000JM\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000LN\u0005"+
		"\t\u0000\u0000ML\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OM\u0001"+
		"\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PT\u0001\u0000\u0000\u0000"+
		"QS\u0005\n\u0000\u0000RQ\u0001\u0000\u0000\u0000SV\u0001\u0000\u0000\u0000"+
		"TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000U\u000b\u0001\u0000"+
		"\u0000\u0000VT\u0001\u0000\u0000\u0000WX\u0006\u0006\uffff\uffff\u0000"+
		"X\\\u0005\t\u0000\u0000Y[\u0005\n\u0000\u0000ZY\u0001\u0000\u0000\u0000"+
		"[^\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000"+
		"\u0000]m\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000_a\n\u0001"+
		"\u0000\u0000`b\u0005\t\u0000\u0000a`\u0001\u0000\u0000\u0000bc\u0001\u0000"+
		"\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000dh\u0001"+
		"\u0000\u0000\u0000eg\u0005\n\u0000\u0000fe\u0001\u0000\u0000\u0000gj\u0001"+
		"\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000"+
		"il\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000k_\u0001\u0000\u0000"+
		"\u0000lo\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000"+
		"\u0000\u0000n\r\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000pq\u0005"+
		"\u0005\u0000\u0000qr\u0003\u0010\b\u0000rs\u0005\u0006\u0000\u0000st\u0003"+
		"\u0012\t\u0000tu\u0005\u0007\u0000\u0000uv\u0003\u0014\n\u0000v\u000f"+
		"\u0001\u0000\u0000\u0000wx\u0003\f\u0006\u0000x\u0011\u0001\u0000\u0000"+
		"\u0000y}\u0005\b\u0000\u0000z|\u0005\n\u0000\u0000{z\u0001\u0000\u0000"+
		"\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001"+
		"\u0000\u0000\u0000~\u0013\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000"+
		"\u0000\u0080\u0082\u0003\u0016\u000b\u0000\u0081\u0080\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000"+
		"\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0088\u0001\u0000\u0000"+
		"\u0000\u0085\u0087\u0005\n\u0000\u0000\u0086\u0085\u0001\u0000\u0000\u0000"+
		"\u0087\u008a\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000"+
		"\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u0015\u0001\u0000\u0000\u0000"+
		"\u008a\u0088\u0001\u0000\u0000\u0000\u008b\u008c\u0003\f\u0006\u0000\u008c"+
		"\u008d\u0003\u0018\f\u0000\u008d\u0017\u0001\u0000\u0000\u0000\u008e\u0090"+
		"\u0003\u001a\r\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001"+
		"\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001"+
		"\u0000\u0000\u0000\u0092\u0019\u0001\u0000\u0000\u0000\u0093\u009d\u0003"+
		"\f\u0006\u0000\u0094\u0095\u0003\f\u0006\u0000\u0095\u0099\u0005\b\u0000"+
		"\u0000\u0096\u0098\u0005\n\u0000\u0000\u0097\u0096\u0001\u0000\u0000\u0000"+
		"\u0098\u009b\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000"+
		"\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009d\u0001\u0000\u0000\u0000"+
		"\u009b\u0099\u0001\u0000\u0000\u0000\u009c\u0093\u0001\u0000\u0000\u0000"+
		"\u009c\u0094\u0001\u0000\u0000\u0000\u009d\u001b\u0001\u0000\u0000\u0000"+
		"\u0012*/4;BIOT\\chm}\u0083\u0088\u0091\u0099\u009c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}