package rj.corejavatraining.io.classloaders;

import java.util.ArrayList;

public class PrintClassLoader {
    public void printClassLoaders() throws ClassNotFoundException {
        System.out.println(this.getClass().getName());
    	System.out.println("Classloader of this class:" + PrintClassLoader.class.getClassLoader());
        System.out.println("Classloader of ArrayList:" + ArrayList.class.getName());
    }
}
