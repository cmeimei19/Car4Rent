import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import java.awt.Button;
import java.awt.Cursor;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;

public class firstpage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					firstpage frame = new firstpage();
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
	public firstpage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 450);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(221, 86, 200, 200);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Mei mei\\Desktop\\2019_1_Project_Car4Rent\\Logo\\1.png"));
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Start");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(106, 90, 205)));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login login = new login();
				login.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setBackground(new Color(230, 230, 250));
		btnNewButton.setFont(new Font("JasmineUPC", Font.BOLD | Font.ITALIC, 30));
		btnNewButton.setBounds(264, 281, 111, 33);
		contentPane.add(btnNewButton);
	}
}
