package corejavatraining.exceptions.runtimeexceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import corejavatraining.domain.Animal;
import corejavatraining.domain.Cat;
import corejavatraining.domain.Lion;

public class FileNotFound {
public static void main(String[] args) {
	try {
	FileInputStream  fis = new FileInputStream("unknown");
		System.out.println("finish");
	}
	catch (FileNotFoundException e) {
		e.printStackTrace();
	}
}
}
