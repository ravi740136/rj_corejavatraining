package rj.corejavatraining.io.externalization;

import java.io.Externalizable;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

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
	
	//following custom serialization methods are invoked only if 
	//the class extends serializable, they do not get invoked if 
	//the class extends externalizable
	private void writeObject(ObjectOutputStream oos) throws IOException {    
		oos.defaultWriteObject();
		System.out.println("using custom write--");
	}
	
	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
		
		ois.defaultReadObject();
		System.out.println("using custom read ..");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "country = '"+ name+"', '" +
				capital + "', '" + code+"'";
	}

}
