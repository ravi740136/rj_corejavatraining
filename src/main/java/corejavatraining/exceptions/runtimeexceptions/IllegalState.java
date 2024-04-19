package corejavatraining.exceptions.runtimeexceptions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IllegalState {
public static void main(String[] args) {
	List<Integer> li = new ArrayList();
	li.add(10);
	try {
	Iterator<Integer> ii =	li.iterator();
ii.remove();
		System.out.println("finish");
	}
	catch (IllegalStateException e) {
		e.printStackTrace();
	}
}
}
