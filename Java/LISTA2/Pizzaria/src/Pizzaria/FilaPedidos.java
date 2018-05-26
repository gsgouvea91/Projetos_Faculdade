/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizzaria;

import java.util.LinkedList;
import java.util.List;

public class FilaPedidos {
    
    private List<Pedido> Pedidos = new LinkedList<>();
    
    public void inserir(Pedido pedido)
    {
        this.Pedidos.add(pedido);
    }
    
    public Pedido remover()
    {
        return this.Pedidos.remove(0);
    }
    
    public Pedido consultar()
    {
        return this.Pedidos.get(0);
    }
    
    public boolean vazio()
    {
        return this.Pedidos.size()==0;
    }
    
}
