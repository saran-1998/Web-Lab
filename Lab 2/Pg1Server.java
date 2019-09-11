import java.io.*;
import java.net.*;
import java.util.*;
class Pg1Server{ 
    public static void main(String[] args) throws Exception { 
        ServerSocket server = new ServerSocket(3000); 
        System.out.println("Server ready"); 
        Socket socket = server.accept();
        Scanner sc = new Scanner(System.in); 
        OutputStream ostream = socket.getOutputStream(); 
        PrintWriter pwrite = new PrintWriter(ostream, true);  
        InputStream istream = socket.getInputStream(); 
        BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));   
        String receiveMessage, sendMessage;
        while(true) {
            receiveMessage = receiveRead.readLine();
            if(!receiveMessage.equals("EXIT")) 
                System.out.println(receiveMessage);
            else{
                break;
            }
            sendMessage = sc.next();
            pwrite.println(sendMessage);
            System.out.flush();
        } 
    } 
}