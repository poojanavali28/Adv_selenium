package DDT;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class getDataprop {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		FileInputStream fis= new FileInputStream("./src/test/resources/loginCred.properties");
		Properties p= new Properties();
		p.load(fis);
		System.out.println(p.getProperty("username"));
		System.out.println(p.getProperty("url"));
		
		
		
		
	}

}
