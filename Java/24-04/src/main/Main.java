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
public class Main {
    
    
    public static void main (String args[]){
    
        
        PessoaFisica pf = new PessoaFisica();
        pf.setCpf("999999999");
        pf.setNome("Joao");
        
        PessoaJuridica pj = new PessoaJuridica();
        pj.setCnpj("10010001000100");
        pj.setNome("XUAUM");
        
        Aluno al = new Aluno();
        al.setRa(22222222);
        al.setMedia(5);
        al.setNome("Carlos");
        
        Funcionario f = new Funcionario();
        f.setCargo("Professor");
        f.setCodigo_func(10995);
        
        Professor pr = new Professor();
        pr.setMateria("MATEMATICA");
        
        
    }
    
}
