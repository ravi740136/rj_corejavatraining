package rj.corejavatraining.io.fileparser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BufferedReaderExample {
	public static List<String> generateArrayListFromFile(String filename) throws IOException{
		BufferedReader br =  new BufferedReader(new FileReader(filename));
		List<String> lines = new ArrayList();
	
		try {
		while (br.ready()) {
			String s =  br.readLine();
			lines.add(s);
		}
		}
		finally {
			br.close();
		}		
		return lines;		
	}
}
