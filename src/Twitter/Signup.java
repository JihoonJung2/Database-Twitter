package Twitter;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Signup extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField id_textField;
	private JTextField nickname_textField;
	private JTextField email_textField;
	private JTextField number_textField;
	private JTextField birth_textField;
	private JPasswordField password_passwordfield;

	
	public Signup() {
		super("Sign up");
		setTitle("Sign up");
		setSize(350, 500);	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		// id
		JLabel id_label = new JLabel("id");
		
		id_textField = new JTextField();
		id_textField.setToolTipText("");
		id_textField.setColumns(10);
		
		// password
		
		JLabel pw_label = new JLabel("password");
		
		password_passwordfield = new JPasswordField();
		
		// nickname
		
		JLabel nickname_label = new JLabel("nickname");
		
		nickname_textField = new JTextField();
		nickname_textField.setColumns(10);
		
		// email
		
		JLabel email_label = new JLabel("email");
		
		email_textField = new JTextField();
		email_textField.setColumns(10);
		
		// phone number
		
		JLabel number_label = new JLabel("phone number");
		
		number_textField = new JTextField();
		number_textField.setText("01012345678");
		number_textField.setColumns(10);
		
		// birth
		
		JLabel birth_label = new JLabel("birth");
		
		birth_textField = new JTextField();
		birth_textField.setText("200300101");
		birth_textField.setColumns(10);
		
		// gender
		
		JLabel gender_label = new JLabel("gender");
		
		JComboBox gender_comboBox = new JComboBox();
		gender_comboBox.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
		
		// sign up button
		
		JButton signup_button = new JButton("Sign up");
		signup_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String test = email_textField.getText();	// 일단 print 찍어
				System.out.println(test);
			}
		});
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(29)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
									.addComponent(id_label)
									.addComponent(pw_label)
									.addComponent(nickname_label)
									.addComponent(email_label)
									.addComponent(number_label, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
									.addComponent(birth_label, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))
								.addComponent(gender_label))
							.addGap(12)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(password_passwordfield)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
									.addComponent(birth_textField)
									.addComponent(number_textField)
									.addComponent(email_textField)
									.addComponent(nickname_textField)
									.addComponent(id_textField)
									.addComponent(gender_comboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(108)
							.addComponent(signup_button)))
					.addContainerGap(69, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(40)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(id_label)
						.addComponent(id_textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(pw_label)
						.addComponent(password_passwordfield, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(nickname_label)
						.addComponent(nickname_textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(email_label)
						.addComponent(email_textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(30)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(number_label)
						.addComponent(number_textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(birth_label)
						.addComponent(birth_textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(gender_comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(gender_label))
					.addPreferredGap(ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
					.addComponent(signup_button)
					.addGap(15))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
