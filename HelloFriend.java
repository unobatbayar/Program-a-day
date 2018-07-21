import java.util.*;
import javax.swing.*;
import javax.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileInputStream;
import java.io.InputStream;

//import sun.audio.*;
/**
											Hello Friend from Mr.Robot
@author uno
@program #8
@date 20-07-2018
**/


public class HelloFriend implements Runnable
{
    public static void main(String[] args) 
    {
		new HelloFriend();
	}

	public static void MusicPlayer(String filepath)
	{
		InputStream music;
		try
		{
			music = new FileInputStream(new file(filepath));
			AudioStream audios = new AudioStream(music);
			
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog("Something went wrong..");
		}
	}

	HelloFriend()
	{
	JFrame frame =new JFrame("1.0_8-whatsyourask.m4p"); 
	//button
	JButton b = new JButton("Hello Friend!");    
	b.setBounds(100,100,140, 40);    

	frame.add(b);    
	frame.setSize(320,200);    
	frame.setLayout(null);    
	frame.setVisible(true);    
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  

	//action listener
	b.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent arg0) {
	
	}          
	});
	}         

	    
}
        
