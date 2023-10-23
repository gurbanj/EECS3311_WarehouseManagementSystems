package wmsApp;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class AdminDB {
	
	HashMap<String, String> credentials;

	public AdminDB() throws IOException {
		Scanner input = new Scanner(new File("Admin_DB.txt"));
		
		credentials = new HashMap<String, String>();
		
		while(input.hasNext()) {
			String userName = input.next();
			String password = input.next();
			credentials.put(userName, password);
		}
	}
}
