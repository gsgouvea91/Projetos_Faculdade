package classes;
/**
 *
 * @author Gustavo
 */
public class Pessoa {
    
    private Endereco endereco;
    private String dataNasc;
    private String telCel;
    private String telRes;
    private String nome;
    private rg rg;


    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getTelCel() {
        return telCel;
    }

    public void setTelCel(String telCel) {
        this.telCel = telCel;
    }

    public String getTelRes() {
        return telRes;
    }

    public void setTelRes(String telRes) {
        this.telRes = telRes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public rg getRg() {
        return rg;
    }

    public void setRg(rg rg) {
        this.rg = rg;
    }
}
