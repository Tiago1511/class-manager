%{
#include "question.tab.h"
%}

%%

"Matching"                { return MATCHING; }
"Multiple Choice"         { return MULTIPLE_CHOICE; }
"Single Answer"           { return SINGLE_ANSWER; }
"Multiple Answers"        { return MULTIPLE_ANSWERS; }
"Short Answer"            { return SHORT_ANSWER; }
"Numerical"               { return NUMERICAL; }
"Select Missing Words"    { return SELECT_MISSING_WORDS; }
"True/False"              { return TRUE_FALSE; }
"-"                       { return DASH; }
":"                       { return COLON; }
"Sub-questions:"          { return SUB_QUESTIONS; }
"Answers:"                { return ANSWERS; }
"Possible Answers:"       { return POSSIBLE_ANSWERS; }
"Accepted Range:"         { return ACCEPTED_RANGE; }
"Group"                   { return GROUP; }
"Item"                    { return ITEM; }
".."                      { return RANGE_SEPARATOR; }
[0-9]+                    { yylval.int_val = atoi(yytext); return NUMBER; }
[a-zA-Z0-9.,?!'"()\-_+=*#@&%$/:;\[\]{}<>]+   { yylval.str_val = strdup(yytext); return TEXT; }
\r?[\n]                   { /* ignore newlines */ }
.                         { /* ignore other characters */ }

%%

int yywrap() {
    return 1;
}