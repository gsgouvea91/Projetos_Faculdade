/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.LinkedList;
//import java.util.List;

public class ListaPerguntas {
    
    private LinkedList<Perguntas> Perguntas = new LinkedList<>();
   
    public void push(Perguntas perguntas)
    {
        this.Perguntas.add(perguntas);
    }
    
    public void remover(int num)
    {
         this.Perguntas.remove(num);
    }
       
    public Perguntas pop(int num)
    {
        return this.Perguntas.get(num);
    }
    
    public int getTamanho(){
        return Perguntas.size();
    }
    
    public void limpar()
    {
        this.Perguntas.clear();
    }     
}
