%{
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int yylex();
void yyerror(const char*);

int totalMarks, passingMarks, duration;
char* examName;

%}

%union {
    int num;
    char* str;
}

%token <num> NUMBER
%token <str> STRING
%token EXAM TOTAL_MARKS PASSING_MARKS DURATION SECTION MARKS QUESTIONS EOL

%type <str> exam_name section_name
%type <num> section_marks question_block question answer_block answer

%%

automaticExam: EXAM exam_name TOTAL_MARKS NUMBER PASSING_MARKS NUMBER DURATION NUMBER section

exam_name: STRING {
    examName = $1;
}

section: SECTION section_name MARKS NUMBER QUESTIONS question_block

section_name: STRING

question_block: question_block EOL question
              | question

question: NUMBER STRING answer_block

answer_block: answer_block EOL answer
            | answer

answer: STRING

%%

void yyerror(const char* s) {
    fprintf(stderr, "Error: %s\n", s);
}

int main() {
    yyparse();
    printf("Exam Name: %s\n", examName);
    printf("Total Marks: %d\n", totalMarks);
    printf("Passing Marks: %d\n", passingMarks);
    printf("Duration: %d\n", duration);
    return 0;
}

//The parser will process the input and print the extracted information, including the automaticExam name, total marks, passing marks, and duration.
// You can modify the input file or the parser to add additional functionality or extract more information as needed.
