package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;
import wrappers.ProjectWrappers;

public class PrepaidCard extends ProjectWrappers {
	
	
	public PrepaidCard(AndroidDriver driver, ExtentTest test)
	{
		this.driver = driver;
		this.test = test;
	}

	public PrepaidCard verifyPrepaidCardPagebalance(String PrepaidCardno){
		
		String cardno=regvalue(PrepaidCardno);
		clickByXpathExplict(".//p[text()='"+cardno+"']");
		
		String finalAccountBalance = null;
		
		try {
			readytimes();
		//	readystate();
			jqueryload();
		} catch (Exception e1) {
			reportStep("jquery wait has supporting", "FAIL");
			
			
		}
	
		Boolean a=VerifyElementpresentreturn("(.//p[contains(text(),'"+cardno+"')]//following::span[@class='num'])[1]");

	if(a){

				
				finalAccountBalance=getTextByXpath("(.//p[contains(text(),'"+cardno+"')]//following::span[@class='num'])[1]");
		reportStep("Balanec has displaying "+finalAccountBalance+"", "PASS");
	}
	else{
	booleanResultFail(a, "Balance has not displaying ");

	}
	//try{
			verifyNottextmatches(AccountBalance,finalAccountBalance,"Balance has been deducted in Account Balance","Balance has not been deducted in Account Balance");
	
		
		
	return this;
	}

	
}
