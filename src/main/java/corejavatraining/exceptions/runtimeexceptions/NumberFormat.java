package corejavatraining.exceptions.runtimeexceptions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NumberFormat {
public static void main(String[] args) {
	
	try {
int i = Integer.parseInt("100h");
		System.out.println("finish");
	}
	catch (NumberFormatException e) {
		e.printStackTrace();
	}
	
	try {
		Integer i = Integer.valueOf("100h");
				System.out.println("finish");
			}
			catch (NumberFormatException e) {
				e.printStackTrace();
			}
}
}
