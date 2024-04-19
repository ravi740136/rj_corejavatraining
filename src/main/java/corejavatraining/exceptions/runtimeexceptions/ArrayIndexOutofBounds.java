package corejavatraining.exceptions.runtimeexceptions;

public class ArrayIndexOutofBounds {
public static void main(String[] args) {
	try {
		int[] ia = {10, 20, 30};
		System.out.println(ia[3]);
		System.out.println("finish");
	}
	catch (ArrayIndexOutOfBoundsException e) {
		e.printStackTrace();
	}
}
}
