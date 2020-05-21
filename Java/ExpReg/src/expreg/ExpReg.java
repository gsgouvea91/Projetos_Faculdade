/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expreg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Gustavo
 */
public class ExpReg {

    public String verificaAceitaCaracteresAaZe0a9Acentos(String string) 
    {
        String saida = "";
        Pattern pattern = Pattern.compile("[áàéèíìóòúùãç qwertyuiopasdfghjklzxcvbnm QWERTYÇUIOPASDFGHJKLZXCVBNM 0123456789]");
        Matcher matcher = pattern.matcher(string);
            while (matcher.find()) {
                saida += matcher.group();
                System.out.println(saida);
            }
            return saida;
    }
    public static void main(String[] args) {
        
        ExpReg e = new ExpReg();
        
        e.verificaAceitaCaracteresAaZe0a9Acentos("escaganifobético");
    }
    
}
