import java.net.*;
import java.io.*;
import java.util.*;
class broadcastClient{
	public static String toString(byte[] arr){
		String s = "";
		for (int i=0; i<arr.length && arr[i] != 0; s += (char)arr[i++]);
		return s;
	}
	public static void main(String[] args){
		try{
			DatagramSocket ds=new DatagramSocket(5000);
			String s1;byte[] buf;
			DatagramPacket dp;
			while(true){
				buf=new byte[1024];
				dp=new DatagramPacket(buf,buf.length);
				ds.receive(dp);
				s1=toString(buf);
				//System.out.println(buf.toString());
				if(s1.equals("exit"))
					break;
				System.out.println(s1);
			}
			ds.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}