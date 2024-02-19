package forms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class Buye_profile extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField idtxf;
	private JTextField nametxf;
	private JTextField sextxf;
	private JTextField telphonetxf;
	private JTextField emailtxf;
	private JTextField passwordtxf;
	private JTable table;
	private JTable table_1;
	private JTextField confirmpasswordtxf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Buye_profile frame = new Buye_profile();
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
	public Buye_profile() {
		setTitle("buyer_profile");
		setBackground(new Color(192, 192, 192));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 940, 519);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BUYER_PROFILE");
		lblNewLabel.setBounds(91, 11, 204, 20);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("buyer id");
		lblNewLabel_1.setBounds(26, 79, 49, 14);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("buyer name");
		lblNewLabel_2.setBounds(26, 125, 49, 14);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("sex");
		lblNewLabel_3.setBounds(26, 176, 49, 14);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("telphone");
		lblNewLabel_4.setBounds(26, 228, 107, 20);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("email");
		lblNewLabel_5.setBounds(26, 283, 71, 20);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("password");
		lblNewLabel_6.setBounds(26, 333, 107, 20);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBounds(10, 448, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {try {
				Class.forName("com.mysql.cj.jdbc.Driver");

				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/selling_fruits_management_system","root","");
		String sql="INSERT INTO buyer_profile VALUES(?,?,?,?,?,?)";
		PreparedStatement st=con.prepareStatement(sql);
		st.setInt(1, Integer.parseInt(idtxf.getText()));
		st.setString(2,nametxf.getText());
		st.setString(3, sextxf.getText());
		st.setString(4, telphonetxf.getText());
		st.setString(5, emailtxf.getText());
		st.setString(6, passwordtxf.getText());
		
		st.executeUpdate();
		JOptionPane.showMessageDialog(btnNewButton, "data saved!!");
		
		st.close();
		con.close();
				
				
				
				
				
				
				
				
				
			} catch (Exception e2) {
				
			}	
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("View");
		btnNewButton_1.setBounds(144, 448, 89, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.setBounds(292, 448, 89, 23);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Update");
		btnNewButton_3.setBounds(424, 448, 89, 23);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Cancel");
		btnNewButton_4.setBounds(563, 448, 89, 23);
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(btnNewButton_4);
		
		idtxf = new JTextField();
		idtxf.setBounds(203, 78, 96, 20);
		contentPane.add(idtxf);
		idtxf.setColumns(10);
		
		nametxf = new JTextField();
		nametxf.setBounds(203, 124, 96, 20);
		contentPane.add(nametxf);
		nametxf.setColumns(10);
		
		sextxf = new JTextField();
		sextxf.setBounds(203, 175, 96, 20);
		contentPane.add(sextxf);
		sextxf.setColumns(10);
		
		telphonetxf = new JTextField();
		telphonetxf.setBounds(203, 230, 96, 20);
		contentPane.add(telphonetxf);
		telphonetxf.setColumns(10);
		
		emailtxf = new JTextField();
		emailtxf.setBounds(203, 285, 96, 20);
		contentPane.add(emailtxf);
		emailtxf.setColumns(10);
		
		passwordtxf = new JTextField();
		passwordtxf.setBounds(203, 335, 96, 20);
		contentPane.add(passwordtxf);
		passwordtxf.setColumns(10);
		
		table = new JTable();
		table.setBounds(455, 117, 1, 1);
		contentPane.add(table);
		
		table_1 = new JTable();
		table_1.setBounds(305, 11, 580, 427);
		contentPane.add(table_1);
		
		JLabel lblNewLabel_7 = new JLabel("confirm password");
		lblNewLabel_7.setBounds(0, 396, 133, 14);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_7);
		
		confirmpasswordtxf = new JTextField();
		confirmpasswordtxf.setBounds(203, 395, 96, 20);
		contentPane.add(confirmpasswordtxf);
		confirmpasswordtxf.setColumns(10);
	}
}
