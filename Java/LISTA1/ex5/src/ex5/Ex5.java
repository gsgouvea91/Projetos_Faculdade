
package ex5;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i, i1 = 1, res = 0, H = 0;
            System.out.print("Limite: ");
            H = s.nextInt();
                for(i=0;i<H;i++){
                    res = res + (i+1);
                    //System.out.println("RES: "+ res + " = " + res + " + (" + (i+1)+ ")" );
                }
        System.out.println(res);
    }
}
