package server;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * This class launch the server side application using TCP.
 * The server generates current date.
 * Each connected client will received current date from the server.
 * 
 * @author hanis sorhana
 *
 */

public class ServerTranslationApplication {

	/**
	 * Main entry point to the server side application
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		// Launch the server frame
		ServerTranslationFrame serverFrame = new ServerTranslationFrame();
		serverFrame.setVisible(true);
		
		// Binding to a port or any other port no you are fancy of
		int portNo = 4228;
		ServerSocket serverSocket = new ServerSocket(portNo);
		
		Translation translate = new Translation();
		Translation translate2 = new Translation();
		Translation translate3 = new Translation();
		
		// Counter to keep track the number of requested connection
		int totalRequest = 0;
		
		// Server needs to be alive forever
		while (true) {
			
			// Message to indicate server is alive
			serverFrame.updateServerStatus(false);
			String engText = "Thank you";
			String targetLanguage1 = "Bahasa Malaysia";
			String targetLanguage2 = "Arabic";
			String targetLanguage3 = "Korean";
			
			// Accept client request for connection
			Socket clientSocket = serverSocket.accept();
			
			// Generate translated text
			String translation1 = translate.getTranslate(targetLanguage1);
			String translation2 = translate2.getTranslate2(targetLanguage2);
			String translation3 = translate3.getTranslate3(targetLanguage3);
			
			// Create stream to write data on the network
			DataOutputStream outputStream = 
					new DataOutputStream(clientSocket.getOutputStream());
			
			// Send current word count back to the client
			outputStream.writeUTF(translation1);
			outputStream.writeUTF(translation2);
			outputStream.writeUTF(translation3);
			
			// Close the socket
			clientSocket.close();
			serverSocket.close();
		
			// Update the request status
			serverFrame.updateRequestStatus(
					"Translated text from : " + engText + " \nTo : " + translation1 +
					"\nTranslated text from : " + engText + " \nTo : " + translation2 +
					"\nTranslated text from : " + engText + " \nTo : " + translation3 );
			serverFrame.updateRequestStatus("Accepted connection to from the "
					+ "client. Total request = " + ++totalRequest );
			
		}
		
		

	}

}
