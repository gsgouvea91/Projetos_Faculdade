
package hotel;

public class Quarto {

   private int quartoN;
   private boolean ocupado;
   private Cliente cliente;
   
    public int getQuartoN()     { return quartoN; }
    public boolean isOcupado()  { return ocupado; }
    public Cliente getCliente() { return cliente; }
    
    public void setQuartoN(int quartoN)     { this.quartoN = quartoN; }
    public void setOcupado(boolean ocupado) { this.ocupado = ocupado; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

}
