package ca.csf.domslator;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	private static Socket socket;
	private static ObjectOutputStream output;
	private static ObjectInputStream input;
	private static String address;
	private static int port;
	private static final String DEFAULT_ADDRESS = "localhost";
	private static final int DEFAULT_PORT = 4444;

	public static void main(String[] args) {

		if (args[0] == null) {
			address = DEFAULT_ADDRESS;
		} else {
			address = args[0];
		}

		try {
			if (args[1] == null) {
				port = DEFAULT_PORT;
			} else {
				port = Integer.parseInt(args[1]);
			}
		} catch (NumberFormatException e) {
			System.out.println("Wrong port number format");
		}

		try {
			socket = new Socket(address, port);
			output = new ObjectOutputStream(socket.getOutputStream());
			input = new ObjectInputStream(socket.getInputStream());
			Scanner userInputScanner = new Scanner(System.in);
			String messageToTranslate = "";

			do {
				// Get message to translate from the user
				System.out.println("Enter a message to translate :");
				messageToTranslate = userInputScanner.nextLine();

				// Send the message to the server to translate
				output.writeObject(messageToTranslate);
				
				// If the message is a special command, do not wait for any result from the server.
				if (messageToTranslate.startsWith("/")) {
					continue;
				}

				// Print the response back in the console
				System.out.println((String) input.readObject());

			} while (!messageToTranslate.equals("quit"));

			userInputScanner.close();
			socket.close();

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Cannot connect to " + address + ":" + Integer.toString(port));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
