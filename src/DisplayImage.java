
import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author hp
 */
public class DisplayImage  extends JPanel{

 
    public static void main(String avg[])  throws Exception{
        // TODO code application logic here
        BufferedImage img = ImageIO.read (new URL("http://www.java2s.com/style/download.png"));
        ImageIcon icon = new ImageIcon(img);
         JFrame frame = new JFrame();
         frame.setLayout(new FlowLayout());
         frame.setSize(200,300);
         
         JLabel lbl = new JLabel();
         lbl.setIcon(icon);
         
         frame.add(lbl);
         frame.setVisible(true);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
    }
    
}
