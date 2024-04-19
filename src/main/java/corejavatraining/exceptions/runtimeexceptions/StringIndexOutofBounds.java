package corejavatraining.exceptions.runtimeexceptions;

public class StringIndexOutofBounds {
public static void main(String[] args) {
	try {
		String name = "ravi";
		System.out.println(name.charAt(4));
		System.out.println("finish");
	} 
	catch (StringIndexOutOfBoundsException e) {
		System.out.println("print stack trace");
		e.printStackTrace();
	}
}
}
