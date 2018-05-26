
package ex;

public class Cliente {

    private int cliCOD;
    private String cpf; 
    private long numCartaoCred;   
    private RG rg;
    private Endereco end;
 
    public Cliente(int CliCOD, RG rg, Endereco end, String cpf, long ncc)
    {
        this.cliCOD = CliCOD;
        this.cpf =cpf;
        this.numCartaoCred=ncc;
        this.set_rg(rg);
        this.setEnd(end);
    }
    
    public int getCliCOD() {return cliCOD;}
    public String getNome() {return rg.getNome();}
    public String getCpf() {return cpf;}
    public long getNumCartaoCred() {return numCartaoCred;}
   
    public void set_rg(RG rg){this.rg = rg;}
    public RG get_rg (){return rg;}
    
    public void setEnd(Endereco end) {this.end = end;}
    public Endereco getEnd(){return end;}
}
