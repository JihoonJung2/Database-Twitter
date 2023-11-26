package Twitter;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public Home() {
		super("Home");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(350, 500);	
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton profile_button = new JButton("Profile");
		profile_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Profile profile = new Profile();
				profile.setVisible(true);
			}
		
		});
		profile_button.setBounds(6, 6, 64, 40);
		contentPane.add(profile_button);
	}
}
