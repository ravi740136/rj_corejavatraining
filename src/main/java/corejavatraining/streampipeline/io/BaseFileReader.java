package corejavatraining.streampipeline.io;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public abstract class BaseFileReader {
	
	String filepath;
	public BaseFileReader(String filepath){
		this.filepath = filepath;
	}
	public List<String> readFile() throws URISyntaxException, IOException {
		// TODO Auto-generated method stub
		Path p = Paths.get(getClass().getClassLoader().getResource(filepath)
				.toURI());
		System.out.println("path "+p);
		return Files.lines(p).map(this::processLines).collect(Collectors.toList());
		
	}
	protected abstract String processLines(String s);

}
