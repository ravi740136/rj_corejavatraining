package corejavatraining.io.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.testng.annotations.Test;

import corejavatraining.io.externalization.Country;

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
}
