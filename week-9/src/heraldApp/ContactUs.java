package heraldApp;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;

public class ContactUs extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	JPanel frame;
	private JTextField textField;
	private JTextField queryField;
	private JTextField emailField;
	private JTextField lastName;
	private JTextField firstName;
	/**
	 * Create the panel.
	 */
	static boolean validateEmail(String email) {
        String regex = "^np+[0-9]+cs+[0-9]+s+[0-9]{6}+@heraldcollege\\.edu\\.np$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
	public ContactUs() {
		frame = new JPanel();
		frame.setBounds(100, 100, 450, 300);

		
		textField = new JTextField();
		textField.setBounds(10, 101, 168, 26);
		textField.setColumns(10);
		frame.setLayout(null);
		frame.setVisible(false);
		
		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblNewLabel.setBounds(49, 78, 86, 21);
		frame.add(lblNewLabel);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblLastName.setBounds(259, 78, 85, 21);
		frame.add(lblLastName);
		
		queryField = new JTextField();
		queryField.setColumns(10);
		queryField.setBounds(259, 197, 150, 31);
		frame.add(queryField);
		
		JLabel lblContactUs = new JLabel("Contact Us");
		lblContactUs.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblContactUs.setBounds(170, 10, 114, 31);
		frame.add(lblContactUs);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblEmail.setBounds(49, 166, 44, 21);
		frame.add(lblEmail);
		
		JLabel lblQueries = new JLabel("Queries");
		lblQueries.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblQueries.setBounds(259, 166, 61, 21);
		frame.add(lblQueries);
		
		emailField = new JTextField();
		emailField.setColumns(10);
		emailField.setBounds(49, 197, 167, 31);
		frame.add(emailField);
		
		lastName = new JTextField();
		lastName.setColumns(10);
		lastName.setBounds(259, 109, 150, 31);
		frame.add(lastName);
		
		JButton submitButton = new JButton("Submit");
		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contactValid();
			}
		});
		submitButton.setForeground(new Color(64, 0, 64));
		submitButton.setFont(new Font("Arial Black", Font.BOLD, 15));
		submitButton.setBounds(180, 259, 96, 31);
		frame.add(submitButton);
		

		
		firstName = new JTextField();
		firstName.setColumns(10);
		firstName.setBounds(49, 109, 167, 31);
		frame.add(firstName);
		frame.setVisible(true);
	}
	public void contactValid() {
		JLabel invalidEmailLabel = new JLabel("");
		invalidEmailLabel.setForeground(new Color(255, 0, 0));
		invalidEmailLabel.setBounds(26, 262, 94, 13);
		frame.add(invalidEmailLabel);
		
		JLabel invalidFirstName = new JLabel("");
		invalidFirstName.setForeground(new Color(255, 0, 0));
		invalidFirstName.setBounds(26, 127, 45, 13);
		frame.add(invalidFirstName);
		
		JLabel invalidLastName = new JLabel("");
		invalidLastName.setForeground(Color.RED);
		invalidLastName.setBounds(329, 127, 45, 13);
		frame.add(invalidLastName);
		
		JLabel invalidQuery = new JLabel("");
		invalidQuery.setForeground(Color.RED);
		invalidQuery.setBounds(329, 262, 45, 13);
		frame.add(invalidQuery);
		
		if (!validateEmail(emailField.getText())) {
			invalidEmailLabel.setText("Invalid Email!");
		} else {
			invalidEmailLabel.setText("");	
		}
		if(emailField.getText().isEmpty() || firstName.getText().isEmpty()|| lastName.getText().isEmpty() || queryField.getText().isEmpty()) {
			 JOptionPane.showMessageDialog(frame, "Please fill in all the fields", "Error", JOptionPane.ERROR_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(null, "Thank you for your querry,Your query has been submitted");
		}
	}
}
