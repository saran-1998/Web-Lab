import java.rmi.*;

public interface DNS extends Remote {
    public String resolveIP(String name) throws RemoteException;
}
