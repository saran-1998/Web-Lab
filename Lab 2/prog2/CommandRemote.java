import java.rmi.*;
import java.rmi.server.*;
import java.io.*;
import java.net.*;
import java.net.UnknownHostException;

public class CommandRemote extends UnicastRemoteObject implements Command{
    CommandRemote() throws RemoteException {
        super();
    }

    public void execute(String cmd) 
    {
        try
        {
            Runtime run = Runtime.getRuntime();
            Process p = run.exec(cmd);
            System.out.println(p);
            System.out.println("This " + cmd + " has been executed.");
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
} 