package corejavatraining.publicaccess.nested;

import corejavatraining.nested.StringProcessor;

public class StringProcessorPublicMain {
	public static void main(String[] args) {
		StringProcessor sp = new StringProcessor("iam mai");
		System.out.println("uppercase string " + sp.toUpperCase());
		System.out.println("reverse string " + sp.reverse());

		StringProcessor.Analyzer anz = new StringProcessor.Analyzer(sp);
		System.out.println("is palindrome? " + anz.isPalindrome());
	}
}
