import java.util.*;

// @author uno
//                                Sachiko's Heart Access Control
import javax.swing.*;
import javax.*;
import java.awt.*;
import java.awt.event.*;// @author uno//                                Sachiko's Heart Access Control

public class Sachiko 
{
    Sachiko()
    {    
		JFrame frame =new JFrame("Sachiko's Heart Access Control ( ･_･)♡"); 
					//submit button
		JButton b = new JButton("アクセス!");    
		b.setBounds(100,100,140, 20);    
					//enter name label		
       	   	JLabel label = new JLabel();
        	label.setText("君の名は? :");
        	label.setBounds(10, 10, 100, 100);
					//empty label which will show event after button clicked
		JLabel label1 = new JLabel();
		label1.setBounds(10 , 110, 200, 100);
					//textfield to enter name
		JTextField textfield= new JTextField();
		textfield.setBounds(110, 50, 130, 30);
					//add to frame
        	frame.add(label);
		frame.add(textfield);
		frame.add(label1);
		frame.add(b);    
		frame.setSize(320,200);    
		frame.setLayout(null);    
		frame.setVisible(true);    
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
        
					//action listener
		b.addActionListener(new ActionListener() {
	        @Override
			public void actionPerformed(ActionEvent arg0) {
                        String username = textfield.getText();
                        username = username.toLowerCase();
                        if(username.equals("uno"))
                        {
                            label1.setText("Success ♡ " + username + "!");	
                        }
                        else
                        {
                            label1.setText("Rejected :-(");	
                        }	
			}          
	      });
	}         
        public static void main(String[] args) 
        {    
		new Sachiko();    
	}    
}
        
