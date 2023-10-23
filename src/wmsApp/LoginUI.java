package wmsApp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class LoginUI {

    public static void main(String[] args) throws IOException {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("User Authentication");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField(20);
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField(20);
        JButton loginButton = new JButton("Login");

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	try {
					Login login = new Login(usernameField, passwordField);
					if(login.authentication == true) {
			    		JOptionPane.showMessageDialog(null, "Authentication successful.");	
		            }
					else {
						JOptionPane.showMessageDialog(null, "Authentication failed.");
					}
				} catch (HeadlessException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            }
            
        });

        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(new JLabel()); // Empty label for spacing
        panel.add(loginButton);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
 
    
}

