package rj.corejavatraining.io.serialization;
import java.io.Serializable;

public class Person implements Serializable {

	//uses default seralization, we do not implement
	//readObject and writeObject methods
	private static final long serialVersionUID = 1L;

	private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
