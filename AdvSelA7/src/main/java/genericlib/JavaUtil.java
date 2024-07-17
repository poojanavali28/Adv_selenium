package genericlib;

import java.util.Random;

public class JavaUtil {
/**
 * used to get random number
 * @return num
 */
	
	public int getRandomNumber() {
	Random random = new Random();
	int num=random.nextInt(100);
	return num;
	}
}
