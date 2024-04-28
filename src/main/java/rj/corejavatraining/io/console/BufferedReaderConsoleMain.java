package rj.corejavatraining.io.console;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class BufferedReaderConsoleMain {
	public static void main(String[] args) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		FileWriter fw = new FileWriter("src/test/resources/br.txt");
		PrintWriter pr = new PrintWriter(fw);
		try {
			List<String> names = new ArrayList<>();
			String s = null;
			while ((s = br.readLine()) != null && !s.equalsIgnoreCase("exit")) {
				names.add(s);
				pr.println(s);
			}
			System.out.println(names);
		} finally {
			fw.close();
			pr.close();
			is.close();
			br.close();
		}
	}
}
