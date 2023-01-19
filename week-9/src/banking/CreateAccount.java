package banking;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CreateAccount extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Create the panel.
	 */
	JPanel createAccount;
	private JTextField firstName;
	private JTextField lastName;
	private JTextField amountField;
	Bonking bonk;
	public CreateAccount(Bonking bonk) {
		createAccount = new JPanel();
		createAccount.setBackground(new Color(255, 252, 247));
		setBackground(new Color(255, 252, 247));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Create Account\r\n");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblNewLabel.setBounds(304, 34, 207, 38);
		createAccount.add(lblNewLabel);
		createAccount.setLayout(null);
		
		firstName = new JTextField();
		firstName.setFont(new Font("Arial", Font.PLAIN, 16));
		firstName.setBounds(255, 139, 295, 25);
		createAccount.add(firstName);
		firstName.setColumns(10);
		
		JTextArea txtrFirstName = new JTextArea();
		txtrFirstName.setEditable(false);
		txtrFirstName.setBackground(new Color(255, 252, 247));
		txtrFirstName.setText("First Name : ");
		txtrFirstName.setFont(new Font("Arial Black", Font.BOLD, 18));
		txtrFirstName.setBounds(68, 135, 139, 30);
		createAccount.add(txtrFirstName);
		
		JTextArea txtrLastName = new JTextArea();
		txtrLastName.setEditable(false);
		txtrLastName.setBackground(new Color(255, 252, 247));
		txtrLastName.setText("Last Name : ");
		txtrLastName.setFont(new Font("Arial Black", Font.BOLD, 18));
		txtrLastName.setBounds(68, 201, 136, 30);
		createAccount.add(txtrLastName);
		
		JTextArea txtrAmount = new JTextArea();
		txtrAmount.setEditable(false);
		txtrAmount.setBackground(new Color(255, 252, 247));
		txtrAmount.setText("Amount : ");
		txtrAmount.setFont(new Font("Arial Black", Font.BOLD, 18));
		txtrAmount.setBounds(68, 260, 105, 30);
		createAccount.add(txtrAmount);
		
		lastName = new JTextField();
		lastName.setFont(new Font("Arial", Font.PLAIN, 16));
		lastName.setColumns(10);
		lastName.setBounds(255, 205, 295, 25);
		createAccount.add(lastName);
		
		amountField = new JTextField();
		amountField.setFont(new Font("Arial", Font.PLAIN, 16));
		amountField.setColumns(10);
		amountField.setBounds(255, 264, 295, 25);
		createAccount.add(amountField);
		
		JButton submitOne = new JButton("Submit");
		submitOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = firstName.getText() + "_" + lastName.getText();
				String message = bonk.createAccount(name, Float.parseFloat(amountField.getText()));
				JOptionPane.showMessageDialog(null, message );			}
		});
		submitOne.setBackground(new Color(150, 173, 200));
		submitOne.setFont(new Font("Arial Black", Font.BOLD, 18));
		submitOne.setBounds(342, 348, 139, 35);
		createAccount.add(submitOne);

	}

}
