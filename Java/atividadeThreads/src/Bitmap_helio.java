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
            
            int h = image.getHeight();
            int w = image.getWidth();
            
            System.out.println("Height: "+h +" Width: " + w);
            
            /*//ImageIO Image write Example in Java
            for (int x = 0; x < (w/2); x++) {
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
            
            for (int x = (w/2); x < image.getWidth(); x++) {
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
            
            ThreadA p1 = new ThreadA(0,w/2,0,h/2,image);
            Thread t1 = new Thread (p1);
            t1.start();
            /*
            ThreadA p2 = new ThreadA(1296,2591,864,1727,image);
            Thread t2 = new Thread (p2);
            t2.start();
            */
            ImageIO.write(image, "jpg", new File("C:\\temp\\processamento2.jpg"));
            //ImageIO.write(image, "bmp", new File("C:\\temp\\1.bmp"));
            //ImageIO.write(image, "png", new File("C:\\temp\\1.png"));

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Success");
    }

}
