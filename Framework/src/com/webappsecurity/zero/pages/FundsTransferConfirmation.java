package com.webappsecurity.zero.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class  FundsTransferConfirmation {

	 @FindBy( css = "#transfer_funds_content > div > div > div.alert.alert-success")
	   private WebElement fundTransConfMsgBox;
	   
	   public FundsTransferConfirmation (WebDriver driver) {
		   PageFactory.initElements(driver, this);
	   }
	   
	   public String getConfText() {
		   String confText = fundTransConfMsgBox.getText();
		   return confText;
	   }
	   
	   									//page classes we only giving details of webelement and what action to take on webelement
	}									//	testscripts is where we validation compare actual and expected 


