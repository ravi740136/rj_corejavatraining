package rj.corejavatraining.io.fileparser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerExample {

public static List<Integer> generateArrayList(String path) throws FileNotFoundException{
	Scanner scan = new Scanner(new File(path));
	List<Integer> li = new ArrayList<>();
	while (scan.hasNext()) {
	if (scan.hasNextInt()) {
	li.add(scan.nextInt());
	}else {
		scan.next();
	}
}
	return li;
}

public static List<String> generateArrayListStrings(String path) throws FileNotFoundException{
	Scanner scan = new Scanner(new File(path));
	List<String> li = new ArrayList<>();
	while (scan.hasNext()) {
	
	li.add(scan.next());
	
}
	return li;
}

public static List<String> generateArrayListLines(String path) throws FileNotFoundException{
	Scanner scan = new Scanner(new File(path));
	List<String> li = new ArrayList<>();
	while (scan.hasNext()) {
	li.add(scan.nextLine());	
}
	return li;
}
}
