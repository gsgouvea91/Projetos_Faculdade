
package aula4;

import java.util.Locale;

public class Pessoa {
    
    private String nome;
    private int rg;
    private String cpf;
    private String dataNasc;
    
    //////GETTER//////
    
    public String getNome() {
        return nome;
    }
    
    public int getRg() {
        return rg;
    }

    public String getCpf() {
        return cpf;
    }
   
    public String getDataNasc() {
        return dataNasc;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    //////SETTER//////
    
    public void setRg(int rg) {
        this.rg = rg;
    }

    public void setCpf(String cpf) {
        //Formatar o CPF
        String bloco1 = cpf.substring(0, 3);
        String bloco2 = cpf.substring(3, 6);
        String bloco3 = cpf.substring(6, 9);
        String bloco4 = cpf.substring(9, 11);
        cpf = bloco1+"."+bloco2+"."+bloco3+"-"+bloco4;
        this.cpf = cpf;
 
    }
    
    public void setDataNasc(String dataNasc) {
        //Formatar Data
        String bloco1 = dataNasc.substring(0, 2);
        String bloco2 = dataNasc.substring(2, 4);
        String bloco3 = dataNasc.substring(4, 8);
        dataNasc = (bloco1+"/"+bloco2+"/"+bloco3);
        
        this.dataNasc = dataNasc;
    }
    
   
    
    
    
}
