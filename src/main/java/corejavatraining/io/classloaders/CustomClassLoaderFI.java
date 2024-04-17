package corejavatraining.io.classloaders;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class CustomClassLoaderFI extends ClassLoader {

    @Override
    public Class findClass(String name) throws ClassNotFoundException {
        byte[] b=null;
        try {
        b= loadClassFromFile(name);
        }
        catch(Exception e) {
        	
        }
        return defineClass(name, b, 0, b.length);
    }

    private byte[] loadClassFromFile(String fileName) throws FileNotFoundException  {
    	File f = new File("src/test/resources/corejavatraining/io/classloaders/PrintClassLoader.class");
        System.out.println("file exists "+f.exists());
    	InputStream inputStream = new FileInputStream(f);
        		//getClass().getClassLoader().getResourceAsStream(
               // fileName.replace('.', File.separatorChar) + ".class");
        byte[] buffer;
        ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
        int nextValue = 0;
        try {
        	
            while ( (nextValue = inputStream.read()) != -1 ) {
                byteStream.write(nextValue);
            }
        } catch (IOException e) {
            e.printStackTrace(); 
        }
        buffer = byteStream.toByteArray();
        return buffer;
    }
}
