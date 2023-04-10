package network_programming_6thsem;

import java.net.*;

public class AddressTests {

    public static void main(String[] args) {

        try {

// Alt + shift +f ==> to arrang the codes
            //A program that prints the address of sites (i.e. domain name)
            System.out.println("\n**********A program that prints the address of sites (i.e. domain name)*********");
            InetAddress address = InetAddress.getByName("www.facebook.com");
            System.out.println("" + address);

            // A program that prints the full  address of domain name of given sites
            System.out.println("\n**************A program that prints the full  address of domain name of given sites****************");
            InetAddress[] addresses = InetAddress.getAllByName("www.facebook.com");
            for (InetAddress ad : addresses) {
                System.out.println(ad);
            }

        //
        //Find the address of the local machine
            System.out.println("\n*******Find the address of the local machine*******");
        InetAddress ad1 = InetAddress.getLocalHost();
System.out.println("the address of the local machine:"+ad1);
        
//
        //Given the address, find the hostname
            System.out.println("\n**********Given the address, find the hostname*********");
//                InetAddress ad2 = InetAddress.getByName("157.240.239.35");
            System.out.println("Host Name:"+ InetAddress.getByName("157.240.239.35").getCanonicalHostName());
       
        //
        //Find the IP address of the local machine
            System.out.println("\n*******Find the IP address of the local machine***********");
            
            String dq = InetAddress.getLocalHost().getHostAddress();
            System.out.println("My adress is : "+ dq);
        
            //
            //Determining whether an IP address is v4 or v6
            System.out.println("\n**********Determining whether an IP address is v4 or v6**********");
          InetAddress ad2 = InetAddress.getByName("157.240.239.35");
          TestAddressTask testAddressTask = new TestAddressTask();
            System.out.println("Address Types: "+ testAddressTask.getVersion(ad2));
         
            
            
            
        }
        catch (UnknownHostException e) {
            System.out.println(e);
            System.out.println("You gave some wrong code. Check obove code!!!");
        }

    }

}

class TestAddressTask{
public static int getVersion(InetAddress ai){
    
byte[]address = ai.getAddress();
    if (address.length ==4) {
        return 4;   
    }
    else if (address.length ==4) {
        return 4;   
    }
    else{
    return -1;
            }
//return 0;
}
    

}