/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gustavo
 */
public class Pilha {
    int elementos[];
    int topo;
    
    public static void main(String[] args) {
        
        Pilha p = new Pilha();
        
        p.push(5);
        p.push(4);
        p.push(1);
        
        p.isEmpty();
        System.out.println(p.top());
    }

    public Pilha(){
        if (isFull()){
            throw new RuntimeException("Stack Overflow");
        }
        elementos = new int[10];
        topo    = -1;
    }        
    public void push(int e){
        topo++;
        elementos[topo] = e;
    }
    public void pop(){
        if (isEmpty()){
            throw new RuntimeException("Empty Stack");
        }
        int e;
        e = elementos[topo];
        topo --;
    }
    public boolean isEmpty(){
        return (topo == -1);
    }
           
    public boolean isFull(){
        return (topo == 9);
    }       
    public int top(){  
        if (isEmpty()){
            throw new RuntimeException("Empty Stack");
        }
      return elementos[topo];
    }
}
