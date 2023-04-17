package Chapter4_InternetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IBiblioAliases {

    public static void main(String args[]) {
        try {
            InetAddress ibiblio = InetAddress.getByName("www.facebook.com");
            InetAddress helios = InetAddress.getByName("facebook.com");
            if (ibiblio.equals(helios)) {
                System.out.println("www.facebook.com is the same as www.facebook.com");
            } else {
                System.out.println("www.facebook.com is not the same as www.facebook.com");
            }
        } catch (UnknownHostException ex) {
            System.out.println("Host lookup failed.");
        }
    }

}
