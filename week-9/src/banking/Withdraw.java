package banking;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Withdraw extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Create the panel.
	 */
	JPanel withdraw;
	private JTextField firstName_2;
	private JTextField lastName_2;
	private JTextField textField;
	Bonking bonk;
	public Withdraw(Bonking bonk) {
		withdraw = new JPanel();
		withdraw.setBackground(new Color(255, 252, 247));
		setBackground(new Color(255, 252, 247));
		setLayout(null);
		withdraw.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("How much you want to withdraw?");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel.setBounds(178, 10, 390, 29);
		withdraw.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First Name  : ");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel_1.setBounds(126, 126, 153, 29);
		withdraw.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Last Name: ");
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(126, 165, 135, 31);
		withdraw.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Withdraw Amount: ");
		lblNewLabel_1_2.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel_1_2.setBounds(126, 206, 199, 26);
		withdraw.add(lblNewLabel_1_2);
		
		firstName_2 = new JTextField();
		firstName_2.setColumns(10);
		firstName_2.setBounds(335, 129, 222, 29);
		withdraw.add(firstName_2);
		
		lastName_2 = new JTextField();
		lastName_2.setColumns(10);
		lastName_2.setBounds(335, 164, 222, 29);
		withdraw.add(lastName_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(335, 208, 222, 29);
		withdraw.add(textField);
		
		JButton btnNewButton = new JButton("Withdraw");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = firstName_2.getText() + "_" + lastName_2.getText();
				String message = bonk.withdrawAmount(name, Float.parseFloat(textField.getText()));
				JOptionPane.showMessageDialog(null, message );	
			}
		});
		btnNewButton.setBackground(new Color(150, 173, 200));
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnNewButton.setBounds(299, 278, 153, 31);
		withdraw.add(btnNewButton);
		

		
	}

}
