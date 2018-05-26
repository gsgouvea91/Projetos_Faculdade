
package ex2;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     double peso = 0;
     double val = 0 ;
     
      System.out.print("Entre com o peso: ");
      peso = s.nextDouble();
      
      val = 12 * peso;
              
      System.out.println("O valor total é R$"+ val);
    
    }
    
}
