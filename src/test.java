
import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.util.*;
import java.net.*;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

class test{
    public static void main(String args[]) throws MalformedURLException, IOException{
        URL url= new URL("https://books.google.com/books?id=fY-bAgAAQBAJ&printsec=frontcover&img=1&zoom=0&edge=curl&source=gbs_api"); 
        URLConnection urlConn = url.openConnection(); 
        urlConn.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.21; Mac_PowerPC)" ); 
        urlConn.connect(); 
        InputStream urlStream = urlConn.getInputStream(); 
        BufferedImage b = ImageIO.read(urlStream);
        JFrame frame = new JFrame();
        frame.getContentPane().setLayout(new FlowLayout());
        frame.getContentPane().add(new JLabel(new ImageIcon(b)));
        frame.pack();
        frame.setVisible(true);
        System.out.println("Done");
        File outputfile = new File("E:\\ime.jpg");
        ImageIO.write(b, "jpg", outputfile);
    }
}