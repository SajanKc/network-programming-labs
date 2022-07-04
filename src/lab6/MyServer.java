package lab6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(8088);
			Socket serverClientSocket = server.accept();

			DataInputStream inStream = new DataInputStream(serverClientSocket.getInputStream());
			DataOutputStream outStream = new DataOutputStream(serverClientSocket.getOutputStream());

			String clientMessage = "";

			while (!clientMessage.equals("end")) {
				clientMessage = inStream.readUTF();
				outStream.writeUTF("From Server: " + clientMessage);
				outStream.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
