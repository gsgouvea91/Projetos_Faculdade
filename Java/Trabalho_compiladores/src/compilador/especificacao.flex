//NOME_VARIAVEL,INT,DEC,COMENTARIO,BRANCO,PALAVRA_CHAVE,ERRO
package compilador;
import static compilador.Token.*;
%%
%{
    private void imprimir (String token,String lexema){
            System.out.println(lexema +" ===>> " + token);
    }
%}
%class Lexer
%type Token
nomeVariavel = [0-9]+
inteiro = [_a-zA-Z][_zA-z0-9]*
decimal = [0-1]+["."]+[0-1]+
blocoComentario = "/*" ~"*/"
branco = [\t|\n|\r]+
linhaComentario = [branco]*"//" .*
palavraChave = "se" | "classe" | "inteiro" | "enquanto" | "para" | "faca" | "decimal"
%%


{palavraChave}              { imprimir("PALAVRA CHAVE :  ", yytext()); return PALAVRA_CHAVE; }
{nomeVariavel}              { imprimir("VARIAVEL :  ", yytext()); return NOME_VARIAVEL; }
{inteiro}                   { imprimir("NUMERO INTEIRO :  ", yytext()); return INT; }
{decimal}                   { imprimir("NUMERO DECIMAL :  ", yytext()); return DEC; }
{blocoComentario}           { imprimir("COMENTARIO :  ", yytext()); return COMENTARIO; }
{linhaComentario}           { imprimir("COMENTARIO :  ", yytext()); return COMENTARIO; }
{branco}                    { return BRANCO; }
.           { imprimir ("<<< CARACTER INVALIDO! >>>  ", yytext()); return   ERROR; }
<<EOF>>     { return null; }

   
