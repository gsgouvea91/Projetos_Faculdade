
package ex9;

import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {
        int num =0;
        Scanner s = new Scanner(System.in);
            System.out.print("NUMERO: ");
        num = s.nextInt();
            for (int i=0; i<=num; i++)
                {
                    if(i%3==0 || i%5==0){
                    System.out.println(i);
                    } 
                }  
    }
}
