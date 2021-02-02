package com.webappsecurity.zero.Testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class Base {
WebDriver driver;
@BeforeClass

public void openApplication() {
	System.setProperty("webdriver, chrome.driver","chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}
	



@AfterTest
public void closeApplication() {
driver.manage().deleteAllCookies();
driver.close();
}
}
