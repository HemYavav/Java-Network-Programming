package Chapter4_InternetAddress;

import java.net.*;
import java.util.*;

public class InterfaceLister {

    public static NetworkInterface getByName(String name) throws SocketException {

        try {
            NetworkInterface ni = NetworkInterface.getByName("eth0");
            if (ni == null) {
                System.err.println("No such interface: eth0");
            }
        } catch (SocketException ex) {
            System.err.println("Could not list sockets.");
        }
        return null;
    }
    
    
    
    public static NetworkInterface getByInetAddress(InetAddress address) throws SocketException{
    
        try {
InetAddress local = InetAddress.getByName("127.0.0.1");
NetworkInterface ni = NetworkInterface.getByInetAddress(local);
if (ni == null) {
System.err.println("That's weird. No local loopback address.");
}
} catch (SocketException ex) {
System.err.println("Could not list network interfaces." );
} catch (UnknownHostException ex) {
System.err.println("That's weird. Could not lookup 127.0.0.1.");
}
        
        return null;
    }
    
    
public static Enumeration getNetworkInterfaces() throws SocketException{
return null;
}    

    public static void main(String[] args) throws SocketException {
        Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
        while (interfaces.hasMoreElements()) {
            NetworkInterface ni = interfaces.nextElement();
            System.out.println(ni);
        }
    }

}
