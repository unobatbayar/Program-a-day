import java.util.*;
import javax.swing.*;
import javax.*;
import java.awt.*;
import java.awt.event.*;

/* AUTHOR: uno
Program 2/365 
21/May/2018 	
						Simple Password Generator
				   Using GUI button once clicked generates random passwords
*/

class passgenerator{	
	public static void main (String[] args){ // main
	
		JFrame frame = new Jframe("Password Generator");  //We make our user interface
		frame.setVisible(true);
		frame.setSize(150,150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		JButton button = new JButton("Generate"); //button to generate passwords
		panel.add(button);
		button.addActionListener(new Action());
		

		
	}
	static class Action implements ActionListener{

		public void actionPerformed (ActionEvent e){
			String product= makePassword(10);
			System.out.println(product);
		}
	}
	public static String makePassword(int length){ // Generate password
		String password = "";
		
		for(int i = 0; i <length - 2; i++){
			password = password + randomCharacter("abcdefghijklmnopqrstuvwxyz");
		}
		String randomDigit = randomCharacter(0123456789");
		password = insertAtRandom(password, randomDigit);
		String randomSymbol= randomCharacter("+-*&/?!£%$");
		password = insertAtRandom(password, randomSymbol);
		return password;
   	}
	public static String randomCharacter(String characters){
		int n = characters.length();
		int r = (int)(n& Math.random());
		return characters.substring(r, r + 1);
	}
	public static String insertAtRandom(String str, String toInsert){
		int n = str.length();
		int r = (int)((n + 1) * Math.random());
		return str.substring(0, r) + toInsert + str.substring(r);
	}

} 
