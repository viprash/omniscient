package browsers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {

	public static void main(String[] args) 
	{
		// open the browser
		FirefoxDriver driver=new FirefoxDriver();
		
		// close the browser
		driver.close();

	}

}
