package banking;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class checkBalance extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Create the panel.
	 */
	JPanel checkBalance;
	private JTextField textField;
	private JTextField textField_1;
	Bonking bonk;
	public checkBalance(Bonking bonk) {
		setLayout(null);
		checkBalance = new JPanel();
		checkBalance.setBackground(new Color(255, 252, 247));
		checkBalance.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Amount in Account");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel.setBounds(255, 35, 219, 29);
		checkBalance.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(293, 106, 181, 35);
		checkBalance.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("First Name: ");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblNewLabel_1.setBounds(142, 103, 138, 35);
		checkBalance.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Last Name: ");
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(142, 169, 109, 23);
		checkBalance.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Amount : ");
		lblNewLabel_1_2.setFont(new Font("Arial Black", Font.BOLD, 17));
		lblNewLabel_1_2.setBounds(142, 230, 103, 40);
		checkBalance.add(lblNewLabel_1_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(293, 161, 178, 35);
		checkBalance.add(textField_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Arial", Font.PLAIN, 12));
		textArea.setEditable(false);
		textArea.setBounds(676, 10, 5, 18);
		checkBalance.add(textArea);
		
		JLabel paisaKoArea = new JLabel("XXXXXXX");
		paisaKoArea.setFont(new Font("Arial", Font.BOLD, 14));
		paisaKoArea.setBounds(293, 236, 181, 30);
		checkBalance.add(paisaKoArea);
		
		
		JButton btnNewButton = new JButton("Check");
		btnNewButton.setBackground(new Color(150, 173, 200));
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textField.getText() + "_" + textField_1.getText();
				String message = bonk.checkBalance(name);
				paisaKoArea.setText(message);
			}
		});
		btnNewButton.setBounds(279, 289, 157, 40);
		checkBalance.add(btnNewButton);
		
		
		
		

	}

}
