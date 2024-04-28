package rj.corejavatraining.io.fileparser;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReaderExample {
	public static List<String> generateArrayListFromFile() throws IOException {
		FileReader fr = new FileReader("src/test/resources/br.txt");
		StringBuilder sb = new StringBuilder();
		List<String> lines = new ArrayList<>();
		try {
			while (fr.ready()) {
				// read will give int value
				// cast it to character

				char ch = (char) fr.read();
				/*
				 * in this case line ending by both /n and /r
				 * 
				 */
				if (ch == '\r') {
					lines.add(sb.toString());
					sb = new StringBuilder();
				} else if (ch == '\n') {
				} else {
					sb.append(ch);
				}

			}

			// System.out.println(sb.length());
			// System.out.println(sb.toString());
		} finally {
			fr.close();
		}
		return lines;
	}

	public static void printFileContents() throws IOException {
		FileReader fr = new FileReader("src/test/resources/br.txt");
		StringBuilder sb = new StringBuilder();

		try {
			while (fr.ready()) {
				// int equivalent of characters
				int ch = fr.read();
				System.out.print(ch + ",");
			}
		} finally {
			fr.close();
		}
	}
}
