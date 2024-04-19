package corejavatraining.nested;

public class StringProcessorInnerMain {
	public static void main(String[] args) {
		StringProcessor sp = new StringProcessor("iam mai");
		System.out.println("uppercase string " + sp.toUpperCase());
		System.out.println("reverse string " + sp.reverse());

		// inner class can be accessed only through instance of outer class
		// here we used sp to access the inner class constructor
		// here inner class object is using the inner class object in its methods
		// without passing the object to it
		StringProcessor.AnalyzerInner anz = sp.new AnalyzerInner();
		System.out.println("is palindrome? " + anz.isPalindrome());
	}
}
