import java.rmi.*;
import java.rmi.server.*;
import java.io.*;
import java.net.*;
import java.net.UnknownHostException;

public class DNSRemote extends UnicastRemoteObject implements DNS{
    DNSRemote() throws RemoteException {
        super();
    }

    public String resolveIP(String host) 
    {
        try
        {
            InetAddress addr = InetAddress.getByName(host);
            String address = addr.getHostAddress();
            return address;
        }
        catch(Exception e) { return "Error";}
    }
} 