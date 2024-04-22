package corejavatraining.collections.lambdaexpression;

import java.util.Arrays;
import java.util.List;

/*
 * Here we are writing the code in place of body 
 * of lambda expression 
 */
public class ListForeachLambdaMain {
	public static void main(String[] args) {
		List<String> numbers = Arrays.asList("20", "30", "40" );
	numbers.forEach(number->System.out.println(number+" "+numbers.indexOf(number)));
	}
}

/* 
 * In this class we are using a method 
 * call in place of 
 * body of the lambda expression
 */
class ListForeachLambdaFunctionMain {
	
	static List<String> numbers = Arrays.asList("20", "30", "40" );
	
	public static void main(String[] args) {
	numbers.forEach(number->printProcess(number));
	}
	
	private static void printProcess(String number){
		System.out.println(number+" "+numbers.indexOf(number));
	}
}
