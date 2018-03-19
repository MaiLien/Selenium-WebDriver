package Guru99.SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClickMethod {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", ".\\gecko\\v0.18.0\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://tinhluong.vansu.vn/");
		
		WebElement textElement1 = driver.findElement(By.name("ThuNhap_USD"));
		textElement1.click();
		Thread.sleep(3000);
		
		WebElement textElement2 = driver.findElement(By.name("NguoiPhuThuoc"));
		textElement2.click();
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
