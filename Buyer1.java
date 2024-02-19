package forms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTable;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class Buyer1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField buyernametxf;
	private JTextField sextxf;
	private JTextField buyeridtxf;
	private JTextField telphonetxf;
	private JTextField emailtxf;
	private JTextField passwordtxf;
	private JTextField confirmpasswordtxf;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Buyer1 frame = new Buyer1();
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
	public Buyer1() {
		setTitle("buyer1");
		setBackground(new Color(192, 192, 192));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 936, 499);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("buyer id");
		lblNewLabel.setBounds(0, 45, 70, 17);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("buyer name");
		lblNewLabel_1.setBounds(0, 89, 94, 17);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("sex");
		lblNewLabel_2.setBounds(0, 132, 49, 17);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("telphone");
		lblNewLabel_3.setBounds(0, 160, 70, 24);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("email");
		lblNewLabel_4.setBounds(0, 219, 70, 17);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("password");
		lblNewLabel_5.setBounds(0, 261, 89, 17);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("confirm password");
		lblNewLabel_6.setBounds(0, 306, 133, 14);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_6);
		
		buyernametxf = new JTextField();
		buyernametxf.setBounds(143, 89, 96, 20);
		contentPane.add(buyernametxf);
		buyernametxf.setColumns(10);
		
		sextxf = new JTextField();
		sextxf.setBounds(143, 132, 96, 20);
		contentPane.add(sextxf);
		sextxf.setColumns(10);
		
		buyeridtxf = new JTextField();
		buyeridtxf.setBounds(143, 45, 96, 20);
		contentPane.add(buyeridtxf);
		buyeridtxf.setColumns(10);
		
		telphonetxf = new JTextField();
		telphonetxf.setBounds(143, 164, 96, 20);
		contentPane.add(telphonetxf);
		telphonetxf.setColumns(10);
		
		emailtxf = new JTextField();
		emailtxf.setBounds(143, 219, 96, 20);
		contentPane.add(emailtxf);
		emailtxf.setColumns(10);
		
		passwordtxf = new JTextField();
		passwordtxf.setBounds(143, 261, 96, 20);
		contentPane.add(passwordtxf);
		passwordtxf.setColumns(10);
		
		confirmpasswordtxf = new JTextField();
		confirmpasswordtxf.setBounds(143, 305, 96, 20);
		contentPane.add(confirmpasswordtxf);
		confirmpasswordtxf.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBounds(0, 390, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {try {
				Class.forName("com.mysql.cj.jdbc.Driver");

				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/selling_fruits_management_system","root","");
		String sql="INSERT INTO buyer VALUES(?,?,?,?,?,?,?)";
		PreparedStatement st=con.prepareStatement(sql);
		st.setInt(1, Integer.parseInt(buyeridtxf.getText()));
		st.setString(2,buyernametxf.getText());
		st.setString(3, sextxf.getText());
		st.setString(4, telphonetxf.getText());
		st.setString(5, emailtxf.getText());
		st.setString(6, passwordtxf.getText());
		st.setString(7, confirmpasswordtxf.getText() );
		
		st.executeUpdate();
		JOptionPane.showMessageDialog(btnNewButton, "data saved!!");
		
		st.close();
		con.close();
				
				
				
				
				
				
				
				
				
			} catch (Exception e2) {
				
			}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("View");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/selling_fruits_management_system","root","");
				java.sql.Statement st=con.createStatement();
				String query="SELECT * FROM buyer";
				ResultSet rs=st.executeQuery(query);
				java.sql.ResultSetMetaData rsdm=rs.getMetaData();
				DefaultTableModel model=(DefaultTableModel)table.getModel();
				int cols=rsdm.getColumnCount();
				String[]colName=new String[cols];
				for(int i=0;i<cols;i++)
				colName[i]=rsdm.getColumnName(i+1);
				model.setColumnIdentifiers(colName);
				String buyerid,buyername,sex,telphone,email,password,confirmpassword;
				while(rs.next()) {
					buyerid=rs.getString(1);
					buyername=rs.getString(2);
					sex=rs.getString(3);
					telphone=rs.getString(4);
					email=rs.getString(5);
					password=rs.getString(6);
					confirmpassword=rs.getString(7);
					String[]row= {buyerid,buyername,sex,telphone,email,password,confirmpassword};	
					model.addRow(row);
					
							
				}
				
				
			}catch (Exception e2) {
				// TODO: handle exception
			}
			}
		});
		btnNewButton_1.setBounds(111, 390, 89, 23);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/selling_fruits_management_system","root","");	
				String sql="DELETE FROM buyer WHERE  buyerid=?";
				int buyeridtxf=Integer.parseInt(JOptionPane.showInputDialog("Enter  to delete ")); 
				PreparedStatement st=con.prepareStatement(sql);
				st.setInt(1,buyeridtxf);
				
				Component Delete;
				JOptionPane.showMessageDialog(btnNewButton, "recored out!!");
				st.executeUpdate();
				st.close();
				con.close();
				
				
				
				
				
			} catch (Exception e2) {
				// TODO: handle exception
			}	
				
			
			}
		});
		btnNewButton_2.setBounds(221, 390, 89, 23);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Update");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/selling_fruits_management_system","root","");
				String sql="UPDATE buyer SET buyerid=?,buyername=?,sex=?,telphone=?,email=?,password=?,confirm password=? WHERE id=?";					
				PreparedStatement st=con.prepareStatement(sql);

				st.setString(1,buyeridtxf.getText());
				st.setString(2,buyernametxf.getText());
				st.setString(3, sextxf.getText());
				st.setString(4, telphonetxf.getText());
				st.setString(5, emailtxf.getText());
				st.setString(6,passwordtxf.getText() );
				st.setString(7,confirmpasswordtxf.getText() );					
									
														
				JOptionPane.showMessageDialog(btnNewButton, "data changed!!!");
				st.executeUpdate();
				st.close();
				con.close();
									
									
									
									
								} catch (Exception e2) {
									// TODO: handle exception
								}
								
								
								
								
							}
						});

		btnNewButton_3.setBounds(332, 390, 89, 23);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Cancel");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { buyeridtxf.setText(null);
			buyernametxf.setText(null);
			sextxf.setText(null);
			telphonetxf.setText(null);
			emailtxf.setText(null);
			passwordtxf.setText(null);
			confirmpasswordtxf.setText(null);
			}
		});
		btnNewButton_4.setBounds(441, 390, 89, 23);
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel_7 = new JLabel("REGISTRATION_FORM");
		lblNewLabel_7.setBounds(10, 17, 199, 17);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_7);
		
		table = new JTable();
		table.setBounds(301, 11, 621, 368);
		table.setBackground(new Color(255, 255, 255));
		contentPane.add(table);
	}
}
