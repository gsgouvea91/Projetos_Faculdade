
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author professor
 */
public class ThreadA implements Runnable {

    private int wS;
    private int wE;
    private int hS;
    private int hE;
    private BufferedImage image;

    public ThreadA(int l1, int l2, int c1, int c2, BufferedImage image) {
        this.wS = l1;
        this.wE = l2;
        this.hS = c1;
        this.hE = c2;
        this.image = image;
    }

    public void run() {

        //System.out.println(this.image.getWidth());
        //System.out.println(this.image.getWidth());
        for (int x = wS; x < wE; x++) {
            for (int y = hS; y < hE; y++) {
                Color c = new Color(this.image.getRGB(x, y));

                int r = c.getRed();
                int g = c.getGreen();
                int b = c.getBlue();
                int media = (r + g + b) / 3;
                Color nc = new Color(media, media, media);
                this.image.setRGB(x, y, nc.getRGB());
            }
        }
        try {
            ImageIO.write(image, "jpg", new File("C:\\temp\\processamento.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(ThreadA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
