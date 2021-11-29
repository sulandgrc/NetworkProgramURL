package url;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class URLConnectionExample {
    public static void main(String[] args) throws IOException {
        // Open connection
        URL u = new URL("https://sueuland.greenriverdev.com");
        URLConnection connection = u.openConnection();

        // Check if response code is HTTP_OK (200)
        HttpURLConnection httpConnection = (HttpURLConnection) connection;
        int code = httpConnection.getResponseCode();
        System.out.println( code + " " + httpConnection.getResponseMessage());

        // if okay
        if (code == HttpURLConnection.HTTP_OK) {
            // Read server response
            Scanner in = new Scanner(connection.getInputStream());

            while (in.hasNextLine()) {
                System.out.println(in.nextLine());
            }

        }
    }
}
