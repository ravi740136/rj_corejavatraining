package corejavatraining.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDeleteMain {
public static void main(String[] args) {
	Path p = Paths.get("d://ravinodir");
	try {	
	System.out.println("before creating "+Files.exists(p));
    Files.createDirectory(p);
    System.out.println("after creating "+Files.exists(p));
	Files.delete(p);
	System.out.println("after deleting "+Files.exists(p));
	System.out.println("trying to delete non existent file ");
	Files.delete(p);
	}
	catch(IOException e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
	
}
}
