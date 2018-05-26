/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matematica;

import java.util.Scanner;


public class Matematica {
  Scanner s = new Scanner(System.in);
  
  public static double pi = 3.14;
  public static double piD2 = 1.570796;
  public static double rad1 = 57.29578;
  public static double umelev0 = 0.017453;
  public static double e = 2.718282;
  public static double eeledois = 7.38906;
  public static double umdive = 0.367879;
  public static double log2 = 0.301029;
  public static double loge = 0.434294;
  public static double epi = 23.140692;
  public static double logpi= 0.497149;
  public static double ln2 = 0.693147;
  public static double ln3=1.098612;
  public static double y = 0.577215;
  public static double raize = 1.648721;
  public static double raizpi = 1.772453;
  public static double raiz2 = 1.414213;
  public static double raiz3 = 1.732050;
  public static double nada = 1.618033;
  public static double r1div2 = raizpi;
  private static int contador;
          
   Matematica(){
       this.contador = contador++;
   }
  
  public int vezesUtilizacao(){
    return this.contador;
  }
  
  public static double seno(double catop, double hip){
    double seno;
    return seno = catop/hip;
  }
  
  public static double coseno(double catadj, double hip){
    double cos;
    return cos= catadj/hip;       
  }
  
   public static double tangente(double catop, double catadj){
    double tg;
    return tg = catop/catadj;
  }
  
  public static double areaSimples(double b, double a){
    return b*a;
  }
  
  public static double areaTriangulo(double b, double a){
   return areaSimples(b,a)/2;
  }
  
  public static double areaPentagono(double b, double a){
   return 5*(areaSimples(b,a)/2);
  }
  
  public static double areaHexagono(double b, double a){
   return 6*(areaSimples(b,a)/2);
  }
 
  /////Poli///////
  
  public static double areaTetraedro(double a){
      double A;
      return A = (a*a) * raiz3;
  }
  
  public static double areaOctaedro(double a){
      double A;
      return A = (2*(a*a))*raiz3;
  }
  
  public static int areaCubo(int a){
      int A;
      return A = 6*(a*a);
  }
  
  public static int areaDodecaedro(int a, int ap){
      int A;
      return A = 30*(a*ap);
  }
  
  public static double areaIcosaedro(int a){
      double A;
      return A = (5*(a*a))*raiz3;
  }
  
  /////Peri///////
  
  public static int perimetroQuadrado(int a){
      int P;
      return P = 4*a;
  }

  public static int perimetroRetangulo(int a,int b){
      int P;
      return P=(2*a)+(2*b);
  }
  
  public static int perimetroTriangulo(int a,int b,int c){
      int P;
      return P=a+b+c;
  }
 
  public static int perimetroLosango(int a){
      int P;
      return P= 4*a;
  }
  
  public static int perimetroParalelogramo(int a,int b){
      int P;
      return P=(2*a)+(2*b);
  }
  
  public static int perimetroTrapezio(int a,int b,int c,int d){
      int P;
      return P=a+b+c+d;
  }
  
   public static int perimetroPoliReg(int lados, int a){
      int P;   
      return P = lados*a;
  }
 
   ///MRU e MRUV//
   public static double MRU(double s0,double v,double t){
     double s; 
     s = s0+(v*t);   
     return s;
   }
   
   public static double MRUV(double v0, double a,double t){
     double v; 
     v = v0+(a*t);   
     return v;
   }
}
