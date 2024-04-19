package corejavatraining.publicaccess.nested;

import corejavatraining.nested.StringProcessor;

public class StringProcessorInnerPublicMain {
	public static void main(String[] args) {
		StringProcessor sp = new StringProcessor("iam mai");
		System.out.println("uppercase string " + sp.toUpperCase());
		System.out.println("reverse string " + sp.reverse());

		// inner class can be accessed even outside the package, if
		//it is declared as public and it's public methods
		//can be accessed
		StringProcessor.AnalyzerInnerPublic anz = sp.new AnalyzerInnerPublic();
		System.out.println("is palindrome? " + anz.isPalindrome());
	}
}
