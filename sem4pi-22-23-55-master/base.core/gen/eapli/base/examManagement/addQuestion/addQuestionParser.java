// Generated from C:/Users/phenr/github-classroom/Departamento-de-Engenharia-Informatica/sem4pi-22-23-55/base.core/src/main/java/eapli/base/examManagement/addQuestion\addQuestion.g4 by ANTLR 4.12.0
package eapli.base.examManagement.addQuestion;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class addQuestionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		TEXTTF=10, TEXT=11, TEXTMULTIPLA=12, CORRESPONDENCIA=13, ESCOLHA_MULTIPLA=14, 
		RESPOSTA_CURTA=15, VERDADEIRO_OU_FALSO=16, PALAVRAS_EM_FALTA=17, NEWLINE=18, 
		WS=19;
	public static final int
		RULE_start = 0, RULE_addQuestion = 1, RULE_questionContent = 2, RULE_correspondencia = 3, 
		RULE_correspondenciaOptions = 4, RULE_correspondenciaOption = 5, RULE_respostaCurta = 6, 
		RULE_verdadeiroOuFalso = 7, RULE_escolhaMultipla = 8, RULE_optionsMultplas = 9, 
		RULE_optionsMultpla = 10, RULE_palavrasEmFalta = 11, RULE_palavrasEmFaltaOptions = 12, 
		RULE_palavrasEmFaltaOption = 13, RULE_numerica = 14, RULE_solution = 15, 
		RULE_solutionVerdadeiroFalso = 16, RULE_solotionMultipla = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "addQuestion", "questionContent", "correspondencia", "correspondenciaOptions", 
			"correspondenciaOption", "respostaCurta", "verdadeiroOuFalso", "escolhaMultipla", 
			"optionsMultplas", "optionsMultpla", "palavrasEmFalta", "palavrasEmFaltaOptions", 
			"palavrasEmFaltaOption", "numerica", "solution", "solutionVerdadeiroFalso", 
			"solotionMultipla"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Type: '", "'Question: '", "'Option:'", "'->'", "'Text: '", "'Missing Words: '", 
			"','", "'Numeric'", "'Solution: '", null, null, null, "'correspondencia'", 
			"'Escolha Multipla'", "'Resposta Curta'", "'Verdadeiro ou Falso'", "'Palavras em Falta'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "TEXTTF", 
			"TEXT", "TEXTMULTIPLA", "CORRESPONDENCIA", "ESCOLHA_MULTIPLA", "RESPOSTA_CURTA", 
			"VERDADEIRO_OU_FALSO", "PALAVRAS_EM_FALTA", "NEWLINE", "WS"
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
	public String getGrammarFileName() { return "addQuestion.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public addQuestionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public AddQuestionContext addQuestion() {
			return getRuleContext(AddQuestionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(addQuestionParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof addQuestionListener ) ((addQuestionListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof addQuestionListener ) ((addQuestionListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof addQuestionVisitor ) return ((addQuestionVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			addQuestion();
			setState(37);
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
	public static class AddQuestionContext extends ParserRuleContext {
		public QuestionContentContext questionContent() {
			return getRuleContext(QuestionContentContext.class,0);
		}
		public AddQuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addQuestion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof addQuestionListener ) ((addQuestionListener)listener).enterAddQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof addQuestionListener ) ((addQuestionListener)listener).exitAddQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof addQuestionVisitor ) return ((addQuestionVisitor<? extends T>)visitor).visitAddQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddQuestionContext addQuestion() throws RecognitionException {
		AddQuestionContext _localctx = new AddQuestionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_addQuestion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(T__0);
			setState(40);
			questionContent();
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
	public static class QuestionContentContext extends ParserRuleContext {
		public CorrespondenciaContext correspondencia() {
			return getRuleContext(CorrespondenciaContext.class,0);
		}
		public EscolhaMultiplaContext escolhaMultipla() {
			return getRuleContext(EscolhaMultiplaContext.class,0);
		}
		public RespostaCurtaContext respostaCurta() {
			return getRuleContext(RespostaCurtaContext.class,0);
		}
		public VerdadeiroOuFalsoContext verdadeiroOuFalso() {
			return getRuleContext(VerdadeiroOuFalsoContext.class,0);
		}
		public PalavrasEmFaltaContext palavrasEmFalta() {
			return getRuleContext(PalavrasEmFaltaContext.class,0);
		}
		public NumericaContext numerica() {
			return getRuleContext(NumericaContext.class,0);
		}
		public QuestionContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questionContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof addQuestionListener ) ((addQuestionListener)listener).enterQuestionContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof addQuestionListener ) ((addQuestionListener)listener).exitQuestionContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof addQuestionVisitor ) return ((addQuestionVisitor<? extends T>)visitor).visitQuestionContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionContentContext questionContent() throws RecognitionException {
		QuestionContentContext _localctx = new QuestionContentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_questionContent);
		try {
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CORRESPONDENCIA:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				correspondencia();
				}
				break;
			case ESCOLHA_MULTIPLA:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				escolhaMultipla();
				}
				break;
			case RESPOSTA_CURTA:
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				respostaCurta();
				}
				break;
			case VERDADEIRO_OU_FALSO:
				enterOuterAlt(_localctx, 4);
				{
				setState(45);
				verdadeiroOuFalso();
				}
				break;
			case PALAVRAS_EM_FALTA:
				enterOuterAlt(_localctx, 5);
				{
				setState(46);
				palavrasEmFalta();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 6);
				{
				setState(47);
				numerica();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CorrespondenciaContext extends ParserRuleContext {
		public TerminalNode CORRESPONDENCIA() { return getToken(addQuestionParser.CORRESPONDENCIA, 0); }
		public CorrespondenciaOptionsContext correspondenciaOptions() {
			return getRuleContext(CorrespondenciaOptionsContext.class,0);
		}
		public SolutionContext solution() {
			return getRuleContext(SolutionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(addQuestionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(addQuestionParser.NEWLINE, i);
		}
		public List<TerminalNode> TEXT() { return getTokens(addQuestionParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(addQuestionParser.TEXT, i);
		}
		public CorrespondenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_correspondencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof addQuestionListener ) ((addQuestionListener)listener).enterCorrespondencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof addQuestionListener ) ((addQuestionListener)listener).exitCorrespondencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof addQuestionVisitor ) return ((addQuestionVisitor<? extends T>)visitor).visitCorrespondencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CorrespondenciaContext correspondencia() throws RecognitionException {
		CorrespondenciaContext _localctx = new CorrespondenciaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_correspondencia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(CORRESPONDENCIA);
			setState(52); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(51);
				match(NEWLINE);
				}
				}
				setState(54); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(56);
			match(T__1);
			setState(58); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(57);
				match(TEXT);
				}
				}
				setState(60); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT );
			setState(63); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(62);
				match(NEWLINE);
				}
				}
				setState(65); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(67);
			match(T__2);
			setState(69); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(68);
				match(NEWLINE);
				}
				}
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(73);
			correspondenciaOptions();
			setState(74);
			solution();
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
	public static class CorrespondenciaOptionsContext extends ParserRuleContext {
		public List<CorrespondenciaOptionContext> correspondenciaOption() {
			return getRuleContexts(CorrespondenciaOptionContext.class);
		}
		public CorrespondenciaOptionContext correspondenciaOption(int i) {
			return getRuleContext(CorrespondenciaOptionContext.class,i);
		}
		public CorrespondenciaOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_correspondenciaOptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof addQuestionListener ) ((addQuestionListener)listener).enterCorrespondenciaOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof addQuestionListener ) ((addQuestionListener)listener).exitCorrespondenciaOptions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof addQuestionVisitor ) return ((addQuestionVisitor<? extends T>)visitor).visitCorrespondenciaOptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CorrespondenciaOptionsContext correspondenciaOptions() throws RecognitionException {
		CorrespondenciaOptionsContext _localctx = new CorrespondenciaOptionsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_correspondenciaOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			correspondenciaOption();
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEXT) {
				{
				{
				setState(77);
				correspondenciaOption();
				}
				}
				setState(82);
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
	public static class CorrespondenciaOptionContext extends ParserRuleContext {
		public List<TerminalNode> TEXT() { return getTokens(addQuestionParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(addQuestionParser.TEXT, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(addQuestionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(addQuestionParser.NEWLINE, i);
		}
		public CorrespondenciaOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_correspondenciaOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof addQuestionListener ) ((addQuestionListener)listener).enterCorrespondenciaOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof addQuestionListener ) ((addQuestionListener)listener).exitCorrespondenciaOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof addQuestionVisitor ) return ((addQuestionVisitor<? extends T>)visitor).visitCorrespondenciaOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CorrespondenciaOptionContext correspondenciaOption() throws RecognitionException {
		CorrespondenciaOptionContext _localctx = new CorrespondenciaOptionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_correspondenciaOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(TEXT);
			setState(84);
			match(T__3);
			setState(85);
			match(TEXT);
			setState(87); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(86);
				match(NEWLINE);
				}
				}
				setState(89); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
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
	public static class RespostaCurtaContext extends ParserRuleContext {
		public TerminalNode RESPOSTA_CURTA() { return getToken(addQuestionParser.RESPOSTA_CURTA, 0); }
		public SolutionContext solution() {
			return getRuleContext(SolutionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(addQuestionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(addQuestionParser.NEWLINE, i);
		}
		public List<TerminalNode> TEXT() { return getTokens(addQuestionParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(addQuestionParser.TEXT, i);
		}
		public RespostaCurtaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_respostaCurta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof addQuestionListener ) ((addQuestionListener)listener).enterRespostaCurta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof addQuestionListener ) ((addQuestionListener)listener).exitRespostaCurta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof addQuestionVisitor ) return ((addQuestionVisitor<? extends T>)visitor).visitRespostaCurta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RespostaCurtaContext respostaCurta() throws RecognitionException {
		RespostaCurtaContext _localctx = new RespostaCurtaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_respostaCurta);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(RESPOSTA_CURTA);
			setState(93); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(92);
				match(NEWLINE);
				}
				}
				setState(95); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(97);
			match(T__1);
			setState(99); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(98);
				match(TEXT);
				}
				}
				setState(101); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT );
			setState(104); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(103);
				match(NEWLINE);
				}
				}
				setState(106); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(108);
			solution();
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
	public static class VerdadeiroOuFalsoContext extends ParserRuleContext {
		public TerminalNode VERDADEIRO_OU_FALSO() { return getToken(addQuestionParser.VERDADEIRO_OU_FALSO, 0); }
		public SolutionVerdadeiroFalsoContext solutionVerdadeiroFalso() {
			return getRuleContext(SolutionVerdadeiroFalsoContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(addQuestionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(addQuestionParser.NEWLINE, i);
		}
		public List<TerminalNode> TEXT() { return getTokens(addQuestionParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(addQuestionParser.TEXT, i);
		}
		public VerdadeiroOuFalsoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verdadeiroOuFalso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof addQuestionListener ) ((addQuestionListener)listener).enterVerdadeiroOuFalso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof addQuestionListener ) ((addQuestionListener)listener).exitVerdadeiroOuFalso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof addQuestionVisitor ) return ((addQuestionVisitor<? extends T>)visitor).visitVerdadeiroOuFalso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VerdadeiroOuFalsoContext verdadeiroOuFalso() throws RecognitionException {
		VerdadeiroOuFalsoContext _localctx = new VerdadeiroOuFalsoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_verdadeiroOuFalso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(VERDADEIRO_OU_FALSO);
			setState(112); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(111);
				match(NEWLINE);
				}
				}
				setState(114); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(116);
			match(T__1);
			setState(118); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(117);
				match(TEXT);
				}
				}
				setState(120); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT );
			setState(123); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(122);
				match(NEWLINE);
				}
				}
				setState(125); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(127);
			solutionVerdadeiroFalso();
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
	public static class EscolhaMultiplaContext extends ParserRuleContext {
		public TerminalNode ESCOLHA_MULTIPLA() { return getToken(addQuestionParser.ESCOLHA_MULTIPLA, 0); }
		public OptionsMultplasContext optionsMultplas() {
			return getRuleContext(OptionsMultplasContext.class,0);
		}
		public SolotionMultiplaContext solotionMultipla() {
			return getRuleContext(SolotionMultiplaContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(addQuestionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(addQuestionParser.NEWLINE, i);
		}
		public List<TerminalNode> TEXT() { return getTokens(addQuestionParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(addQuestionParser.TEXT, i);
		}
		public EscolhaMultiplaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escolhaMultipla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof addQuestionListener ) ((addQuestionListener)listener).enterEscolhaMultipla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof addQuestionListener ) ((addQuestionListener)listener).exitEscolhaMultipla(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof addQuestionVisitor ) return ((addQuestionVisitor<? extends T>)visitor).visitEscolhaMultipla(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscolhaMultiplaContext escolhaMultipla() throws RecognitionException {
		EscolhaMultiplaContext _localctx = new EscolhaMultiplaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_escolhaMultipla);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(ESCOLHA_MULTIPLA);
			setState(131); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(130);
				match(NEWLINE);
				}
				}
				setState(133); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(135);
			match(T__1);
			setState(137); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(136);
				match(TEXT);
				}
				}
				setState(139); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT );
			setState(142); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(141);
				match(NEWLINE);
				}
				}
				setState(144); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(146);
			match(T__2);
			setState(148); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(147);
				match(NEWLINE);
				}
				}
				setState(150); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(152);
			optionsMultplas();
			setState(153);
			solotionMultipla();
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
	public static class OptionsMultplasContext extends ParserRuleContext {
		public List<OptionsMultplaContext> optionsMultpla() {
			return getRuleContexts(OptionsMultplaContext.class);
		}
		public OptionsMultplaContext optionsMultpla(int i) {
			return getRuleContext(OptionsMultplaContext.class,i);
		}
		public OptionsMultplasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionsMultplas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof addQuestionListener ) ((addQuestionListener)listener).enterOptionsMultplas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof addQuestionListener ) ((addQuestionListener)listener).exitOptionsMultplas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof addQuestionVisitor ) return ((addQuestionVisitor<? extends T>)visitor).visitOptionsMultplas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionsMultplasContext optionsMultplas() throws RecognitionException {
		OptionsMultplasContext _localctx = new OptionsMultplasContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_optionsMultplas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			optionsMultpla();
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEXT) {
				{
				{
				setState(156);
				optionsMultpla();
				}
				}
				setState(161);
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
	public static class OptionsMultplaContext extends ParserRuleContext {
		public List<TerminalNode> TEXT() { return getTokens(addQuestionParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(addQuestionParser.TEXT, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(addQuestionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(addQuestionParser.NEWLINE, i);
		}
		public OptionsMultplaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionsMultpla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof addQuestionListener ) ((addQuestionListener)listener).enterOptionsMultpla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof addQuestionListener ) ((addQuestionListener)listener).exitOptionsMultpla(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof addQuestionVisitor ) return ((addQuestionVisitor<? extends T>)visitor).visitOptionsMultpla(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionsMultplaContext optionsMultpla() throws RecognitionException {
		OptionsMultplaContext _localctx = new OptionsMultplaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_optionsMultpla);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(TEXT);
			setState(163);
			match(T__3);
			setState(165); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(164);
				match(TEXT);
				}
				}
				setState(167); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT );
			setState(170); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(169);
				match(NEWLINE);
				}
				}
				setState(172); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
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
	public static class PalavrasEmFaltaContext extends ParserRuleContext {
		public TerminalNode PALAVRAS_EM_FALTA() { return getToken(addQuestionParser.PALAVRAS_EM_FALTA, 0); }
		public PalavrasEmFaltaOptionsContext palavrasEmFaltaOptions() {
			return getRuleContext(PalavrasEmFaltaOptionsContext.class,0);
		}
		public SolutionContext solution() {
			return getRuleContext(SolutionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(addQuestionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(addQuestionParser.NEWLINE, i);
		}
		public List<TerminalNode> TEXT() { return getTokens(addQuestionParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(addQuestionParser.TEXT, i);
		}
		public PalavrasEmFaltaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_palavrasEmFalta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof addQuestionListener ) ((addQuestionListener)listener).enterPalavrasEmFalta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof addQuestionListener ) ((addQuestionListener)listener).exitPalavrasEmFalta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof addQuestionVisitor ) return ((addQuestionVisitor<? extends T>)visitor).visitPalavrasEmFalta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PalavrasEmFaltaContext palavrasEmFalta() throws RecognitionException {
		PalavrasEmFaltaContext _localctx = new PalavrasEmFaltaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_palavrasEmFalta);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(PALAVRAS_EM_FALTA);
			setState(176); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(175);
				match(NEWLINE);
				}
				}
				setState(178); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(180);
			match(T__1);
			setState(182); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(181);
				match(TEXT);
				}
				}
				setState(184); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT );
			setState(187); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(186);
				match(NEWLINE);
				}
				}
				setState(189); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(191);
			match(T__4);
			setState(193); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(192);
				match(TEXT);
				}
				}
				setState(195); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT );
			setState(198); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(197);
				match(NEWLINE);
				}
				}
				setState(200); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(202);
			match(T__5);
			setState(203);
			palavrasEmFaltaOptions();
			setState(205); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(204);
				match(NEWLINE);
				}
				}
				setState(207); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(209);
			solution();
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
	public static class PalavrasEmFaltaOptionsContext extends ParserRuleContext {
		public List<PalavrasEmFaltaOptionContext> palavrasEmFaltaOption() {
			return getRuleContexts(PalavrasEmFaltaOptionContext.class);
		}
		public PalavrasEmFaltaOptionContext palavrasEmFaltaOption(int i) {
			return getRuleContext(PalavrasEmFaltaOptionContext.class,i);
		}
		public PalavrasEmFaltaOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_palavrasEmFaltaOptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof addQuestionListener ) ((addQuestionListener)listener).enterPalavrasEmFaltaOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof addQuestionListener ) ((addQuestionListener)listener).exitPalavrasEmFaltaOptions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof addQuestionVisitor ) return ((addQuestionVisitor<? extends T>)visitor).visitPalavrasEmFaltaOptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PalavrasEmFaltaOptionsContext palavrasEmFaltaOptions() throws RecognitionException {
		PalavrasEmFaltaOptionsContext _localctx = new PalavrasEmFaltaOptionsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_palavrasEmFaltaOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			palavrasEmFaltaOption();
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(212);
				match(T__6);
				setState(213);
				palavrasEmFaltaOption();
				}
				}
				setState(218);
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
	public static class PalavrasEmFaltaOptionContext extends ParserRuleContext {
		public List<TerminalNode> TEXT() { return getTokens(addQuestionParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(addQuestionParser.TEXT, i);
		}
		public PalavrasEmFaltaOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_palavrasEmFaltaOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof addQuestionListener ) ((addQuestionListener)listener).enterPalavrasEmFaltaOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof addQuestionListener ) ((addQuestionListener)listener).exitPalavrasEmFaltaOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof addQuestionVisitor ) return ((addQuestionVisitor<? extends T>)visitor).visitPalavrasEmFaltaOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PalavrasEmFaltaOptionContext palavrasEmFaltaOption() throws RecognitionException {
		PalavrasEmFaltaOptionContext _localctx = new PalavrasEmFaltaOptionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_palavrasEmFaltaOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(219);
				match(TEXT);
				}
				}
				setState(222); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT );
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
	public static class NumericaContext extends ParserRuleContext {
		public SolutionContext solution() {
			return getRuleContext(SolutionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(addQuestionParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(addQuestionParser.NEWLINE, i);
		}
		public List<TerminalNode> TEXT() { return getTokens(addQuestionParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(addQuestionParser.TEXT, i);
		}
		public NumericaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numerica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof addQuestionListener ) ((addQuestionListener)listener).enterNumerica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof addQuestionListener ) ((addQuestionListener)listener).exitNumerica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof addQuestionVisitor ) return ((addQuestionVisitor<? extends T>)visitor).visitNumerica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericaContext numerica() throws RecognitionException {
		NumericaContext _localctx = new NumericaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_numerica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(T__7);
			setState(226); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(225);
				match(NEWLINE);
				}
				}
				setState(228); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(230);
			match(T__1);
			setState(232); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(231);
				match(TEXT);
				}
				}
				setState(234); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT );
			setState(237); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(236);
				match(NEWLINE);
				}
				}
				setState(239); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(241);
			solution();
			setState(243); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(242);
				match(NEWLINE);
				}
				}
				setState(245); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
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
	public static class SolutionContext extends ParserRuleContext {
		public List<TerminalNode> TEXT() { return getTokens(addQuestionParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(addQuestionParser.TEXT, i);
		}
		public SolutionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_solution; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof addQuestionListener ) ((addQuestionListener)listener).enterSolution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof addQuestionListener ) ((addQuestionListener)listener).exitSolution(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof addQuestionVisitor ) return ((addQuestionVisitor<? extends T>)visitor).visitSolution(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SolutionContext solution() throws RecognitionException {
		SolutionContext _localctx = new SolutionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_solution);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(T__8);
			setState(249); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(248);
				match(TEXT);
				}
				}
				setState(251); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT );
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
	public static class SolutionVerdadeiroFalsoContext extends ParserRuleContext {
		public TerminalNode TEXTTF() { return getToken(addQuestionParser.TEXTTF, 0); }
		public SolutionVerdadeiroFalsoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_solutionVerdadeiroFalso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof addQuestionListener ) ((addQuestionListener)listener).enterSolutionVerdadeiroFalso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof addQuestionListener ) ((addQuestionListener)listener).exitSolutionVerdadeiroFalso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof addQuestionVisitor ) return ((addQuestionVisitor<? extends T>)visitor).visitSolutionVerdadeiroFalso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SolutionVerdadeiroFalsoContext solutionVerdadeiroFalso() throws RecognitionException {
		SolutionVerdadeiroFalsoContext _localctx = new SolutionVerdadeiroFalsoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_solutionVerdadeiroFalso);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(T__8);
			setState(254);
			match(TEXTTF);
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
	public static class SolotionMultiplaContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(addQuestionParser.TEXT, 0); }
		public SolotionMultiplaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_solotionMultipla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof addQuestionListener ) ((addQuestionListener)listener).enterSolotionMultipla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof addQuestionListener ) ((addQuestionListener)listener).exitSolotionMultipla(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof addQuestionVisitor ) return ((addQuestionVisitor<? extends T>)visitor).visitSolotionMultipla(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SolotionMultiplaContext solotionMultipla() throws RecognitionException {
		SolotionMultiplaContext _localctx = new SolotionMultiplaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_solotionMultipla);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(T__8);
			setState(257);
			match(TEXT);
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
		"\u0004\u0001\u0013\u0104\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00021\b"+
		"\u0002\u0001\u0003\u0001\u0003\u0004\u00035\b\u0003\u000b\u0003\f\u0003"+
		"6\u0001\u0003\u0001\u0003\u0004\u0003;\b\u0003\u000b\u0003\f\u0003<\u0001"+
		"\u0003\u0004\u0003@\b\u0003\u000b\u0003\f\u0003A\u0001\u0003\u0001\u0003"+
		"\u0004\u0003F\b\u0003\u000b\u0003\f\u0003G\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0005\u0004O\b\u0004\n\u0004\f\u0004R\t"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005X\b"+
		"\u0005\u000b\u0005\f\u0005Y\u0001\u0006\u0001\u0006\u0004\u0006^\b\u0006"+
		"\u000b\u0006\f\u0006_\u0001\u0006\u0001\u0006\u0004\u0006d\b\u0006\u000b"+
		"\u0006\f\u0006e\u0001\u0006\u0004\u0006i\b\u0006\u000b\u0006\f\u0006j"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0004\u0007q\b\u0007"+
		"\u000b\u0007\f\u0007r\u0001\u0007\u0001\u0007\u0004\u0007w\b\u0007\u000b"+
		"\u0007\f\u0007x\u0001\u0007\u0004\u0007|\b\u0007\u000b\u0007\f\u0007}"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0004\b\u0084\b\b\u000b\b\f\b"+
		"\u0085\u0001\b\u0001\b\u0004\b\u008a\b\b\u000b\b\f\b\u008b\u0001\b\u0004"+
		"\b\u008f\b\b\u000b\b\f\b\u0090\u0001\b\u0001\b\u0004\b\u0095\b\b\u000b"+
		"\b\f\b\u0096\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0005\t\u009e\b\t"+
		"\n\t\f\t\u00a1\t\t\u0001\n\u0001\n\u0001\n\u0004\n\u00a6\b\n\u000b\n\f"+
		"\n\u00a7\u0001\n\u0004\n\u00ab\b\n\u000b\n\f\n\u00ac\u0001\u000b\u0001"+
		"\u000b\u0004\u000b\u00b1\b\u000b\u000b\u000b\f\u000b\u00b2\u0001\u000b"+
		"\u0001\u000b\u0004\u000b\u00b7\b\u000b\u000b\u000b\f\u000b\u00b8\u0001"+
		"\u000b\u0004\u000b\u00bc\b\u000b\u000b\u000b\f\u000b\u00bd\u0001\u000b"+
		"\u0001\u000b\u0004\u000b\u00c2\b\u000b\u000b\u000b\f\u000b\u00c3\u0001"+
		"\u000b\u0004\u000b\u00c7\b\u000b\u000b\u000b\f\u000b\u00c8\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0004\u000b\u00ce\b\u000b\u000b\u000b\f\u000b"+
		"\u00cf\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u00d7\b"+
		"\f\n\f\f\f\u00da\t\f\u0001\r\u0004\r\u00dd\b\r\u000b\r\f\r\u00de\u0001"+
		"\u000e\u0001\u000e\u0004\u000e\u00e3\b\u000e\u000b\u000e\f\u000e\u00e4"+
		"\u0001\u000e\u0001\u000e\u0004\u000e\u00e9\b\u000e\u000b\u000e\f\u000e"+
		"\u00ea\u0001\u000e\u0004\u000e\u00ee\b\u000e\u000b\u000e\f\u000e\u00ef"+
		"\u0001\u000e\u0001\u000e\u0004\u000e\u00f4\b\u000e\u000b\u000e\f\u000e"+
		"\u00f5\u0001\u000f\u0001\u000f\u0004\u000f\u00fa\b\u000f\u000b\u000f\f"+
		"\u000f\u00fb\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0000\u0000\u0012\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"\u0000\u0000"+
		"\u0116\u0000$\u0001\u0000\u0000\u0000\u0002\'\u0001\u0000\u0000\u0000"+
		"\u00040\u0001\u0000\u0000\u0000\u00062\u0001\u0000\u0000\u0000\bL\u0001"+
		"\u0000\u0000\u0000\nS\u0001\u0000\u0000\u0000\f[\u0001\u0000\u0000\u0000"+
		"\u000en\u0001\u0000\u0000\u0000\u0010\u0081\u0001\u0000\u0000\u0000\u0012"+
		"\u009b\u0001\u0000\u0000\u0000\u0014\u00a2\u0001\u0000\u0000\u0000\u0016"+
		"\u00ae\u0001\u0000\u0000\u0000\u0018\u00d3\u0001\u0000\u0000\u0000\u001a"+
		"\u00dc\u0001\u0000\u0000\u0000\u001c\u00e0\u0001\u0000\u0000\u0000\u001e"+
		"\u00f7\u0001\u0000\u0000\u0000 \u00fd\u0001\u0000\u0000\u0000\"\u0100"+
		"\u0001\u0000\u0000\u0000$%\u0003\u0002\u0001\u0000%&\u0005\u0000\u0000"+
		"\u0001&\u0001\u0001\u0000\u0000\u0000\'(\u0005\u0001\u0000\u0000()\u0003"+
		"\u0004\u0002\u0000)\u0003\u0001\u0000\u0000\u0000*1\u0003\u0006\u0003"+
		"\u0000+1\u0003\u0010\b\u0000,1\u0003\f\u0006\u0000-1\u0003\u000e\u0007"+
		"\u0000.1\u0003\u0016\u000b\u0000/1\u0003\u001c\u000e\u00000*\u0001\u0000"+
		"\u0000\u00000+\u0001\u0000\u0000\u00000,\u0001\u0000\u0000\u00000-\u0001"+
		"\u0000\u0000\u00000.\u0001\u0000\u0000\u00000/\u0001\u0000\u0000\u0000"+
		"1\u0005\u0001\u0000\u0000\u000024\u0005\r\u0000\u000035\u0005\u0012\u0000"+
		"\u000043\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u000064\u0001\u0000"+
		"\u0000\u000067\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u00008:\u0005"+
		"\u0002\u0000\u00009;\u0005\u000b\u0000\u0000:9\u0001\u0000\u0000\u0000"+
		";<\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000"+
		"\u0000=?\u0001\u0000\u0000\u0000>@\u0005\u0012\u0000\u0000?>\u0001\u0000"+
		"\u0000\u0000@A\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001"+
		"\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CE\u0005\u0003\u0000\u0000"+
		"DF\u0005\u0012\u0000\u0000ED\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000"+
		"\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HI\u0001\u0000"+
		"\u0000\u0000IJ\u0003\b\u0004\u0000JK\u0003\u001e\u000f\u0000K\u0007\u0001"+
		"\u0000\u0000\u0000LP\u0003\n\u0005\u0000MO\u0003\n\u0005\u0000NM\u0001"+
		"\u0000\u0000\u0000OR\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000"+
		"PQ\u0001\u0000\u0000\u0000Q\t\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000"+
		"\u0000ST\u0005\u000b\u0000\u0000TU\u0005\u0004\u0000\u0000UW\u0005\u000b"+
		"\u0000\u0000VX\u0005\u0012\u0000\u0000WV\u0001\u0000\u0000\u0000XY\u0001"+
		"\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000"+
		"Z\u000b\u0001\u0000\u0000\u0000[]\u0005\u000f\u0000\u0000\\^\u0005\u0012"+
		"\u0000\u0000]\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_]\u0001"+
		"\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000"+
		"ac\u0005\u0002\u0000\u0000bd\u0005\u000b\u0000\u0000cb\u0001\u0000\u0000"+
		"\u0000de\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000"+
		"\u0000\u0000fh\u0001\u0000\u0000\u0000gi\u0005\u0012\u0000\u0000hg\u0001"+
		"\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000"+
		"jk\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lm\u0003\u001e\u000f"+
		"\u0000m\r\u0001\u0000\u0000\u0000np\u0005\u0010\u0000\u0000oq\u0005\u0012"+
		"\u0000\u0000po\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rp\u0001"+
		"\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000"+
		"tv\u0005\u0002\u0000\u0000uw\u0005\u000b\u0000\u0000vu\u0001\u0000\u0000"+
		"\u0000wx\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000"+
		"\u0000\u0000y{\u0001\u0000\u0000\u0000z|\u0005\u0012\u0000\u0000{z\u0001"+
		"\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000"+
		"}~\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0003 \u0010\u0000\u0080\u000f\u0001\u0000\u0000\u0000\u0081\u0083\u0005"+
		"\u000e\u0000\u0000\u0082\u0084\u0005\u0012\u0000\u0000\u0083\u0082\u0001"+
		"\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0083\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0087\u0001"+
		"\u0000\u0000\u0000\u0087\u0089\u0005\u0002\u0000\u0000\u0088\u008a\u0005"+
		"\u000b\u0000\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001"+
		"\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001"+
		"\u0000\u0000\u0000\u008c\u008e\u0001\u0000\u0000\u0000\u008d\u008f\u0005"+
		"\u0012\u0000\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001"+
		"\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001"+
		"\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0094\u0005"+
		"\u0003\u0000\u0000\u0093\u0095\u0005\u0012\u0000\u0000\u0094\u0093\u0001"+
		"\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0094\u0001"+
		"\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0098\u0001"+
		"\u0000\u0000\u0000\u0098\u0099\u0003\u0012\t\u0000\u0099\u009a\u0003\""+
		"\u0011\u0000\u009a\u0011\u0001\u0000\u0000\u0000\u009b\u009f\u0003\u0014"+
		"\n\u0000\u009c\u009e\u0003\u0014\n\u0000\u009d\u009c\u0001\u0000\u0000"+
		"\u0000\u009e\u00a1\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000"+
		"\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u0013\u0001\u0000\u0000"+
		"\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\u000b\u0000"+
		"\u0000\u00a3\u00a5\u0005\u0004\u0000\u0000\u00a4\u00a6\u0005\u000b\u0000"+
		"\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000"+
		"\u0000\u00a8\u00aa\u0001\u0000\u0000\u0000\u00a9\u00ab\u0005\u0012\u0000"+
		"\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000"+
		"\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000"+
		"\u0000\u00ad\u0015\u0001\u0000\u0000\u0000\u00ae\u00b0\u0005\u0011\u0000"+
		"\u0000\u00af\u00b1\u0005\u0012\u0000\u0000\u00b0\u00af\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b6\u0005\u0002\u0000\u0000\u00b5\u00b7\u0005\u000b\u0000"+
		"\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000"+
		"\u0000\u00b9\u00bb\u0001\u0000\u0000\u0000\u00ba\u00bc\u0005\u0012\u0000"+
		"\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000"+
		"\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000"+
		"\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c1\u0005\u0005\u0000"+
		"\u0000\u00c0\u00c2\u0005\u000b\u0000\u0000\u00c1\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c7\u0005\u0012\u0000\u0000\u00c6\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000"+
		"\u0000\u00ca\u00cb\u0005\u0006\u0000\u0000\u00cb\u00cd\u0003\u0018\f\u0000"+
		"\u00cc\u00ce\u0005\u0012\u0000\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000"+
		"\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000"+
		"\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d2\u0003\u001e\u000f\u0000\u00d2\u0017\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d8\u0003\u001a\r\u0000\u00d4\u00d5\u0005\u0007\u0000\u0000\u00d5"+
		"\u00d7\u0003\u001a\r\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d7\u00da"+
		"\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d9"+
		"\u0001\u0000\u0000\u0000\u00d9\u0019\u0001\u0000\u0000\u0000\u00da\u00d8"+
		"\u0001\u0000\u0000\u0000\u00db\u00dd\u0005\u000b\u0000\u0000\u00dc\u00db"+
		"\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u00dc"+
		"\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u001b"+
		"\u0001\u0000\u0000\u0000\u00e0\u00e2\u0005\b\u0000\u0000\u00e1\u00e3\u0005"+
		"\u0012\u0000\u0000\u00e2\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e8\u0005"+
		"\u0002\u0000\u0000\u00e7\u00e9\u0005\u000b\u0000\u0000\u00e8\u00e7\u0001"+
		"\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001"+
		"\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ed\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ee\u0005\u0012\u0000\u0000\u00ed\u00ec\u0001"+
		"\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001"+
		"\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f3\u0003\u001e\u000f\u0000\u00f2\u00f4\u0005"+
		"\u0012\u0000\u0000\u00f3\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001"+
		"\u0000\u0000\u0000\u00f6\u001d\u0001\u0000\u0000\u0000\u00f7\u00f9\u0005"+
		"\t\u0000\u0000\u00f8\u00fa\u0005\u000b\u0000\u0000\u00f9\u00f8\u0001\u0000"+
		"\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000"+
		"\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u001f\u0001\u0000"+
		"\u0000\u0000\u00fd\u00fe\u0005\t\u0000\u0000\u00fe\u00ff\u0005\n\u0000"+
		"\u0000\u00ff!\u0001\u0000\u0000\u0000\u0100\u0101\u0005\t\u0000\u0000"+
		"\u0101\u0102\u0005\u000b\u0000\u0000\u0102#\u0001\u0000\u0000\u0000!0"+
		"6<AGPY_ejrx}\u0085\u008b\u0090\u0096\u009f\u00a7\u00ac\u00b2\u00b8\u00bd"+
		"\u00c3\u00c8\u00cf\u00d8\u00de\u00e4\u00ea\u00ef\u00f5\u00fb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}