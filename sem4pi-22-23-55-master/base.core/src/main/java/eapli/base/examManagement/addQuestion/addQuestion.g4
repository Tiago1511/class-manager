grammar addQuestion;

start: addQuestion EOF;

addQuestion: 'Type: ' questionContent;

//tipos de questoes

questionContent:  correspondencia |  escolhaMultipla |  respostaCurta |  verdadeiroOuFalso |  palavrasEmFalta | numerica;

//correspondencia

correspondencia: 'correspondencia' NEWLINE+ 'Question: ' TEXT+ NEWLINE+ 'Option:' NEWLINE+ correspondenciaOptions solution;

correspondenciaOptions: correspondenciaOption (correspondenciaOption)*;

correspondenciaOption: TEXT '->' TEXT NEWLINE+ ;

//resposgtacurta

respostaCurta: RESPOSTA_CURTA NEWLINE+ 'Question: ' TEXT+ NEWLINE+ solution;

//verdadeiro ou falso

verdadeiroOuFalso: VERDADEIRO_OU_FALSO NEWLINE+ 'Question: ' TEXT+ NEWLINE+ solutionVerdadeiroFalso;

//escolhas multiplas

escolhaMultipla: ESCOLHA_MULTIPLA NEWLINE+ 'Question: ' TEXT+ NEWLINE+ 'Option:' NEWLINE+ optionsMultplas solotionMultipla;

optionsMultplas: optionsMultpla (optionsMultpla)*;

optionsMultpla:  TEXT '->' TEXT+ NEWLINE+;

//palavras em falta

palavrasEmFalta: PALAVRAS_EM_FALTA NEWLINE+ 'Question: ' TEXT+ NEWLINE+ 'Text: ' TEXT+ NEWLINE+ 'Missing Words: ' palavrasEmFaltaOptions NEWLINE+ solution;

palavrasEmFaltaOptions: palavrasEmFaltaOption (',' palavrasEmFaltaOption)*;

palavrasEmFaltaOption: TEXT+ ;


// numerica

numerica: 'Numeric' NEWLINE+ 'Question: ' TEXT+ NEWLINE+ solution NEWLINE+;

solution: 'Solution: ' TEXT+;
solutionVerdadeiroFalso: 'Solution: ' TEXTTF;
solotionMultipla: 'Solution: ' TEXT;

TEXTTF: 'True'| 'False' | 'T' | 'F';
TEXT: ' '* [a-zA-Z0-9,?.:;-]+ ' '* '+'*;
TEXTMULTIPLA: ' '* [a-zA-Z] ' '*;



//CORRESPONDENCIA: 'correspondencia';
ESCOLHA_MULTIPLA: 'Escolha Multipla';
RESPOSTA_CURTA: 'Resposta Curta';
VERDADEIRO_OU_FALSO: 'Verdadeiro ou Falso';
PALAVRAS_EM_FALTA: 'Palavras em Falta';

NEWLINE:'\r'?'\n' ;
WS: [ \t\r\n]+ -> skip;


