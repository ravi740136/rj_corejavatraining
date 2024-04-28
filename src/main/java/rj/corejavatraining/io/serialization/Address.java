package rj.corejavatraining.io.serialization;

import java.io.Serializable;

public class Address implements Serializable{
	
	//uses default seralization, we do not implement
	//readObject and writeObject methods
	
	private static final long serialVersionUID = 1L;

	private int houseNumber;

	public int getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

}
