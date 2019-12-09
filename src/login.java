import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import java.awt.Cursor;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setForeground(new Color(230, 230, 250));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 450);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(216, 191, 216));
		contentPane.setForeground(new Color(255, 240, 245));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("");
		lblUsername.setIcon(new ImageIcon("C:\\Users\\Mei mei\\Desktop\\2019_1_Project_Car4Rent\\Logo\\rsz_kissclipart-user-icon-png-clipart-computer-icons-user-a4eb14b4e1bef511.png"));
		lblUsername.setFont(new Font("JasmineUPC", Font.ITALIC, 21));
		lblUsername.setBounds(160, 171, 32, 32);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("");
		lblPassword.setIcon(new ImageIcon("C:\\Users\\Mei mei\\Downloads\\rsz_kisspng-padlock-computer-icons-toolbar-icon-design-padlock-icon-5b5bce02dcf058989326341532743170905.png"));
		lblPassword.setFont(new Font("JasmineUPC", Font.ITALIC, 21));
		lblPassword.setBounds(160, 220, 32, 32);
		contentPane.add(lblPassword);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("JasmineUPC", Font.PLAIN, 18));
		txtUsername.setBounds(213, 171, 234, 32);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		

		
		JButton btnLog = new JButton("LogIn");
		btnLog.setBorder(null);
		btnLog.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLog.setBackground(new Color(248, 248, 255));
		btnLog.setFont(new Font("JasmineUPC", Font.ITALIC, 18));
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String password = txtPassword.getText();
				String username = txtUsername.getText();
				
				if(password.contains("first") && username.contains("Earn")) {
					txtPassword.setText(null);
					txtUsername.setText(null);
					
				Booking mainpage = new Booking();
				mainpage.setVisible(true);
				setVisible(false);
					
				}else {
					JOptionPane.showMessageDialog(null, "Invalid Login Deatails","Login Error",JOptionPane.ERROR_MESSAGE);
					txtPassword.setText(null);
					txtUsername.setText(null);
				}
				
				
			}
		});
		btnLog.setBounds(160, 323, 135, 32);
		contentPane.add(btnLog);
		
		JButton btnNewButton = new JButton("Create Account");
		btnNewButton.setBorder(null);
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBackground(new Color(248, 248, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				register register=new register();
				register.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("JasmineUPC", Font.ITALIC, 17));
		btnNewButton.setBounds(313, 323, 135, 32);
		contentPane.add(btnNewButton);
		
		txtPassword = new JPasswordField();
		txtPassword.setFont(new Font("JasmineUPC", Font.PLAIN, 18));
		txtPassword.setBounds(214, 220, 233, 32);
		contentPane.add(txtPassword);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Mei mei\\Desktop\\2019_1_Project_Car4Rent\\Logo\\1.png"));
		lblNewLabel_1.setBounds(160, 10, 335, 117);
		contentPane.add(lblNewLabel_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Remember Password");
		chckbxNewCheckBox.setFont(new Font("JasmineUPC", Font.ITALIC, 18));
		chckbxNewCheckBox.setBackground(new Color(216, 191, 216));
		chckbxNewCheckBox.setBounds(260, 266, 170, 19);
		contentPane.add(chckbxNewCheckBox);
	}
}
