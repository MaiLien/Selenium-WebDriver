package Guru99.SeleniumWebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
	
	public static void main(String[] args) {
		
//		https://www.guru99.com/first-webdriver-script.html

		System.setProperty("webdriver.gecko.driver", ".\\gecko\\v0.18.0\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/articles_popup.php");
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("")));
		driver.findElement(By.name("emailid")).sendKeys("mailien@gmail.com");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("btnLogin")));
		driver.findElement(By.name("btnLogin")).click();
		
		driver.close();
		
	}

}
