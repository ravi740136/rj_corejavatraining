package rj.corejavatraining.io;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathResolveMain {
public static void main(String[] args) {  
	
	//Here we are able to resolve sub paths on two different paths
	Path p = Paths.get("D:\\my_interview_material\\selenium").resolve("doc");
	System.out.println(p.toString());
	System.out.println(Files.exists(p));
	
	p = Paths.get("D:\\my_interview_material\\jmeter").resolve("doc");
	System.out.println(p.toString());
	System.out.println(Files.exists(p));
}
}
