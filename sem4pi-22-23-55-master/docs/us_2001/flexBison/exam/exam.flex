%{
#include "automaticExam.tab.h"
%}

%%

"Exam:" { return EXAM; }
"TotalMarks:" { return TOTAL_MARKS; }
"PassingMarks:" { return PASSING_MARKS; }
"Duration:" { return DURATION; }
"Section:" { return SECTION; }
"Marks:" { return MARKS; }
"Questions:" { return QUESTIONS; }
[0-9]+ { yylval.num = atoi(yytext); return NUMBER; }
[a-zA-Z0-9 ]+ { yylval.str = strdup(yytext); return STRING; }
\n { return EOL; }
. { return yytext[0]; }

%%

int yywrap() {
return 1;
}