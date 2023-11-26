package Twitter;

import java.awt.EventQueue;

public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Signup signup = new Signup();
					signup.setVisible(true);
					
					Signin Signin = new Signin();
					Signin.setVisible(true);
					
					WritingArticle writingArticle = new WritingArticle();
					writingArticle.setVisible(true);
					
					ChangePassword changePassword = new ChangePassword();
					changePassword.setVisible(true);
					
					Home home = new Home();
					home.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

}
