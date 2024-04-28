package rj.corejavatraining.io.console;

import java.io.Console;

public class ConsoleMethodsMain {
	public static void main(String[] args) throws ConsoleMissingException {
		//Get and check for console
		Console con = System.console();
		if (con==null) {
			System.out.println("no console available");
			throw new  ConsoleMissingException("console is null");
		}
		//con.printf("Please eneter your favourite programming language");
		//following line will prompt the message and read the line
		String lan = con.readLine("Please eneter your favourite programming language");
		con.printf("your favourite language is %s" , lan);
		
		//con.printf("Please enter your password");
		char[] pass = con.readPassword("Please enter your password");
		//any of the following two options will work fine
		String passs= String.valueOf(pass);
		//String passs= new String(pass);
		//The following option will fail
		// String passs= pass.toString();
		if (passs.toUpperCase().equals("RAVI"))
		con.printf("GOOD");
		else
		con.printf("Try next time, you have entered %s",passs);
		
		
		
	}

}
