package com.webappsecurity.zero.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransferFundsVerify {
	@FindBy(name="btn_submit")  //found the webelement stored in variable
	private WebElement submitBtn;
	
	public TransferFundsVerify(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickSubmit() { //now create method and tell method what to do
	submitBtn.click();	
	}

	

}

