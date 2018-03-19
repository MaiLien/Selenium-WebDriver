package Guru99.SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseAndQuitMethod {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", ".\\gecko\\v0.18.0\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
        driver.get("http://www.popuptest.com/");
        driver.findElement(By.linkText("Multi-PopUp Test #2")).click();
//        driver.quit();  // using QUIT all windows will be close
		driver.close(); // only current window is closed
	}

}
