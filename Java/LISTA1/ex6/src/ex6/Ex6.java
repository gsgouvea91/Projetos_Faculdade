
package ex6;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        int num =0;
        Scanner s = new Scanner(System.in);
            System.out.print("NUMERO: ");
        num = s.nextInt();
            if (num % 2 == 0){
                System.out.println("PAR");  
            }else{
                System.out.println("IMPAR");   
            }  
    }
}
