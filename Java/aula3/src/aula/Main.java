/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula;

/**
 *
 * @author professor
 */
public class Main {
    public static void main(String args[]){
        Pessoa p0 = new Pessoa("Maria");
        Pessoa p1 = new Pessoa("Mario");
        Pessoa p2 = new Pessoa("Janaina");
        
        p0.cpf = new CPF("342.587.699-89");
        p0.rg = new RG("4597841/5","SP","Ana","Flavio");
        p0.titulo = new TDE("000000000",25,358);
        p0.mae = new Pessoa("Joaquina");
        
        p1.cpf = new CPF("999.999.999-99");
        p1.rg = new RG("333333/3","BH","Ana","Flavio");
        p1.titulo = new TDE("000000000",25,358);
        p1.mae = new Pessoa("Joaquina");
        
        p2.cpf = new CPF("342.587.699-89");
        p2.rg = new RG("4597841/5","SP","Ana","Flavio");
        p2.titulo = new TDE("000000000",25,358);
        p2.mae = new Pessoa("Joaquina");
      
        System.out.println(p2.rg.uf);
      
                
      }
}
