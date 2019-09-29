/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Container;
import javax.swing.JFrame;

/**
 *
 * @author Gustavo
 */
public class Principal_JP extends JFrame       
{
    private Container cn;
    private int largura = 1035;
    private int altura = 757;  

    Principal_JP() {
       this.setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE); 
       this.setSize(altura,largura);
       this.setTitle("Formulário");
       cn = getContentPane();
       Principal pn = new Principal();
       cn.add(pn); 
       //this.setLayout(null);
       this.setVisible(true);
    }
   
}
