import java.io.*;
import java.net.*;
import java.util.*;
class broadcastServer{
	public static void main(String[] args){
		try{
			DatagramSocket ds=new DatagramSocket();
			String msg;
			DatagramPacket dp;
			InetAddress ip=InetAddress.getByName("255.255.255.255");
			Scanner sc=new Scanner(System.in);
			byte[] buf;
			while(true){
				System.out.println("Enter the message to be broadcasted..\n");
				msg=sc.nextLine();
				buf=msg.getBytes();
				dp=new DatagramPacket(buf,buf.length,ip,5000);
				ds.send(dp);
				if(msg.equals("exit"))
					break;
			}
			ds.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}