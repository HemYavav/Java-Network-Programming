package Chapter4_InternetAddress;

import java.net.*;

class AddressTests {

    public static int getVersion(InetAddress ia) {

        byte[] address = ia.getAddress();
        if (address.length == 4) {
            return 4;
        } else if (address.length == 16) {
            return 6;
        } else {
            return -1;
        }
    }

}

public class AddressTestsTask {

    public static void main(String[] args) throws UnknownHostException {
   //Determining whether an IP address is v4 or v6
        System.out.println("Size/Type of IP Address: "+AddressTests.getVersion(InetAddress.getByName("www.facebook.com")));
    }

}
