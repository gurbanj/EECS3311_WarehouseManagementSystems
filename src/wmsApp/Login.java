package wmsApp;

import java.awt.HeadlessException;
import java.io.IOException;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login {
	
	protected String username;
	protected String password;
	protected boolean authentication;
	
	public Login(JTextField uInput, JPasswordField pInput) throws HeadlessException, IOException {
    	
    	this.username = uInput.getText();
    	this.password = new String(pInput.getPassword());
    	
    	UserAuthentication userAuthentication = new UserAuthentication(username, password);
    	
    	if (userAuthentication.authentication == true) {
    		this.authentication = true;
    	}
    	else {
    		this.authentication = false;
    	}
    
    }
}
