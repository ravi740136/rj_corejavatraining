package corejavatraining.exceptionsandlogging.examples;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NullPointerExample {
	/*
	 * Created both file appender and console appender 
	 * for this package using logger, also set
	 * the time format in 12 hour am/pm for logs
	 * logging configuration is stored in 
	 * src/main/resources/logback.xml file and log file is saved in 
	 * src/test/resources
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(NullPointerExample.class);
	public static void main(String[] args) {
		Person personObj = null;
		try {
			String name = personObj.personName; // Accessing the field of a null object
			personObj.personName = "Jon Doe"; // Modifying the field of a null object
		} catch (NullPointerException e) {
			LOGGER.error("NullPointerException caught!");
		}
	}
}

class Person {
	public String personName;
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
}
