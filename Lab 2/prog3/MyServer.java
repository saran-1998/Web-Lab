import java.rmi.*;
import java.rmi.registry.*;

public class MyServer {
    public static void main(String[] args) {
        try
        {
            Factorial stub =  new FactorialRemote();
            Naming.rebind("rmi://localhost:5001/factorial", stub);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}