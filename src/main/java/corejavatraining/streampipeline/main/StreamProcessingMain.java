package corejavatraining.streampipeline.main;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import corejavatraining.streampipeline.io.LowercaseFileReader;

import corejavatraining.streampipeline.io.BaseFileReader;

public class StreamProcessingMain{

	public static void main(String[] args) throws URISyntaxException, IOException {
		Path p = Paths.get(StreamProcessingMain.class.getClassLoader().getResource("school.properties")
				.toURI());
		System.out.println("path "+p);
		List<String> lines = Files.lines(p).map(name->name+ "property").collect(Collectors.toList());
	System.out.println(lines);
	}
	
	
}
