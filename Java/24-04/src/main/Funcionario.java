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
public class Funcionario extends Pessoa {

    public int getCodigo_func() {
        return codigo_func;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCodigo_func(int codigo_func) {
        this.codigo_func = codigo_func;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    private int codigo_func;
    private String cargo;
    
}


