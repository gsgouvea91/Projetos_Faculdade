
package main;

public class Rg {
        
   	private String registroGeral;
	private String dataExpedicao;
	private String nome;
	private String nomePai;
	private String nomeMae;
	private String naturalidade;
	private String dataNascimento;
        
        public Rg(){}
        
 ////////SETTERS//////
    public void setRegistroGeral (String registroGeral)  {this.registroGeral = registroGeral;}
    public void setDataExpedicao (String dataExpedicao)  {this.dataExpedicao = dataExpedicao;}
    public void setNome          (String nome)           {this.nome = nome;}
    public void setNomePai       (String nomePai)        {this.nomePai = nomePai;}
    public void setNomeMae       (String nomeMae)        {this.nomeMae = nomeMae;}
    public void setNaturalidade  (String naturalidade)   {this.naturalidade = naturalidade;}
    public void setDataNascimento(String dataNascimento) {this.dataNascimento = dataNascimento;}
    
//////////GETTERS//////////
    public String getRegistroGeral()  {return registroGeral;}
    public String getDataExpedicao()  {return dataExpedicao;}
    public String getNome()           {return nome;}
    public String getNomePai()        {return nomePai;}
    public String getNomeMae()        {return nomeMae;}
    public String getNaturalidade()   {return naturalidade;}
    public String getDataNascimento() {return dataNascimento;}
}
