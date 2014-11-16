package ca.csf.domslator;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class Server {

	private static ServerSocket serverSocket;
	private static Socket clientSocket;
	private static ObjectInputStream input;
	private static ObjectOutputStream output;
	private static int port;
	private static final int DEFAULT_PORT = 4444;
	private static final int DEFAULT_L33T_LEVEL = 30;

	public static void main(String[] args) {
		if (args[0] == null) {
			port = DEFAULT_PORT;
		} else {
			port = Integer.parseInt(args[0]);
		}

		try {
			serverSocket = new ServerSocket(port);
			while (true) {

				try {
					System.out.println("Waiting for a connection...");
					// This is a reference to the client socket that connected
					// successfully
					clientSocket = serverSocket.accept();
					System.out.println("Connected successfully to " + clientSocket.getInetAddress());

					input = new ObjectInputStream(clientSocket.getInputStream());
					output = new ObjectOutputStream(clientSocket.getOutputStream());

					String messageToTranslate = "";

					int leetLevel = DEFAULT_L33T_LEVEL;

					do {
						// We read the message to translate from the input
						// stream
						messageToTranslate = (String) input.readObject();

						System.out.println("Client asked to translate this : " + messageToTranslate);

						if (messageToTranslate.startsWith("/setLeetLevel ")) {
							leetLevel = Integer.parseInt(messageToTranslate.substring(messageToTranslate.indexOf(" ") + 1));
							System.out.println("Client set the leet level to " + leetLevel);
							continue;
						}

						// Translate the message into epic L33T T4LK
						String translatedMessage = Leet.toLeet(messageToTranslate, leetLevel);

						// We write back the translated message to the output
						// stream
						System.out.println("Returning back the following translated message : " + translatedMessage);
						output.writeObject(translatedMessage);

					} while (!messageToTranslate.equals("quit"));
					System.out.println("End of translation");
					
					clientSocket.close();
				} catch (SocketException e) {
					System.out.println("Client ended the connection");
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
