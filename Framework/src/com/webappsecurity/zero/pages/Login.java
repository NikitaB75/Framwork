package com.webappsecurity.zero.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	@FindBy (id = "user_login")
	private WebElement uName;
	
	@FindBy (id = "user_password")
	private WebElement pass;
	
	@FindBy (name= "submit")
	private WebElement signIn;
	
	public Login(WebDriver driver) {//constructor
		PageFactory.initElements(driver, this);//KEYWORD THIS//PASTE THIS LINE IN ON PAGE CLASSES
	}
	

	
	public void applicationLogin(String loginName, String loginPassword){
		uName.sendKeys(loginName);
		pass.sendKeys(loginPassword);
		signIn.click();
	}
	public String getErrorMsg() {
		WebElement errMsgBox = null;
		String errorMessage= errMsgBox.getText();
		return errorMessage;

		
	
}
	
}

