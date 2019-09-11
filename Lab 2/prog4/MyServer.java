import java.rmi.*;
import java.rmi.registry.*;

public class MyServer {
    public static void main(String[] args) {
        try
        {
            Arithmetic stub =  new ArithmeticRemote();
            Naming.rebind("rmi://localhost:5001/arithmetic", stub);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}