/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author professor
 */
public class Pessoa {

    private String nome;
    private String endereco;
    private String cidade;
    private String cep;
    private String estado;
    private int telefone;
    
    public String getNome() { return nome; }
    public String getEndereco() { return endereco; }
    public String getCidade() { return cidade; }
    public String getCep() { return cep; }
    public String getEstado() { return estado; }
    public int getTelefone() { return telefone; }

    public void setNome(String nome) {  this.nome = nome; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
    public void setCidade(String cidade) { this.cidade = cidade; }
    public void setCep(String cep) { this.cep = cep; }
    public void setEstado(String estado) { this.estado = estado; }
    public void setTelefone(int telefone) { this.telefone = telefone; }

    
}
