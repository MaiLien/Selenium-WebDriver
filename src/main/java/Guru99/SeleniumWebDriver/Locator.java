package Guru99.SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", ".\\gecko\\v0.18.0\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.guru99.com/first-webdriver-script.html");
		
		String xpath1 = "//h1[@itemprop='headline']";
		WebElement header = driver.findElement(By.xpath(xpath1));
		System.out.println("Text of header: " + header.getText());
		
		String xpath2 = "//h1[@itemprop='headline']/..";
		WebElement parentOfHeader = driver.findElement(By.xpath(xpath2));
		System.out.println("parentOfHeader:" + parentOfHeader.getTagName());
		
		String cssSelector = "*.page-header";
		WebElement elementFoundByCss = driver.findElement(By.cssSelector(cssSelector));
		System.out.println("elementFoundByCss: " + elementFoundByCss.getTagName() + " and text: " +  elementFoundByCss.getText());
		
		
		driver.close();
		
	}

}
