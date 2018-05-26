
package Pizzaria;

public class Cliente {
    
    private String nome;
    private String telefone;
    private String end;
    //private Pedido pedido;
    
    public Cliente (){}
    
    public String getNome()     { return nome; }
    public String getTelefone() { return telefone; }
    public String getEnd()      { return end; }
   //public Pedido getPedido()   { return pedido; }

    public void setNome(String nome)         { this.nome = nome; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public void setEnd(String end)           { this.end = end; }
   //public void setPedido(Pedido pedido)     { this.pedido = pedido; }
    
}
