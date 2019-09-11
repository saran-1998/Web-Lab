import java.rmi.*;  
public class MyClient{  
    public static void main(String args[]){  
        try{  
            Arithmetic stub=(Arithmetic)Naming.lookup("rmi://localhost:5001/arithmetic");  
            System.out.println(stub.add(4,3));
            System.out.println(stub.sub(4,3));
            System.out.println(stub.mul(4,3));
            System.out.println(stub.div(4,3));
            System.out.println(stub.mod(4,3));  
        }
        catch(Exception e){}  
    }  
}  