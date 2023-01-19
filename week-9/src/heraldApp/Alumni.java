package heraldApp;

import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Alumni extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Create the panel.
	 */
	JPanel panel_Alumni;
	public Alumni() {
		panel_Alumni = new JPanel();
		setLayout(null);
		panel_Alumni.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Our Alumni");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblNewLabel.setBounds(154, 10, 103, 32);
		panel_Alumni.add(lblNewLabel);
		
		JTextArea txtrSugamPaudyalRoshish = new JTextArea();
		txtrSugamPaudyalRoshish.setWrapStyleWord(true);
		txtrSugamPaudyalRoshish.setFont(new Font("Arial", Font.PLAIN, 14));
		txtrSugamPaudyalRoshish.setText("\r\nSugam Paudyal\r\nRoshish Shrestha\r\nSimon Pradhananga\r\nSimonta Pradhananga\r\nSimanta Pradhananga\r\n");
		txtrSugamPaudyalRoshish.setEditable(false);
		txtrSugamPaudyalRoshish.setBounds(10, 52, 430, 238);
		panel_Alumni.add(txtrSugamPaudyalRoshish);
			
	}
}
