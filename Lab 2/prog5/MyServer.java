import java.rmi.*;
import java.rmi.registry.*;

public class MyServer {
    public static void main(String[] args) {
        try
        {
            DNS stub =  new DNSRemote();
            Naming.rebind("rmi://localhost:5001/dns", stub);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}