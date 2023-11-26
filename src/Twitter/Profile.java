package Twitter;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Profile extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;


	public Profile() {
		super("Profile");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(350, 500);	
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
