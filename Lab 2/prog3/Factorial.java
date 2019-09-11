import java.rmi.*;

public interface Factorial extends Remote {
    public int fact(int x) throws RemoteException;
}
