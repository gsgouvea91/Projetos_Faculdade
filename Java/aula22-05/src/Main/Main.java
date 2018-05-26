/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author professor
 */
public class Main {
    
    public static void main(String args[]){
        
        Strings s = new Strings();
        
        s.quantVogal("consoantes voadores");
        s.quantCons("consoantes voadores");
        s.quantFrases("Tarso miguel, é um cara muito catitaço, ele é um cara legal.");
        s.quantParagrafo("Tarso miguel, é um cara muito catitaço, ele é um cara legal. \n Mas ele não gosta. \n de feijão.");
        s.quantPalavras("mary Tinha Um Carnerinho Ele Era Catitaco ");
        s.quantSilabas("xaxa xexe xixi xoxo xuxu ");
    }    
}
