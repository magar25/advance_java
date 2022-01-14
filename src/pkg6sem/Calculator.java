/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg6sem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author hp
 */
public class Calculator {
    JPanel windowContent;
    private JTextField displayField;
    JButton button0;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton buttonPoint;
    JButton buttonEqual;
    JPanel p1;
    
    public void setDisplayValue(String val){
        displayField.setText(val);
    }
    
    public String getDeisplayValue(){
        return displayField.getText();
    }
    //contructor creats the components
    //and adds them to the frameusing combination of border and grid layout
    Calculator(){
        windowContent=new JPanel();
        
        //set the layout manager for this panle
        
        BorderLayout b1= new BorderLayout();
        windowContent.setLayout(b1);
        //create the display field and place it in the Nothe are of the window
        
        displayField=new JTextField(30);
        windowContent.add("North",displayField);
        //creates buttons using constructor of the class 
        //Jbutton that takes the lable of the button as parameter
        
        button0= new JButton("0");
        button1= new JButton("1");
        button2= new JButton("2");
        button3= new JButton("3");
        button4= new JButton("4");
        button5= new JButton("5");
        button6= new JButton("6");
        button7= new JButton("7");
        button8= new JButton("8");
        button9= new JButton("9");
        buttonPoint= new JButton(".");
        buttonEqual= new JButton("=");
        //create the panel with the gridlayout with 17 buttons
        //10 numbers, period, abd the equal sigh
        
        p1 = new JPanel();
        GridLayout gl = new GridLayout(4,3);
        p1.setLayout(gl);
        
        // add window controls to the panel p1
        
        p1.add(button1);
        p1.add(button2);
        p1.add(button3);
        p1.add(button4);
        p1.add(button5);
        p1.add(button6);
        p1.add(button7);
        p1.add(button8);
        p1.add(button9);
        p1.add(button0);
        p1.add(buttonPoint);
        p1.add(buttonEqual);
        
        CalculatorEngine calcEngine = new CalculatorEngine();
        button0.addActionListener(calcEngine);
        button1.addActionListener(calcEngine);
        button2.addActionListener(calcEngine);
        button3.addActionListener(calcEngine);
        button4.addActionListener(calcEngine);
        button5.addActionListener(calcEngine);
        button6.addActionListener(calcEngine);
        button7.addActionListener(calcEngine);
        button8.addActionListener(calcEngine);
        button9.addActionListener(calcEngine);
        buttonPoint.addActionListener(calcEngine);
        buttonEqual.addActionListener(calcEngine);
        
        //add the panel p1 to the center of the window
        windowContent.add("Center",p1);
        
        //create the frame an dset its content pane
        
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(windowContent);
        
        //set teh size of the window to the big enough to accom
        
        frame.pack();
        //display the window
        
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Calculator();
    }
}
