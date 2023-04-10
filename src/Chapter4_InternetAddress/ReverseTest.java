
package Chapter4_InternetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class ReverseTest {
    public static void main (String[] args) throws UnknownHostException {
InetAddress ia = InetAddress.getByName("157.240.239.35");
System.out.println("getCanonicalHostName: "+ia.getCanonicalHostName());
}

    
}
