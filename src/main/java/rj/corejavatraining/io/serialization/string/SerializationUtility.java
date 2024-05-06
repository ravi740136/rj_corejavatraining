package rj.corejavatraining.io.serialization.string;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Base64;

public class SerializationUtility {
	
	public static String serializeToString(Object o) throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(baos);
		oos.writeObject(o);
		String s = Base64.getEncoder().encodeToString(baos.toByteArray());
		return s;
	}

}
