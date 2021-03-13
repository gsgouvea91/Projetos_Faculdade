/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compilador;
import java.io.*;

/**
 *
 * @author Gustavo
 */
public class Main {
    public static void main(String[] args) throws IOException {
        
        String arq ="C:/temp/teste.txt";
        BufferedReader in = new BufferedReader(new FileReader(arq));
        Lexer analise = new Lexer(in);
        while (true){
            Token token = analise.yylex();
            if (token==null) break;
      
        }   
    }
}
    
