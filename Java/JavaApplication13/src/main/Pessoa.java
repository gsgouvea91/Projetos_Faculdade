/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


public class Pessoa {
  
    private String nome;
    private String cpf;
    private String endereco;
    private String cidade;
    private String bairro;
    private String data_nasc;
    private String Rg;
    private String cep;
    private String genero;
    private String estado;
    private int telefone;
    private String estado_civil;
    private Conjuje conjuge;
    
  public String getNome() { return nome; }
  public String getCpf() { return cpf; }
  public String getEndereco() { return endereco; }
  public String getCidade() { return cidade; }
  public String getBairro() { return bairro; }
  public String getData_nasc() { return data_nasc; }
  public String getRg() { return Rg; }
  public String getCep() { return cep; }
  public String getGenero() { return genero; }
  public String getEstado() { return estado; }
  public int getTelefone() { return telefone; }

  public void setNome(String nome) { this.nome = nome; }
  public void setCpf(String cpf) { this.cpf = cpf; }
  public void setEndereco(String endereco) { this.endereco = endereco;}
  public void setCidade(String cidade) { this.cidade = cidade; }
  public void setBairro(String bairro) { this.bairro = bairro; }
  public void setData_nasc(String data_nasc) { this.data_nasc = data_nasc; }
  public void setRg(String Rg) { this.Rg = Rg; }
  public void setCep(String cep) { this.cep = cep; }
  public void setGenero(String genero) { this.genero = genero; }
  public void setEstado(String estado) { this.estado = estado; }
  public void setTelefone(int telefone) { this.telefone = telefone; }
  
  public void setEstadoCivil(String opcao){
  this.estado_civil = opcao;
  }
   
   
    
 
}
