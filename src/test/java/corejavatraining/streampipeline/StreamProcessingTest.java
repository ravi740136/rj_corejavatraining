package corejavatraining.streampipeline;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

import corejavatraining.streampipeline.main.StreamProcessingMethodMain;

public class StreamProcessingTest {

	/*
	 * writing lambda Expression 
	 * in stream map api for transformation
	 * 
	 */
	@Test
	public void testStreamProcessingUsingLambdaExpression() throws URISyntaxException, IOException {
		Path p = Paths.get(getClass().getClassLoader().getResource("school.properties").toURI());
		System.out.println("path " + p);
		List<String> lines = Files.lines(p).map(name -> name + "property").collect(Collectors.toList());
		System.out.println(lines);
	}
	
	/*
	 * Accessing the static member of the class
	 * in stream map api for transformation
	 * 
	 */
	@Test
	public void testStreamProcessingUsingMethodReference() throws URISyntaxException, IOException {
		Path p = Paths.get(getClass().getClassLoader().getResource("school.properties").toURI());
		System.out.println("path " + p);
		List<String> lines = Files.lines(p).map(StreamProcessingMethodMain::modifyLine).collect(Collectors.toList());
		System.out.println(lines);
	}
	
	/*
	 * Accessing the non static member of the class
	 * in stream map api for transformation
	 * 
	 */
	@Test
	public void testStreamProcessingUsingObjectMemberReference() throws URISyntaxException, IOException {
		Path p = Paths.get(getClass().getClassLoader().getResource("school.properties").toURI());
		System.out.println("path " + p);
		List<String> lines = Files.lines(p).map(new StreamProcessingMethodMain()::modifyLineObjectMember).collect(Collectors.toList());
		System.out.println(lines);
	}

	/*
	 * converting simple list to stream and processing
	 * using lambda expression
	 * in stream map api for transformation
	 * 
	 */
	@Test
	public void testStreamProcessingFromCollection() throws URISyntaxException, IOException {
		List<Integer> numbers = Arrays.asList(5, 10, 20, 30);
		System.out.println("list of numbers " + numbers);
		List<Integer> doubleNumbers = numbers.stream().map(n -> n *2).collect(Collectors.toList());
		System.out.println(doubleNumbers);
	}
}
