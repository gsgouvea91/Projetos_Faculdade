

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author professor
 */
public class Exemplo implements Runnable {

    public String NomeProcesso;
    public void run() {
        for (int i =0; i<1000000;i++){
            System.out.println("Programa"+NomeProcesso+" Valor: "+i);
        }
        System.out.println("Acabei: "+this.NomeProcesso);
    }
    
    public static void main(String[] args){
    
    Exemplo p1 = new Exemplo();
    p1.NomeProcesso="p1";
    Thread t1 = new Thread (p1);
    
    Exemplo p2 = new Exemplo();
    p2.NomeProcesso="p2";
    Thread t2 = new Thread (p2);
    
    Exemplo p3 = new Exemplo();
    p3.NomeProcesso="p3";
    Thread t3 = new Thread (p3);
    t3.start();
    
    Exemplo p4 = new Exemplo();
    p4.NomeProcesso="p4";
    Thread t4 = new Thread (p4);
    t4.start();
        
    }
    
}
