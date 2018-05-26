
package ex4;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
       int peso;
       double alt;
       double imc;
       Scanner s = new Scanner(System.in);
            System.out.print("Digite peso: ");
        peso = s.nextInt();
            System.out.print("Digite Altura: ");
        alt = s.nextDouble();
        imc = peso/(alt*alt);
            if(imc < 20){
                System.out.println("ABAIXO");
            }
            if( imc >= 20 && imc <25 ){
                System.out.println("NORMAL");
            }
            if( imc >= 26 && imc <= 30 ){
                System.out.println("SOBRE PESO");
            }
            if( imc >= 30 && imc <= 40 ){
                System.out.println("OBESO");
            if( imc > 40){
                System.out.println("OBESO MORBIDO");
        }
 
        }
    }
}
