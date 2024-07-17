package DDT;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class InsertDataIn_property {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub

		Properties p=new Properties();
		
		p.setProperty("url", "https://demowebshop.tricentis.com/");
		p.setProperty("name", "Pooja");
		
		FileOutputStream fos=new FileOutputStream("./src/test/resources/prop1.properties");
	    p.store(fos, "prop1");
	}
	

}
