package DDT;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class fetchingDataFrom_Nil {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		FileInputStream fis=new FileInputStream("./src/test/resources/nil.properties");
		
		Properties prop= new Properties();
		
		prop.load(fis);
		
	System.out.println(prop.getProperty("url"));
	System.out.println(prop.getProperty("name"));
	}

}
