/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

public class Perguntas {
    
   private boolean check;
   private int questaoNumero;
   private int numeroDePerguntas;
   private String questao;
   private String resposta;
   
   public Perguntas(){
   }
  
    public boolean isCheck() { return check; }
    public String getPergunta() { return getQuestao(); }
    public String getDescricao() { return resposta; }
    public int getQuestaoNumero() { return questaoNumero; }
    public void setQuestaoNumero(int questaoNumero) { this.questaoNumero = questaoNumero; }
    public String getQuestao() { return questao; }
    public void setQuestao(String questao) { this.questao = questao; }
    //public void setCheck(boolean check) { this.check = check; }
    //public void setDescricao(String resposta) { this.resposta = resposta; }
    
    public void perguntar(){
       Scanner scan = new Scanner(System.in);
       
       System.out.print(getQuestao()+" S/N: ");
       String choice = scan.nextLine();
       
       if ("S".equals(choice)|| "s".equals(choice)){
           this.check = true;
           System.out.print("Quais?/Quantos?/Quando?/Há quanto Tempo?: ");
           this.resposta = scan.nextLine();
       } else  if ("N".equals(choice) || "n".equals(choice)){
           this.check = false;
       } else {
          perguntar();
       }
    }  
}

