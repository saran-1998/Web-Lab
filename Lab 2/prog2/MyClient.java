import java.rmi.*;  
public class MyClient{  
    public static void main(String args[]){  
        try{  
            Command stub=(Command)Naming.lookup("rmi://localhost:5001/command");  
            stub.execute("google-chrome");
        }
        catch(Exception e){}  
    }  
}  