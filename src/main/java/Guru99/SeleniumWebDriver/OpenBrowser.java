package Guru99.SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {
	
	public static void main(String[] args) {

		// Link download FF:
		// https://support.mozilla.org/en-US/kb/install-older-version-of-firefox
		// https://ftp.mozilla.org/pub/firefox/releases/

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\PhoPhaoHoa\\eclipse-workspace\\SeleniumWebDriver\\gecko\\v0.18.0\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\PhoPhaoHoa\\eclipse-workspace\\SeleniumWebDriver\\chromedriver\\2.9\\chromedriver.exe");
		// WebDriver driver = new ChromeDriver();

		driver.get("https://www.guru99.com/first-webdriver-script.html");

		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		String xpath = "//*[@itemprop='headline']";
		WebElement header = driver.findElement(By.xpath(xpath));
		String tagName = header.getTagName();
		System.out.println(tagName);
		
		driver.close();
//		driver.quit();
//		System.exit(0);
		
	}

}
