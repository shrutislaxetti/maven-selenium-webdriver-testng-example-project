package testcases.mytheresa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverSettings {
	
	public WebDriver driverSettings() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe /home/ec2-user/");
		WebDriver driver = new ChromeDriver();
		return driver;
	}

}
