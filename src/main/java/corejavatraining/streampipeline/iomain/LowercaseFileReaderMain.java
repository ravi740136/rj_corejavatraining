package corejavatraining.streampipeline.iomain;

import java.io.IOException;
import java.net.URISyntaxException;
import corejavatraining.streampipeline.io.LowercaseFileReader;

import corejavatraining.streampipeline.io.BaseFileReader;

public class LowercaseFileReaderMain{

	public static void main(String[] args) throws URISyntaxException, IOException {
		BaseFileReader bfr = new LowercaseFileReader("school.properties");
	//collection is return by readfile method,
	//and each line is processed by foreach me
		bfr.readFile().forEach(name->System.out.println(name));
	}
}
