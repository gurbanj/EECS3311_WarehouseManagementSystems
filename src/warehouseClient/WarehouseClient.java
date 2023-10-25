package warehouseClient;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class WarehouseClient {
    public static void main(String[] args) {
        String serverUrl = "http://localhost:8000/api"; // Update with your server's URL

        try {
            URL url = new URL(serverUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            int responseCode = conn.getResponseCode();
            if (responseCode == 200) {
                InputStream is = conn.getInputStream();
                Scanner scanner = new Scanner(is);

                StringBuilder response = new StringBuilder();
                while (scanner.hasNextLine()) {
                    response.append(scanner.nextLine());
                }

                System.out.println("Server response: " + response.toString());
            } else {
                System.out.println("Error: Server returned response code " + responseCode);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}