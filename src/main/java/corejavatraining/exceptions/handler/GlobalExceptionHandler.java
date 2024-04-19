package corejavatraining.exceptions.handler;

import java.io.IOException;
import java.lang.Thread.UncaughtExceptionHandler;

public class GlobalExceptionHandler {
public static void main(String[] args) throws IOException {
	Handler h = new Handler();
	Thread.setDefaultUncaughtExceptionHandler(h);
	throw new IOException("ior");
	//unreachable code
	//System.out.println("after the exception");
	
}
}
class Handler implements UncaughtExceptionHandler{
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println("printing stack trace----"+t+" "+e);
		e.printStackTrace();		
	}
	
}
