package hotel;

public class Hotel {
    
    private Quarto quarto[];
    
    //Construtores//
    public Hotel() { }
    public Hotel(int qtdQuartos)
    {
    this.quarto = new Quarto[qtdQuartos];
        int i=0;
            for(i=0;i<qtdQuartos;i++){
                this.quarto[i]=new Quarto();
                this.quarto[i].setQuartoN(i+100);
                this.quarto[i].setOcupado(false);
                this.quarto[i].setCliente(null);
            }
    }
    
    //Metodos//
    
    public Quarto[] getQuarto() { return quarto; }
    public void setQuarto(Quarto quarto[])
    {
        this.quarto=quarto;
    }
    
    public Quarto buscarQuarto(int num)
    {
        int i;
            for(i=0;i<quarto.length;i++){
                if(quarto[i].getQuartoN()==num)
                {
                    return quarto[i];
                } 
            }
         return null;
    }
    
    public Quarto buscarQuartoVazio()
    {
        int i;
            for(i=0;i<quarto.length;i++){
                if(quarto[i].isOcupado()==false)
                {
                    return quarto[i];
                } 
            }
        return null;
    }
    
    public int checkIn(Cliente c)
    {
        Quarto livre = buscarQuartoVazio();
               livre.setCliente(c);
               livre.setOcupado(true);
        return livre.getQuartoN();
    }
    
    public int checkOut(int num)
    {
        Quarto ocupado = buscarQuarto(num);
            if(ocupado.isOcupado()==true){
                    ocupado.setCliente(null);
                    ocupado.setOcupado(false);
                 System.out.println("Quarto Desocupado");
            } else {
                 System.out.println("Quarto já Desocupado");
            }
        return ocupado.getQuartoN();
    }
}
