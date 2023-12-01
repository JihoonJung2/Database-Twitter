package Twitter;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JPasswordField;

public class Signin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Email_textField;
	private JPasswordField Password_textField;

	
	public Signin() {
		super("Sign in");
		setTitle("Sign in");							
		this.setSize(675, 500);	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		Email_textField = new JTextField();
		Email_textField.setColumns(10);
		
		JButton Login_button = new JButton("LOGIN");
		
		Login_button.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent ae){
			      String textFieldValue = Email_textField.getText();
			      // .... do some operation on value ...
			      Home home = new Home();
			      setVisible(false);
			      home.setVisible(true);
			   }
			});
		
		JButton SignUpBtn = new JButton("Sign Up");
		SignUpBtn.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent ae){
			      setVisible(false);
			      Signup Signup = new Signup();
					Signup.setVisible(true);
			   }
			});
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\82107\\eclipse-workspace\\Database-Twitter\\image\\twitter-312464_640.png"));
		
		JLabel lblNewLabel_1 = new JLabel("See  what's happeing in the world right now");
		lblNewLabel_1.setFont(new Font("Eras Bold ITC", Font.BOLD, 21));
		
		JLabel lblNewLabel_2 = new JLabel("Join us today");
		lblNewLabel_2.setFont(new Font("Gadugi", Font.BOLD | Font.ITALIC, 16));
		
		Password_textField = new JPasswordField();
		
		JLabel lblNewLabel_3 = new JLabel("E-mail : ");
		
		JLabel lblNewLabel_4 = new JLabel("Password : ");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(22)
							.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(Email_textField, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(Password_textField, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
							.addGap(34)
							.addComponent(Login_button))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(77)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 647, Short.MAX_VALUE)
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(199)
							.addComponent(SignUpBtn, GroupLayout.PREFERRED_SIZE, 253, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(Email_textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(Login_button)
						.addComponent(lblNewLabel_3)
						.addComponent(lblNewLabel_4)
						.addComponent(Password_textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(72)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_2)
					.addGap(18)
					.addComponent(SignUpBtn)
					.addGap(109))
		);
		
		contentPane.setLayout(gl_contentPane);
	}
}
