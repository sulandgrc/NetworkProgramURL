package url;

import java.net.URL;
import java.util.Scanner;

public class URLClass {

    public static void main(String[] args) {

        try{
            URL url = new URL("https://sueuland.greenriverdev.com/index.html");

            // retrieving URL properties
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            System.out.println("Path: " + url.getPath());
            System.out.println("Default port: " + url.getDefaultPort());

            // downloading the index.html file
            Scanner in = new Scanner(url.openStream());
            while(in.hasNextLine()){
                System.out.println(in.nextLine());
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
