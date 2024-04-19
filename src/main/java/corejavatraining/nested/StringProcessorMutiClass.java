package corejavatraining.nested;
public class StringProcessorMutiClass {
	String myString;
	public StringProcessorMutiClass(String s) {
		myString = s;
	}

  public String toUpperCase() {
    return myString.toUpperCase();
  }

  public String reverse() {
    StringBuilder sb = new StringBuilder(myString);
    return sb.reverse().toString();
  }

  // Static nested class with a constructor to receive an outer class 
  // instance
  // This is called inner class, static nested class is called inner class
  public static class Analyzer {

    private final StringProcessorMutiClass outer;

    //passing the outer instance to the inner class
    public Analyzer(StringProcessorMutiClass outer) {
      this.outer = outer;
    }

    public boolean isPalindrome() {
      return outer.reverse().equals(outer.myString);
    }
  }
  
  //Non-static nested class is called inner class
  //it can access the fields and methods of outer class instance
  //In other classes it can be accessed only through
  //instance of outer class
  class AnalyzerInner {
	    boolean isPalindrome() {
	      return reverse().equals(myString);
	    }
	  }
  
  public class AnalyzerInnerPublic {
	    public boolean isPalindrome() {
	      return reverse().equals(myString);
	    }
	  }
}

class StringFinder{
	String source;
	StringFinder(String source ){
		this.source=source;
	}
	int findIndex(String s){
		return source.indexOf(s);
	}
}
