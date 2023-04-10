package Chapter4_InternetAddress;

import java.net.*;

public class MyAddress {

    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getLocalHost();
            //Find the address of the local machine
            System.out.println("getLocalHost: " + address);

                //  Find the IP address of the local machine
                String dottedQuad = address.getHostAddress();
System.out.println("My address is " + dottedQuad);
        } catch (UnknownHostException ex) {
            System.out.println("Could not find this computer's address.");
        }
    }

}
