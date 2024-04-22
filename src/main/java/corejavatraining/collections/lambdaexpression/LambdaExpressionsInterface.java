package corejavatraining.collections.lambdaexpression;

interface MathOperation{
	int operate (int a, int b);
}


public class LambdaExpressionsInterface {

	public static void main(String[] args) {
		MathOperation addition = (a,b)->a+ b;
		MathOperation subtraction = (a,b)->a - b;
		
		System.out.println(addition.operate(5, 3 ));
	    System.out.println(subtraction.operate(7, 3));
	}
	
	static int operate(int a, int b, MathOperation o) {
		return o.operate(a, b);
	}
	
	static class RunTest{
		
		public static void main(String[] args) {
			Runnable r = ()->System.out.println("ravi");
		Thread t = new Thread(r);
		t.start();
		
		}
		
	}
	 
	
	
	
}
