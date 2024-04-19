package corejavatraining.exceptions.runtimeexceptions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Parse {
public static void main(String[] args) {
	
	try {
SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
sdf.parse("2024xx01");
		System.out.println("finish");
	}
	catch (ParseException e) {
		e.printStackTrace();
	}
	
	
}
}
