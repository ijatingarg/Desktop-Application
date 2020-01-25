package college;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class user extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JTextField pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					user frame = new user();
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
	public user() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 153, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcome = new JLabel("Welcome");
		lblWelcome.setFont(new Font("Sitka Display", Font.BOLD | Font.ITALIC, 20));
		lblWelcome.setBounds(173, 11, 109, 44);
		contentPane.add(lblWelcome);
		
		JLabel lblSetUsernameFor = new JLabel("Set Username for your account :");
		lblSetUsernameFor.setBounds(34, 86, 198, 14);
		contentPane.add(lblSetUsernameFor);
		
		JLabel lblSetPasswordFor = new JLabel("Set Password for your account :");
		lblSetPasswordFor.setBounds(34, 142, 213, 14);
		contentPane.add(lblSetPasswordFor);
		
		username = new JTextField();
		username.setBounds(257, 83, 152, 20);
		contentPane.add(username);
		username.setColumns(10);
		
		pass = new JTextField();
		pass.setBounds(257, 139, 152, 20);
		contentPane.add(pass);
		pass.setColumns(10);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("Save"))
				{
					try {
						Class.forName("com.mysql.jdbc.Driver");
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","new");
						Statement stmt=con.createStatement();
						String sql="select * from data where username='"+username.getText()+"'";
						ResultSet rs=stmt.executeQuery(sql);
						if(rs.next())
						{
							JOptionPane.showMessageDialog(null,"Username already exists!");
							JOptionPane.showMessageDialog(null,"Please choose different username");
						}
						else
						{
							String username1 = username.getText();
							String pswrd = pass.getText();
							
							try
							   {

							   		try
							   		{
							   			Class.forName("com.mysql.cj.jdbc.Driver");

							   		}
							   		catch(Exception be)
							   		{
							   			JOptionPane.showMessageDialog(null, "Loading problem...");
							   		
							   		}

							   		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db?autoReconnect=true&useSSL=false","root","new");	
							  		
							  		String sqll ="insert into data(username,password) values(?,?)";

							  		PreparedStatement st = conn.prepareStatement(sqll);

							  		st.setString(1,username1);
							  		st.setString(2,pswrd);
							  		
							  		st.executeUpdate();
							  		
							  		JOptionPane.showMessageDialog(null, "Your Username and Password is saved");
							  		JOptionPane.showMessageDialog(null, "You can now login using your Username and Password");
							  		
							  		new Login().setVisible(true);
							  		setVisible(false);
							  	
							  		
							   }
							   catch(Exception ce)
							   {
							   	
							   	JOptionPane.showMessageDialog(null, "Problem");
							    System.out.println(ce);
							   }
								con.close();
						}
					}
					catch(Exception ae) 
					{
						System.out.println(ae);
					}
					
				} 
				
			}
		});
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSave.setBounds(257, 202, 89, 23);
		contentPane.add(btnSave);
	}

}
