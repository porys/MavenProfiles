import java.io.*;
import java.util.Properties;

/**
 * Created by NHNENT on 2017-02-13.
 */
public class HelloWorld {
	public static void main(String[] args){
		Properties prop = new Properties();
	try(InputStream stream = new HelloWorld().getClass().getResourceAsStream("db.properties")){
		//Load a property file
		prop.load(stream);
		// get property value and prints
		System.out.println("Hello! This is " + prop.getProperty("env") + " server!");
		System.out.println("- DB Connection Information - ");
		System.out.println("USERNAME: " + prop.getProperty("db.username"));
		System.out.println("PASSWORD: " + prop.getProperty("db.password"));
		System.out.println("URL: " + prop.getProperty("db.url"));
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	}


}
