package forms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class Admin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField adminidtxf;
	private JTextField adminnametxf;
	private JTextField telphonetxf;
	private JTextField sextxf;
	private JTextField emailtxf;
	private JTextField passwordtxf;
	private JTextField confirmpasswordtxf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin frame = new Admin();
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
	public Admin() {
		setTitle("admin");
		setBackground(new Color(192, 192, 192));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 538, 507);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("admin id");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(32, 53, 76, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("admin name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(32, 109, 101, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("telphone");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(32, 161, 109, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("sex");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(32, 210, 49, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("email");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(32, 249, 49, 48);
		contentPane.add(lblNewLabel_5);
		
		adminidtxf = new JTextField();
		adminidtxf.setBounds(232, 52, 96, 20);
		contentPane.add(adminidtxf);
		adminidtxf.setColumns(10);
		
		adminnametxf = new JTextField();
		adminnametxf.setBounds(232, 108, 96, 20);
		contentPane.add(adminnametxf);
		adminnametxf.setColumns(10);
		
		telphonetxf = new JTextField();
		telphonetxf.setBounds(232, 160, 96, 20);
		contentPane.add(telphonetxf);
		telphonetxf.setColumns(10);
		
		sextxf = new JTextField();
		sextxf.setBounds(232, 209, 96, 20);
		contentPane.add(sextxf);
		sextxf.setColumns(10);
		
		emailtxf = new JTextField();
		emailtxf.setBounds(232, 265, 96, 20);
		contentPane.add(emailtxf);
		emailtxf.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {try {
				Class.forName("com.mysql.cj.jdbc.Driver");

				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/selling_fruits_management_system","root","");
		String sql="INSERT INTO admin VALUES(?,?,?,?,?,?,?)";
		PreparedStatement st=con.prepareStatement(sql);
		st.setInt(1, Integer.parseInt(adminidtxf.getText()));
		st.setString(2,adminnametxf.getText());
		st.setString(3, telphonetxf.getText());
		st.setString(4, sextxf.getText());
                st.setString(5, emailtxf.getText());
                st.setString(6, passwordtxf.getText());
                st.setString(7, confirmpasswordtxf.getText());
		
		
		st.executeUpdate();
		JOptionPane.showMessageDialog(btnNewButton, "data saved!!");
		
		st.close();
		con.close();
				
				
				
				
				
				
				
				
				
			} catch (Exception e2) {
				
			}
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(32, 405, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {adminidtxf.setText(null);
			adminnametxf.setText(null);
			sextxf.setText(null);
			telphonetxf.setText(null);
			emailtxf.setText(null);
			passwordtxf.setText(null);
			confirmpasswordtxf.setText(null);
			}
			
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(311, 405, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_6 = new JLabel("REGISTRATION FORM");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_6.setBounds(120, 11, 242, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_2 = new JLabel("password");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(32, 312, 101, 20);
		contentPane.add(lblNewLabel_2);
		
		passwordtxf = new JTextField();
		passwordtxf.setBounds(232, 309, 96, 20);
		contentPane.add(passwordtxf);
		passwordtxf.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("confirm password");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_7.setBounds(32, 360, 146, 20);
		contentPane.add(lblNewLabel_7);
		
		confirmpasswordtxf = new JTextField();
		confirmpasswordtxf.setBounds(232, 362, 96, 20);
		contentPane.add(confirmpasswordtxf);
		confirmpasswordtxf.setColumns(10);
	}
}
