package ex;

public class Endereco {
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais; 
 
    public Endereco (String log,String num,String compl,String bairro ,String cid ,String est , String pais)
    {
        this.logradouro = log;
        this.numero = num;
        this.complemento = compl;
        this.bairro = bairro;
        this.cidade = cid;
        this.estado = est;
        this.pais = pais;
    }
    
    public String getLogradouro() {return logradouro;}
    public String getNumero() {return numero;}
    public String getComplemento() {return complemento;}
    public String getBairro() {return bairro;}
    public String getCidade() {return cidade;}
    public String getEstado() {return estado;}
    public String getPais() {return pais;}
    
}
