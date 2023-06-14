package client;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * This class represent the window for the client side TCP application.
 * It display the date retrieve from the server.
 * 
 * @author hanis sorhana
 *
 */
public class ClientTranslationFrame extends JFrame {

	
	private static final long serialVersionUID = 1L;
	
	// Private frame components
	private JLabel lblServerLanguage;
	private JLabel lblServerLanguage2;
	private JLabel lblServerLanguage3;
	private JLabel lblStatusValue;
	
	// Private attributes for frame size
	private int width = 700;
	private int height = 200;


	/**
	 * The constructor that initialize and organize the Swing components on 
	 * the frame.
	 */
	public ClientTranslationFrame () {
		
		// Default frame setting
		this.setLayout(new BorderLayout());
		this.setTitle("TCP Application: Client Side");
		this.setSize(width, height);
		
		
		// Center the frame on the screen
        this.setLocationRelativeTo(null);
		
		// Initialize default value for label
        lblServerLanguage = new JLabel("-");
        lblServerLanguage2 = new JLabel("-");
        lblServerLanguage3 = new JLabel("-");
		lblStatusValue = new JLabel("-");
		
		// Must close on X
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Organize components
		loadComponent();
		
	}
	
	
	/**
	 * This method update the value of Word Count on the frame
	 * 
	 * @param serverDate: Server's Word Count
	 */
	public void updateServerLanguage (String targetLanguage) {
		
		this.lblServerLanguage.setText(targetLanguage);
		
	}
	public void updateServerLanguage2 (String targetLanguage2) {
	
		this.lblServerLanguage.setText(targetLanguage2);
		
	}
	public void updateServerLanguage3 (String targetLanguage3) {
	
	this.lblServerLanguage.setText(targetLanguage3);
	
}
	
	/**
	 * This method update the status of connection to the server.
	 * 
	 * @param connStatus: Connection status (true/false)
	 */
	public void updateConnectionStatus (boolean connStatus) {
		

		// Default status. Assuming for the worst case scenario.
		String status = "No connection to server.";
		
		// Validate status of connection
		if (connStatus)
			status = "Connection has established.";
		
				
		// Update the status on frame
		this.lblStatusValue.setText(status);
	}
	
	/**
	 * This method creates and arrange Swing components to display status of 
	 * client's connection to the server.
	 * 
	 * @param font
	 * @return Swing components organized in a panel.
	 */
	private JPanel getConnectionStatusPanel(Font font) {
		
		// Create component
		JPanel panel = new JPanel();
		JLabel lblConnStatus = new JLabel ("Connection status: ");
		
		// Style the component
		lblConnStatus.setFont(font);
		lblStatusValue.setFont(font);
		lblConnStatus.setBackground(Color.WHITE);
		lblConnStatus.setOpaque(true);
		lblStatusValue.setBackground(Color.WHITE);
		lblStatusValue.setOpaque(true);
		
		// Organize components into panel
		panel.add(lblConnStatus);
		panel.add(lblStatusValue);
		
		return panel;
		
	}
	
	/**
	 * This method creates and arrange Swing components to word count retrieve from 
	 * the server.
 	 *
	 * @param font
	 * @return Swing components organized in panel
	 */
	private JPanel getServerDatePanel(Font font) {
		
		// Create component to display date retrieve from the server
		JPanel panel = new JPanel();
		JLabel lblLanguage = new JLabel ("Translation at server side");

		// Style the component
		lblLanguage.setFont(font);
		lblServerLanguage.setFont(font);
		lblLanguage.setBackground(Color.WHITE);
		lblLanguage.setOpaque(true);
		lblServerLanguage.setBackground(Color.WHITE);
		lblServerLanguage.setOpaque(true);

		// Organize components into panel
		panel.add(lblLanguage);
		panel.add(lblServerLanguage);
		
		return panel;
	} 
	private JPanel getServerDatePanel2(Font font) {
		
		// Create component to display date retrieve from the server
		JPanel panel = new JPanel();
		JLabel lblLanguage = new JLabel ("Translation at server side");

		// Style the component
		lblLanguage.setFont(font);
		lblServerLanguage.setFont(font);
		lblLanguage.setBackground(Color.WHITE);
		lblLanguage.setOpaque(true);
		lblServerLanguage.setBackground(Color.WHITE);
		lblServerLanguage.setOpaque(true);

		// Organize components into panel
		panel.add(lblLanguage);
		panel.add(lblServerLanguage2);
		
		return panel;
	} 
	
	private JPanel getServerDatePanel3(Font font) {
		
		// Create component to display date retrieve from the server
		JPanel panel = new JPanel();
		JLabel lblLanguage = new JLabel ("Translation at server side");

		// Style the component
		lblLanguage.setFont(font);
		lblServerLanguage.setFont(font);
		lblLanguage.setBackground(Color.WHITE);
		lblLanguage.setOpaque(true);
		lblServerLanguage.setBackground(Color.WHITE);
		lblServerLanguage.setOpaque(true);

		// Organize components into panel
		panel.add(lblLanguage);
		panel.add(lblServerLanguage3);
		
		return panel;
	} 
	
	
	/**
	 * This method arrange the Swing components on the frame.
	 */
	private void loadComponent() {
		
		// Get font
		Font font = this.getFontStyle();
		
		// Get server status's panel and add to frame
		JPanel northPanel = this.getConnectionStatusPanel(font);		
		this.add(northPanel, BorderLayout.NORTH);
		
		// Get server date's panel and add to frame
		JPanel center = getServerDatePanel(font);
		this.add(center, BorderLayout.CENTER);
		JPanel center2 = getServerDatePanel2(font);
		this.add(center2, BorderLayout.CENTER);
		JPanel center3 = getServerDatePanel3(font);
		this.add(center3, BorderLayout.CENTER);
	}
	
	
	/**
	 * This method define a font to a generic style.
	 * 
	 * @return font object
	 */
	private Font getFontStyle() {
		
		Font font = new Font ("Serif", Font.PLAIN, 30);
		
		return font;
		
	}
	
	
	
	
	
}
