package corejavatraining.streampipeline.iomain;

import java.io.IOException;
import java.net.URISyntaxException;

import corejavatraining.streampipeline.io.BaseFileReader;

public class UppercaseFileReaderMain{

	public static void main(String[] args) throws URISyntaxException, IOException {
		BaseFileReader bfr = new corejavatraining.streampipeline.io.UppercaseFileReader("school.properties");
	bfr.readFile().forEach(name->System.out.println(name));
	}
}
