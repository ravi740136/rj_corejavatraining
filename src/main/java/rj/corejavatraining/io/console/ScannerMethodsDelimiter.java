package rj.corejavatraining.io.console;

import java.util.Scanner;

public class ScannerMethodsDelimiter {
	public static void main(String[] args) {
		System.out.println("enter your marks separated by x");
		Scanner d = new Scanner(System.in);
		//scanner takes the input until new line character
		String input = d.nextLine();
		
		Scanner s = new Scanner(input);
		s.useDelimiter("x");
		
		double eng = s.nextDouble();
		double maths = s.nextDouble();
		double science = s.nextDouble();
		System.out.printf("Total marks are %f", eng + maths + science);
		s.close();
	}
}

class ScannerMethodsDelimiterUntil {
	public static void main(String[] args) {
		System.out.println("enter records separated by semicolon");
		Scanner d = new Scanner(System.in);
		String input = d.nextLine();
		
		Scanner s = new Scanner(input);
		s.useDelimiter("[,;]");
		
		while (s.hasNext()) {
		String name = s.next();
		int age = s.nextInt();
		String city = s.next();
		System.out.printf("Name: %s, age: %d, city: %s%n", name, age, city);
		}		
		s.close();
	}
	
}

class ScannerMethodsUntilQuit {
	public static void main(String[] args) {
		System.out.println("enter city description");
		
		Scanner s = new Scanner(System.in);
		
		StringBuilder input=new StringBuilder();
		String name="";
		
		do {
			name = s.nextLine();	
			if (name!=null && !name.equals("") && !name.equalsIgnoreCase("quit")) {
			System.out.printf("description: %s%n", name);
			input.append(name).append("\n");
			}
		}while (s.hasNextLine() && !name.equalsIgnoreCase("quit") && name != null);
			
			
		System.out.println("printing descriptions");
	    System.out.println(input.toString());
		s.close();
	}
}