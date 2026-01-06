// Generated from C:/Users/phenr/github-classroom/Departamento-de-Engenharia-Informatica/sem4pi-22-23-55/base.core/src/main/java/eapli/base/examManagement/automaticFormativeExam\AutomaticFormativeExam.g4 by ANTLR 4.12.0
package eapli.base.examManagement.automaticFormativeExam;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class AutomaticFormativeExamParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SECTION=1, MARKS=2, NUMBER=3, STRING=4, NEWLINE=5, QUESTIONS=6, WS=7;
	public static final int
		RULE_start = 0, RULE_section = 1, RULE_section_name = 2, RULE_section_marks = 3, 
		RULE_question_block = 4, RULE_question = 5, RULE_answer_block = 6, RULE_answer = 7, 
		RULE_text = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "section", "section_name", "section_marks", "question_block", 
			"question", "answer_block", "answer", "text"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Section:'", "'Marks:'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SECTION", "MARKS", "NUMBER", "STRING", "NEWLINE", "QUESTIONS", 
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
	public String getGrammarFileName() { return "AutomaticFormativeExam.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AutomaticFormativeExamParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public SectionContext section() {
			return getRuleContext(SectionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(AutomaticFormativeExamParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomaticFormativeExamListener ) ((AutomaticFormativeExamListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomaticFormativeExamListener ) ((AutomaticFormativeExamListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomaticFormativeExamVisitor ) return ((AutomaticFormativeExamVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			section();
			setState(19);
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
	public static class SectionContext extends ParserRuleContext {
		public TerminalNode SECTION() { return getToken(AutomaticFormativeExamParser.SECTION, 0); }
		public Section_nameContext section_name() {
			return getRuleContext(Section_nameContext.class,0);
		}
		public TerminalNode MARKS() { return getToken(AutomaticFormativeExamParser.MARKS, 0); }
		public Section_marksContext section_marks() {
			return getRuleContext(Section_marksContext.class,0);
		}
		public TerminalNode QUESTIONS() { return getToken(AutomaticFormativeExamParser.QUESTIONS, 0); }
		public Question_blockContext question_block() {
			return getRuleContext(Question_blockContext.class,0);
		}
		public SectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomaticFormativeExamListener ) ((AutomaticFormativeExamListener)listener).enterSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomaticFormativeExamListener ) ((AutomaticFormativeExamListener)listener).exitSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomaticFormativeExamVisitor ) return ((AutomaticFormativeExamVisitor<? extends T>)visitor).visitSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SectionContext section() throws RecognitionException {
		SectionContext _localctx = new SectionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_section);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			match(SECTION);
			setState(22);
			section_name();
			setState(23);
			match(MARKS);
			setState(24);
			section_marks();
			setState(25);
			match(QUESTIONS);
			setState(26);
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
			if ( listener instanceof AutomaticFormativeExamListener ) ((AutomaticFormativeExamListener)listener).enterSection_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomaticFormativeExamListener ) ((AutomaticFormativeExamListener)listener).exitSection_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomaticFormativeExamVisitor ) return ((AutomaticFormativeExamVisitor<? extends T>)visitor).visitSection_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Section_nameContext section_name() throws RecognitionException {
		Section_nameContext _localctx = new Section_nameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_section_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
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
		public TerminalNode NUMBER() { return getToken(AutomaticFormativeExamParser.NUMBER, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(AutomaticFormativeExamParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(AutomaticFormativeExamParser.NEWLINE, i);
		}
		public Section_marksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section_marks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomaticFormativeExamListener ) ((AutomaticFormativeExamListener)listener).enterSection_marks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomaticFormativeExamListener ) ((AutomaticFormativeExamListener)listener).exitSection_marks(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomaticFormativeExamVisitor ) return ((AutomaticFormativeExamVisitor<? extends T>)visitor).visitSection_marks(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Section_marksContext section_marks() throws RecognitionException {
		Section_marksContext _localctx = new Section_marksContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_section_marks);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(NUMBER);
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(31);
				match(NEWLINE);
				}
				}
				setState(36);
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
		public List<TerminalNode> NEWLINE() { return getTokens(AutomaticFormativeExamParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(AutomaticFormativeExamParser.NEWLINE, i);
		}
		public Question_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomaticFormativeExamListener ) ((AutomaticFormativeExamListener)listener).enterQuestion_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomaticFormativeExamListener ) ((AutomaticFormativeExamListener)listener).exitQuestion_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomaticFormativeExamVisitor ) return ((AutomaticFormativeExamVisitor<? extends T>)visitor).visitQuestion_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Question_blockContext question_block() throws RecognitionException {
		Question_blockContext _localctx = new Question_blockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_question_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(37);
				question();
				}
				}
				setState(40); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(42);
				match(NEWLINE);
				}
				}
				setState(47);
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
			if ( listener instanceof AutomaticFormativeExamListener ) ((AutomaticFormativeExamListener)listener).enterQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomaticFormativeExamListener ) ((AutomaticFormativeExamListener)listener).exitQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomaticFormativeExamVisitor ) return ((AutomaticFormativeExamVisitor<? extends T>)visitor).visitQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionContext question() throws RecognitionException {
		QuestionContext _localctx = new QuestionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_question);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			text(0);
			setState(49);
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
			if ( listener instanceof AutomaticFormativeExamListener ) ((AutomaticFormativeExamListener)listener).enterAnswer_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomaticFormativeExamListener ) ((AutomaticFormativeExamListener)listener).exitAnswer_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomaticFormativeExamVisitor ) return ((AutomaticFormativeExamVisitor<? extends T>)visitor).visitAnswer_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Answer_blockContext answer_block() throws RecognitionException {
		Answer_blockContext _localctx = new Answer_blockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_answer_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(52); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(51);
					answer();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(54); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
		public TerminalNode NUMBER() { return getToken(AutomaticFormativeExamParser.NUMBER, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(AutomaticFormativeExamParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(AutomaticFormativeExamParser.NEWLINE, i);
		}
		public AnswerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_answer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomaticFormativeExamListener ) ((AutomaticFormativeExamListener)listener).enterAnswer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomaticFormativeExamListener ) ((AutomaticFormativeExamListener)listener).exitAnswer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomaticFormativeExamVisitor ) return ((AutomaticFormativeExamVisitor<? extends T>)visitor).visitAnswer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnswerContext answer() throws RecognitionException {
		AnswerContext _localctx = new AnswerContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_answer);
		try {
			int _alt;
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				text(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				text(0);
				setState(58);
				match(NUMBER);
				setState(62);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(59);
						match(NEWLINE);
						}
						} 
					}
					setState(64);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
	public static class TextContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(AutomaticFormativeExamParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(AutomaticFormativeExamParser.STRING, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(AutomaticFormativeExamParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(AutomaticFormativeExamParser.NEWLINE, i);
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
			if ( listener instanceof AutomaticFormativeExamListener ) ((AutomaticFormativeExamListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomaticFormativeExamListener ) ((AutomaticFormativeExamListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomaticFormativeExamVisitor ) return ((AutomaticFormativeExamVisitor<? extends T>)visitor).visitText(this);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_text, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(68);
			match(STRING);
			setState(72);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(69);
					match(NEWLINE);
					}
					} 
				}
				setState(74);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TextContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_text);
					setState(75);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(77); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(76);
							match(STRING);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(79); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(84);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(81);
							match(NEWLINE);
							}
							} 
						}
						setState(86);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
					}
					}
					} 
				}
				setState(91);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
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
		"\u0004\u0001\u0007]\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0005\u0003!\b\u0003\n\u0003\f\u0003"+
		"$\t\u0003\u0001\u0004\u0004\u0004\'\b\u0004\u000b\u0004\f\u0004(\u0001"+
		"\u0004\u0005\u0004,\b\u0004\n\u0004\f\u0004/\t\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0004\u00065\b\u0006\u000b\u0006\f\u0006"+
		"6\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007=\b\u0007"+
		"\n\u0007\f\u0007@\t\u0007\u0003\u0007B\b\u0007\u0001\b\u0001\b\u0001\b"+
		"\u0005\bG\b\b\n\b\f\bJ\t\b\u0001\b\u0001\b\u0004\bN\b\b\u000b\b\f\bO\u0001"+
		"\b\u0005\bS\b\b\n\b\f\bV\t\b\u0005\bX\b\b\n\b\f\b[\t\b\u0001\b\u0000\u0001"+
		"\u0010\t\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0000\u0000]\u0000"+
		"\u0012\u0001\u0000\u0000\u0000\u0002\u0015\u0001\u0000\u0000\u0000\u0004"+
		"\u001c\u0001\u0000\u0000\u0000\u0006\u001e\u0001\u0000\u0000\u0000\b&"+
		"\u0001\u0000\u0000\u0000\n0\u0001\u0000\u0000\u0000\f4\u0001\u0000\u0000"+
		"\u0000\u000eA\u0001\u0000\u0000\u0000\u0010C\u0001\u0000\u0000\u0000\u0012"+
		"\u0013\u0003\u0002\u0001\u0000\u0013\u0014\u0005\u0000\u0000\u0001\u0014"+
		"\u0001\u0001\u0000\u0000\u0000\u0015\u0016\u0005\u0001\u0000\u0000\u0016"+
		"\u0017\u0003\u0004\u0002\u0000\u0017\u0018\u0005\u0002\u0000\u0000\u0018"+
		"\u0019\u0003\u0006\u0003\u0000\u0019\u001a\u0005\u0006\u0000\u0000\u001a"+
		"\u001b\u0003\b\u0004\u0000\u001b\u0003\u0001\u0000\u0000\u0000\u001c\u001d"+
		"\u0003\u0010\b\u0000\u001d\u0005\u0001\u0000\u0000\u0000\u001e\"\u0005"+
		"\u0003\u0000\u0000\u001f!\u0005\u0005\u0000\u0000 \u001f\u0001\u0000\u0000"+
		"\u0000!$\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000\"#\u0001\u0000"+
		"\u0000\u0000#\u0007\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000"+
		"%\'\u0003\n\u0005\u0000&%\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000"+
		"\u0000(&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)-\u0001\u0000"+
		"\u0000\u0000*,\u0005\u0005\u0000\u0000+*\u0001\u0000\u0000\u0000,/\u0001"+
		"\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000"+
		".\t\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u000001\u0003\u0010\b"+
		"\u000012\u0003\f\u0006\u00002\u000b\u0001\u0000\u0000\u000035\u0003\u000e"+
		"\u0007\u000043\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u000064\u0001"+
		"\u0000\u0000\u000067\u0001\u0000\u0000\u00007\r\u0001\u0000\u0000\u0000"+
		"8B\u0003\u0010\b\u00009:\u0003\u0010\b\u0000:>\u0005\u0003\u0000\u0000"+
		";=\u0005\u0005\u0000\u0000<;\u0001\u0000\u0000\u0000=@\u0001\u0000\u0000"+
		"\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?B\u0001\u0000"+
		"\u0000\u0000@>\u0001\u0000\u0000\u0000A8\u0001\u0000\u0000\u0000A9\u0001"+
		"\u0000\u0000\u0000B\u000f\u0001\u0000\u0000\u0000CD\u0006\b\uffff\uffff"+
		"\u0000DH\u0005\u0004\u0000\u0000EG\u0005\u0005\u0000\u0000FE\u0001\u0000"+
		"\u0000\u0000GJ\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000HI\u0001"+
		"\u0000\u0000\u0000IY\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000"+
		"KM\n\u0001\u0000\u0000LN\u0005\u0004\u0000\u0000ML\u0001\u0000\u0000\u0000"+
		"NO\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000"+
		"\u0000PT\u0001\u0000\u0000\u0000QS\u0005\u0005\u0000\u0000RQ\u0001\u0000"+
		"\u0000\u0000SV\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001"+
		"\u0000\u0000\u0000UX\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000"+
		"WK\u0001\u0000\u0000\u0000X[\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000"+
		"\u0000YZ\u0001\u0000\u0000\u0000Z\u0011\u0001\u0000\u0000\u0000[Y\u0001"+
		"\u0000\u0000\u0000\n\"(-6>AHOTY";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}