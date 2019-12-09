import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class payment extends JFrame {

	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					payment frame = new payment();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	ButtonGroup group = new ButtonGroup();
	/**
	 * Create the frame.
	 */
	public payment() {
		setBackground(new Color(230, 230, 250));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 450);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setForeground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPaymrent = new JLabel("Payment");
		lblPaymrent.setHorizontalAlignment(SwingConstants.CENTER);
		lblPaymrent.setFont(new Font("JasmineUPC", Font.BOLD | Font.ITALIC, 35));
		lblPaymrent.setBounds(267, 10, 113, 57);
		contentPane.add(lblPaymrent);
		
		JLabel lblNewLabel = new JLabel("    \r\nPay at the bank");
		lblNewLabel.setFont(new Font("JasmineUPC", Font.ITALIC, 26));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Mei mei\\Desktop\\2019_1_Project_Car4Rent\\Logo\\rsz_bank-building.png"));
		lblNewLabel.setBounds(249, 90, 262, 57);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("     Pay by card");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Mei mei\\Desktop\\2019_1_Project_Car4Rent\\Logo\\rsz_credit-cards-payment.png"));
		lblNewLabel_1.setFont(new Font("JasmineUPC", Font.ITALIC, 26));
		lblNewLabel_1.setBounds(249, 157, 187, 57);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("    Cash payment");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Mei mei\\Desktop\\2019_1_Project_Car4Rent\\Logo\\rsz_money-bag.png"));
		lblNewLabel_2.setFont(new Font("JasmineUPC", Font.ITALIC, 26));
		lblNewLabel_2.setBounds(249, 224, 213, 38);
		contentPane.add(lblNewLabel_2);
		
		JButton btnCompleted = new JButton("Completed");
		btnCompleted.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Booking mainpage = new Booking();
				mainpage.setVisible(true);
				setVisible(false);
			}
		});
		btnCompleted.setBackground(new Color(230, 230, 250));
		btnCompleted.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(106, 90, 205)));
		btnCompleted.setFont(new Font("JasmineUPC", Font.BOLD | Font.ITALIC, 36));
		btnCompleted.setBounds(237, 320, 171, 47);
		contentPane.add(btnCompleted);
		
		JRadioButton radioButton = new JRadioButton("");
		radioButton.setBackground(new Color(230, 230, 250));
		radioButton.setBounds(203, 110, 21, 21);
		contentPane.add(radioButton);
		group.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("");
		radioButton_1.setBackground(new Color(230, 230, 250));
		radioButton_1.setBounds(203, 177, 21, 21);
		contentPane.add(radioButton_1);
		group.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("");
		radioButton_2.setBackground(new Color(230, 230, 250));
		radioButton_2.setBounds(203, 235, 21, 21);
		contentPane.add(radioButton_2);
		group.add(radioButton_2);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon("C:\\Users\\Mei mei\\Desktop\\2019_1_Project_Car4Rent\\Logo\\rsz_dollar-exchange.png"));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				money money = new money();
				money.setVisible(true);
				setVisible(false);
			}
		});
		button.setBorder(null);
		button.setBackground(new Color(230, 230, 250));
		button.setBounds(563, 348, 63, 55);
		contentPane.add(button);
	}
}
