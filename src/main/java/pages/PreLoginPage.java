package pages;

import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;
import wrappers.ProjectWrappers;

public class PreLoginPage extends ProjectWrappers {
	
	PreLoginPage(AndroidDriver driver ,ExtentTest test)
	{
		this.driver = driver;
		this.test =test;
	}
	
	public PreLoginPage ClickCardtype(String cardtype) throws InterruptedException{

		clickByXpathExplict(".//span[contains(.,'"+cardtype+"')]");


	return this;
	}

	public PreLoginPage Entercardno(String cardno) throws InterruptedException{

		String cardnumber =regvalue(cardno);
		
		enterByXpathExplict(prop.getProperty("enter.card.xpath"),cardnumber);


	return this;
	}
	
	public PreLoginPage EnterPinno(String Pinno) throws InterruptedException{

		String Pinnumber =regvalue(Pinno);
		
		enterValue(prop.getProperty("enter.pin.xpath"),Pinnumber);


	return this;
	}
	
	public PreLoginPage clickAuthSmsbutton(){
		
		clickByXpathExplict(prop.getProperty("click.sms.xpath"));
		
		return this;
	}
	
public PreLoginPage clickValidatebutton(){
		
		clickByXpathExplict(prop.getProperty("click.validate.xpath"));
		
		return this;
	}

public PreLoginPage EnterOtp() throws InterruptedException{
	
enterValue(prop.getProperty("enter.prelogin.otp.xpath"),DBOTP_function_transfer());
		
		
			return this;
		}
public PreLoginPage submitAddBeneOtpconfirm(){
	
	clickByXpathExplict(prop.getProperty("otp.submit.xpath"));

		return this;
	}

public PreLoginPage VerifyUser(String Username){
	
	verifyTextByXpath(prop.getProperty("verify.user.xpath"),Username);
	return this;

	
	}

}
