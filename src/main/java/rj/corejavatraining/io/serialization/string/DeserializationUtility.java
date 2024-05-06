package rj.corejavatraining.io.serialization.string;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Base64;

public class DeserializationUtility {

	public static Object desrializeFromString(String s) throws IOException, ClassNotFoundException {
		
	byte[] bytes =	Base64.getDecoder().decode(s);
	ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
	ObjectInputStream ois = new ObjectInputStream(bais);
	Object am = ois.readObject();	
	return am;
		
	}
}
