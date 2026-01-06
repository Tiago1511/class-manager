%{
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

enum {
    MATCHING,
    MULTIPLE_CHOICE,
    SINGLE_ANSWER,
    MULTIPLE_ANSWERS,
    SHORT_ANSWER,
    NUMERICAL,
    SELECT_MISSING_WORDS,
    TRUE_FALSE,
    DASH,
    COLON,
    SUB_QUESTIONS,
    ANSWERS,
    POSSIBLE_ANSWERS,
    ACCEPTED_RANGE,
    GROUP,
    ITEM,
    RANGE_SEPARATOR,
    NUMBER,
    TEXT
};

extern int yylex();
extern int yyparse();
extern int yylineno;
extern char* yytext;
extern FILE* yyin;

typedef struct {
    int type;
    char* text;
    int number;
} Question;

Question* current_question;

int yyerror(const char* s) {
    fprintf(stderr, "Syntax error at line %d: %s\n", yylineno, s);
    return 0;
}

void print_question(Question* q) {
    printf("Question Type: %d\n", q->type);
    printf("Question Text: %s\n", q->text);
    printf("Question Number: %d\n", q->number);
}

int main(int argc, char** argv) {
    if (argc != 2) {
        fprintf(stderr, "Usage: %s input_file\n", argv[0]);
        return 1;
    }

    FILE* file = fopen(argv[1], "r");
    if (!file) {
        fprintf(stderr, "Failed to open input file.\n");
        return 1;
    }

    yyin = file;

    yyparse();

    fclose(file);
    return 0;
}
%}

%union {
    int int_val;
    char* str_val;
}

%token <int_val> NUMBER
%token <str_val> TEXT
%token MATCHING MULTIPLE_CHOICE SINGLE_ANSWER MULTIPLE_ANSWERS SHORT_ANSWER NUMERICAL SELECT_MISSING_WORDS TRUE_FALSE DASH COLON SUB_QUESTIONS ANSWERS POSSIBLE_ANSWERS ACCEPTED_RANGE GROUP ITEM RANGE_SEPARATOR

%%
automaticExam: question { print_question($1); }

question: matching_question { $$ = $1; }
        | multiple_choice_question { $$ = $1; }
        | short_answer_question { $$ = $1; }
        | numerical_question { $$ = $1; }
        | select_missing_words_question { $$ = $1; }
        | true_false_question { $$ = $1; }

matching_question: MATCHING DASH sub_questions answers { $$ = create_question(MATCHING, $3, $4); }
sub_questions: SUB_QUESTIONS colon sub_question_item { $$ = $3; }
sub_question_item: NUMBER DASH TEXT { /* handle sub-question item */ }

answers: ANSWERS colon answer_item { $$ = $3; }
answer_item: NUMBER DASH TEXT { /* handle answer item */ }

multiple_choice_question: MULTIPLE_CHOICE DASH (single_answer_question | multiple_answer_question) { /* handle multiple choice question */ }
single_answer_question: SINGLE_ANSWER DASH question_text answers { /* handle single answer question */ }
multiple_answer_question: MULTIPLE_ANSWERS DASH question_text answers { /* handle multiple answer question */ }
question_text: TEXT { /* handle question text */ }

short_answer_question: SHORT_ANSWER DASH question_text possible_answers { /* handle short answer question */ }
possible_answers: POSSIBLE_ANSWERS colon answer_item { $$ = $3; }