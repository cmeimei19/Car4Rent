import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;

public class ecocar extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ecocar frame = new ecocar();
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
	public ecocar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 452);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 114, 594, 119);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\eclipse\\Car4Rent1\\Homebottom\\2019_24.png"));
		lblNewLabel.setBounds(10, 10, 207, 99);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Detail");
		lblNewLabel_1.setFont(new Font("JasmineUPC", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(273, 11, 153, 99);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Select");
		btnNewButton.setFont(new Font("JasmineUPC", Font.BOLD | Font.ITALIC, 16));
		btnNewButton.setBounds(498, 47, 86, 26);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(10, 266, 594, 119);
		contentPane.add(panel_1);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon("D:\\eclipse\\Car4Rent1\\Homebottom\\aeafef-1.png"));
		label.setBounds(10, 10, 214, 99);
		panel_1.add(label);
		
		JLabel lblDetail = new JLabel("Detail");
		lblDetail.setBounds(280, 10, 153, 99);
		panel_1.add(lblDetail);
		
		JButton btnSelect = new JButton("Select");
		btnSelect.setFont(new Font("JasmineUPC", Font.BOLD | Font.ITALIC, 16));
		btnSelect.setBounds(500, 44, 84, 27);
		panel_1.add(btnSelect);
		
		JLabel lblNewLabel_2 = new JLabel("Eco Car");
		lblNewLabel_2.setFont(new Font("JasmineUPC", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel_2.setBounds(35, 63, 87, 41);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Booking mainpage = new Booking();
				mainpage.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("JasmineUPC", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_1.setBounds(508, 69, 96, 30);
		contentPane.add(btnNewButton_1);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("D:\\eclipse\\Car4Rent1\\Homebottom\\images.jpg"));
		label_1.setBackground(new Color(255, 228, 225));
		label_1.setBounds(0, 0, 636, 55);
		contentPane.add(label_1);
	}
}
