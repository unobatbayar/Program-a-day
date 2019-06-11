import javax.swing.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

/* 
@author uno 
@program #2
@date 21-05-2018	
						Simple Password Generator
				   Using GUI button once clicked generates random passwords
*/

class Passgenerator{	
	public static void main (String[] args){ // main

		JFrame frame = new JFrame("Password Generator by Uno");  //We make our user interface
		frame.setVisible(true);
		frame.setSize(350,100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();  
		frame.add(panel);

		JButton button = new JButton("Generate"); //button to generate passwords
		panel.add(button);
		button.addActionListener(new Action());
	}
	static class Action implements ActionListener{

		public void actionPerformed (ActionEvent e){
			String product= makePassword(5);
			JOptionPane.showMessageDialog(null, product);
		}
	}
	public static String makePassword(int length){ // Generate password

		String password = "";
		
		for(int i = 0; i <length - 2; i++){
			password = password + randomCharacter("abcdefghijklmnopqrstuvwxyz") + randomCharacter("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		}
		String randomDigit = randomCharacter("0123456789");
		password = insertAtRandom(password, randomDigit);
		String randomSymbol= randomCharacter("+-*&/?!£%$");
		password = insertAtRandom(password, randomSymbol);
		//word + password + pass
		long current_time = System.currentTimeMillis();
		password = password.substring(password.length()/2, password.length())+current_time/1000+password+password.substring(0, password.length()/2);
		return password;
   	}
	public static String randomCharacter(String characters){
		int n = characters.length();
		int r = (int)(n * Math.random());
		return characters.substring(r, r + 1);
	}
	public static String insertAtRandom(String str, String toInsert){
		int n = str.length();
		int r = (int)((n + 1) * Math.random());
		return str.substring(0, r) + toInsert + str.substring(r);
	}

} 
