grammar AutomaticFormativeExam;

start: section EOF;

section: SECTION section_name MARKS section_marks QUESTIONS question_block;

section_name: text;//  {System.out.println("Section: %s",$STRING.text);};

section_marks: NUMBER NEWLINE*;// {sectionMarks.put(section_name.getText(), $NUMBER);};

question_block: question+ NEWLINE*;

question:  text answer_block ;// { System.out.println("Question %d.: %s",$NUMBER,$STRING.text); };

answer_block : answer+;


answer :text
|text NUMBER NEWLINE*; //{ System.out.println("Answer: %s", $STRING.text); };

text: STRING NEWLINE*
| text STRING+ NEWLINE*;

SECTION: 'Section:';
MARKS: 'Marks:' ;
NUMBER: [0-9]+ ;
STRING: [a-zA-Z0-9,?.:;-]+;
NEWLINE:'\r'?'\n' ;
QUESTIONS: 'Questions:'NEWLINE*;

WS: [ \t\r]+ -> skip;