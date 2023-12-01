package Twitter;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Home extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public Home() {
		super("Home");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(640, 500);	
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton profile_button = new JButton("Profile");
		profile_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Profile profile = new Profile();
				setVisible(false);
				profile.setVisible(true);
			}
		
		});
		profile_button.setBounds(53, 169, 96, 23);
		contentPane.add(profile_button);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.setBounds(52, 52, 80, 30);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(58, 136, 91, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(53, 202, 96, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(-10, 60, 50, 15);
		contentPane.add(lblNewLabel);
	}
}
