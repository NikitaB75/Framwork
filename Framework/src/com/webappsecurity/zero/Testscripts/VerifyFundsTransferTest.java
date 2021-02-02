package com.webappsecurity.zero.Testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.webappsecurity.zero.pages.AccountSummmary;
import com.webappsecurity.zero.pages.FundsTransferConfirmation;
import com.webappsecurity.zero.pages.Login;
import com.webappsecurity.zero.pages.TransferFunds;
import com.webappsecurity.zero.pages.TransferFundsVerify;

import utils.GenericMethods;

public class VerifyFundsTransferTest extends Base {
	
	@Test
	public void verifyFundTransfer() throws IOException {
 Login lp = new Login (driver);
 AccountSummmary acc = new AccountSummmary(driver);
 TransferFunds tf = new TransferFunds(driver);
 TransferFundsVerify tfv = new TransferFundsVerify(driver);
 FundsTransferConfirmation tfc = new FundsTransferConfirmation (driver);

 String[][]  data = GenericMethods.getData("C:\\Users\\nikit\\Downloads\\DataFrmWrk.xlsx", "Sheet1");
 
 
 lp.applicationLogin("", "");
 acc.clickFunTransfer();
 tf.doFundTransfer("", "");
 tfv.clickSubmit();
String actualText=  tfc.getConfText();
String expectedText= ""; 
 Assert.assertEquals(actualText,expectedText );
}
}