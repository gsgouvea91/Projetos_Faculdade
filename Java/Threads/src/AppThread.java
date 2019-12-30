/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @ Marcos
 */
//Classe Thread já é uma classe fornecida pelo Java
public class AppThread extends Thread {

   private String termina; //para determinar qual Thread termina de contar primeiro

   public AppThread(){ //método construtor
       termina=" ";
   }

    public String getTermina() { //get e set
        return termina;
    }

    public void setTermina(String termina) {
        this.termina = termina;
    }

   public void run(){ //método RUN -> toda lógica de execução da Thread
       for (int i=1; i<=1000000; i++){
          System.out.println(getTermina()+i);
       }
          System.out.println ();
          System.out.println ();
          System.out.println ("-------"+getTermina()+"------");
          System.out.println ();
          System.out.println ();
   }

   public static void main (String args[]){ //método principal
	   
       AppThread a = new AppThread(); //criando novo objeto Thread
       a.setTermina("A"); //nomeando Thread "A"
       AppThread b = new AppThread();
       b.setTermina("B");
       AppThread c = new AppThread();
       c.setTermina("C");
       
       //iniciando as 3 Threads
       a.start();
       b.start();
       c.start();

   }
}




