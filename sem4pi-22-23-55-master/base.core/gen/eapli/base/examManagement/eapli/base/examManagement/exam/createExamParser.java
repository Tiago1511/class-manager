// Generated from C:/Users/phenr/github-classroom/Departamento-de-Engenharia-Informatica/sem4pi-22-23-55/base.core/src/main/java/eapli/base/examManagement/eapli/base/examManagement/exam\createExam.g4 by ANTLR 4.12.0
package eapli.base.examManagement.eapli.base.examManagement.exam;

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
		EXAM=1, CODE=2, TOTAL_MARKS=3, PASSING_MARKS=4, DURATION=5, SECTION=6, 
		MARKS=7, QUESTIONS=8, NUMBER=9, STRING=10, NEWLINE=11, WS=12;
	public static final int
		RULE_start = 0, RULE_exam = 1, RULE_exam_name = 2, RULE_code_name = 3, 
		RULE_total_marks = 4, RULE_passing_marks = 5, RULE_duration_ = 6, RULE_text = 7, 
		RULE_section = 8, RULE_section_name = 9, RULE_section_marks = 10, RULE_question_block = 11, 
		RULE_question = 12, RULE_answer_block = 13, RULE_answer = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "exam", "exam_name", "code_name", "total_marks", "passing_marks", 
			"duration_", "text", "section", "section_name", "section_marks", "question_block", 
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
			null, "EXAM", "CODE", "TOTAL_MARKS", "PASSING_MARKS", "DURATION", "SECTION", 
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
			setState(30);
			exam();
			setState(31);
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
			setState(33);
			match(EXAM);
			setState(34);
			exam_name();
			setState(35);
			match(CODE);
			setState(36);
			code_name();
			setState(37);
			match(TOTAL_MARKS);
			setState(38);
			total_marks();
			setState(39);
			match(PASSING_MARKS);
			setState(40);
			passing_marks();
			setState(41);
			match(DURATION);
			setState(42);
			duration_();
			setState(44); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(43);
				section();
				}
				}
				setState(46); 
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
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48);
				match(STRING);
				}
				}
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(53);
				match(NEWLINE);
				}
				}
				setState(58);
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
			setState(60); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(59);
				match(STRING);
				}
				}
				setState(62); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(64);
				match(NEWLINE);
				}
				}
				setState(69);
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
			setState(70);
			match(NUMBER);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(71);
				match(NEWLINE);
				}
				}
				setState(76);
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
			setState(77);
			match(NUMBER);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(78);
				match(NEWLINE);
				}
				}
				setState(83);
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
			setState(84);
			match(NUMBER);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(85);
				match(NEWLINE);
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(91);
				match(STRING);
				}
				}
				setState(94); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(96);
				match(NEWLINE);
				}
				}
				setState(101);
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
			setState(103);
			match(STRING);
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(104);
					match(NEWLINE);
					}
					} 
				}
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(124);
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
					setState(110);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(112); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(111);
							match(STRING);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(114); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(119);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
						_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
					}
					}
					} 
				}
				setState(126);
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
		enterRule(_localctx, 16, RULE_section);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(SECTION);
			setState(128);
			section_name();
			setState(129);
			match(MARKS);
			setState(130);
			section_marks();
			setState(131);
			match(QUESTIONS);
			setState(132);
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
		enterRule(_localctx, 18, RULE_section_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
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
		enterRule(_localctx, 20, RULE_section_marks);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(NUMBER);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(137);
				match(NEWLINE);
				}
				}
				setState(142);
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
		enterRule(_localctx, 22, RULE_question_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(143);
				question();
				}
				}
				setState(146); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(148);
				match(NEWLINE);
				}
				}
				setState(153);
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
		enterRule(_localctx, 24, RULE_question);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			text(0);
			setState(155);
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
		enterRule(_localctx, 26, RULE_answer_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(158); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(157);
					answer();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(160); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		enterRule(_localctx, 28, RULE_answer);
		try {
			int _alt;
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				text(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				text(0);
				setState(164);
				match(NUMBER);
				setState(168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(165);
						match(NEWLINE);
						}
						} 
					}
					setState(170);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		"\u0004\u0001\f\u00ae\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0004\u0001-\b\u0001\u000b\u0001\f\u0001.\u0001\u0002\u0004\u00022\b"+
		"\u0002\u000b\u0002\f\u00023\u0001\u0002\u0005\u00027\b\u0002\n\u0002\f"+
		"\u0002:\t\u0002\u0001\u0003\u0004\u0003=\b\u0003\u000b\u0003\f\u0003>"+
		"\u0001\u0003\u0005\u0003B\b\u0003\n\u0003\f\u0003E\t\u0003\u0001\u0004"+
		"\u0001\u0004\u0005\u0004I\b\u0004\n\u0004\f\u0004L\t\u0004\u0001\u0005"+
		"\u0001\u0005\u0005\u0005P\b\u0005\n\u0005\f\u0005S\t\u0005\u0001\u0006"+
		"\u0001\u0006\u0005\u0006W\b\u0006\n\u0006\f\u0006Z\t\u0006\u0001\u0006"+
		"\u0004\u0006]\b\u0006\u000b\u0006\f\u0006^\u0001\u0006\u0005\u0006b\b"+
		"\u0006\n\u0006\f\u0006e\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007j\b\u0007\n\u0007\f\u0007m\t\u0007\u0001\u0007\u0001\u0007\u0004"+
		"\u0007q\b\u0007\u000b\u0007\f\u0007r\u0001\u0007\u0005\u0007v\b\u0007"+
		"\n\u0007\f\u0007y\t\u0007\u0005\u0007{\b\u0007\n\u0007\f\u0007~\t\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0005\n\u008b\b\n\n\n\f\n\u008e\t\n\u0001\u000b\u0004"+
		"\u000b\u0091\b\u000b\u000b\u000b\f\u000b\u0092\u0001\u000b\u0005\u000b"+
		"\u0096\b\u000b\n\u000b\f\u000b\u0099\t\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0004\r\u009f\b\r\u000b\r\f\r\u00a0\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0005\u000e\u00a7\b\u000e\n\u000e\f\u000e\u00aa\t\u000e\u0003"+
		"\u000e\u00ac\b\u000e\u0001\u000e\u0000\u0001\u000e\u000f\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u0000\u0000"+
		"\u00b2\u0000\u001e\u0001\u0000\u0000\u0000\u0002!\u0001\u0000\u0000\u0000"+
		"\u00041\u0001\u0000\u0000\u0000\u0006<\u0001\u0000\u0000\u0000\bF\u0001"+
		"\u0000\u0000\u0000\nM\u0001\u0000\u0000\u0000\fT\u0001\u0000\u0000\u0000"+
		"\u000ef\u0001\u0000\u0000\u0000\u0010\u007f\u0001\u0000\u0000\u0000\u0012"+
		"\u0086\u0001\u0000\u0000\u0000\u0014\u0088\u0001\u0000\u0000\u0000\u0016"+
		"\u0090\u0001\u0000\u0000\u0000\u0018\u009a\u0001\u0000\u0000\u0000\u001a"+
		"\u009e\u0001\u0000\u0000\u0000\u001c\u00ab\u0001\u0000\u0000\u0000\u001e"+
		"\u001f\u0003\u0002\u0001\u0000\u001f \u0005\u0000\u0000\u0001 \u0001\u0001"+
		"\u0000\u0000\u0000!\"\u0005\u0001\u0000\u0000\"#\u0003\u0004\u0002\u0000"+
		"#$\u0005\u0002\u0000\u0000$%\u0003\u0006\u0003\u0000%&\u0005\u0003\u0000"+
		"\u0000&\'\u0003\b\u0004\u0000\'(\u0005\u0004\u0000\u0000()\u0003\n\u0005"+
		"\u0000)*\u0005\u0005\u0000\u0000*,\u0003\f\u0006\u0000+-\u0003\u0010\b"+
		"\u0000,+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.,\u0001\u0000"+
		"\u0000\u0000./\u0001\u0000\u0000\u0000/\u0003\u0001\u0000\u0000\u0000"+
		"02\u0005\n\u0000\u000010\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u0000"+
		"31\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u000048\u0001\u0000\u0000"+
		"\u000057\u0005\u000b\u0000\u000065\u0001\u0000\u0000\u00007:\u0001\u0000"+
		"\u0000\u000086\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u00009\u0005"+
		"\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000;=\u0005\n\u0000\u0000"+
		"<;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000><\u0001\u0000\u0000"+
		"\u0000>?\u0001\u0000\u0000\u0000?C\u0001\u0000\u0000\u0000@B\u0005\u000b"+
		"\u0000\u0000A@\u0001\u0000\u0000\u0000BE\u0001\u0000\u0000\u0000CA\u0001"+
		"\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000D\u0007\u0001\u0000\u0000"+
		"\u0000EC\u0001\u0000\u0000\u0000FJ\u0005\t\u0000\u0000GI\u0005\u000b\u0000"+
		"\u0000HG\u0001\u0000\u0000\u0000IL\u0001\u0000\u0000\u0000JH\u0001\u0000"+
		"\u0000\u0000JK\u0001\u0000\u0000\u0000K\t\u0001\u0000\u0000\u0000LJ\u0001"+
		"\u0000\u0000\u0000MQ\u0005\t\u0000\u0000NP\u0005\u000b\u0000\u0000ON\u0001"+
		"\u0000\u0000\u0000PS\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000"+
		"QR\u0001\u0000\u0000\u0000R\u000b\u0001\u0000\u0000\u0000SQ\u0001\u0000"+
		"\u0000\u0000TX\u0005\t\u0000\u0000UW\u0005\u000b\u0000\u0000VU\u0001\u0000"+
		"\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001"+
		"\u0000\u0000\u0000Y\\\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000"+
		"[]\u0005\n\u0000\u0000\\[\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000"+
		"\u0000^\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_c\u0001\u0000"+
		"\u0000\u0000`b\u0005\u000b\u0000\u0000a`\u0001\u0000\u0000\u0000be\u0001"+
		"\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000"+
		"d\r\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000fg\u0006\u0007\uffff"+
		"\uffff\u0000gk\u0005\n\u0000\u0000hj\u0005\u000b\u0000\u0000ih\u0001\u0000"+
		"\u0000\u0000jm\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001"+
		"\u0000\u0000\u0000l|\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000"+
		"np\n\u0001\u0000\u0000oq\u0005\n\u0000\u0000po\u0001\u0000\u0000\u0000"+
		"qr\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000"+
		"\u0000sw\u0001\u0000\u0000\u0000tv\u0005\u000b\u0000\u0000ut\u0001\u0000"+
		"\u0000\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001"+
		"\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000"+
		"zn\u0001\u0000\u0000\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000"+
		"\u0000|}\u0001\u0000\u0000\u0000}\u000f\u0001\u0000\u0000\u0000~|\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0005\u0006\u0000\u0000\u0080\u0081\u0003"+
		"\u0012\t\u0000\u0081\u0082\u0005\u0007\u0000\u0000\u0082\u0083\u0003\u0014"+
		"\n\u0000\u0083\u0084\u0005\b\u0000\u0000\u0084\u0085\u0003\u0016\u000b"+
		"\u0000\u0085\u0011\u0001\u0000\u0000\u0000\u0086\u0087\u0003\u000e\u0007"+
		"\u0000\u0087\u0013\u0001\u0000\u0000\u0000\u0088\u008c\u0005\t\u0000\u0000"+
		"\u0089\u008b\u0005\u000b\u0000\u0000\u008a\u0089\u0001\u0000\u0000\u0000"+
		"\u008b\u008e\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000"+
		"\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u0015\u0001\u0000\u0000\u0000"+
		"\u008e\u008c\u0001\u0000\u0000\u0000\u008f\u0091\u0003\u0018\f\u0000\u0090"+
		"\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092"+
		"\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093"+
		"\u0097\u0001\u0000\u0000\u0000\u0094\u0096\u0005\u000b\u0000\u0000\u0095"+
		"\u0094\u0001\u0000\u0000\u0000\u0096\u0099\u0001\u0000\u0000\u0000\u0097"+
		"\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098"+
		"\u0017\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u009a"+
		"\u009b\u0003\u000e\u0007\u0000\u009b\u009c\u0003\u001a\r\u0000\u009c\u0019"+
		"\u0001\u0000\u0000\u0000\u009d\u009f\u0003\u001c\u000e\u0000\u009e\u009d"+
		"\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u009e"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u001b"+
		"\u0001\u0000\u0000\u0000\u00a2\u00ac\u0003\u000e\u0007\u0000\u00a3\u00a4"+
		"\u0003\u000e\u0007\u0000\u00a4\u00a8\u0005\t\u0000\u0000\u00a5\u00a7\u0005"+
		"\u000b\u0000\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a7\u00aa\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001"+
		"\u0000\u0000\u0000\u00a9\u00ac\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001"+
		"\u0000\u0000\u0000\u00ab\u00a2\u0001\u0000\u0000\u0000\u00ab\u00a3\u0001"+
		"\u0000\u0000\u0000\u00ac\u001d\u0001\u0000\u0000\u0000\u0014.38>CJQX^"+
		"ckrw|\u008c\u0092\u0097\u00a0\u00a8\u00ab";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}