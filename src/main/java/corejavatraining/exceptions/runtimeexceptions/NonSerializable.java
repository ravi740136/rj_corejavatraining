package corejavatraining.exceptions.runtimeexceptions;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectOutputStream;

import corejavatraining.domain.Animal;
import corejavatraining.domain.Lion;

public class NonSerializable {
public static void main(String[] args) throws IOException {
	try {
		Animal a = new Lion();
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/test/resources/myobj.txt"));
		oos.writeObject(a);
		
		System.out.println("finish");
	} 
	catch (NotSerializableException e) {
		System.out.println("print stack trace");
		e.printStackTrace();
	}
}
}
