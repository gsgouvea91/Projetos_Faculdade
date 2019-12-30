/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marcos
 */
public class ThreadA extends Thread {

   public ThreadA(){ //método construtor
   }
   
   public String NomeProcesso;
   public void run(){ //método RUN -> toda lógica de execução da Thread
       for (int i=1; i<=1000000; i++){
          System.out.println("Programa "+ NomeProcesso + "valor: "+ i);
       }
   }

   public static void main (String args[]){ //método principal

       ThreadA a = new ThreadA(); //criando novo objeto Thread

       //iniciando a Thread
       System.out.println("Thread A: ");
       a.start();
    }
}

