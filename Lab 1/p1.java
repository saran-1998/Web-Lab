import java.io.*;
import java.util.*;
import java.net.*;

class Ping
{
    public static void sendPingRequest(String ipAddress)throws UnknownHostException, IOException
    {
        InetAddress addr = InetAddress.getByName(ipAddress);
        System.out.println("Sending ping request to " + ipAddress);
        if(addr.isReachable(5000))
            System.out.println("Host is Reachable");
        else
            System.out.println("Cannot reach host");
    }

    public static void main(String[] args) throws UnknownHostException, IOException{
        String ipAddress = "127.0.0.1";
        sendPingRequest(ipAddress);
        ipAddress = "192.168.117.70";
        sendPingRequest(ipAddress);
    }
}