package lab6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class MyClient {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost", 8088);
			DataInputStream inStream = new DataInputStream(socket.getInputStream());
			DataOutputStream outStream = new DataOutputStream(socket.getOutputStream());
			
			Scanner scanner = new Scanner(System.in);
			String clientMessage = "";
			String serverMessage = "";
			
			while(!clientMessage.equals("end")) {
				System.out.println("Enter something: ");
				clientMessage = scanner.nextLine();
				
				// send to server
				outStream.writeUTF(clientMessage);
				outStream.flush();
				
				// receive from server
				serverMessage = inStream.readUTF();
				System.out.println(serverMessage);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
