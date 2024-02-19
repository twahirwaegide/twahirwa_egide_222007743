package forms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class fruit_category extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField categoryidtxf;
	private JTextField categorynametxf;
	private JTextField descriptiontxf;
	private JTextField parentcategorytxf;
	private JTextField shelflifetxf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fruit_category frame = new fruit_category();
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
	public fruit_category() {
		setTitle("fruit_category");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 581, 507);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("category id");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(24, 59, 152, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("category name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(24, 120, 124, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("description");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(24, 181, 143, 23);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("parent category");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(24, 241, 124, 23);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("shelf life");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(24, 298, 152, 23);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {try {
				Class.forName("com.mysql.cj.jdbc.Driver");

				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/selling_fruits_management_system","root","");
		String sql="INSERT INTO fruit_category VALUES(?,?,?,?,?)";
		PreparedStatement st=con.prepareStatement(sql);
		st.setInt(1, Integer.parseInt(categoryidtxf.getText()));
		st.setString(2,categorynametxf.getText());
                st.setString(3,descriptiontxf.getText());
                st.setString(4,parentcategorytxf.getText());
                st.setString(5,shelflifetxf.getText());
		
		
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
		btnNewButton.setBounds(87, 396, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {categoryidtxf.setText(null);
			categorynametxf.setText(null);
			descriptiontxf.setText(null);
			parentcategorytxf.setText(null);
			shelflifetxf.setText(null);
			}
		
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(352, 396, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_5 = new JLabel("FRUIT_CATEGORY_DETAILS");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_5.setBounds(160, 11, 265, 23);
		contentPane.add(lblNewLabel_5);
		
		categoryidtxf = new JTextField();
		categoryidtxf.setBounds(269, 62, 96, 20);
		contentPane.add(categoryidtxf);
		categoryidtxf.setColumns(10);
		
		categorynametxf = new JTextField();
		categorynametxf.setBounds(269, 123, 96, 20);
		contentPane.add(categorynametxf);
		categorynametxf.setColumns(10);
		
		descriptiontxf = new JTextField();
		descriptiontxf.setBounds(269, 178, 96, 20);
		contentPane.add(descriptiontxf);
		descriptiontxf.setColumns(10);
		
		parentcategorytxf = new JTextField();
		parentcategorytxf.setBounds(269, 238, 96, 20);
		contentPane.add(parentcategorytxf);
		parentcategorytxf.setColumns(10);
		
		shelflifetxf = new JTextField();
		shelflifetxf.setBounds(269, 295, 96, 20);
		contentPane.add(shelflifetxf);
		shelflifetxf.setColumns(10);
	}
}
