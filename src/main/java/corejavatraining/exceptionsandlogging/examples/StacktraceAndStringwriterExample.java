package corejavatraining.exceptionsandlogging.examples;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.apache.commons.lang3.exception.ExceptionUtils;

public class StacktraceAndStringwriterExample { 
	public static void main(String[] args) {
		try {
			throw new IndexOutOfBoundsException("out of bounds");
		}
		catch(IndexOutOfBoundsException ie) {
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			pw.println("===============>");
			ie.printStackTrace(pw);
			pw.flush();
			pw.close();
			String s = sw.toString();
			System.out.println("printing the stack trace \n"+s);
		}
		/*
		 * stack trace is converted to string using 
		 * exception utils
		 */
		try {
			throw new IndexOutOfBoundsException("out of bounds");
		}
		catch(IndexOutOfBoundsException ie) {
			String s = ExceptionUtils.getStackTrace(ie);
		System.out.println("printing statck trace using exception utils: \n"+s);
		}
	}

}
