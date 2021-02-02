package com.webappsecurity.zero.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSummmary {
	@FindBy(linkText ="Transfer Funds")
	private WebElement transferFunds;

public AccountSummmary (WebDriver driver) {
PageFactory.initElements(driver, this);
}



public void clickFunTransfer() {
	transferFunds.click();
}
public boolean transferFundsPresent() {
boolean transferLinkPresent = transferFunds.isDisplayed();
return transferLinkPresent;
		
}
}