import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.ImageIcon;

public class money extends JFrame {

	private JPanel contentPane;
	private JTextField FromUSDtextField;
	private JButton btnClear;
	private JTextField FromJPYtextField;
	private JTextField THBtextField;
	private JTextField JTHBtextField;
	private JTextField ToJPYTtextField;
	private JTextField CNYtextField;
	private JTextField MMKtextField;
	private JTextField LAKtextField;
	private JTextField KRWtextField;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					money frame = new money();
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
	public money() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 450);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMoneyExchang = new JLabel("Money Exchange");
		lblMoneyExchang.setHorizontalAlignment(SwingConstants.CENTER);
		lblMoneyExchang.setBounds(196, 40, 250, 37);
		lblMoneyExchang.setFont(new Font("JasmineUPC", Font.BOLD | Font.ITALIC, 40));
		contentPane.add(lblMoneyExchang);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("JasmineUPC", Font.ITALIC, 30));
		comboBox.setBounds(96, 126, 216, 40);
		comboBox.setMaximumRowCount(20);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			
			//if-else select convert
			{    
				if(comboBox.getSelectedItem()=="USD-THB") {
					FromUSDtextField.setVisible(true);
					THBtextField.setVisible(true);
				}else if(comboBox.getSelectedItem()=="JPY-THB") {
					FromJPYtextField.setVisible(true);
					THBtextField.setVisible(true);
				}
				else if(comboBox.getSelectedItem()=="CNY-THB") {
					CNYtextField.setVisible(true);
					THBtextField.setVisible(true);
			}
				else if(comboBox.getSelectedItem()=="MMK-THB") {
					MMKtextField.setVisible(true);
					THBtextField.setVisible(true);
			}
				else if(comboBox.getSelectedItem()=="LAK-THB") {
					LAKtextField.setVisible(true);
					THBtextField.setVisible(true);
			}
				else if(comboBox.getSelectedItem()=="KRW-THB") {
					KRWtextField.setVisible(true);
					THBtextField.setVisible(true);
			}
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "USD-THB", "JPY-THB", "CNY-THB", "MMK-THB", "LAK-THB", "KRW-THB"}));
		contentPane.add(comboBox);
		
		
		
		FromUSDtextField = new JTextField();
		FromUSDtextField.setFont(new Font("JasmineUPC", Font.PLAIN, 30));
		FromUSDtextField.setBounds(123, 205, 160, 38);
		FromUSDtextField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fusd = FromUSDtextField.getText();
				int cfusd = Integer.parseInt(fusd);
				int result = cfusd*30;
				THBtextField.setText(Integer.toString(result));
			}
		});
		contentPane.add(FromUSDtextField);
		FromUSDtextField.setColumns(10);
		FromUSDtextField.setVisible(false);
		
		//clear textfield and text
		btnClear = new JButton("Clear");
		btnClear.setBackground(new Color(230, 230, 250));
		btnClear.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(106, 90, 205)));
		btnClear.setFont(new Font("JasmineUPC", Font.ITALIC, 30));
		btnClear.setBounds(351, 126, 165, 40);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FromUSDtextField.setVisible(false);
				FromUSDtextField.setText("");
				FromJPYtextField.setVisible(false);
				FromJPYtextField.setText("");
				THBtextField.setVisible(false);
				THBtextField.setText("");
				CNYtextField.setVisible(false);
				CNYtextField.setText("");
				MMKtextField.setVisible(false);
				MMKtextField.setText("");
				LAKtextField.setVisible(false);
				LAKtextField.setText("");
				KRWtextField.setVisible(false);
				KRWtextField.setText("");
			}
		});
		contentPane.add(btnClear);
		
		FromJPYtextField = new JTextField();
		FromJPYtextField.setBounds(123, 203, 160, 41);
		FromJPYtextField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fjpy = FromJPYtextField.getText(); //get value from...textfield
				int cfthb = Integer.parseInt(fjpy); //string to int
				double result = cfthb*0.28;
				THBtextField.setText(Double.toString(result));
			}
		});
		contentPane.add(FromJPYtextField);
		FromJPYtextField.setColumns(10);
		FromJPYtextField.setVisible(false);
		
		THBtextField = new JTextField();
		THBtextField.setFont(new Font("JasmineUPC", Font.PLAIN, 30));
		THBtextField.setBounds(333, 205, 165, 38);
		contentPane.add(THBtextField);
		THBtextField.setColumns(10);
		THBtextField.setVisible(false); //don't show before convert
		
		JTHBtextField = new JTextField();
		JTHBtextField.setBounds(121, 204, 162, 40);
		contentPane.add(JTHBtextField);
		JTHBtextField.setColumns(10);
		JTHBtextField.setVisible(false);
		
		ToJPYTtextField = new JTextField();
		ToJPYTtextField.setBounds(333, 205, 165, 38);
		contentPane.add(ToJPYTtextField);
		ToJPYTtextField.setColumns(10);
		ToJPYTtextField.setVisible(false);
		
		CNYtextField = new JTextField();
		CNYtextField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fcny = CNYtextField.getText();
				int cfthb = Integer.parseInt(fcny);
				double result = cfthb*4.3620;
				THBtextField.setText(Double.toString(result));
			}
		});
		CNYtextField.setBounds(121, 205, 163, 38);
		contentPane.add(CNYtextField);
		CNYtextField.setColumns(10);
		CNYtextField.setVisible(false);
		
		MMKtextField = new JTextField();
		MMKtextField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fmmk = MMKtextField.getText();
				int cfthb = Integer.parseInt(fmmk);
				double result = cfthb*0.0202;
				THBtextField.setText(Double.toString(result));
			}
		});
		MMKtextField.setBounds(123, 205, 160, 40);
		contentPane.add(MMKtextField);
		MMKtextField.setColumns(10);
		MMKtextField.setVisible(false);
		
		LAKtextField = new JTextField();
		LAKtextField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String flak = LAKtextField.getText();
				int cfthb = Integer.parseInt(flak);
				double result = cfthb*0.3429;
				THBtextField.setText(Double.toString(result));
			}
		});
		LAKtextField.setBounds(121, 205, 160, 40);
		contentPane.add(LAKtextField);
		LAKtextField.setColumns(10);
		LAKtextField.setVisible(false);
		
		KRWtextField = new JTextField();
		KRWtextField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fkrw = KRWtextField.getText();
				int cfthb = Integer.parseInt(fkrw);
				double result = cfthb*0.3429;
				THBtextField.setText(Double.toString(result));
			}
		});
		KRWtextField.setBounds(123, 205, 160, 40);
		contentPane.add(KRWtextField);
		KRWtextField.setColumns(10);
		KRWtextField.setVisible(false);
		
		btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				payment payment = new payment();
				payment.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setBackground(new Color(230, 230, 250));
		btnNewButton.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(106, 90, 205)));
		btnNewButton.setFont(new Font("JasmineUPC", Font.BOLD | Font.ITALIC, 25));
		btnNewButton.setBounds(541, 376, 85, 27);
		contentPane.add(btnNewButton);
		THBtextField.setVisible(false);
		CNYtextField.setVisible(false);
		
		
	}
}