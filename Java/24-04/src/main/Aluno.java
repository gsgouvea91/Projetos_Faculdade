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
public class Aluno extends Pessoa {

    public int getRa() {
        return ra;
    }

    public int getMedia() {
        return media;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public void setMedia(int media) {
        this.media = media;
    }
    
    private int ra;
    private int media;
    
}
