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
public class Professor extends Funcionario {

    public String getMateria() {
        return Materia;
    }

    public String getTurmas() {
        return Turmas;
    }

    public void setMateria(String Materia) {
        this.Materia = Materia;
    }

    public void setTurmas(String Turmas) {
        this.Turmas = Turmas;
    }
    
  private String Materia;
  private String Turmas;
    
}