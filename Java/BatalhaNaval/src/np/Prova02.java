/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Prova02 extends JFrame{
    Prova02(){
        this.setSize(500, 500);  
        Container ctn = this.getContentPane();
        ctn.setLayout(null);
        for (int x = 0; x < 310; x += 51) {
            for (int y = 0; y < 310; y += 51) {
            //JButton btnok = new JButton();
            //btnok.setBounds(x, y, 30, 30);
            //ctn.add(btnok);
            Submarino b = new Submarino(x,y);
            b.setBounds(x, y, 50, 50);
            ctn.add(b);
            ctn.repaint();
        }
        this.setVisible(true);
        }
    }
    public static void main(String[] args) {
        Prova02 p = new Prova02();
    }
  }
