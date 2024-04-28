package corejavatraining.io.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.testng.annotations.Test;

import rj.corejavatraining.io.externalization.Country;
import rj.corejavatraining.io.externalization.CountryCustom;

public class ExternalizationTest {

	private static final String EXTFILE = "src/test/resources/extfile.txt";
	File f = new File(EXTFILE);

	@Test
	public void testExternalization() throws IOException, ClassNotFoundException {
		Country c = new Country();
		c.setName("india");
		c.setCapital("delhi");
		c.setCode(100);

		FileOutputStream fo = new FileOutputStream(EXTFILE);
		ObjectOutputStream oo = new ObjectOutputStream(fo);
		c.writeExternal(oo);
		oo.flush();
		oo.close();
		fo.close();

		FileInputStream fi = new FileInputStream(EXTFILE);
		ObjectInputStream oi = new ObjectInputStream(fi);
		c.readExternal(oi);
		oi.close();
		fi.close();

		System.out.println(c);
	}

	/*
	 * custom serialization methods are invoked only if the class extends
	 * serializable, they do not get invoked if the class extends externalizable
	 */
	@Test
	public void testCustomSerializationOfExternaizableObject() throws IOException, ClassNotFoundException {
		CountryCustom cc = new CountryCustom();
		cc.setName("england");
		cc.setCapital("london");
		cc.setCode(200);

		if (f.exists()) {
			f.delete();
		}
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(cc);
		oos.flush();
		oos.close();

		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		CountryCustom cc2 = (CountryCustom) ois.readObject();
		ois.close();
		fis.close();

		System.out.println(cc2);
	}
}
