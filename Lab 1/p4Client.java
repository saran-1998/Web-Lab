import java.net.*; 
import java.io.*; 
import java.util.*;
class Client 
{ 
    private Socket socket = null; 
    private DataInputStream input = null; 
    private DataOutputStream out = null; 
    public Client(String address, int port) 
    { 
        try
        { 
            socket = new Socket(address, port); 
            System.out.println("Connected"); 
            input = new DataInputStream(new BufferedInputStream(socket.getInputStream())); 
            out = new DataOutputStream(socket.getOutputStream()); 
        } 
        catch(Exception e) 
        { 
            System.out.println(e); 
        } 
        String line = "", r = ""; 
        Scanner sc = new Scanner(System.in);
        while (true) 
        { 
            try
            { 
                line = sc.next(); 
                out.writeUTF(line);
                r = input.readUTF();
                System.out.println(r); 
            } 
            catch(IOException i) 
            { 
                System.out.println(i); 
            } 
        } 
    } 
    public static void main(String args[]) 
    { 
        Client client = new Client("127.0.0.1", 5000); 
    } 
} 
