import java.rmi.*;
import java.rmi.registry.*;

public class MyServer {
    public static void main(String[] args) {
        try
        {
            Command stub =  new CommandRemote();
            Naming.rebind("rmi://localhost:5001/command", stub);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}