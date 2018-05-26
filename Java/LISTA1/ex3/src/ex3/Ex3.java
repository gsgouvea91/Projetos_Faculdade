package ex3;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        int id =0 ;
        Scanner s = new Scanner(System.in);
            System.out.print("Digite a idade: ");
        id = s.nextInt();
            if( id < 7){
                System.out.println("INFANTIL A");
            }
            if( id >= 8 && id <= 11 ){
                System.out.println("INFANTIL B");
            }
            if( id == 12 || id == 13 ){
                System.out.println("JUVENIL A");
            }
            if( id >= 14 && id <= 17 ){
                System.out.println("JUVENIL B");
            }
            if( id > 18 ){
                System.out.println("ADULTO");
            }
    } 
}
