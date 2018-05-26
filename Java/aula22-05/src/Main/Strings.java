/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author professor
 */
public class Strings {
       
    
private int vogal;
private int consoante;
private int Frases;
private int Paragrafo;
private int Palavras;
private int silabas;

    public void quantVogal(String palavra){

        palavra.toLowerCase();
        
        for(int i=0;i< palavra.length();i++){
            char c = palavra.charAt(i);
            if(c == 'a'|| c == 'e'||c == 'i'|| c == 'o'|| c == 'u'){
               this.vogal++;
            }
        }
         System.out.println("Vogal:"+vogal);
    }
    
    
     public void quantCons(String palavra){

        palavra.toLowerCase();
        
        for(int i=0;i< palavra.length();i++){
        char c = palavra.charAt(i);    
            if(c != 'a'&& c != 'e' && c != 'i' && c != 'o' && c != 'u'){
               this.consoante++;
            }
        }
         System.out.println("Cons:"+consoante);
    }
    
     public void quantFrases(String palavra){

        for(int i=0;i< palavra.length();i++){
        char c = palavra.charAt(i);    
            if(c == ','|| c == '.'){
               this.Frases++;
            }
         
        }
        System.out.println("Frases:"+Frases);
    }
     
    public void quantParagrafo(String palavra){
        
        for(int i=0;i< palavra.length();i++){
        char c = palavra.charAt(i);   
            if(c == '\n'){
               this.Paragrafo++;
            }
        }
        System.out.println("Paragrafos:"+Paragrafo);
    }
    
    public void quantPalavras(String palavra){
  
         if(palavra.length()>0){
               this.Palavras++;
            }
        for(int i=0;i< palavra.length()-1;i++){  
            char c = palavra.charAt(i);
            if(c == ' ' && c+1 != ' '){
               this.Palavras++;
            }
        }
        System.out.println("Palavras:"+Palavras);
    }
    
    public void quantSilabas(String palavra){
        
        for(int i=0;i< palavra.length()-1;i++){  
            char c = palavra.charAt(i);
            if(c!=' '){
                if(c == 'a'|| c == 'e'||c == 'i'|| c == 'o'|| c == 'u' && c+1 != ' ' && c+1 != 'a' && c+1 != 'e' && c+1 != 'i' && c+1 != 'o'){
                    this.silabas++;
                }
            }
        }
        System.out.println("Silabas:"+silabas);
    }
    
}
