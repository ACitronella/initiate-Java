/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test3;
import java.awt.*;
import javax.swing.*;
import java.util.*;
/**
 *
 * @author User
 */
public class Test3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame(){
            @Override
            public void paint (Graphics g){
                g.drawString("Hello, World!", 110,150);
                g.drawOval(100,130,90,30);
            }
        };
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
