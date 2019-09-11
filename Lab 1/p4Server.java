import java.net.*; 
import java.io.*; 
class Server 
{ 
    private Socket socket = null; 
    private ServerSocket server = null; 
    private DataInputStream in =  null;
    private DataOutputStream out = null; 
    public Server(int port) 
    { 
        try
        { 
            server = new ServerSocket(port); 
            System.out.println("Server started"); 
            System.out.println("Waiting for a client ..."); 
            socket = server.accept(); 
            System.out.println("Client accepted"); 
            in = new DataInputStream(new BufferedInputStream(socket.getInputStream())); 
            out = new DataOutputStream(socket.getOutputStream());
            String line = "";
            while (true) 
            { 
                try
                { 
                    line = in.readUTF(); 
                    System.out.println(line);
                    out.writeUTF(line.toUpperCase());    
                } 
                catch(IOException i) 
                { 
                    System.out.println(i); 
                } 
            } 
        } 
        catch(IOException i) 
        { 
            System.out.println(i); 
        } 
    } 
    public static void main(String args[]) 
    { 
        Server server = new Server(5000); 
    } 
}