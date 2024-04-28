package rj.corejavatraining.io.console;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ScannerMethodsSkip {

	public static void main(String[] args) {

		String str = "test 102 test 131 150 123";
		// Initialize Scanner object
		Scanner scan = new Scanner(str);
		// Initialize the String pattern
		String pattern = "[a-zA-Z]*";
		// Printing the tokenized Strings
		while (scan.hasNext()) {
			// Skipping first occurrence of the Pattern
			scan.skip(pattern);
			System.out.println(scan.next());
			System.out.println("==next==");
		}
		scan.close();
	}
}

class ScannerSkipExampleManualCheckForNumbers {
	public static void main(String args[]) {
		// Initialize Scanner object
		System.out.println(System.getProperty("java.version"));
		Scanner scan = new Scanner("Hello Hello Hello World! SSSIT 102 Hindi 100 150 123");

		// Skip the word that matches the specified pattern
		while (true) {
			// checking if next word is a number
			if (scan.hasNext(Pattern.compile("[\\d]+"))) {
				System.out.println("String: " + scan.next());

			} else {
				// skipping using next if not a number
				//scan.next();
				
				//skip is working only of spaces are also
				//included in the pattern
				try {
				scan.skip("[a-zA-Z! \t]+");
				}
				catch(NoSuchElementException e) {
					System.out.println("exception");
				}
			}
			if (!scan.hasNext()) {
				break;
			}
		}
		scan.close();
	}
}

class ScannerSkipExample1 {
	public static void main(String args[]) {
		// Initialize Scanner object
		System.out.println(System.getProperty("java.version"));
		Scanner scan = new Scanner("Hello Hello Hello World! SSSIT 102 Hindi100 150 123");
		// String s = scan.findInLine(Pattern.compile("..llo"));

		// System.out.println(s);
		// Skip the word that matches the specified pattern
		while (true) {
			if (scan.hasNext(Pattern.compile("..llo"))) {
				// System.out.println("found skip pattern " + scan.next());
				// skip should work here if we do not execute
				// about scan.next but, it is not working
				scan.skip(Pattern.compile("..llo"));
				System.out.println("skipped");
			}
			System.out.println("Left String: " + scan.next());
			if (!scan.hasNext()) {
				break;
			}
		}
		scan.close();
	}
}

//not working
class Main {
	public static void main(String[] args) {
		String text = "123 abc 456 def 789 ghi";

		// Create a Scanner object with the input string
		Scanner scanner = new Scanner(text);

		// Skip letters using a regular expression pattern
		while (scanner.hasNext()) {
			if (scanner.hasNext("[a-zA-Z]+")) { // [a-zA-Z]+ matches one or more letters
				scanner.skip("[a-zA-Z]+"); // Skip letters
			} else {
				System.out.println(scanner.next()); // Print non-letter part
			}
		}

		// Close the scanner
		scanner.close();
	}
}
