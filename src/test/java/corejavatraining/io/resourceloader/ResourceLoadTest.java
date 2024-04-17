package corejavatraining.io.resourceloader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class ResourceLoadTest {
@Test
public void testLoadingPropertiesAsResource() throws IOException {
InputStream is =  getClass().getClassLoader().getResourceAsStream("school.properties");
Properties p = new Properties();
p.load(is);
is.close();
System.out.println(p.getProperty("school.name"));
System.out.println(p.getProperty("school.principal"));
}

}
