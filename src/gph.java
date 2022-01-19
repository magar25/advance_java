/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author hp
 */
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class gph extends JFrame {
    public gph() {
        setSize(new Dimension(300,300));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        JPanel p = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                Graphics2D g2=(Graphics2D) g;

                Shape line = new Line2D.Double(3,3,303,303);
                Shape rect = new Rectangle(3,3,303,303);
                Shape circle = new Ellipse2D.Double(100,100,100,100);
                Shape roundRect = new RoundRectangle2D.Double(20,20,250,250,5,25);

                g2.draw(line);
                g2.draw(rect);
                g2.draw(circle);
                g2.draw(roundRect);
            }};
            setTitle("My shapes");
            this.getContentPane().add(p);
    }
    public static void main (String arg[]) {
        new gph();
            }

    }
