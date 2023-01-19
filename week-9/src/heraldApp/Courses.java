package heraldApp;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class Courses extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Create the panel.
	 */
	JPanel panel_courses;
	public Courses() {
		panel_courses = new JPanel();
		panel_courses.setBounds(100, 100, 498, 338);
		panel_courses.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Our Courses");
		lblNewLabel_1.setBounds(166, 7, 107, 23);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 16));
		panel_courses.add(lblNewLabel_1);
		
		JTextPane txtpnYearComputational = new JTextPane();
		txtpnYearComputational.setBackground(new Color(240, 240, 240));
		txtpnYearComputational.setFont(new Font("Arial", Font.PLAIN, 12));
		txtpnYearComputational.setText("Year 1: \r\nComputational Mathematics\r\nFundamentals of Computing\r\nInternet Software Architecture\r\nAcademic Skills and Team-Based Learning\r\nEmbedded System Programming\r\nIntroductory Programming And Problem Solving\r\n--------------------------------------------------------------------------------\r\nYear 2:\r\nCollaborative Development\r\nDistributed and Cloud System Programming\r\nNumerical Methods and Concurrency\r\nObject-Oriented Design and Programming\r\nConcepts and Technologies of AI\r\nHuman - Computer Interaction\r\n--------------------------------------------------------------------------------\r\nYear3:\r\nBig Data\r\nHigh Performance Computing\r\nProject and Professionalism\r\nArtificial Intelligence and Machine Learning\r\nComplex Systems");
		txtpnYearComputational.setBounds(0, 40, 498, 298);
		panel_courses.add(txtpnYearComputational);
	}
}
