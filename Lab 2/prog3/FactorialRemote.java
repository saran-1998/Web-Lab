import java.rmi.*;
import java.rmi.server.*;

public class FactorialRemote extends UnicastRemoteObject implements Factorial{
    FactorialRemote() throws RemoteException {
        super();
    }

    public int fact(int x)
    {
        int ans = 1;
        for(int i=2; i<=x; i++)
        {
            ans *= i;
        }
        return ans;
    }
} 