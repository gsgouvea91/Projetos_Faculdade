/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppThread;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marcos
 */
public class ThreadC extends Thread {
 
   public ThreadC(){ //método construtor
   }

   public void run(){ //método RUN -> toda lógica de execução da Thread
       for (int i=1; i<=1000000; i++){
          System.out.println(i);
       }
   }

   public static void main (String args[]){ //método principal

       ThreadC c = new ThreadC(); //criando novo objeto Thread

       //iniciando a Thread
       System.out.println("Thread C: ");
       c.start();
    }
}