package corejavatraining.io.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.testng.annotations.Test;

public class CustomSerializationTest {

	@Test
	public void test_custom_serialization_including_transient_field() throws IOException, ClassNotFoundException {
		Person p = new Person();
		p.setAge(25);
		p.setName("rahul");
		
		AddressNS a =  new AddressNS();
		a.setHouseNumber(1);
		
		EmployeeCustomSerial e = new EmployeeCustomSerial();
		e.setPerson(p);
		e.setAddress(a);
		
		FileOutputStream fo = new FileOutputStream("src/test/resources/output.txt");
	    ObjectOutputStream oo = new ObjectOutputStream(fo);
	    oo.writeObject(e);
	    oo.flush();
	    oo.close();
	    
	    FileInputStream fi = new FileInputStream("src/test/resources/output.txt");
	    ObjectInputStream oi = new ObjectInputStream(fi);
	    EmployeeCustomSerial e1 = (EmployeeCustomSerial)oi.readObject();
	    oi.close();
	    
	    System.out.println(e1.getPerson().getAge());
	    System.out.println(e1.getAddress().getHouseNumber());
	    
	}
}
