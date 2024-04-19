package corejavatraining.exceptions.handler;

import java.lang.Thread.UncaughtExceptionHandler;

public class GlobalExceptionHandler {
public static void main(String[] args) {
	Handler h = new Handler();
	Thread.setDefaultUncaughtExceptionHandler(h);
	throw new NullPointerException();
}


}

class Handler implements UncaughtExceptionHandler{
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println("printing stack trace----");
		e.printStackTrace();		
	}
	
}
