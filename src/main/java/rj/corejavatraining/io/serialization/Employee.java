package rj.corejavatraining.io.serialization;

import java.io.Serializable;


/*
 *This class uses defult implementation 
 *and does not use custom serialization methods 
 *readObject and writeObject
 * 
 */
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
  
	// both serializable objects with 
	// default implementation, non transient
	private Address address; 
	private Person person;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
}
