package corejavatraining.io.encoding;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import org.testng.annotations.Test;

import rj.corejavatraining.io.encoding.InputstreamReaderEncodingExamples;

public class InputstreamReaderEncodingTest {

	// default encoding utf8
	@Test
	public void defaultTest() throws FileNotFoundException {
		String en = new InputStreamReader(new FileInputStream("src/test/resources/br.txt")).getEncoding();
		System.out.println("encoding " + en);
	}

	@Test
	public void simpleFileTest() throws IOException {
		InputstreamReaderEncodingExamples.readFile("src/test/resources/br.txt", "UTF8");
		InputstreamReaderEncodingExamples.readFile("src/test/resources/br.txt", "ASCII");
	}

	@Test
	public void encodingFileTest() throws IOException {
        //UTF8 or UTF-8 both are correct		
		InputstreamReaderEncodingExamples.readFile("src/test/resources/br_chinese.txt", "UTF8");
        //chinese characters can't be read using ASCII encoding
		InputstreamReaderEncodingExamples.readFile("src/test/resources/br_chinese.txt", "ASCII");

	}
}
