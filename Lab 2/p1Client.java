import java.io.*;
import java.net.*;

/**
 * p1Client
 */
public class p1Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("127.0.0.1", 3000);
        BufferedReader keyRead =  new BufferedReader(new InputStreamReader(System.in));
        OutputStream ostream = socket.getOutputStream();

        PrintWriter pWrite = new PrintWriter(ostream,true);
        InputStream istream = socket.getInputStream();
        BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));
        System.out.println("Client Ready, Type and press Enter Key");
        String receiveMessage, sendMessage, temp;
        while (true) {
            System.out.println("\nEnter Input:");
            temp = keyRead.readLine();
            sendMessage = temp.toLowerCase();
            pWrite.println(sendMessage);
            System.out.flush();
        }
    }
}