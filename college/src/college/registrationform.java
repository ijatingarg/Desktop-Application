package college;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import java.sql.*;
import java.util.Locale;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class registrationform extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField mail;
	private JTextField number;
	private JTextField street;
	private JTextField pincode;
	private JTextField city;
	private JTextField country;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registrationform frame = new registrationform();
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
	public registrationform() {
		setBackground(new Color(173, 255, 47));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 811, 785);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 204, 255));
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblRegistrationForm = new JLabel("Club Membership Registration Form");
		lblRegistrationForm.setForeground(new Color(255, 255, 255));
		lblRegistrationForm.setFont(new Font("Traditional Arabic", Font.BOLD | Font.ITALIC, 20));
		lblRegistrationForm.setBounds(217, 0, 371, 35);
		contentPane.add(lblRegistrationForm);
		
		//String date[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(53, 63, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("E-mail");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(53, 88, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Phone Number");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(53, 113, 100, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Address :");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(53, 145, 86, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Street");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(53, 170, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("City");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setBounds(399, 170, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblPincode = new JLabel("PinCode");
		lblPincode.setForeground(new Color(255, 255, 255));
		lblPincode.setBounds(53, 195, 86, 14);
		contentPane.add(lblPincode);
		
		JLabel lblCountry = new JLabel("Country");
		lblCountry.setForeground(new Color(255, 255, 255));
		lblCountry.setBounds(399, 195, 46, 14);
		contentPane.add(lblCountry);
		
		JLabel lblDob = new JLabel("D.O.B.");
		lblDob.setForeground(new Color(255, 255, 255));
		lblDob.setBounds(53, 230, 46, 14);
		contentPane.add(lblDob);
		
		JComboBox date = new JComboBox();
		date.setForeground(new Color(0, 0, 51));
		date.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "12", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "30"}));
		date.setBounds(173, 227, 46, 20);
		contentPane.add(date);
		
		JComboBox month = new JComboBox();
		month.setForeground(new Color(0, 0, 51));
		month.setModel(new DefaultComboBoxModel(new String[] {"January", "February", "March", "April", "May", "June", "July", "August", "September ", "October", "November", "December"}));
		month.setBounds(229, 227, 86, 20);
		contentPane.add(month);
		
		JComboBox year = new JComboBox();
		year.setForeground(new Color(0, 0, 51));
		year.setModel(new DefaultComboBoxModel(new String[] {"1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998"}));
		year.setBounds(325, 227, 67, 20);
		contentPane.add(year);
		
		JLabel lblWhereDidYou = new JLabel("Where did you hear about us?");
		lblWhereDidYou.setForeground(new Color(255, 255, 255));
		lblWhereDidYou.setBounds(53, 309, 209, 14);
		contentPane.add(lblWhereDidYou);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("A Friend or colleauge");
		chckbxNewCheckBox.setBackground(new Color(0, 204, 255));
		chckbxNewCheckBox.setForeground(new Color(0, 0, 51));
		chckbxNewCheckBox.setBounds(53, 337, 154, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Google");
		chckbxNewCheckBox_1.setBackground(new Color(0, 204, 255));
		chckbxNewCheckBox_1.setForeground(new Color(0, 0, 51));
		chckbxNewCheckBox_1.setBounds(53, 363, 97, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Blog Post");
		chckbxNewCheckBox_2.setBackground(new Color(0, 204, 255));
		chckbxNewCheckBox_2.setForeground(new Color(0, 0, 51));
		chckbxNewCheckBox_2.setBounds(53, 389, 97, 23);
		contentPane.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewsArticle = new JCheckBox("News Article");
		chckbxNewsArticle.setBackground(new Color(0, 204, 255));
		chckbxNewsArticle.setForeground(new Color(0, 0, 51));
		chckbxNewsArticle.setBounds(53, 415, 97, 23);
		contentPane.add(chckbxNewsArticle);
		
		name = new JTextField();
		name.setBackground(Color.WHITE);
		name.setForeground(Color.BLACK);
		name.setBounds(176, 60, 154, 20);
		contentPane.add(name);
		name.setColumns(10);
		
		mail = new JTextField();
		mail.setBackground(Color.WHITE);
		mail.setForeground(Color.BLACK);
		mail.setBounds(176, 85, 154, 20);
		contentPane.add(mail);
		mail.setColumns(10);
		
		number = new JTextField();
		number.setBackground(Color.WHITE);
		number.setForeground(Color.BLACK);
		number.setBounds(176, 110, 154, 20);
		contentPane.add(number);
		number.setColumns(10);
		
		street = new JTextField();
		street.setBackground(Color.WHITE);
		street.setForeground(Color.BLACK);
		street.setBounds(176, 167, 154, 20);
		contentPane.add(street);
		street.setColumns(10);
		
		pincode = new JTextField();
		pincode.setBackground(Color.WHITE);
		pincode.setForeground(Color.BLACK);
		pincode.setBounds(176, 192, 154, 20);
		contentPane.add(pincode);
		pincode.setColumns(10);
		
		city = new JTextField();
		city.setBackground(Color.WHITE);
		city.setForeground(Color.BLACK);
		city.setBounds(502, 167, 138, 20);
		contentPane.add(city);
		city.setColumns(10);
		
		country = new JTextField();
		country.setBackground(Color.WHITE);
		country.setForeground(Color.BLACK);
		country.setBounds(502, 192, 138, 20);
		contentPane.add(country);
		country.setColumns(10);
		
		JLabel lblMembershipRules = new JLabel("MemberShip Rules:");
		lblMembershipRules.setForeground(new Color(255, 255, 255));
		lblMembershipRules.setBounds(53, 459, 157, 14);
		contentPane.add(lblMembershipRules);
		
		JCheckBox chckbxIHaveRead = new JCheckBox("I have read, understood and accepted the rules for membership.");
		chckbxIHaveRead.setBackground(new Color(0, 204, 255));
		chckbxIHaveRead.setForeground(new Color(0, 0, 51));
		chckbxIHaveRead.setBounds(53, 547, 551, 23);
		contentPane.add(chckbxIHaveRead);
		
		JLabel lblPrivacyPolicy = new JLabel("Privacy Policy:");
		lblPrivacyPolicy.setForeground(new Color(255, 255, 255));
		lblPrivacyPolicy.setBounds(53, 583, 86, 14);
		contentPane.add(lblPrivacyPolicy);
		
		JCheckBox chckbxIHaveRead_1 = new JCheckBox("I have read, understood, and accepted the PRIVACY POLICY for membership.");
		chckbxIHaveRead_1.setBackground(new Color(0, 204, 255));
		chckbxIHaveRead_1.setForeground(new Color(0, 0, 51));
		chckbxIHaveRead_1.setBounds(53, 604, 564, 23);
		contentPane.add(chckbxIHaveRead_1);
		
		JLabel lblMembershipIs = new JLabel("1. Membership is available to anyone 18 years of age or color.");
		lblMembershipIs.setForeground(new Color(255, 255, 255));
		lblMembershipIs.setBounds(53, 484, 486, 14);
		contentPane.add(lblMembershipIs);
		
		JLabel lblYouPromiseNot = new JLabel("2. You promise NOT to use to conduct any fraudlent or buisness activity or have more than one Member Account at any time.");
		lblYouPromiseNot.setForeground(new Color(255, 255, 255));
		lblYouPromiseNot.setBounds(53, 509, 898, 31);
		contentPane.add(lblYouPromiseNot);
		
		JLabel lblOnceYouSubmit = new JLabel("Once you submit your application, we will contact you shortly to complete your membership application.");
		lblOnceYouSubmit.setForeground(new Color(255, 255, 255));
		lblOnceYouSubmit.setBounds(53, 641, 658, 14);
		contentPane.add(lblOnceYouSubmit);
		
		JLabel lblSex = new JLabel("Sex");
		lblSex.setForeground(Color.WHITE);
		lblSex.setBounds(53, 273, 46, 14);
		contentPane.add(lblSex);
		
		JRadioButton male = new JRadioButton("Male");
		male.setBackground(new Color(0, 204, 255));
		male.setForeground(Color.WHITE);
		male.setBounds(195, 269, 67, 23);
		contentPane.add(male);
		
		JRadioButton female = new JRadioButton("Female");
		female.setForeground(Color.WHITE);
		female.setBackground(new Color(0, 204, 255));
		female.setBounds(292, 269, 100, 23);
		contentPane.add(female);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(male);
		bg.add(female);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				
				if(!name.getText().equals("")&&!mail.getText().equals("")&&!number.getText().equals("")&&!street.getText().equals("")&&!city.getText().equals("")&&!pincode.getText().equals("")&&!country.getText().equals("")) 
				{
								
				if(chckbxIHaveRead.isSelected()&&chckbxIHaveRead_1.isSelected())
				{
				
				
				String name1 = name.getText();
				String mail1 = mail.getText();
				String number1 = number.getText();
				String city1 = city.getText();
				String street1 = street.getText();
				String code = pincode.getText();
				String country1 = country.getText();
				String date1 = (String)date.getSelectedItem();
				String year1 = (String)year.getSelectedItem();
				String month1 = (String)month.getSelectedItem();
				String gen = "Male";
						if(female.isSelected())
							gen = "Female";
				try
				   {

				   		try
				   		{
				   			Class.forName("com.mysql.cj.jdbc.Driver");

				   		}
				   		catch(Exception e)
				   		{
				   			JOptionPane.showMessageDialog(null, "Loading problem...");
				   			//display.setText("Loading problem...");
				   		}

				   		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/reg?autoReconnect=true&useSSL=false","root","new");	
				  		
				  		String sql ="insert into detail(Member_Name,Member_Number,Gender,Email,Country,City,Street,Pincode,Date,Month,Year) values(?,?,?,?,?,?,?,?,?,?,?)";

				  		PreparedStatement st = con.prepareStatement(sql);

				  		st.setString(1,name1);
				  		st.setString(2,number1);
				  		st.setString(3,gen);
				  		st.setString(4,mail1);
				  		st.setString(5,country1);
				  		st.setString(6,city1);
				  		st.setString(7,street1);
				  		st.setString(8,code);
				  		st.setString(9,date1);
				  		st.setString(10,month1);
				  		st.setString(11,year1);
				  		

				  		st.executeUpdate();
				  		
				  		JOptionPane.showMessageDialog(null, "Thank You For Registration!");
				  		JOptionPane.showMessageDialog(null, "Registration Successful!");
				  		
				  		new user().setVisible(true);
				  		setVisible(false);
				  		
				   }
				   catch(Exception ce)
				   {
				   	
				   	JOptionPane.showMessageDialog(null, "Problem");
				    System.out.println(ce);
				   }
				}
				else
				{
					JOptionPane.showMessageDialog(null, "First agree to our terms and conditions");
					
				}
			}else {
				JOptionPane.showMessageDialog(null, "Please fill up all the fields!");
			}
			}
		});
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSubmit.setForeground(new Color(0, 0, 51));
		btnSubmit.setBackground(Color.LIGHT_GRAY);
		btnSubmit.setBounds(349, 686, 89, 23);
		contentPane.add(btnSubmit);
		
	}
}
