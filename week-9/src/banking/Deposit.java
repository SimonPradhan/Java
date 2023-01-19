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

public class Deposit extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Create the panel.
	 */
	JPanel deposit;
	private JTextField depositAmt;
	private JTextField firstName_1;
	private JTextField lastName_1;
	Bonking bonk;
	public Deposit(Bonking bonk) {
		deposit = new JPanel();
		deposit.setBackground(new Color(255, 252, 247));
		setBackground(new Color(255, 252, 247));
		setLayout(null);
		deposit.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("How much you want to deposit?");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel.setBounds(226, 26, 368, 29);
		deposit.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First Name  : ");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel_1.setBounds(112, 116, 141, 29);
		deposit.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Last Name  : ");
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(112, 166, 138, 29);
		deposit.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Deposit Amount: ");
		lblNewLabel_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel_1_1_1.setBounds(109, 217, 180, 36);
		deposit.add(lblNewLabel_1_1_1);
		
		depositAmt = new JTextField();
		depositAmt.setBounds(287, 221, 213, 29);
		deposit.add(depositAmt);
		depositAmt.setColumns(10);
		
		JButton btnNewButton = new JButton("Deposit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = firstName_1.getText() + "_" + lastName_1.getText();
				String message = bonk.depositAmount(name, Float.parseFloat(depositAmt.getText()));
				JOptionPane.showMessageDialog(null, message );	
			}
		});
		btnNewButton.setBackground(new Color(150, 173, 200));
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 16));
		btnNewButton.setBounds(326, 294, 126, 36);
		deposit.add(btnNewButton);
		
		firstName_1 = new JTextField();
		firstName_1.setColumns(10);
		firstName_1.setBounds(287, 119, 213, 29);
		deposit.add(firstName_1);
		
		lastName_1 = new JTextField();
		lastName_1.setColumns(10);
		lastName_1.setBounds(287, 169, 213, 29);
		deposit.add(lastName_1);

	}

}
