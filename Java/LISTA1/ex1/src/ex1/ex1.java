
package ex1;

import java.util.Scanner;

public class ex1 {

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        double q1 = 0, q2 = 0, q3 = 0;
        double res;
        int q = 0, i = 0;

        do{
        System.out.println();
        System.out.println("1:Coca 350ml");
        System.out.println("2:Coca 600ml");
        System.out.println("3:Coca 2l");
        System.out.println("4:Exit");
        System.out.print("Digite o produto: ");
        i = s.nextInt();
        System.out.print("Digite a quantidade: ");
        q = s.nextInt();

        switch(i){

            case 1:
            q1 = q * 0.350;
            break;
            case 2:
            q2 = q * 0.600; 
            break;
            case 3:
            q3 = q * 2;
            break;
     }
        res= q1+q2+q3;
        System.out.println("O total é: " + res );
        
     }while (i != 4);
 }   
}
