import java.io.*;
import java.net.*;

/**
 * p1Server
 */
public class p1Server {
    public static void main(String[] args) throws Exception{
        ServerSocket server = new ServerSocket(3000);
        System.out.println("Server Ready");
        Socket socket = server.accept();
        BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
        OutputStream oStream = socket.getOutputStream();
        PrintWriter pWrite = new PrintWriter(oStream, true);
        InputStream iStream = socket.getInputStream();
        BufferedReader receiveRead = new BufferedReader(new InputStreamReader(System.in));
        String receiveMessage, sendMessage, fun;
        int a,b,c;
        while (true) {
            fun = receiveRead.readLine();
            if(fun!=null)
                System.out.println("Data" + fun);
            System.out.flush();
        }
    }
}