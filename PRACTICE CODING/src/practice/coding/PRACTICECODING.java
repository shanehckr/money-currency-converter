
package practice.coding;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
public class PRACTICECODING {


    public static void main(String[] args) {
         ImageIcon image = new ImageIcon("Screensshot (5).png");  
          JLabel pogi = new JLabel();
          pogi.setText("cutie pie");
          pogi.setIcon(image);
          pogi.setHorizontalTextPosition(JLabel.CENTER);
          pogi.setForeground(new Color(23,90,90));
          pogi.setFont(new Font("SANS",Font.PLAIN,80));
          pogi.setVerticalAlignment(JLabel.CENTER);
          pogi.setHorizontalAlignment(JLabel.CENTER);
          
          
          
          
      
       JFrame cute = new JFrame();
       cute.setTitle("pogi ako");
       cute.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       cute.setSize(250,250);
       cute.setVisible(true);
       cute.getContentPane().setBackground(new Color(150,30,50));
       cute.add(pogi);
       
     
      
        
        
           }
    
}
