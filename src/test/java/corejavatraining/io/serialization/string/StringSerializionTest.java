package corejavatraining.io.serialization.string;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Base64;

import org.testng.annotations.Test;

import rj.corejavatraining.io.serialization.string.AppleMachine;
import rj.corejavatraining.io.serialization.string.DeserializationUtility;
import rj.corejavatraining.io.serialization.string.SerializationUtility;

public class StringSerializionTest {

	@Test
	public void testSerializingToString() throws IOException {
		AppleMachine macbook = new AppleMachine();
		macbook.setPort1("p1");
		macbook.setPort2("p2");
		macbook.setPort3("p3");

		String s = SerializationUtility.serializeToString(macbook);
		System.out.println(s);
	}

	@Test
	public void testDeserializingFromString() throws IOException, ClassNotFoundException {
		String s = "rO0ABXNyADhyai5jb3JlamF2YXRyYWluaW5nLmlvLnNlcmlhbGl6YXRpb24uc3RyaW5nLkFwcGxlTWFjaGluZQAAAAAAAAABAgADTAAFcG9ydDF0ABJMamF2YS9sYW5nL1N0cmluZztMAAVwb3J0MnEAfgABTAAFcG9ydDNxAH4AAXhwdAACcDF0AAJwMnQAAnAz";		
		AppleMachine am = (AppleMachine) DeserializationUtility.desrializeFromString(s);
		System.out.println(am);
	}
}
