package Simplepro;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPaddress1 {

	public static void main(String[] args) throws IOException {
		// local host name and address 
        InetAddress localhost = InetAddress.getLocalHost(); 
        System.out.println("System IP Address : " + 
                      (localhost.getHostAddress()).trim()); 

	}

}
