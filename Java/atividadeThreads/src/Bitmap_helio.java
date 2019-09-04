import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import static java.sql.DriverManager.println;
import javax.imageio.ImageIO;

public class Bitmap_helio{
    public static void main(String[] args) {
           System.out.println("start");
        BufferedImage image = null;
        try {
            File imagefile = new File("C://temp//download.jpg");
            image = ImageIO.read(imagefile);
            
            int h1 = image.getHeight();
            int w1 = image.getWidth()/2;
            
            /*//ImageIO Image write Example in Java
            for (int x = 0; x < image.getWidth(); x++) {
                for (int y = 0; y < image.getHeight(); y++) {
                    Color c = new Color(image.getRGB(x, y));

                    int r = c.getRed();
                    int g = c.getGreen();
                    int b = c.getBlue();
                    int media = (r + g + b) / 3;
                    Color nc = new Color(media, media, media);
                    image.setRGB(x, y, nc.getRGB());
                }
            }

            */
            
            //Threads que dividem imagem em 2 
            ThreadA p1 = new ThreadA(0,(w1-1),0,(h1-1),image);
            Thread t1 = new Thread (p1);
            
            
            ThreadA p2 = new ThreadA(w1,(image.getWidth()-1),0,(image.getHeight()-1),image);
            Thread t2 = new Thread (p2);
            
            t1.start();
            t2.start();
            
            ImageIO.write(image, "jpg", new File("C:\\temp\\processamento2.jpg"));

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Success");
    }

}
