package heraldApp;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.ComponentAdapter;
import java.awt.CardLayout;


public class Gui {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui window = new Gui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 240, 240));
		frame.setBounds(100, 100, 701, 514);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 240, 240));
		panel.setBounds(0, 0, 688, 100);
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(240, 240, 240));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 17));
		btnNewButton.setBounds(397, 52, 121, 38);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sign In");
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(new Color(240, 240, 240));
		
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 17));
		btnNewButton_1.setBounds(529, 52, 116, 38);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("H@AP");
		lblNewLabel.setBounds(33, 32, 96, 43);
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(0, 0, 160));
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 24));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 240, 240));
		panel_1.setBounds(0, 98, 248, 377);
		frame.getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(258, 110, 416, 355);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new CardLayout(0, 0));
		
		JButton btnNewButton_4 = new JButton("Courses");
		btnNewButton_4.setBounds(10, 28, 228, 56);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_2.removeAll();
				panel_2.add(new Courses().panel_courses);
				panel_2.repaint();
				panel_2.revalidate();
			}
		});
		panel_1.setLayout(null);
		btnNewButton_4.setFont(new Font("Arial Black", Font.BOLD, 14));
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("About Us");
		btnNewButton_5.setBounds(10, 94, 228, 56);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_2.removeAll();
				panel_2.add(new About_us().panel_about);
				panel_2.repaint();
				panel_2.revalidate();
			}
		});
		btnNewButton_5.setFont(new Font("Arial Black", Font.BOLD, 14));
		panel_1.add(btnNewButton_5);
		
		JButton btnNewButton_3 = new JButton("Contact Us");
		btnNewButton_3.setBounds(10, 160, 228, 56);
		btnNewButton_3.addComponentListener(new ComponentAdapter() { 
		});
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_2.removeAll();
				panel_2.add(new ContactUs().frame);
				panel_2.repaint();
				panel_2.revalidate();
			}
		});
		btnNewButton_3.setFont(new Font("Arial Black", Font.BOLD, 14));
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("Alumni");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_2.removeAll();
				panel_2.add(new Alumni().panel_Alumni);
				panel_2.repaint();
				panel_2.revalidate();
			}
		});
		btnNewButton_2.setBounds(10, 226, 228, 56);
		btnNewButton_2.setFont(new Font("Arial Black", Font.BOLD, 14));
		panel_1.add(btnNewButton_2);
		
		JButton btnScholor = new JButton("Scholar");
		btnScholor.setBounds(10, 292, 228, 56);
		btnScholor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_2.removeAll();
				panel_2.add(new Scholar().panel_Scholar);
				panel_2.repaint();
				panel_2.revalidate();
			}
		});
		btnScholor.setFont(new Font("Arial Black", Font.BOLD, 14));
		panel_1.add(btnScholor);
		

		
		JPanel panel_3 = new JPanel();
		panel_2.add(panel_3, "name_18544160230700");
		panel_3.setLayout(null);
			panel_2.removeAll();
			panel_2.add(new Courses().panel_courses);
			panel_2.repaint();
			panel_2.revalidate();
		
	}
}
