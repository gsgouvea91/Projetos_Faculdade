package Pizzaria;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        Pizzaria pizzaria = new Pizzaria();
        
        Scanner in = new Scanner(System.in);
        int opt=0;
        
        while(opt!=9){
            System.out.println("1 - Criar Cliente");
            System.out.println("2 - Fazer Pedido");
            opt = in.nextInt();
            if(opt==2){
            
            
            }
            
        }
        Cliente cliente = new Cliente();
        
        cliente.setNome("Joao");
        cliente.setTelefone("39337866");

        pizzaria.fazerPedido(cliente, "10/10/10", 33.50, 1);
        
        
        Pedido primeiroDaFila  =  pizzaria.getFilaPedidos().consultar();
        
        
        System.out.println(primeiroDaFila.getCliente().getNome());
    }
}
