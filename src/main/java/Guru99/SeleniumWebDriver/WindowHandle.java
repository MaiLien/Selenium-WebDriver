package Guru99.SeleniumWebDriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {

		// https://www.guru99.com/alert-popup-handling-selenium.html

		System.setProperty("webdriver.gecko.driver", ".\\gecko\\v0.19.0\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.findElement(By.linkText("Click Here")).click();

		String mainWindow = driver.getWindowHandle();
		System.out.println("mainWindow: " + mainWindow);
		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait(driver, 2);
		
		Set<String> childrenWindow = driver.getWindowHandles();
		Iterator<String> iterator = childrenWindow.iterator();
		while (iterator.hasNext()) {
			String childWindow = iterator.next();
			System.out.println("windowChildren: " + childWindow);
			if (!mainWindow.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("emailid")));
				driver.findElement(By.name("emailid")).sendKeys("mailien@gmail.com");
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("btnLogin")));
				driver.findElement(By.name("btnLogin")).click();
				driver.close();
			}
		}
		driver.switchTo().window(mainWindow);
		driver.close();
	}

}
