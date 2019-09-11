import java.rmi.*;  
public class MyClient{  
    public static void main(String args[]){  
        try{  
            DNS stub=(DNS)Naming.lookup("rmi://localhost:5001/dns");  
            System.out.println(stub.resolveIP("google.com"));
        }
        catch(Exception e){}  
    }  
}  