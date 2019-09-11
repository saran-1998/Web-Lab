import java.rmi.*;
import java.rmi.server.*;

public class ArithmeticRemote extends UnicastRemoteObject implements Arithmetic{
    ArithmeticRemote() throws RemoteException {
        super();
    }

    public int add(int x, int y)
    {
        return x+y;
    }
    public int sub(int x, int y)
    {
        return x-y;
    }
    public int mul(int x, int y)
    {
        return x*y;
    }
    public int div(int x, int y)
    {
        return x/y;
    }
    public int mod(int x, int y)
    {
        return x%y;
    }
} 