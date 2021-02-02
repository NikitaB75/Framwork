package kdf;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class methods {
	WebDriver driver;
	
	public void openBrowser() {
		driver = new ChromeDriver ();
		
		
	}
	public void maxmizeBrowserWindow() {
	driver.manage().window().maximize();
}

public void implementImplicitWait() {
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}

public void navigateToApp(String url) {
	driver.get(url);
}
public void enterInEditBox(String locValue, String value) {
	driver.findElement(By.id(locValue)).sendKeys(value);
}
	public void clickAButton(String locValue) {
	driver.findElement(By.name(locValue)).click();	
	}
	public String getErrorMess(String locValue) {
		String actualText = driver.findElement(By.cssSelector(locValue)).getText();
		return actualText;
		
	}
	public void closeApplicationWindow() {
		driver.close();
	}
}
