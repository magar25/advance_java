
package pkg6sem;
import javax.swing.*;
import java.awt.FlowLayout;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    // create a panel
      JPanel windowContent = new JPanel();
      
// set a layout manager for this panel
      JLabel label1 = new JLabel("Number 1: ");
      JTextField field1 = new JTextField(10);
      JLabel label2 = new JLabel("Number 2");
      JTextField field2 = new JTextField(10);
      JLabel label3 = new JLabel("Sum");
      JTextField result = new JTextField(10);
      JButton go = new JButton ("Add");

//Add controls to the panel
     windowContent.add(label1);
     windowContent.add(field1);
     windowContent.add(label2);
     windowContent.add(field2);
     windowContent.add(label3);
     windowContent.add(result);
     windowContent.add(go);

//create the frame and add the panel to it

     JFrame frame = new JFrame("My first calculator");
     
// add teh panel to top level container

    frame.setContentPane(windowContent);

// set the sze adn amek teh window visibel

    frame.setSize(400,100);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
    
}
