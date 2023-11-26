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

public class Signin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Email_textField;
	private JTextField Password_textField;

	
	public Signin() {
		super("Sign in");
		setTitle("Sign in");							
		this.setSize(350, 500);	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel Email_label = new JLabel("Email");
		
		Email_textField = new JTextField();
		Email_textField.setColumns(10);
		
		JLabel Password_label = new JLabel("Password");
		
		Password_textField = new JTextField();
		Password_textField.setColumns(10);
		
		JButton Login_button = new JButton("LOGIN");
		
		Login_button.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent ae){
			      String textFieldValue = Email_textField.getText();
			      // .... do some operation on value ...
			   }
			});
		
		JLabel lblNewLabel_2 = new JLabel("LOGIN");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(100)
							.addComponent(Login_button))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap(33, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(Email_label)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
									.addComponent(Password_label)
									.addComponent(Email_textField, GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
									.addComponent(Password_textField))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(130)
							.addComponent(lblNewLabel_2)))
					.addContainerGap(70, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGap(56)
					.addComponent(lblNewLabel_2)
					.addPreferredGap(ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
					.addComponent(Email_label)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(Email_textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(32)
					.addComponent(Password_label)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(Password_textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(82)
					.addComponent(Login_button)
					.addGap(48))
		);
		contentPane.setLayout(gl_contentPane);
	}

}
