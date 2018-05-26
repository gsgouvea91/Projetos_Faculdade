/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

public class Paciente 
{
    private String nome;
    private char genero;
    private String dataNasc;
    private String signo;
    private Rg rg;
    private String cpf;
    private String trabalho;
    private String estCivil;
    private String telefoneRes;
    private String telefoneCel;
    private String email;
    private double altura;
    private double peso;    
    private Endereco end;
    private Perguntas perguntas[];
    private CasoDeEmerg emergencia;
    private ListaPerguntas listaPerguntas;
     
    Scanner scan = new Scanner(System.in);
    
    public Paciente(){
         
         this.listaPerguntas = new ListaPerguntas();
    }  
    
    //Método Para elaborar uma lista de questões (pede para escrever a questao)
    public void criarPerguntas(int totalDePerguntas){
        this.perguntas = new Perguntas[totalDePerguntas];
        
        for(int i=0;i<totalDePerguntas;i++){
             this.perguntas[i] = new Perguntas();
             this.perguntas[i].setQuestaoNumero(i);
             System.out.print("Elabore questao "+i+":");
             String choice = scan.nextLine();
             this.perguntas[i].setQuestao(choice);
             this.getListaPerguntas().push(perguntas[i]);
        }
    }
    
   //Método Para iniciar a lista de questoes em sequencia 0,1,2,3... 
   //(resgata da lista e pede resposta)
   public void perguntarSequencialmente(){
        
        for(int i=0;i<listaPerguntas.getTamanho();i++){        
            listaPerguntas.pop(i).perguntar();
        }
    } 
    //Método que resgata uma pergunta especifica da lista.
    public void perguntarEspecificamente(int num){          
            listaPerguntas.pop(num).perguntar();
    }
    //Somente retorna a descricao da pergunta
    public String getPergunta(int num){          
            return listaPerguntas.pop(num).getPergunta();
    }
   
    public String getNome()         { return nome; }
    public char getGenero()         { return genero; }
    public String getDataNasc()     { return dataNasc; }
    public String getSigno()        { return signo; }
    public String getCpf()          { return cpf; }
    public String getTrabalho()     { return trabalho; }
    public String getEstCivil()     { return estCivil; }
    public String getTelefoneRes()  { return telefoneRes; }
    public String getTelefoneCel()  { return telefoneCel; }
    public String getEmail()        { return email; }
    public double getAltura()       { return altura; }
    public double getPeso()         { return peso; }
    public Endereco getEnd()        { return end; }
    public Rg getRg()               { return rg; }
    public ListaPerguntas getListaPerguntas()  { return listaPerguntas; }
    public CasoDeEmerg getEmergencia()         { return emergencia; }  
    
    public void setNome(String nome)                { this.nome = nome; }
    public void setGenero(char genero)              { this.genero = genero; }
    public void setDataNasc(String dataNasc)        { this.dataNasc = dataNasc; }
    public void setSigno(String signo)              { this.signo = signo; }
    public void setCpf(String cpf)                  { this.cpf = cpf; }
    public void setTrabalho(String trabalho)        { this.trabalho = trabalho; }
    public void setEstCivil(String estCivil)        { this.estCivil = estCivil; }
    public void setTelefoneRes(String telefoneRes)  { this.telefoneRes = telefoneRes; }
    public void setTelefoneCel(String telefoneCel)  { this.telefoneCel = telefoneCel; }
    public void setEmail(String email)              { this.email = email; }
    public void setAltura(double altura)            { this.altura = altura; }
    public void setPeso(double peso)                { this.peso = peso; }
    public void setEnd(Endereco end)                { this.end = end; }
    public void setRg(Rg rg)                        { this.rg = rg; }
    public void setListaPerguntas(ListaPerguntas listaPerguntas) { this.listaPerguntas = listaPerguntas;  }
    public void setEmergencia(CasoDeEmerg emergencia) { this.emergencia = emergencia; }
}
