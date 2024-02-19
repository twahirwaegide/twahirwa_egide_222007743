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

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField emailtxf;
	private JTextField passwordtxf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("Login");
		setBackground(new Color(192, 192, 192));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 572, 499);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("email");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(30, 97, 82, 56);
		contentPane.add(lblNewLabel);
		
		emailtxf = new JTextField();
		emailtxf.setBounds(278, 110, 96, 34);
		contentPane.add(emailtxf);
		emailtxf.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(30, 227, 112, 17);
		contentPane.add(lblNewLabel_1);
		
		passwordtxf = new JTextField();
		passwordtxf.setBounds(278, 220, 96, 34);
		contentPane.add(passwordtxf);
		passwordtxf.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Login_Form");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(162, 45, 166, 25);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {try {
				Class.forName("com.mysql.cj.jdbc.Driver");

				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/selling_fruits_management_system","root","");
		String sql="INSERT INTO login VALUES(?,?)";
		PreparedStatement st=con.prepareStatement(sql);
		st.setInt(1, Integer.parseInt(emailtxf.getText()));
		st.setString(2,passwordtxf.getText());
		
		
		st.executeUpdate();
		JOptionPane.showMessageDialog(btnNewButton, "data saved!!");
		
		st.close();
		con.close();
				
				
				
				
				
				
				
			} catch (Exception e2) {
				
			}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(105, 372, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {emailtxf.setText(null);
			passwordtxf.setText(null);
		
			}
		
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(356, 374, 89, 23);
		contentPane.add(btnNewButton_1);
	}

}
