
package pkg6sem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Grid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        JPanel windowContent= new JPanel();
       //Set the layout manager for teh panel
      
       GridLayout gl =new GridLayout(4,2);
       windowContent.setLayout(gl);
       JLabel label1= new JLabel("Number 1:");
       JTextField field1= new JTextField(10);
       JLabel label2= new JLabel("Number 2:");
       JTextField field2 = new JTextField(10);
       JLabel label3 = new JLabel("sum:");
      JTextField result = new JTextField(10);
       JButton go = new JButton("Add");

// add controls to the panel

     windowContent.add(label1);
     windowContent.add(field1);
     windowContent.add(label2);
     windowContent.add(field2);
     windowContent.add(label3);
     windowContent.add(result);
     windowContent.add(go);
// create the frame and add teh panel
       
       JFrame frame = new JFrame("GridLayout Calculator");
       
//add the panel to top level container

      frame.setContentPane(windowContent);

// set the size and make the window visible

     frame.setSize(400,100);
     frame.setVisible(true);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    

       
       

    }
    
    
    
}
