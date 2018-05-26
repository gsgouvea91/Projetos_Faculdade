/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;
import java.util.Scanner;

public class Binario {
   Scanner s = new Scanner(System.in);
   private double num;
   private String[] bin = new String[8];
   private int res;
   public Binario(){
   }
   
  public void conversorBin(double num1){
      this.num = num1;
      if(num > 255){
          System.out.println("Numero Maior que 8 bits");
      } else {
          for (int i=0; i<8; i++)
          {
              res = (int) num;
              
              if (res%2==0){
                  //System.out.println("0 "+ num);
                  bin[i]="0";   
                  num = num/2; 
              } 
              if (res%2 >0) {
                  //System.out.println("1 "+ num);
                  bin[i]="1";
                  num=num/2;
              }   
                   System.out.print(bin[i]); 
          }
          
          }   
      }
 public int ConversonNum(){
     int i1=0;
     for (int i=0;i<8;i++){
            System.out.print("Insira valor da posicao "+ i +":");
            bin[i]= s.nextLine();
            if ("1".equals(bin[i])){
            res = (int) (res + (Math.pow(2,i1))); 
            System.out.println(res);
            }
            i1++;
        }  
        return res;
 }
 
        public static void main (String[] args){
            Binario b = new Binario();
            b.conversorBin(15);
            System.out.println(b.ConversonNum());
        }
  }
 
  
