package kdf;



import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import utils.GenericMethods;

public class Application  {

	@Test
	
	public void invalidLoginTest(Object GenericMethod) throws IOException  {

		String[][]data=	GenericMethods.getData("C:\\Users\\nikit\\OneDrive\\Documents\\key.xlsx", "Sheet1");
		 methods mtd =  new methods ();
		for (int i =1;i<data.length;i++) {

			switch (data [i][3]) {
			case "openBrowser":
				mtd.openBrowser();
				break;
			case  "maxBrowser":
				mtd.maxmizeBrowserWindow();
				break;
			case "ImpWait":
				mtd.implementImplicitWait();
				break;
			
			case "navigateToApp":
			mtd.navigateToApp(data[i][6]);
			break;
			
			case "enterInTextBox":
				mtd.enterInEditBox(data[i][5], data[i][6]);
				break;
			
				
			case"verifyErrMsg":
			String actualMsg = mtd.getErrorMess(data[i][5]);
			String expectedMsg = data[i][6];
			Assert.assertEquals(expectedMsg, actualMsg);
			break;
			
			case"closeApplication":
				mtd.closeApplicationWindow();
			
			
		
			}
			
		
			

	}
}
}