package rj.corejavatraining.io.encoding;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputstreamReaderEncodingExamples {

	public static void readFile(String path, String encoding) throws IOException {
		InputStreamReader en = new InputStreamReader(new FileInputStream(path),encoding);
		System.out.println("encoding "+en.getEncoding());
		while (en.ready()) {
			System.out.print((char)en.read());
		}
	}
}
