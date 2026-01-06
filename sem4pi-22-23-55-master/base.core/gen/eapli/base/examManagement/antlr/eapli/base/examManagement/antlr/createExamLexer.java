// Generated from C:/Users/phenr/github-classroom/Departamento-de-Engenharia-Informatica/sem4pi-22-23-55/base.core/src/main/java/eapli/base/examManagement/antlr/eapli/base/examManagement/antlr\createExam.g4 by ANTLR 4.12.0
package eapli.base.examManagement.exam.eapli.base.examManagement.antlr;

    import java.util.HashMap;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class createExamLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EXAM=1, TOTAL_MARKS=2, PASSING_MARKS=3, DURATION=4, SECTION=5, MARKS=6, 
		QUESTIONS=7, NUMBER=8, STRING=9, NEWLINE=10, WS=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"EXAM", "TOTAL_MARKS", "PASSING_MARKS", "DURATION", "SECTION", "MARKS", 
			"QUESTIONS", "NUMBER", "STRING", "NEWLINE", "WS"
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


	    int totalMarks;
	    int passingMarks;
	    int duration;
	    String examName;
	    HashMap<String, Integer> sectionMarks = new HashMap<>();


	public createExamLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "createExam.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u000b\u009d\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0005\u0000\u001f\b\u0000\n\u0000\f\u0000\"\t\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u00011\b\u0001\n\u0001\f\u00014\t\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002E\b\u0002\n\u0002\f\u0002H\t\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"V\b\u0003\n\u0003\f\u0003Y\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004e\b\u0004\n\u0004\f\u0004h\t\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005r\b\u0005\n\u0005\f\u0005u\t\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"\u0083\b\u0006\n\u0006\f\u0006\u0086\t\u0006\u0001\u0007\u0004\u0007\u0089"+
		"\b\u0007\u000b\u0007\f\u0007\u008a\u0001\b\u0004\b\u008e\b\b\u000b\b\f"+
		"\b\u008f\u0001\t\u0003\t\u0093\b\t\u0001\t\u0001\t\u0001\n\u0004\n\u0098"+
		"\b\n\u000b\n\f\n\u0099\u0001\n\u0001\n\u0000\u0000\u000b\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0001\u0000\u0003\u0001\u000009\u0005\u0000,.0"+
		";??AZaz\u0003\u0000\t\t\r\r  \u00a7\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0001\u0017"+
		"\u0001\u0000\u0000\u0000\u0003#\u0001\u0000\u0000\u0000\u00055\u0001\u0000"+
		"\u0000\u0000\u0007I\u0001\u0000\u0000\u0000\tZ\u0001\u0000\u0000\u0000"+
		"\u000bi\u0001\u0000\u0000\u0000\rv\u0001\u0000\u0000\u0000\u000f\u0088"+
		"\u0001\u0000\u0000\u0000\u0011\u008d\u0001\u0000\u0000\u0000\u0013\u0092"+
		"\u0001\u0000\u0000\u0000\u0015\u0097\u0001\u0000\u0000\u0000\u0017\u0018"+
		"\u0005E\u0000\u0000\u0018\u0019\u0005x\u0000\u0000\u0019\u001a\u0005a"+
		"\u0000\u0000\u001a\u001b\u0005m\u0000\u0000\u001b\u001c\u0005:\u0000\u0000"+
		"\u001c \u0001\u0000\u0000\u0000\u001d\u001f\u0003\u0013\t\u0000\u001e"+
		"\u001d\u0001\u0000\u0000\u0000\u001f\"\u0001\u0000\u0000\u0000 \u001e"+
		"\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000!\u0002\u0001\u0000"+
		"\u0000\u0000\" \u0001\u0000\u0000\u0000#$\u0005T\u0000\u0000$%\u0005o"+
		"\u0000\u0000%&\u0005t\u0000\u0000&\'\u0005a\u0000\u0000\'(\u0005l\u0000"+
		"\u0000()\u0005M\u0000\u0000)*\u0005a\u0000\u0000*+\u0005r\u0000\u0000"+
		"+,\u0005k\u0000\u0000,-\u0005s\u0000\u0000-.\u0005:\u0000\u0000.2\u0001"+
		"\u0000\u0000\u0000/1\u0003\u0013\t\u00000/\u0001\u0000\u0000\u000014\u0001"+
		"\u0000\u0000\u000020\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u0000"+
		"3\u0004\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u000056\u0005P\u0000"+
		"\u000067\u0005a\u0000\u000078\u0005s\u0000\u000089\u0005s\u0000\u0000"+
		"9:\u0005i\u0000\u0000:;\u0005n\u0000\u0000;<\u0005g\u0000\u0000<=\u0005"+
		"M\u0000\u0000=>\u0005a\u0000\u0000>?\u0005r\u0000\u0000?@\u0005k\u0000"+
		"\u0000@A\u0005s\u0000\u0000AB\u0005:\u0000\u0000BF\u0001\u0000\u0000\u0000"+
		"CE\u0003\u0013\t\u0000DC\u0001\u0000\u0000\u0000EH\u0001\u0000\u0000\u0000"+
		"FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000G\u0006\u0001\u0000"+
		"\u0000\u0000HF\u0001\u0000\u0000\u0000IJ\u0005D\u0000\u0000JK\u0005u\u0000"+
		"\u0000KL\u0005r\u0000\u0000LM\u0005a\u0000\u0000MN\u0005t\u0000\u0000"+
		"NO\u0005i\u0000\u0000OP\u0005o\u0000\u0000PQ\u0005n\u0000\u0000QR\u0005"+
		":\u0000\u0000RS\u0005 \u0000\u0000SW\u0001\u0000\u0000\u0000TV\u0003\u0013"+
		"\t\u0000UT\u0001\u0000\u0000\u0000VY\u0001\u0000\u0000\u0000WU\u0001\u0000"+
		"\u0000\u0000WX\u0001\u0000\u0000\u0000X\b\u0001\u0000\u0000\u0000YW\u0001"+
		"\u0000\u0000\u0000Z[\u0005S\u0000\u0000[\\\u0005e\u0000\u0000\\]\u0005"+
		"c\u0000\u0000]^\u0005t\u0000\u0000^_\u0005i\u0000\u0000_`\u0005o\u0000"+
		"\u0000`a\u0005n\u0000\u0000ab\u0005:\u0000\u0000bf\u0001\u0000\u0000\u0000"+
		"ce\u0003\u0013\t\u0000dc\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000\u0000"+
		"fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000g\n\u0001\u0000\u0000"+
		"\u0000hf\u0001\u0000\u0000\u0000ij\u0005M\u0000\u0000jk\u0005a\u0000\u0000"+
		"kl\u0005r\u0000\u0000lm\u0005k\u0000\u0000mn\u0005s\u0000\u0000no\u0005"+
		":\u0000\u0000os\u0001\u0000\u0000\u0000pr\u0003\u0013\t\u0000qp\u0001"+
		"\u0000\u0000\u0000ru\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000"+
		"st\u0001\u0000\u0000\u0000t\f\u0001\u0000\u0000\u0000us\u0001\u0000\u0000"+
		"\u0000vw\u0005Q\u0000\u0000wx\u0005u\u0000\u0000xy\u0005e\u0000\u0000"+
		"yz\u0005s\u0000\u0000z{\u0005t\u0000\u0000{|\u0005i\u0000\u0000|}\u0005"+
		"o\u0000\u0000}~\u0005n\u0000\u0000~\u007f\u0005s\u0000\u0000\u007f\u0080"+
		"\u0005:\u0000\u0000\u0080\u0084\u0001\u0000\u0000\u0000\u0081\u0083\u0003"+
		"\u0013\t\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u0086\u0001\u0000"+
		"\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000"+
		"\u0000\u0000\u0085\u000e\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000"+
		"\u0000\u0000\u0087\u0089\u0007\u0000\u0000\u0000\u0088\u0087\u0001\u0000"+
		"\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000"+
		"\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u0010\u0001\u0000"+
		"\u0000\u0000\u008c\u008e\u0007\u0001\u0000\u0000\u008d\u008c\u0001\u0000"+
		"\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000"+
		"\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0012\u0001\u0000"+
		"\u0000\u0000\u0091\u0093\u0005\r\u0000\u0000\u0092\u0091\u0001\u0000\u0000"+
		"\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000"+
		"\u0000\u0094\u0095\u0005\n\u0000\u0000\u0095\u0014\u0001\u0000\u0000\u0000"+
		"\u0096\u0098\u0007\u0002\u0000\u0000\u0097\u0096\u0001\u0000\u0000\u0000"+
		"\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000"+
		"\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000"+
		"\u009b\u009c\u0006\n\u0000\u0000\u009c\u0016\u0001\u0000\u0000\u0000\f"+
		"\u0000 2FWfs\u0084\u008a\u008f\u0092\u0099\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}