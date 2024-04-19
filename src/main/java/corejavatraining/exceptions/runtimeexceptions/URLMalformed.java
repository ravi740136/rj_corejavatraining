package corejavatraining.exceptions.runtimeexceptions;

import java.net.MalformedURLException;
import java.net.URL;

import corejavatraining.domain.Animal;
import corejavatraining.domain.Cat;
import corejavatraining.domain.Lion;

public class URLMalformed {
public static void main(String[] args) {
	try {
URL u = new URL("mal");
		System.out.println("finish");
	}
	catch (MalformedURLException e) {
		e.printStackTrace();
	}
}
}
