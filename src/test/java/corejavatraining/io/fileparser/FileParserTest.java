package corejavatraining.io.fileparser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.testng.annotations.Test;

import rj.corejavatraining.io.fileparser.BufferedReaderExample;
import rj.corejavatraining.io.fileparser.FileReaderExample;
import rj.corejavatraining.io.fileparser.FilesReaderExample;
import rj.corejavatraining.io.fileparser.ScannerExample;

public class FileParserTest {

	@Test
	public void test1() throws IOException {
		List<String> lines =  FileReaderExample.generateArrayListFromFile();
	//lines.stream().forEach(line->System.out.println(line+"<newline>"));
	System.out.println(lines);
	}
	
	@Test
	public void testPrintFileContents() throws IOException {
		FileReaderExample.printFileContents();
	//	System.out.println(lines);
	}
	
	@Test
	public void testBufferedReader() throws IOException {
		List<String> lines =  BufferedReaderExample.generateArrayListFromFile("src/test/resources/br.txt");
	//lines.stream().forEach(line->System.out.println(line+"<newline>"));
	System.out.println(lines);
	}
	
	@Test
	public void testFilesRead() throws IOException {
	     List<String> lines =  FilesReaderExample.generateArrayListFromFile("src/test/resources/br.txt");	
	 System.out.println(lines);
	}
	
	@Test
	public void testFilesStream() throws IOException {
		
		List<String> lines =  Files.lines(Paths.get("src/test/resources/br.txt")).toList();
	
	System.out.println(lines);
	Files.lines(Paths.get("src/test/resources/br.txt")).forEach(s->System.out.println(s.toUpperCase()));
	}
	
	@Test
	public void testIntScanner() throws IOException {
		
	List<Integer> ints = ScannerExample.generateArrayList("src/test/resources/brint.txt");
	System.out.println(ints);
	
	}
	
	@Test
	public void testStringScanner() throws IOException {
		
	List<String> sl = ScannerExample.generateArrayListStrings("src/test/resources/br.txt");
	System.out.println(sl);
	
	}
	
	@Test
	public void testLineScanner() throws IOException {		
	List<String> sl = ScannerExample.generateArrayListLines("src/test/resources/br.txt");
	System.out.println(sl);
	
	}
}