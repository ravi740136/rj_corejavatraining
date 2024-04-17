package corejavatraining.io.classloaders;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import org.testng.annotations.Test;

public class CustomClassLoaderUnitTest {

    @Test
    public void testCustomLoaderWithFileInputStream() throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        CustomClassLoaderFI customClassLoader = new CustomClassLoaderFI();
        Class<?> c = customClassLoader.findClass(PrintClassLoader.class.getName());

        Object ob = c.newInstance();

        Method md = c.getMethod("printClassLoaders");
        md.invoke(ob);
    }
    
    @Test
    public void testCustomLoaderWithResourceStream() throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        CustomClassLoaderRS customClassLoader = new CustomClassLoaderRS();
        Class<?> c = customClassLoader.findClass(PrintClassLoader.class.getName());

        Object ob = c.newInstance();

        Method md = c.getMethod("printClassLoaders");
        md.invoke(ob);
    }
    
    @Test
    public void testURLClassLoader() throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, MalformedURLException {
    	  File directory = new File("src/test/resources/corejavatraining/io/classloaders");

          // Convert the directory to a URL
          URL url = directory.toURI().toURL();
 
          // Create a URLClassLoader with the directory URL
          URLClassLoader classLoader = new URLClassLoader(new URL[]{url});

          // Load the class using the URLClassLoader
          Class<?> loadedClass = classLoader.loadClass("corejavatraining.io.classloaders.PrintClassLoader");

        Object ob = loadedClass.newInstance();

        Method md = loadedClass.getMethod("printClassLoaders");
        md.invoke(ob);
    }
}
