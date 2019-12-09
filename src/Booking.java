import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jdatepicker.DateModel;
import org.jdatepicker.JDateComponentFactory;
import org.jdatepicker.JDatePicker;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;


import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JCheckBox;
import java.awt.Checkbox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Properties;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.DefaultComboBoxModel;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;

public class Booking extends JFrame {

	private JPanel contentPane;
	
	int month = java.util.Calendar.getInstance().get(java.util.Calendar.MONTH);
    int year = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
    JLabel l = new JLabel("", JLabel.CENTER);
    String day = "";
    static JDialog d;
    JButton[] button = new JButton[49];
 
	/**
	 * Launch the application.
	 */
//    d = new JDialog();
//	d.setModal(true);
//    String[] header = { "Sun", "Mon", "Tue", "Wed", "Thur", "Fri", "Sat" };
//    JPanel p1 = new JPanel(new GridLayout(7, 7));
//    p1.setPreferredSize(new Dimension(430, 120));
//    
//    for (int x = 0; x <button> 6)
//        button[x].addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent ae) {
//                day = button[selection].getActionCommand();
//                d.dispose();
//            }
//        });
//    if (x < 7) {
//        button[x].setText(header[x]);
//        button[x].setForeground(Color.red);
//    }
//    p1.add(button[x]);
//}
//JPanel p2 = new JPanel(new GridLayout(1, 3));
//JButton previous = new JButton("<>");
//next.addActionListener(new ActionListener() {
//    public void actionPerformed(ActionEvent ae) {
//        month++;
//        displayDate();
//    }
//});
//p2.add(next);
//d.add(p1, BorderLayout.CENTER);
//d.add(p2, BorderLayout.SOUTH);
//d.pack();
//d.setLocationRelativeTo(parent);
//displayDate();
//d.setVisible(true);
//}
//
//		public void displayDate() {
//				for (int x = 7; x < button.length; x++)
//						button[x].setText("");
//				java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("MMMM yyyy");
//				java.util.Calendar cal = java.util.Calendar.getInstance();
//				cal.set(year, month, 1);
//				int dayOfWeek = cal.get(java.util.Calendar.DAY_OF_WEEK);
//				int daysInMonth = cal.getActualMaximum(java.util.Calendar.DAY_OF_MONTH);
//				for (int x = 6 + dayOfWeek, day = 1; day <= daysInMonth; x++, day++)
//					button[x].setText("" + day);
//				l.setText(sdf.format(cal.getTime()));
//				d.setTitle("Date Picker");
//		}
//
//		public String setPickedDate() {
//			if (day.equals(""))
//				return day;
//			java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MM-yyyy");
//			java.util.Calendar cal = java.util.Calendar.getInstance();
//			cal.set(year, month, Integer.parseInt(day));
//			return sdf.format(cal.getTime());
//		}
	public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Booking frame = new Booking();
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
	public Booking() {
		setBackground(new Color(230, 230, 250));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 450);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Car4Rent");
		lblNewLabel.setForeground(new Color(255, 192, 203));
		lblNewLabel.setFont(new Font("JasmineUPC", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(260, 10, 114, 45);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\eclipse\\Car4Rent1\\Homebottom\\images.jpg"));
		lblNewLabel_1.setBackground(new Color(255, 228, 225));
		lblNewLabel_1.setBounds(0, 0, 636, 55);
		contentPane.add(lblNewLabel_1);
		
		JLabel label_2 = new JLabel("Select Car Typpe  :");
		label_2.setFont(new Font("JasmineUPC", Font.BOLD, 25));
		label_2.setBounds(119, 293, 164, 37);
		contentPane.add(label_2);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBackground(new Color(230, 230, 250));
		comboBox_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(230, 230, 250)));
		comboBox_2.setFont(new Font("JasmineUPC", Font.ITALIC, 22));
		comboBox_2.setBounds(118, 168, 140, 31);
		contentPane.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBackground(new Color(230, 230, 250));
		comboBox_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(230, 230, 250)));
		comboBox_3.setFont(new Font("JasmineUPC", Font.ITALIC, 22));
		comboBox_3.setBounds(341, 168, 140, 31);
		contentPane.add(comboBox_3);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBackground(new Color(230, 230, 250));
		panel.setBounds(0, 0, 636, 413);
		contentPane.add(panel);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(310, 298, 194, 31);
		panel.add(comboBox_1);
		comboBox_1.setBackground(new Color(230, 230, 250));
		comboBox_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(230, 230, 250)));
		comboBox_1.setFont(new Font("JasmineUPC", Font.PLAIN, 22));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Eco Car","Motorbike"}));
		
		JLabel label = new JLabel("Car4Rent");
		label.setForeground(new Color(255, 192, 203));
		label.setFont(new Font("JasmineUPC", Font.BOLD | Font.ITALIC, 30));
		label.setBounds(260, 10, 114, 45);
		panel.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBackground(new Color(255, 228, 225));
		label_1.setBounds(0, 0, 636, 55);
		panel.add(label_1);
		
		JLabel label_3 = new JLabel("Select Car Typpe  :");
		label_3.setFont(new Font("JasmineUPC", Font.BOLD, 25));
		label_3.setBounds(119, 293, 164, 37);
		panel.add(label_3);
		
		JButton button_3 = new JButton("");
		button_3.setBorder(null);
		button_3.setBackground(new Color(230, 230, 250));
		button_3.setBounds(563, 348, 63, 55);
		panel.add(button_3);
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setBounds(118, 168, 140, 31);
		panel.add(comboBox_8);
		
		JComboBox comboBox_9 = new JComboBox();
		comboBox_9.setBounds(341, 168, 140, 31);
		panel.add(comboBox_9);
		
		JComboBox comboBox_12 = new JComboBox();
		comboBox_12.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(230, 230, 250)));
		comboBox_12.setBackground(new Color(230, 230, 250));
		comboBox_12.setFont(new Font("JasmineUPC", Font.PLAIN, 22));
		comboBox_12.setBounds(360, 241, 50, 31);
		panel.add(comboBox_12);
		
		JComboBox comboBox_13 = new JComboBox();
		comboBox_13.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(230, 230, 250)));
		comboBox_13.setBackground(new Color(230, 230, 250));
		comboBox_13.setFont(new Font("JasmineUPC", Font.PLAIN, 22));
		comboBox_13.setBounds(416, 241, 50, 31);
		panel.add(comboBox_13);
		
		JLabel lblProvince = new JLabel("Province :");
		lblProvince.setBounds(151, 91, 80, 31);
		panel.add(lblProvince);
		lblProvince.setFont(new Font("JasmineUPC", Font.BOLD | Font.ITALIC, 25));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("JasmineUPC", Font.PLAIN, 22));
		comboBox.setBackground(new Color(230, 230, 250));
		comboBox.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(230, 230, 250)));
		comboBox.setBounds(241, 93, 203, 31);
		panel.add(comboBox);
		
		JButton btnNewButton = new JButton("Click");
		btnNewButton.setBackground(new Color(82, 63, 110));
		btnNewButton.setForeground(new Color(255, 192, 203));
		btnNewButton.setFont(new Font("JasmineUPC", Font.BOLD | Font.ITALIC, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(260, 213, 85, 22);
		panel.add(btnNewButton);
		
		JLabel lblPickupDate = new JLabel("Pick-up Date");
		lblPickupDate.setBounds(119, 136, 139, 31);
		panel.add(lblPickupDate);
		lblPickupDate.setFont(new Font("JasmineUPC", Font.ITALIC, 25));
		
		JLabel lblDropoffDate = new JLabel("Drop-off Date");
		lblDropoffDate.setBounds(341, 136, 140, 31);
		panel.add(lblDropoffDate);
		lblDropoffDate.setFont(new Font("JasmineUPC", Font.ITALIC, 25));
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setBounds(167, 211, 38, 24);
		panel.add(lblTime);
		lblTime.setFont(new Font("JasmineUPC", Font.ITALIC, 25));
		
		JLabel lblTime_1 = new JLabel("Time");
		lblTime_1.setBounds(395, 211, 38, 24);
		panel.add(lblTime_1);
		lblTime_1.setFont(new Font("JasmineUPC", Font.ITALIC, 25));
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBackground(new Color(230, 230, 250));
		comboBox_5.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(230, 230, 250)));
		comboBox_5.setBounds(185, 241, 50, 31);
		panel.add(comboBox_5);
		comboBox_5.setFont(new Font("JasmineUPC", Font.PLAIN, 22));
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBackground(new Color(230, 230, 250));
		comboBox_4.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(230, 230, 250)));
		comboBox_4.setBounds(129, 241, 50, 31);
		panel.add(comboBox_4);
		comboBox_4.setFont(new Font("JasmineUPC", Font.PLAIN, 22));
		
		
		JButton button_1 = new JButton("Search");
		button_1.setBounds(185, 358, 276, 45);
		panel.add(button_1);
		button_1.setForeground(new Color(255, 192, 203));
		button_1.setBackground(new Color(82, 63, 110));
		button_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//if-else choose car type
				if(comboBox_1.getSelectedItem()=="Eco Car") {
					ecocar ecocar = new ecocar();
					ecocar.setVisible(true);
					setVisible(false);
				}else if(comboBox_1.getSelectedItem()=="Motorbike") {
					motorbike motorbike = new motorbike();
					motorbike.setVisible(true);
					setVisible(false);
				}
				
			}
		});
		button_1.setFont(new Font("JasmineUPC", Font.BOLD | Font.ITALIC, 30));
		

        
	}
}
