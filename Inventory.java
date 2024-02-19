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

public class Inventory extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField productidtxf;
	private JTextField productnametxf;
	private JTextField producttypetxf;
	private JTextField pricetxf;
	private JTextField qtytxf;
	private JTextField expirationdatetxf;
	private JTextField purchasedatetxf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inventory frame = new Inventory();
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
	public Inventory() {
		setTitle("Inventory");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 532, 489);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("product id");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(38, 67, 114, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("product name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(38, 115, 114, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("product type");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(38, 153, 114, 31);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("price");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setToolTipText("Price");
		lblNewLabel_3.setBounds(38, 207, 103, 19);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("qty");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(38, 257, 49, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("expiration date");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(38, 300, 114, 20);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("purchase date");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setBounds(38, 349, 114, 23);
		contentPane.add(lblNewLabel_6);
		
		productidtxf = new JTextField();
		productidtxf.setBounds(251, 66, 96, 20);
		contentPane.add(productidtxf);
		productidtxf.setColumns(10);
		
		productnametxf = new JTextField();
		productnametxf.setBounds(251, 114, 96, 20);
		contentPane.add(productnametxf);
		productnametxf.setColumns(10);
		
		producttypetxf = new JTextField();
		producttypetxf.setBounds(251, 160, 96, 20);
		contentPane.add(producttypetxf);
		producttypetxf.setColumns(10);
		
		pricetxf = new JTextField();
		pricetxf.setBounds(251, 206, 96, 20);
		contentPane.add(pricetxf);
		pricetxf.setColumns(10);
		
		qtytxf = new JTextField();
		qtytxf.setBounds(251, 256, 96, 20);
		contentPane.add(qtytxf);
		qtytxf.setColumns(10);
		
		expirationdatetxf = new JTextField();
		expirationdatetxf.setBounds(251, 299, 96, 20);
		contentPane.add(expirationdatetxf);
		expirationdatetxf.setColumns(10);
		
		purchasedatetxf = new JTextField();
		purchasedatetxf.setBounds(251, 348, 96, 20);
		contentPane.add(purchasedatetxf);
		purchasedatetxf.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("INVENTORY_DETAILS");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_7.setBounds(155, 23, 275, 20);
		contentPane.add(lblNewLabel_7);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {try {
				Class.forName("com.mysql.cj.jdbc.Driver");

				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/selling_fruits_management_system","root","");
		String sql="INSERT INTO inventory VALUES(?,?,?,?,?,?,?)";
		PreparedStatement st=con.prepareStatement(sql);
		st.setInt(1, Integer.parseInt(productidtxf.getText()));
		st.setString(2,productnametxf.getText());
		st.setString(3, producttypetxf.getText());
		st.setString(4, pricetxf.getText());
                st.setString(5, qtytxf.getText());
                st.setString(6, expirationdatetxf.getText());
                st.setString(7, purchasedatetxf.getText());
               
		
		
		st.executeUpdate();
		JOptionPane.showMessageDialog(btnNewButton, "data saved!!");
		
		st.close();
		con.close();
				
				
				
				
				
				
				
				
				
			} catch (Exception e2) {
				
			}
			Login ad = new Login();
			if(e.getSource()==btnNewButton) {
				ad.main(new String[0]);
			}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(63, 413, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {productidtxf.setText(null);
			productnametxf.setText(null);
			producttypetxf.setText(null);
			pricetxf.setText(null);
			qtytxf.setText(null);
			expirationdatetxf.setText(null);
			purchasedatetxf.setText(null);
			}
	
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(341, 415, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
