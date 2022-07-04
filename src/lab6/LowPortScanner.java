package lab6;

import java.io.IOException;
import java.net.Socket;
import java.rmi.UnknownHostException;

public class LowPortScanner {
	public static void main(String[] args) {
		String host = "localhost";
		for (int i = 1; i < 1024; i++) {
			try {
				Socket s = new Socket(host, i);
				System.out.println("There is a server on port: " + i + " of " + host);
			} catch (UnknownHostException e) {
				e.printStackTrace();
				break;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
