import java.rmi.*;  
public class MyClient{  
    public static void main(String args[]){  
        try{  
            Factorial stub=(Factorial)Naming.lookup("rmi://localhost:5001/factorial");  
            System.out.println(stub.fact(5));  
        }
        catch(Exception e){}  
    }  
}  