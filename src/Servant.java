import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Servant extends UnicastRemoteObject implements Service{
    protected Servant() throws RemoteException {
        super();
    }

    public String printMessage() throws RemoteException{
        return "Hello World";
    }
}
