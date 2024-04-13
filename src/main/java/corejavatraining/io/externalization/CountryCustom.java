package corejavatraining.io.externalization;

import java.io.Externalizable;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class CountryCustom implements Externalizable {
	
	
	private int code;
	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	private String name, capital;

	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeUTF(name);
		out.writeUTF(capital);
		out.writeInt(code);			
	}

	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		this.name = in.readUTF();
		this.capital = in.readUTF();
		this.code = in.readInt();
	}
	
	private void writeObject(ObjectOutputStream oos) throws IOException {

	}
	
	private void readObject(ObjectInputStream ois) {
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "country = '"+ name+"', '" +
				capital + "', '" + code+"'";
	}

}
