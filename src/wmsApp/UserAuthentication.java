package wmsApp;
import java.io.IOException;

public class UserAuthentication {
	
	protected String username;
	protected String password;
	protected boolean authentication;

	public UserAuthentication(String username, String password) throws IOException {
		this.username = username;
		this.password = password;
		this.authentication = authenticateUser(username, password);
	}
	
	
	private static boolean authenticateUser(String username, String password) throws IOException {
    	AdminDB admin_database = new AdminDB();
    	
    	if (admin_database.credentials.containsKey(username)) {
    		String correctPassword = admin_database.credentials.get(username);
    		if(correctPassword.equals(password)) {
    			return true;
    		}	
    	}
    	return false;
    }
}
