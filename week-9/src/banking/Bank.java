package banking;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Hashtable;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.CardLayout;

class Bonking{
	private String name;
    private float amount;
    private int choice;

    private Hashtable<String, Float> details = new Hashtable<String, Float>();


    public String getName() {
        return name;
    }

    public float getAmount() {
        return amount;
    }

    public int getChoice() {
        return choice;
    }

    private boolean checkAccount(String name) {
        return details.containsKey(name);
    }

    public String createAccount(String name, float amount) {
        if (checkAccount(name)) {
            return "There is already an account under this name!";
        }
        details.put(name, amount);
        return "Account created successfully";
    }

    public String depositAmount(String name, float amount) {

        if (!checkAccount(name)) {
            
            return "There is no user with this name!";
        }

        float currentAmount = details.get(name);

        if (amount < 0) {
        
            return "The amount cannot be in negative, please try again!";
        }

        details.replace(name, currentAmount + amount);
        return "Amount Deposited Successfully!";
    }

    public String withdrawAmount(String name, float amount) {

        if (!checkAccount(name)) {
            return "There is no user under this name!";
        }

        float prevBalance = details.get(name);

        if (amount < 0) {
            return "The amount cannot be in negative, please try again!";
        }

        if (prevBalance < amount) {
          
            return "Exceeded current amount!";
        }

        details.replace(name, prevBalance - amount);
        return "Amount Withdrawn Successfully!";
    }

    public String checkBalance(String name) {

        if (!checkAccount(name)) {
            return "There is no account under this name!";
        }

        return details.get(name).toString();
    }
}
public class Bank {
	
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bank window = new Bank();
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
	public Bank() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Bonking bonk = new Bonking();
		frame = new JFrame();
		frame.setBounds(100, 100, 826, 537);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(150, 173, 200));
		
		JPanel displayPanel = new JPanel();
		displayPanel.setBackground(new Color(255, 252, 247));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(displayPanel, GroupLayout.DEFAULT_SIZE, 818, Short.MAX_VALUE)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 818, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(4)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(displayPanel, GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE))
		);
		frame.getContentPane().add(displayPanel);
		displayPanel.setLayout(new CardLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		displayPanel.add(panel_1, "name_42039189696700");
		panel_1.setLayout(null);
		panel.setLayout(null);
		displayPanel.removeAll();
		displayPanel.add(new Deposit(bonk).deposit);
		displayPanel.repaint();
		displayPanel.revalidate();
		
		
		JLabel lblNewLabel = new JLabel("Garima Simon Bank");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		lblNewLabel.setBounds(311, 10, 219, 34);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Create Account");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayPanel.removeAll();
				displayPanel.add(new CreateAccount(bonk).createAccount);
				displayPanel.repaint();
				displayPanel.revalidate();
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnNewButton.setBounds(51, 70, 144, 21);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Deposit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayPanel.removeAll();
				displayPanel.add(new Deposit(bonk).deposit);
				displayPanel.repaint();
				displayPanel.revalidate();
				
			}
		});
		btnNewButton_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnNewButton_1.setBounds(236, 70, 144, 21);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Withdraw");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayPanel.removeAll();
				displayPanel.add(new Withdraw(bonk).withdraw);
				displayPanel.repaint();
				displayPanel.revalidate();
			}
		});
		btnNewButton_2.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnNewButton_2.setBounds(427, 70, 144, 21);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Check Balance");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayPanel.removeAll();
				displayPanel.add(new checkBalance(bonk).checkBalance);
				displayPanel.repaint();
				displayPanel.revalidate();
			}
		});
		btnNewButton_3.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnNewButton_3.setBounds(615, 70, 144, 21);
		panel.add(btnNewButton_3);
		frame.getContentPane().setLayout(groupLayout);
	}
}
