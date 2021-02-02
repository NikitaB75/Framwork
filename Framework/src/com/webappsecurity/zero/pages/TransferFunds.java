package com.webappsecurity.zero.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TransferFunds {

	
		@FindBy(id = "tf_fromAccountId")
		private WebElement fromAcc;
		
		@FindBy(id = "tf_fromAccountId")
		private WebElement toAcc;
		
		@FindBy(id = "tf_amount")
		private WebElement amt;
		
		@FindBy(id = "tf_description")
		private WebElement desc;
		
		@FindBy(id = "btn_submit")
		private WebElement continueBtn;
		
		public TransferFunds (WebDriver driver) {//constructor
			PageFactory.initElements(driver, this);
		}
		
		public void doFundTransfer(String amount, String description) { //these are called parmeters because we sending data to method
																			//method can also return
			Select fromDD =  new Select(fromAcc);
			fromDD.selectByIndex(2);
			
			
			Select toDD = new Select(toAcc);
			fromDD.selectByIndex(3);
			
			amt.sendKeys(amount);
			desc.sendKeys(description);
			continueBtn.click();
			
			
			
		}
		
		

	}




