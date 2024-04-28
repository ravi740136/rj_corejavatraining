package corejavatraining.io.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.testng.annotations.Test;

import rj.corejavatraining.io.serialization.Address;
import rj.corejavatraining.io.serialization.Employee;
import rj.corejavatraining.io.serialization.Person;

public class DefaultSerializationTest {
	@Test
	public void test_Default_Serialization_With_no_transient_fields() throws IOException, ClassNotFoundException {
		Person p = new Person();
		p.setAge(25);
		p.setName("rahul");

		// serializable with default implementation
		Address a = new Address();
		a.setHouseNumber(1);

		// This employee object has no transient objects and uses
		// default serialization
		Employee e = new Employee();
		e.setPerson(p);
		e.setAddress(a);
		File f = new File("src/test/resources/output.txt");

		if (f.exists())
			f.delete();

		// FileOutputStream fo = new FileOutputStream("src/test/resources/output.txt");
		FileOutputStream fo = new FileOutputStream(f);
		ObjectOutputStream oo = new ObjectOutputStream(fo);
		oo.writeObject(e);
		//ensuring that data is written to outputstream
		//using flush method
		oo.flush();
		
		//ensuring the release of resources like file handles
		oo.close();

		// FileInputStream fi = new FileInputStream("src/test/resources/output.txt");
		FileInputStream fi = new FileInputStream(f);
		ObjectInputStream oi = new ObjectInputStream(fi);
		Employee e1 = (Employee) oi.readObject();
		oi.close();
		
		System.out.println(e1.getPerson().getAge());
		System.out.println(e1.getAddress().getHouseNumber());
	}
}
