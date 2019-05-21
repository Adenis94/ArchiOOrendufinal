package calculatrice2;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class RequeteCalculatrice {
    private static final Logger LOGGER = Logger.getLogger(RequeteCalculatrice.class.getName());
    
    private static int PORT = 4999;
    
    public static Operation call(Operation operation) throws UnknownHostException, IOException, ClassNotFoundException, InterruptedException {
        InetAddress host = InetAddress.getLocalHost();
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        
        Socket socket = new Socket(host.getHostName(), PORT);
        
        oos = new ObjectOutputStream(socket.getOutputStream());
        LOGGER.log(Level.INFO, "Connection established");
        
        LOGGER.log(Level.INFO, "Sending request to Socket Server");
        oos.writeObject(operation);
        
        ois = new ObjectInputStream(socket.getInputStream());
        Operation result = (Operation) ois.readObject();
        LOGGER.log(Level.INFO, "Received response : " + result);
        
        socket.close();
        
        return result;
        
        
    }
    
}
