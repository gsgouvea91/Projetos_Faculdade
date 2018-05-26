
package ex8;

import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {
        int num = 0, num1 = 0;
        double [][] matriz = new double [num][num];
        Scanner s = new Scanner(System.in);
             System.out.print("NUMERO: ");
        num = s.nextInt();
             System.out.print("NUMERO: ");
        num1 = s.nextInt();
        if (num ==  num1){
        for (int i=0; i<num; i++)
            {
            for(int j=0; j<=num1; j++){
                if (i == j){
                System.out.print("1");
                } else if (i != j){
                System.out.print("0");
                }
            }
            System.out.println("");
            }
        } else{
        System.out.print("numeros diferentes");
        }   
    } 
}
