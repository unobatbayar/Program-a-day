import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Encryption
 * 
 * @author uno
 * @program #7
 * @date 17-07-2018
 **/

public class Encryption {
	Encryption() {
		JFrame frame = new JFrame("Encryption");
		// submit button
		JButton buttonEnter = new JButton("Enter");
		buttonEnter.setBounds(100, 100, 140, 20);
		// enter name label
		JLabel label = new JLabel();
		label.setText("Enter key:");
		label.setBounds(12, 12, 100, 100);
		// empty label which will show event after button clicked
		JLabel labelResult = new JLabel();
		labelResult.setBounds(10, 110, 300, 100);
		// textfield to enter key
		JTextField textFieldKey = new JTextField();
		textFieldKey.setBounds(90, 50, 180, 30);
		// add to frame
		frame.add(label);
		frame.add(textFieldKey);
		frame.add(labelResult);
		frame.add(buttonEnter);
		frame.setSize(320, 200);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);

		// Action listener
		buttonEnter.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String inputKey = textFieldKey.getText();
				if (inputKey.equals("*]SAb3p+Br3#$I&eMEtMvO1XA")) {
					labelResult.setText("Successful AHS3-3XAN-LP9Q-6BZI");
				} else {
					labelResult.setText("Encryption key incorrect.");
				}
			}
		});
	}

	public static void main(String[] args) {
		new Encryption();
	}
}
