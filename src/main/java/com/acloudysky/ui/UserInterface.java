package com.acloudysky.ui;


import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author mmiele
 *
 */


import java.util.Scanner;

/**
 * Defines the variables and methods required to implement the SimpleUI class.
 * @author Michael
 *
 */
public abstract class UserInterface implements IUserInterface {

	/**
	 * Platform specific separator.
	 */
	protected static final String newline = System.getProperty("line.separator");
	
	/**
	 * Scanner object to interact with the application's user. 
	 * For more information, see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html" target="_blank">Class Scanner</a>.
	 */
	protected static Scanner _input;
	
	/**
	 * Initializes a new Scanner that produces 
	 * values scanned from the specified input stream. 
	 */
	protected UserInterface() {
		
		// Instantiate Scanner object to read user's input.
		_input = new Scanner(System.in);

	}
	
	 /** 
	  * Prompts user for integer input. Read user's input. 
	  * @return The user's input
	 */
	protected int readUserInputInt() {
		System.out.print(">>");
		int result = Integer.parseInt(_input.nextLine());
		return result;
	}
	
	/** 
	  * Prompts user for string input. Read user's input. 
	  * @return The user's input
	 */
	protected String readUserInputString() {
		System.out.print(">>");
		String result = String.valueOf(_input.nextLine());
		return result;
	}
	
	
	 /**
	  * Displays welcome message.
	  * @param message The message to display.
	  */
	 public static void displayWelcomeMessage(String message)
	 {
	     System.out.println(dividerLine("*", DIVIDER_LENGTH));
	     String welcome = "Welcome to " + message; 
	     System.out.println(headerLine(welcome, DIVIDER_LENGTH));
	     System.out.println(dividerLine("*", DIVIDER_LENGTH));
	 }
	
	 /**
	  * Displays good bye message.
	  * @param message The message to display.
	  */
	 public static void displayGoodbyeMessage(String message)
	 {
		 headerLine(message, DIVIDER_LENGTH);
	     System.out.println(dividerLine("*", DIVIDER_LENGTH));
	     String bye = "Thank you for using " + message; 
	     System.out.println(headerLine(bye, DIVIDER_LENGTH));
	     System.out.println(dividerLine("*", DIVIDER_LENGTH));
	 }
	  
	 
	 /*************************
	  ** Internal utilities  **
	  *************************/
	 
	 /*
	  * Creates the header to display.
	  * @param headerText The text to display in the header.
	  * @param length The length of the header.  
	  * @return Formatted header line.
	  */
	 private static String headerLine(String headerText, int length)
	 {
	     String header = "";
	     header = header.concat("***");
	     int blankSpaces = (length - (header.length() + headerText.length()))/2;
	     
	     for(int i = 2; i < blankSpaces; i++)
	     	header = header.concat(" ");
	     header = header.concat(headerText);
	     for(int i = header.length(); i < length - 3; i++)
	     	header = header.concat(" ");
	     header = header.concat("***");
	     return header;
	 }
	 
	 /*
	  * Creates the divider line.
	  * @param c The character to use to create the divider line.
	  * @param length The length of the divider line.
	  * @return Formatted divider line.
	  */
	 private static String dividerLine(String c, int length)
	 {
	     String divider = "";
	     for(int i = 0; i < length; i++)
	         divider = divider.concat(c);
	
	     return divider;
	 }
	 
	 /*************************
	  ** Public methods      **
	  *************************/
	
	/**
	 * Processes user's input.
	 * @see UserInterface#processUserInput()
	 */
	 public abstract void processUserInput ();
	
	 /**
	  * Displays the application menu.
	 * @param menuentries The array containing the menu entries. 
	  */
	 public void displayMenu(ArrayList<String> menuentries) {
		
		 // Display menu header.
		 System.out.println(dividerLine("*", DIVIDER_LENGTH));
	
		// Display menu entries.
	 	Iterator<String> i = menuentries.iterator();
	 	while (i.hasNext()) {
	 		System.out.println(i.next());
	 	}	
	 	
	 	// Display menu footer.
	 	System.out.println(dividerLine("*", DIVIDER_LENGTH));
	 }

}

