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

public class motorbike extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					motorbike frame = new motorbike();
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
	public motorbike() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 450);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(10, 114, 594, 119);
		contentPane.add(panel);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon("D:\\eclipse\\Car4Rent1\\Homebottom\\Webp.net-resizeimage.png"));
		label.setBounds(10, 10, 182, 99);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Detail");
		label_1.setBounds(226, 10, 153, 99);
		panel.add(label_1);
		
		JButton button = new JButton("Select");
		button.setBounds(446, 39, 85, 21);
		panel.add(button);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(10, 266, 594, 119);
		contentPane.add(panel_1);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setIcon(new ImageIcon("D:\\eclipse\\Car4Rent1\\Homebottom\\Webp.net-resizeimage1.png"));
		label_2.setBounds(10, 10, 162, 99);
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("Detail");
		label_3.setBounds(226, 10, 153, 99);
		panel_1.add(label_3);
		
		JButton button_1 = new JButton("Select");
		button_1.setBounds(446, 39, 85, 21);
		panel_1.add(button_1);
		
		JLabel lblNewLabel = new JLabel("Motorbike");
		lblNewLabel.setFont(new Font("JasmineUPC", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel.setBounds(30, 60, 112, 44);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Booking mainpage = new Booking();
				mainpage.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("JasmineUPC", Font.BOLD | Font.ITALIC, 20));
		btnNewButton.setBounds(516, 68, 88, 31);
		contentPane.add(btnNewButton);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon("D:\\eclipse\\Car4Rent1\\Homebottom\\images.jpg"));
		label_4.setBackground(new Color(255, 228, 225));
		label_4.setBounds(0, 0, 636, 55);
		contentPane.add(label_4);
	}

}
