package lab1;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpAddressTest {

	/*
	 * Write a program to get the IP address of localhost and identify if the
	 * address is IPV4 or IPV6.
	 */

	public static void main(String[] args) throws UnknownHostException {
		InetAddress ip = InetAddress.getLocalHost();

		System.out.println(ip.getHostAddress());

		byte[] bytes = ip.getAddress();
		if (bytes.length == 4) {
			System.out.println(ip + " is IPv4 address.");
		} else if (bytes.length == 16) {
			System.out.println(ip + " is IPv6 address.");
		} else {
			System.out.println("Neither.");
		}

	}

}
