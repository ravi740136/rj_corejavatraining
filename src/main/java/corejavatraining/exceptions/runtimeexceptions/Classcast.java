package corejavatraining.exceptions.runtimeexceptions;

import corejavatraining.domain.Animal;
import corejavatraining.domain.Cat;
import corejavatraining.domain.Lion;

public class Classcast {
public static void main(String[] args) {
	try {
		Animal a = new Cat();
		Lion l = (Lion) a;
		System.out.println("finish");
	}
	catch (ClassCastException e) {
		e.printStackTrace();
	}
}
}
