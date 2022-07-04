package lab7;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.Socket;

public class NistGovTime {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("time.nist.gov", 13);
			InputStream input = socket.getInputStream();
			Reader reader = new InputStreamReader(input);
			while ((reader.read()) != -1) {
				System.out.print((char) reader.read());
			}
		} catch (Exception e) {
			System.out.println("Could not connect to time.nist.gov");
		}
	}

}
