grammar createExam;

start: automaticExam EOF ;

automaticExam: EXAM exam_name CODE code_name TOTAL_MARKS total_marks PASSING_MARKS passing_marks DURATION duration_ section+;

exam_name: STRING+ NEWLINE*;

code_name: STRING+ NEWLINE*;

total_marks: NUMBER NEWLINE*;

passing_marks: NUMBER NEWLINE*;

duration_: NUMBER NEWLINE* STRING+ NEWLINE*;

text: STRING
| text  STRING+;

section: SECTION section_name MARKS section_marks QUESTIONS question_section+;


question_section: mc_question_block|tf_question_block|ta_question_block;

section_name: text NEWLINE*;

section_marks: NUMBER NEWLINE*;

mc_question_block: QUESTION_TYPE MULTIPLE_CHOICE MARKS NUMBER NEWLINE* mc_question+ NEWLINE*;

tf_question_block:  QUESTION_TYPE BOOLEAN MARKS NUMBER NEWLINE* tf_question+ NEWLINE*;

ta_question_block:  QUESTION_TYPE TEXT_ANSWER MARKS NUMBER NEWLINE* ta_question+ NEWLINE*;



mc_question:  text NEWLINE* mc_answer_block CORRECT_ANSWER text NEWLINE*;

mc_answer_block : mc_answer+;

mc_answer :text NEWLINE*
|text NUMBER NEWLINE*;


tf_question: text NEWLINE* CORRECT_ANSWER text NEWLINE*;

ta_question: text NEWLINE* CORRECT_ANSWER text NEWLINE*;



EXAM: 'Exam: ' NEWLINE*;
CODE: 'Code: ' NEWLINE*;
TOTAL_MARKS: 'TotalMarks: ' NEWLINE*;
PASSING_MARKS: 'PassingMarks: ' NEWLINE*;
DURATION: 'Duration: ' NEWLINE*;
SECTION: 'Section: ' NEWLINE*;
MARKS: 'Marks: ' NEWLINE*;
QUESTIONS: 'Questions:'NEWLINE*;
QUESTION_TYPE: 'Question Type: 'NEWLINE*;
MULTIPLE_CHOICE: 'Multiple Choice'NEWLINE*;
BOOLEAN: 'Boolean' NEWLINE*;
//TRUE_FALSE: 'True Or False'|'True or False'NEWLINE*;
TEXT_ANSWER: 'Text Answer'NEWLINE*;

CORRECT_ANSWER:'Correct Answer:'NEWLINE*;

//QUESTION: [1-9]'. 'STRING+;
//ANSWER: [a-d]'. 'STRING+ NEWLINE*;

NUMBER: [0-9]+ ;
STRING: [a-zA-Z0-9,?.:;-]+;
//TEXT: SPACE* STRING SPACE*;
//SPACE: [ ];
//NEWLINE : [ \t\n]+ ;
NEWLINE:'\r'?'\n' ;


WS: [ \t\r]+ -> skip;