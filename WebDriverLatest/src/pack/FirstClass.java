package pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FirstClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\WD8\\Jars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\DELL\\Desktop\\WD8\\Jars\\IEDriverServer.exe");
		WebDriver driver1=new InternetExplorerDriver();
		driver1.get("http://rediff.com");
		driver1.manage().window().maximize();
		
		
		

	}

}
