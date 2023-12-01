package Twitter;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Profile extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	


	public Profile() {
		super("Profile");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(398, 474);	
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        
		setContentPane(contentPane);
		ImageIcon imageIcon = new ImageIcon("./image/person.png");
		CircularLabel circularLabel = new CircularLabel("Hello", imageIcon);
        circularLabel.setHorizontalAlignment(JLabel.CENTER);
        circularLabel.setVerticalAlignment(JLabel.CENTER);
        circularLabel.setBounds(10, 100, 130, 130); // 위치와 크기 설정
        circularLabel.setOpaque(false);

        this.getContentPane().add(circularLabel);
		contentPane.setLayout(null);
		
		JLabel backgroundLbl = new JLabel("");
		backgroundLbl.setBackground(new Color(192, 192, 192));
		backgroundLbl.setBounds(0, 0, 384, 162);
		contentPane.add(backgroundLbl);
		backgroundLbl.setOpaque(true);
		
		JLabel nameLbl = new JLabel("name");
		nameLbl.setFont(new Font("Segoe UI Semibold", Font.BOLD, 19));
		nameLbl.setBounds(12, 230, 112, 31);
		contentPane.add(nameLbl);
		
		JLabel intrudoceLbl = new JLabel("introduce youself");
		intrudoceLbl.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		intrudoceLbl.setBounds(12, 281, 123, 20);
		contentPane.add(intrudoceLbl);
		
		JLabel numberOfFollowings = new JLabel("0");
		numberOfFollowings.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 12));
		numberOfFollowings.setBounds(12, 325, 25, 15);
		contentPane.add(numberOfFollowings);
		
		JLabel lblNewLabel_3 = new JLabel("Followings");
		lblNewLabel_3.setFont(new Font("굴림체", Font.ITALIC, 12));
		lblNewLabel_3.setBounds(31, 325, 82, 15);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("0");
		lblNewLabel.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 12));
		lblNewLabel.setBounds(98, 325, 15, 15);
		contentPane.add(lblNewLabel);
		
		JLabel numberOfFollowers = new JLabel("Followers");
		numberOfFollowers.setFont(new Font("굴림체", Font.ITALIC, 12));
		numberOfFollowers.setBounds(119, 325, 68, 15);
		contentPane.add(numberOfFollowers);
		
		JButton editBtn = new JButton("Edit Profile");
		editBtn.setHorizontalAlignment(SwingConstants.LEFT);
		editBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		editBtn.setBackground(new Color(39, 162, 209));
		editBtn.setBounds(252, 184, 120, 31);
		contentPane.add(editBtn);
		editBtn.setOpaque(false);
		
		JLabel blueBack = new JLabel("");
		blueBack.setIcon(new ImageIcon("C:\\Users\\82107\\eclipse-workspace\\Database-Twitter\\image\\blue button (1).png"));
		blueBack.setBounds(252, 184, 120, 31);
		contentPane.add(blueBack);
        
	}
	 public class CircularLabel extends JLabel {
	        private ImageIcon imageIcon;

	        public CircularLabel(String text, ImageIcon imageIcon) {
	            super(text, JLabel.CENTER);
	            this.imageIcon = imageIcon;
	            setPreferredSize(new Dimension(100, 100)); // 크기 조절
	        }

	        @Override
	        protected void paintComponent(Graphics g) {
	            super.paintComponent(g);

	            int diameter = Math.min(getWidth(), getHeight());
	            int x = (getWidth() - diameter) / 2;
	            int y = (getHeight() - diameter) / 2;

	            g.setColor(new Color(244, 244, 255));
	            g.fillOval(x, y, diameter, diameter);

	            // 이미지를 그립니다.
	            if (imageIcon != null) {
	                Image image = imageIcon.getImage();
	                g.drawImage(image, x, y, diameter, diameter, this);
	            }
	        }
	    }
}
