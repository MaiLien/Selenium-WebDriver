package Guru99.SeleniumWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateCommands {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", ".\\gecko\\v0.18.0\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://tinhluong.vansu.vn/");
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.guru99.com/first-webdriver-script.html");
		Thread.sleep(3000);
		
		driver.get("http://google.com/");
		Thread.sleep(3000);
		
	}

}
