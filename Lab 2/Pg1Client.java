import java.io.*;
import java.net.*;
import java.util.*;
class Pg1Client
    {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("127.0.0.1", 3000); 
        Scanner sc = new Scanner(System.in);
        OutputStream ostream = socket.getOutputStream(); 
        PrintWriter pwrite = new PrintWriter(ostream, true); 
        InputStream istream = socket.getInputStream(); 
        BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));   
        System.out.println("Client ready, type and press Enter key and EXIT to exit");
        String receiveMessage, sendMessage; 
        while(true) {
            sendMessage = sc.next();
            pwrite.println(sendMessage);
            if(sendMessage.equals("EXIT")){
                break;
            }
            System.out.flush(); 
            if((receiveMessage = receiveRead.readLine()) != null) 
                System.out.println(receiveMessage); 
        }
    }
}