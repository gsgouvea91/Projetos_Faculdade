
package Pizzaria;

public class Pizzaria {
    public static int teste;
    private Pedido pedido;
    private FilaPedidos filaPedidos;

    public FilaPedidos getFilaPedidos() {
        return filaPedidos;
    }
    
    public Pizzaria(){
        this.filaPedidos =  new FilaPedidos();;
    
    }
    
    public void fazerPedido(Cliente c, String data ,double total,int num)
    {
        Pedido novo = new Pedido();
        novo.setNumber(num);
        novo.setCliente(c);
        novo.setData(data);
        novo.setTotalPedido(total);
        this.filaPedidos.inserir(novo);
    }
    
    public void removerPedido (Pedido p)
    {
        Pedido retirar = new Pedido();
               retirar.setNumber(0);
               retirar.setData("");
               retirar.setCliente(null);
               this.filaPedidos.remover();
    }

    public Pedido getPedido() { return pedido; }
      
}
