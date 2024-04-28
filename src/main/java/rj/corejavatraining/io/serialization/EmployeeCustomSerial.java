package rj.corejavatraining.io.serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class EmployeeCustomSerial implements Serializable {

	private static final long serialVersionUID = 1L;

	private transient AddressNS address; // not an serializable object
	private Person person;

	public AddressNS getAddress() {
		return address;
	}

	public void setAddress(AddressNS address) {
		this.address = address;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	private void writeObject(ObjectOutputStream oos) throws IOException {
		oos.defaultWriteObject();
		oos.writeObject(address.getHouseNumber());
	}

	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
		ois.defaultReadObject();
		Integer houseNumber = (Integer) ois.readObject();
		AddressNS a = new AddressNS();
		a.setHouseNumber(houseNumber);
		this.setAddress(a) ;
	}

}
