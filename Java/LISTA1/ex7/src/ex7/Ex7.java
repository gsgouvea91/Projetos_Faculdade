/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex7;

import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args) {
        int num = 0, num2 = 0;
        Scanner s = new Scanner(System.in);
            System.out.print("NUMERO: ");
        num = s.nextInt();
            for (int i=0; i<num; i++){
                for(int i1=i; i1<=num+i; i1++){
                    System.out.print(i1);
                }
                System.out.println("");
            }
        }
    
}
