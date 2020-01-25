package college;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JPasswordField pass;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 498, 427);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcomeToDronacharya = new JLabel("Welcome to DRONACHARYA CLUB!");
		lblWelcomeToDronacharya.setForeground(new Color(0, 0, 255));
		lblWelcomeToDronacharya.setBackground(new Color(0, 0, 255));
		lblWelcomeToDronacharya.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		lblWelcomeToDronacharya.setBounds(82, 11, 340, 30);
		contentPane.add(lblWelcomeToDronacharya);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblUsername.setBounds(47, 108, 89, 17);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPassword.setBounds(47, 170, 78, 14);
		contentPane.add(lblPassword);
		
		username = new JTextField();
		username.setBounds(261, 105, 144, 20);
		contentPane.add(username);
		username.setColumns(10);
		
		pass = new JPasswordField();
		pass.setBounds(261, 167, 144, 20);
		contentPane.add(pass);
		
		JButton btnLogIn = new JButton("Log In");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","new");
					Statement stmt=con.createStatement();
					String sql="select * from data where username='"+username.getText()+"' and password='"+pass.getText().toString()+"'";
					ResultSet rs=stmt.executeQuery(sql);
					if(rs.next())
					{
						JOptionPane.showMessageDialog(null,"Login Successfully..");
						new welcome().setVisible(true);
						setVisible(false);
						//System.out.println("Success");
					}
					else
						JOptionPane.showMessageDialog(null, "Incorrect Username and Password");
					con.close();
				}
				catch(Exception ae) 
				{
					System.out.println(ae);
				}
			}
		});
		btnLogIn.setBackground(SystemColor.activeCaptionBorder);
		btnLogIn.setForeground(SystemColor.infoText);
		btnLogIn.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
		btnLogIn.setBounds(261, 225, 89, 23);
		contentPane.add(btnLogIn);
		
		JLabel lblNotAMember = new JLabel("Not a member of our club? Just SIGN UP It's Free and Always will be.");
		lblNotAMember.setForeground(Color.WHITE);
		lblNotAMember.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		lblNotAMember.setBounds(23, 284, 459, 14);
		contentPane.add(lblNotAMember);
		
		JButton btnNewButton = new JButton("SIGN UP");
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registrationform rg = new registrationform();
					rg.setVisible(true);
					setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 11));
		btnNewButton.setBounds(261, 334, 89, 23);
		contentPane.add(btnNewButton);
	}
}
