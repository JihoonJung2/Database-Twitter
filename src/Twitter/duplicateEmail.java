package Twitter;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class duplicateEmail extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;


	public duplicateEmail() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Duplicate Email");
		lblNewLabel.setBounds(74, 63, 224, 129);
		contentPane.add(lblNewLabel);
	}

}
