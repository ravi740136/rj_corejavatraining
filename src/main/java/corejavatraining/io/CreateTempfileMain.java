package corejavatraining.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateTempfileMain {
	public static void main(String[] args) throws IOException {
		Path tempf;
		try {
		tempf= Paths.get("C:\\Users\\Admin\\AppData\\Local\\Temp\\ravi2183320129991011586jak");
		System.out.println("old temp file " + Files.exists(tempf));
		//this method will delete the temp file on jvm exit for this program
		//this method should be used only on the temp files
		tempf.toFile().deleteOnExit();
	
		}
		catch(Exception ioe) {
			ioe.printStackTrace();
		}
		Path p = Files.createTempFile("ravi", "jak");
		//temp file is created in the temp folder location 
		//C:\Users\Admin\AppData\Local\Temp
	    System.out.println("temp file path "+ p);
	}

}
