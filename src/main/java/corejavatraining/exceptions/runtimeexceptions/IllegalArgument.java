package corejavatraining.exceptions.runtimeexceptions;

public class IllegalArgument {
public static void main(String[] args) throws InterruptedException {
	try {
Thread.sleep(-1000l);
		System.out.println("finish");
	}
	catch (IllegalArgumentException e) {
		e.printStackTrace();
	}
}
}
