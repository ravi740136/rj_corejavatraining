package corejavatraining.exceptions.runtimeexceptions;

public class Arithmetic {
public static void main(String[] args) {
	try {
		int i = 100/0;
		System.out.println("finish");
	}
	catch(ArithmeticException e) {
		e.printStackTrace();
	}
}
}
