package Com.amazon.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Propertyread {
	
	public static void main(String[] args) throws IOException {
		FileInputStream r=new FileInputStream("C:\\Users\\SINGAM\\workspace\\Amazon\\Objectrepo\\Config.properties");
		Properties s=new Properties();
		s.load(r);
		String value=s.getProperty("URL");
		System.out.println(value);
		
		
	}

}
