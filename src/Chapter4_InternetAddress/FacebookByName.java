package Chapter4_InternetAddress;
import java.net.*;

public class FacebookByName {
    public static void main(String[] args) {

        try {
            // A program that prints the address of www.facebook.com
            InetAddress address = InetAddress.getByName("www.facebook.com");
            System.out.println(InetAddress.getByName("www.facebook.com"));
            System.out.println("Host Name: " + address.getHostName());
            System.out.println("getHostAddress: " + address.getHostAddress());
            System.out.println("getCanonicalHostName: " + address.getCanonicalHostName());
         
                   System.out.println("\n**************A program that prints the full  address of domain name of given sites****************");
            InetAddress[] addresses = InetAddress.getAllByName("www.facebook.com");
            for (InetAddress ad : addresses) {
                System.out.println(ad);
            }
            
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Couldn't find this address");
        }
    }
}
