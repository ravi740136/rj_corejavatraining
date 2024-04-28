package rj.corejavatraining.io.fileparser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FilesReaderExample {
public static List<String> generateArrayListFromFile(String path) throws IOException{
	return Files.readAllLines(Paths.get(path));
}
}
