package forms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class sales extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField saleidtxf;
	private JTextField discounttxf;
	private JTextField qtysoldtxf;
	private JTextField totalpricetxf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sales frame = new sales();
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
	public sales() {
		setFont(new Font("Dialog", Font.BOLD, 14));
		setTitle("sale");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 579, 505);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("sale id");
		lblNewLabel.setBounds(72, 63, 80, 17);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("discount");
		lblNewLabel_1.setBounds(72, 140, 69, 17);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("qty sold");
		lblNewLabel_2.setBounds(72, 220, 80, 20);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("total price");
		lblNewLabel_3.setBounds(72, 286, 108, 23);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_3);
		
		saleidtxf = new JTextField();
		saleidtxf.setBackground(new Color(255, 255, 255));
		saleidtxf.setBounds(344, 63, 96, 20);
		contentPane.add(saleidtxf);
		saleidtxf.setColumns(10);
		
		discounttxf = new JTextField();
		discounttxf.setBounds(344, 140, 96, 20);
		contentPane.add(discounttxf);
		discounttxf.setColumns(10);
		
		qtysoldtxf = new JTextField();
		qtysoldtxf.setBounds(344, 222, 96, 20);
		contentPane.add(qtysoldtxf);
		qtysoldtxf.setColumns(10);
		
		totalpricetxf = new JTextField();
		totalpricetxf.setBounds(344, 289, 96, 20);
		contentPane.add(totalpricetxf);
		totalpricetxf.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {try {
				Class.forName("com.mysql.cj.jdbc.Driver");

				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/selling_fruits_management_system","root","");
		String sql="INSERT INTO sale VALUES(?,?,?,?)";
		PreparedStatement st=con.prepareStatement(sql);
		st.setInt(1, Integer.parseInt(saleidtxf.getText()));
		st.setString(2,discounttxf.getText());
                st.setString(3,qtysoldtxf.getText());
                st.setString(4,totalpricetxf.getText());
                
		
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
		btnNewButton.setBounds(21, 387, 89, 23);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {saleidtxf.setText(null);
			discounttxf.setText(null);
			qtysoldtxf.setText(null);
			totalpricetxf.setText(null);
			}
		
		});
		btnNewButton_1.setBounds(365, 387, 89, 23);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("SALES_DETAILS");
		lblNewLabel_4.setBounds(198, 25, 182, 20);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_4);
	}

}
