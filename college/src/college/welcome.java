package college;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class welcome extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					welcome frame = new welcome();
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
	public welcome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 447);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcomeDronacharian = new JLabel("Welcome DRONACHARIAN!");
		lblWelcomeDronacharian.setFont(new Font("Sitka Display", Font.BOLD | Font.ITALIC, 16));
		lblWelcomeDronacharian.setBounds(147, 52, 240, 68);
		contentPane.add(lblWelcomeDronacharian);
		
		JLabel lblAProudMember = new JLabel("A Proud Member Of This Club!");
		lblAProudMember.setFont(new Font("Palatino Linotype", Font.BOLD | Font.ITALIC, 15));
		lblAProudMember.setBounds(157, 131, 274, 14);
		contentPane.add(lblAProudMember);
		
		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Logged Out.");
				new Login().setVisible(true);
				setVisible(false);
			}
		});
		btnLogOut.setForeground(Color.BLACK);
		btnLogOut.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLogOut.setBackground(Color.LIGHT_GRAY);
		btnLogOut.setBounds(412, 11, 89, 23);
		contentPane.add(btnLogOut);
		
		JLabel lblVision = new JLabel("Vision");
		lblVision.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblVision.setBounds(47, 172, 78, 23);
		contentPane.add(lblVision);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 2, 2);
		contentPane.add(scrollPane);
		
		JTextArea txtrToImpartQuality = new JTextArea();
		txtrToImpartQuality.setBackground(new Color(0, 204, 255));
		txtrToImpartQuality.setText("To impart Quality Education, to give an enviable growth to seekers of learning, to \r\ngroom them as World Class Engineers and Managers competent to match the \r\nexpanding expectations of the Corporate World \r\nhas been our ever enlarging vision extending to new horizons\r\n since the inception of \r\nDronacharya College of Engineering.");
		txtrToImpartQuality.setBounds(44, 206, 514, 135);
		contentPane.add(txtrToImpartQuality);
	}
}
