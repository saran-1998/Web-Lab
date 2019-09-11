import java.rmi.*;

public interface Command extends Remote {
    public void execute(String cmd) throws RemoteException;
}
