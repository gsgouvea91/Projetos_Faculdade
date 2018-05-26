package Pizzaria;

public class Pedido {
    
    private int number;
    private String data;
    private Cliente cli;
    private double totalPedido;
    
    public int getNumber() { return number; }
    public String getData() { return data; }
    public Cliente getCliente() { return cli; }
    public double getTotalPedido() { return totalPedido; }

    public void setNumber(int number) { this.number = number; }
    public void setData(String data) { this.data = data; }
    public void setCliente(Cliente cliente) { this.cli = cliente; }
    public void setTotalPedido(double totalPedido) { this.totalPedido = totalPedido; }
}
