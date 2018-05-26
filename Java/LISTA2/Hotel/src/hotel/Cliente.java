
package hotel;

public class Cliente {

    private String nome;
    private String cpf; 
    private String rg;
    private Quarto quarto;
    
    public Cliente(){ }
    
    public String getNome()     { return nome; }
    public String getCpf()      { return cpf; }
    public String getRg()       { return rg; }
    public Quarto getQuarto()   { return quarto; }

    public void setNome(String nome)     { this.nome = nome; }
    public void setCpf(String cpf)       { this.cpf = cpf; }
    public void setRg(String rg)         { this.rg = rg; }
    public void setQuarto(Quarto quarto) { this.quarto = quarto; }
    
}
