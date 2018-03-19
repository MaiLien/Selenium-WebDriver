package Guru99.SeleniumWebDriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchTo {
	
	public static void main(String[] args) throws InterruptedException {
		
		//https://www.guru99.com/alert-popup-handling-selenium.html
		
		//Frame
		System.setProperty("webdriver.gecko.driver", ".\\gecko\\v0.19.0\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
        driver.get("http://demo.guru99.com/selenium/deprecated.html");
        driver.switchTo().frame("classFrame");
        driver.findElement(By.linkText("Deprecated")).click();
//        driver.close();
        
        //Alert
//        driver = new FirefoxDriver();
        driver.get("http://demo.guru99.com/test/delete_customer.php");
        driver.findElement(By.name("cusid")).sendKeys("LienHTM1");
        driver.findElement(By.name("res")).click();
        driver.findElement(By.name("cusid")).sendKeys("Chuong.2v");
        driver.findElement(By.name("submit")).click();
        Alert alert = driver.switchTo().alert();
//        String content = "Do you really want to delete this Customer?";
//        Assert.assertEquals(content, alert.getText());
        Thread.sleep(2000);
        alert.accept();
//        alert.dismiss();
        
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        
        Thread.sleep(2000);
        driver.close();
		
	}

}
