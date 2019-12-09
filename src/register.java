import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.border.MatteBorder;
import javax.swing.border.BevelBorder;

public class register extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_6;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JPasswordField conpasswordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					register frame = new register();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public register() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 450);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Register");
		lblNewLabel.setFont(new Font("JasmineUPC", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel.setBounds(397, 59, 73, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setFont(new Font("JasmineUPC", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(226, 92, 92, 15);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBackground(new Color(230, 230, 250));
		textField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(72, 61, 139)));
		textField.setFont(new Font("JasmineUPC", Font.PLAIN, 18));
		textField.setBounds(328, 90, 198, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Last Name");
		lblNewLabel_2.setFont(new Font("JasmineUPC", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(226, 129, 92, 15);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(230, 230, 250));
		textField_1.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(72, 61, 139)));
		textField_1.setFont(new Font("JasmineUPC", Font.PLAIN, 18));
		textField_1.setBounds(328, 128, 198, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Email");
		lblNewLabel_3.setFont(new Font("JasmineUPC", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(226, 208, 92, 15);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBackground(new Color(230, 230, 250));
		textField_2.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(72, 61, 139)));
		textField_2.setFont(new Font("JasmineUPC", Font.PLAIN, 18));
		textField_2.setBounds(328, 167, 198, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Password");
		lblNewLabel_4.setFont(new Font("JasmineUPC", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(226, 247, 92, 15);
		contentPane.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBackground(new Color(230, 230, 250));
		textField_3.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(72, 61, 139)));
		textField_3.setFont(new Font("JasmineUPC", Font.PLAIN, 18));
		textField_3.setBounds(328, 207, 198, 19);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Confirm Password");
		lblNewLabel_5.setFont(new Font("JasmineUPC", Font.PLAIN, 19));
		lblNewLabel_5.setBounds(226, 284, 103, 15);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Phone");
		lblNewLabel_6.setFont(new Font("JasmineUPC", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(226, 320, 92, 17);
		contentPane.add(lblNewLabel_6);
		
		textField_6 = new JTextField();
		textField_6.setBackground(new Color(230, 230, 250));
		textField_6.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(72, 61, 139)));
		textField_6.setFont(new Font("JasmineUPC", Font.PLAIN, 18));
		textField_6.setBounds(328, 318, 198, 19);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("JasmineUPC", Font.PLAIN, 20));
		lblUsername.setBounds(226, 168, 92, 15);
		contentPane.add(lblUsername);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(230, 230, 250));
		passwordField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(72, 61, 139)));
		passwordField.setFont(new Font("JasmineUPC", Font.PLAIN, 18));
		passwordField.setBounds(328, 244, 198, 19);
		contentPane.add(passwordField);
		
				
		JButton btnRegister = new JButton("Register");
		btnRegister.setForeground(new Color(248, 248, 255));
		btnRegister.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login login = new login();
				String pass = String.copyValueOf(passwordField.getPassword());
				String conpass = String.copyValueOf(conpasswordField.getPassword());
				
				if(pass.equals(conpass)) {
					JOptionPane.showMessageDialog(null,"Register Completed");
					setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					login.setVisible(true);
					setVisible(false);
				}else if(pass!=conpass) {
					JOptionPane.showMessageDialog(null,"Password Not Match");
					setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					setVisible(true);
				}
				
			}
		});
		btnRegister.setBackground(new Color(149, 125, 173));
		btnRegister.setFont(new Font("JasmineUPC", Font.BOLD, 20));
		btnRegister.setBounds(434, 370, 92, 26);
		contentPane.add(btnRegister);
		
		JButton btnBack = new JButton("Back");
		btnBack.setForeground(new Color(248, 248, 255));
		btnBack.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login login = new login();
				login.setVisible(true);
				setVisible(false);
			}
		});
		btnBack.setBackground(new Color(149, 125, 173));
		btnBack.setFont(new Font("JasmineUPC", Font.BOLD, 20));
		btnBack.setBounds(291, 369, 92, 27);
		contentPane.add(btnBack);
		
		conpasswordField = new JPasswordField();
		conpasswordField.setBackground(new Color(230, 230, 250));
		conpasswordField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(72, 61, 139)));
		conpasswordField.setFont(new Font("JasmineUPC", Font.PLAIN, 18));
		conpasswordField.setBounds(328, 284, 198, 19);
		contentPane.add(conpasswordField);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(210, 145, 188));
		panel.setBounds(167, 0, 469, 34);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(149, 125, 173));
		panel_1.setBounds(0, 0, 167, 413);
		contentPane.add(panel_1);
	}
}
