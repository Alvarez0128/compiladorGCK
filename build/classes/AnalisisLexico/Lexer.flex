
package AnalisisLexico;
import static AnalisisLexico.Tokens.*;

%%

%class Lexer
%type Tokens
L=[A-Za-z]+
D=[0-9]+
espacio=[ \t\r]+
%{
    public String lexeme;
    public int linea=1;
%}

%%
((i)(n)(t)) | ((f)(l)(o)(a)(t))|
((c)(o)(n)(s)(t)) | ((c)(h)(a)(r))|
((S)(t)(r)(i)(n)(g)) | ((b)(o)(o)(l))|
((A)(r)(r)(a)(y)) | ((C)(o)(l)(o)(r)) |
((R)(e)(c)(t)(2)) |((D)(i)(c)(t)(i)(o)(n)(a)(r)(y))|
((e)(x)(t)(e)(n)(d)(s))|((V)(e)(c)(t)(o)(r)(2))|
((F)(i)(l)(e))|((r)(e)(t)(u)(r)(n))|
((n)(e)(w))|((A)(A)(B)(B))|((T)(i)(m)(e)(S)(p)(a)(n))|
((R)(e)(s)(o)(u)(r)(c)(e))|((O)(b)(j)(e)(c)(t))|
((S)(t)(a)(r)(t))|((S)(c)(e)(n)(e)(T)(r)(e)(e))|
((P)(h)(y)(s)(i)(c)(s)(S)(h)(a)(p)(e))|((c)(l)(a)(s)(s))|
((v)(o)(i)(d))|((p)(r)(i)(n)(t))|
((P)(h)(y)(s)(i)(c)(s)(B)(o)(d)(y))|((f)(u)(n)(c))|
((E)(r)(r)(o)(r))|((f)(o)(r))|
((w)(h)(i)(l)(e))|((i)(f))|
((e)(l)(i)(f))|((e)(l)(s)(e))|((b)(r)(e)(a)(k)) {lexeme=yytext(); return Reservada;}
{espacio}                     {/*Ignore*/}
"//".*                        {/*Ignore*/}
"="                           {lexeme=yytext(); return OpAsignacion;}
"+="                          {lexeme=yytext(); return OpAsignacion;}
"-="                          {lexeme=yytext(); return OpAsignacion;}
"%="                          {lexeme=yytext(); return OpAsignacion;}
"*="                          {lexeme=yytext(); return OpAsignacion;}
"/="                          {lexeme=yytext(); return OpAsignacion;}
"!="                          {lexeme=yytext(); return OpComparacion;}
"=="                          {lexeme=yytext(); return OpComparacion;}
">="                          {lexeme=yytext(); return OpComparacion;}
"<="                          {lexeme=yytext(); return OpComparacion;}
"<"                           {lexeme=yytext(); return OpComparacion;}
">"                           {lexeme=yytext(); return OpComparacion;}
"+"                           {lexeme=yytext(); return OpAritmetico;}
"*"                           {lexeme=yytext(); return OpAritmetico;}
"/"                           {lexeme=yytext(); return OpAritmetico;}
"-"                           {lexeme=yytext(); return OpAritmetico;}
"%"                           {lexeme=yytext(); return OpAritmetico;}
"{"                           {lexeme=yytext(); return OpAgrupacion;}
"}"                           {lexeme=yytext(); return OpAgrupacion;}
"]"                           {lexeme=yytext(); return OpAgrupacion;}
"["                           {lexeme=yytext(); return OpAgrupacion;}
"("                           {lexeme=yytext(); return OpAgrupacion;}
")"                           {lexeme=yytext(); return OpAgrupacion;}
"&&"                          {lexeme=yytext(); return OpLogico;}
"||"                          {lexeme=yytext(); return OpLogico;}
"!"                           {lexeme=yytext(); return OpLogico;}
"\."                          {lexeme=yytext(); return OpAccesoMiembros;}
\n                            {linea++;}
{L}({L}|{D})*                 {lexeme=yytext(); return Identificador;}
[-+]?{D}+                     {lexeme=yytext(); return NumEntero;}
[-+]?{D}+(\.{D}+)             {lexeme=yytext(); return NumFlotante;}

 .                            {return ERROR1;}
{D}({L})+({D})*               {lexeme=yytext();return ERROR2;}
//({D}|{L}).*({D}|{L})* {lexeme=yytext();return ERROR2;}
