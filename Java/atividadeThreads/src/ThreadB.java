
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class ThreadB implements Runnable{
    private final BufferedImage image;
    
    public ThreadB(BufferedImage img){
        this.image = img;
    }
    
    public void run() {
        
        int h = this.image.getHeight();
        int w = this.image.getWidth();
        
        for (int x = (w/2); x < w; x++) {
                for (int y = 0; y < h; y++) {
                    Color c = new Color(image.getRGB(x, y));

                    int r = c.getRed();
                    int g = c.getGreen();
                    int b = c.getBlue();
                    int media = (r + g + b) / 3;
                    Color nc = new Color(media, media, media);
                    image.setRGB(x, y, nc.getRGB());
                }
            }
    }
}

