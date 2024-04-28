package rj.corejavatraining.io.console;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ScannerMethodsMain {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = s.nextLine();
		System.out.println(name);
		System.out.println("enter your id");
		long l = s.nextLong();
		System.out.println("your id is " + l);

		System.out.println("enter your marks");
		double eng = s.nextDouble();
		double maths = s.nextDouble();
		double science = s.nextDouble();
		System.out.printf("Total marks are %f", eng + maths + science);
		s.close();
	}
}

class ScannerHasNextType {
	public static void main(String args[]) {
		// Initialize Scanner object
		System.out.println(System.getProperty("java.version"));
		Scanner scan = new Scanner("Hello Hello Hello World! SSSIT 102 Hindi 100 150 123");

		while (true) {
			if (scan.hasNextInt()) {
				System.out.println(scan.next());
			}else {
				scan.next();
			}
			System.out.println(scan.nextLine());
			if (!scan.hasNext()) {
				break;
			}
		}
		scan.close();
	}
}

class ScannerHasNextDouble {
	public static void main(String args[]) {
		// Initialize Scanner object
		System.out.println(System.getProperty("java.version"));
		Scanner scan = new Scanner("102.4 132.6 100 150 100.45 123");

		//Print only integers
		while (scan.hasNext()) {
			if (scan.hasNextInt()) {
				//or scan.next()
				System.out.println(scan.nextInt());
			}else {
				scan.next();
			}
			}
		scan.close();
	}
}

class ScannerSkipExample3 {    
	   public static void main(String args[]){   
	        //Initialize Scanner object  
	        Scanner scan = new Scanner("JavaTpoint SSSIT 102 Hindi 100 150 123");      
	        if (scan.hasNext("JavaTpoint"))
	        scan.skip("JavaTpoint");  
	       //it seems space is causing the problems we need to skip the 
	       //word including space character, following line worked 
	        scan.skip(" SSSIT");
	        System.out.println(scan.nextLine());  
	        scan.close();  
	          }  
	} 

class ScannerSkipExample4 {   
	//it seems only problem is we should include delimiter also
	//in the pattern for skip, then it is working fine
	   public static void main(String args[]){   
	        //Initialize Scanner object  
	     //printing only the numbers
		   Scanner scan = new Scanner("JavaTpoint SSSIT 102 Hindi 100 150 123");      
	       //it will be blocked if it is waiting for input from commandline 
		   while(scan.hasNext()) {
	        while (scan.hasNext(Pattern.compile("[a-zA-Z ]+"))) 
	        scan.skip(Pattern.compile("[a-zA-Z ]+"));  

	        System.out.println(scan.next()); 
	        }
	        scan.close();  
	          }  
	} 
