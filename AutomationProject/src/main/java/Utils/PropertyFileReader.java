package Utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {

	public static String getProperty(String propertyName) {
		Properties p = new Properties();
		String property = null;
		try {
			String filePath = System.getProperty("user.dir") + "/src/main/resources/config.properties";
			FileReader file;
			file = new FileReader(filePath);
			p.load(file);
			property = p.getProperty(propertyName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return property;
	}
}
