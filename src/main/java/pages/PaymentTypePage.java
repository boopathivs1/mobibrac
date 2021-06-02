package pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import wrappers.ProjectWrappers;

public class PaymentTypePage extends ProjectWrappers {

	
	public PaymentTypePage(AndroidDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	
	}
	
	public PaymentTypePage clickWithinbankLink(){
		
		clickByXpathExplict(prop.getProperty("click.withinBank.link.xpath"));

		
		return this;
	}	
	
	public BillPaymentPage clickMobilebiller() throws InterruptedException{
		clickByXpathExplict(prop.getProperty("click.mobilebiller.xpath"));

		return new BillPaymentPage (driver,test);
	}
	
	public BillPaymentPage ClickUtilitybiller() throws InterruptedException{
		clickByXpathExplict(prop.getProperty("click.utility.xpath"));

		return new BillPaymentPage (driver,test);
	}
	
	public BillPaymentPage clickInternetbiller() throws InterruptedException{
		clickByXpathExplict(prop.getProperty("click.internet.biller.xpath"));

		return new BillPaymentPage (driver,test);
	}	
	
	public BillPaymentPage clickInsurancebiller() throws InterruptedException{
		clickByXpathExplict(prop.getProperty("click.insurancebiller.xpath"));

		return new BillPaymentPage (driver,test);
	}
	
	public BillPaymentPage clicktuitionfees() throws InterruptedException{
		clickByXpathExplict(prop.getProperty("click.tuitionfee.xpath"));

		return new BillPaymentPage (driver,test);
	}
	
	public PaymentTypePage clickNextLink(){
		
		clickByXpathExplict(prop.getProperty("click.next.value.button.xpath"));

		
		return this;
	}		
	
	public PaymentTypePage fillAccountnum(String accnumber) throws InterruptedException{
		String regAccnum=regvalue(accnumber);
		enterByXpathExplict(prop.getProperty("enter.accnumber.xpath"),regAccnum);
	
			return this;
		}
	public PaymentTypePage fillnickname(String nickname) throws InterruptedException{
		enterByXpath(prop.getProperty("enter.nickname.xpath"),nickname);
			return this;
		}
	public PaymentTypePage entermail(String entermail) throws InterruptedException{
			enterByXpathExplict(prop.getProperty("enter.email.withinbank.xpath"),entermail);
			return this;
			}
	
		public PaymentTypePage clickSmsNextButton() throws InterruptedException{
	
		clickByXpathExplict(prop.getProperty("click.within.sms.xpath"));
		clickByXpathExplict(prop.getProperty("click.wallet.next.xpath"));
	
		return this;
		}

		public PaymentTypePage clickconfirm(){


			clickByXpathExplict(prop.getProperty("click.confirmbtn.xpath"));
			
				
				return this;
			}
		
		
		


		public PaymentTypePage singleScroll() throws InterruptedException{
			
			bottomverticalSwipeByPercentages();
			Thread.sleep(1000);
			System.out.println("Scrolled successfully");		  
			return this;
		}
		
		
		public PaymentTypePage EnterOtp() throws InterruptedException{
			
enterValue(prop.getProperty("enter.otp.xpath"),DBOTP_function_transfer());
			
			
				return this;
			}
		public PaymentTypePage submitAddBeneOtpconfirm(){
			
						clickByXpathExplict(prop.getProperty("otp.submit.xpath"));
					
							return this;
						}
		
		public PaymentTypePage clickViewBeneButton(){

		clickByXpathExplict(prop.getProperty("click.addedBene.view.xpath"));
		return this;
	}

		
		public PaymentTypePage submitEditOtp(){
			
			clickByXpathExplict(prop.getProperty("click.Edit.otp.Verify.button.xpath"));
		
				return this;
			}
	
		public PaymentTypePage verifyBeneficiaryAdded(String accnumber){

			String  regaccnum=regvalue(accnumber);
//Boolean a=VerifyElementpresentreturn(prop.getProperty("verify.success.Beneficiarty.message.xpath"));

VerifyElementPresent(".//p[text()="+accnumber+"]","Beneficiary has added sucessfully","Beneficiary has not added successfully");
	
	
	
	
	
	return this;
	}

		
	



public PaymentTypePage clickAddBeneficiaryButton(){


	clickByXpathExplict(prop.getProperty("click.addbene.button.xpath"));
	
		
		return this;
	}
	
public PaymentTypePage clickCardTypeButton(){


	clickByXpathExplict(prop.getProperty("click.Cardtype.Card.xpath"));
	
		
		return this;
	}




public PaymentTypePage clickAddbeneNum(String accno) throws InterruptedException{
clickByXpathExplict(".//p[text()="+accno+"]");

return this;
}

public PaymentTypePage clickAddCardbeneNum(String Cardno) throws InterruptedException{
	clickByXpathExplict(".//p[.='"+Cardno+"']");

return this;
}


public PaymentTypePage editbeneform(String accno,String shortname) throws InterruptedException{
	clickByXpathExplict("//input[@accnum="+accno+"]//following::a[contains(@id,'edit')]");
enterByXpathExplict(prop.getProperty("enter.shortname.bene.xpath"),shortname);
clickByXpathExplict(prop.getProperty("click.within.edit.save.xpath"));
clickByXpathExplict(prop.getProperty("Click.Edit.Confirm.button.xpath"));


return this;
}


public PaymentTypePage Otherbankeditbeneform(String accno ,String shortname) throws InterruptedException{
	singleScroll();
	singleScroll();	
	clickByXpathExplict("//input[@accnum="+accno+"]//following::a[contains(@id,'edit')]");
singleScroll();
singleScroll();
enterByXpathExplict(prop.getProperty("enter.shortname.bene.xpath"),shortname);
clickByXpathExplict(prop.getProperty("click.within.edit.save.xpath"));
singleScroll();
singleScroll();
clickByXpathExplict(prop.getProperty("Click.Edit.Confirm.button.xpath"));


return this;
}


public PaymentTypePage editWalletbeneform(String accno,String UpdatedRemarks) throws InterruptedException{
	clickByXpathExplict("//input[@accnum="+accno+"]//following::a[contains(@id,'dit')]");
enterByXpathExplict(prop.getProperty("Enter.remark.xpath"),UpdatedRemarks);
clickByXpathExplict(prop.getProperty("click.within.edit.save.xpath"));
clickByXpathExplict(prop.getProperty("Click.Edit.Confirm.button.xpath"));


return this;
}

public PaymentTypePage clickOK() throws InterruptedException{

	clickByXpathExplict(prop.getProperty("click.ok.submit.xpath"));


return this;
}

public PaymentTypePage clickback() throws InterruptedException{

	clickByXpathExplict(prop.getProperty("click.Managebene.Back.button.xpath"));


return this;
}

public PaymentTypePage accnunmberverify(String accno) throws InterruptedException{

verifyTextByXpath(".//p[text()="+accno+"]",accno);
return this;



}


public PaymentTypePage Cardnunmberverify(String Cardno) throws InterruptedException{
	
	System.out.println(Cardno+"value");

verifyTextByXpath(".//p[text()='"+Cardno+"']",Cardno);
return this;

}


	public PaymentTypePage deletebeneficiary(String accno) throws InterruptedException{
	//	locateFrame("icanvas");
	//	enterByXpathExplict(prop.getProperty("search.beneficiary.xpath"),beneficiaryName);

//		Boolean a=VerifyElementpresentreturn(".//p[text()='1501200018601002']");
System.out.println(accno);
Thread.sleep(4000);
		Boolean a=driver.getPageSource().contains(accno);
		
		
		if(a){
			singleScroll();
		clickByXpathExplict(".//p[text()="+accno+"]");
		Thread.sleep(4000);
		singleScroll();
	
		clickByXpathExplict("//input[@accnum="+accno+"]//following::a[contains(@id,'elete')]");
		clickByXpathExplict(prop.getProperty("click.delete.confirm.button.xpath"));
		clickByXpathExplict(prop.getProperty("click.viewbene.button.xpath"));
	
	}
	else{
		booleanNoElementPresentResult(a,"Beneficiary has not Present for deletion");
		
	}
	return this;
	}

	
	
	
	public PaymentTypePage deleteCardbeneficiary(String Cardno) throws InterruptedException{
		//	locateFrame("icanvas");
		//	enterByXpathExplict(prop.getProperty("search.beneficiary.xpath"),beneficiaryName);

//			Boolean a=VerifyElementpresentreturn(".//p[text()='1501200018601002']");
		System.out.println(Cardno);
Thread.sleep(4000);
		Boolean a=driver.getPageSource().contains(Cardno);

			
			if(a){
			
			clickByXpathExplict(".//p[.='"+Cardno+"']");
			singleScroll();
			singleScroll();
			clickByXpathExplict("//input[@accnum="+Cardno+"]//following::a[contains(@id,'elete')]");
			clickByXpathExplict(prop.getProperty("click.delete.confirm.button.xpath"));
			clickByXpathExplict(prop.getProperty("click.viewbene.button.xpath"));
		
		}
		else{
			booleanNoElementPresentResult(a,"Beneficiary has not Present for deletion");
			
		}
		return this;
		}
	
	public PaymentTypePage fillCardnum(String Cardnumber) throws InterruptedException{
		String regAccnum=regvalue(Cardnumber);
		enterByXpathExplict(prop.getProperty("enter.accnumber.xpath"),regAccnum);
	//Thread.sleep(6000);

		
			return this;
		}
	
public PaymentTypePage clickOtherbankLink(){
		
		clickByXpathExplict(prop.getProperty("click.OtherBank.link.xpath"));

		
		return this;
	}	
	
	
public PaymentTypePage clickBeneTypeButton(){


	clickByXpathExplict(prop.getProperty("click.bene.type.xpath"));

	
		
		return this;
	}


public PaymentTypePage clickBeneTypeCardButton(){


	clickByXpathExplict(prop.getProperty("click.bene.tye.card.xpath"));

	
		
		return this;
	}
public PaymentTypePage deleteOtherBankbeneficiary(String accno) throws InterruptedException{
	//	locateFrame("icanvas");
	//	enterByXpathExplict(prop.getProperty("search.beneficiary.xpath"),beneficiaryName);

//		Boolean a=VerifyElementpresentreturn(".//p[text()='1501200018601002']");

		Boolean a=driver.getPageSource().contains(accno);

		
		if(a){
		


		clickByXpathExplict(".//p[text()="+accno+"]");
		Thread.sleep(4000);
		clickByXpathExplict(prop.getProperty("click.delete.bene.button.xpath"));
		clickByXpathExplict(prop.getProperty("click.delete.confirm.button.xpath"));
		clickByXpathExplict(prop.getProperty("click.viewbene.button.xpath"));
	
	}
	else{
		booleanNoElementPresentResult(a,"Beneficiary has not Present for deletion");
		
	}
	return this;
	}

public PaymentTypePage clickOtherBankAddBeneficiaryButton() throws InterruptedException{

singleScroll();
singleScroll();
	clickByXpathExplict(prop.getProperty("click.Otherbank.Addbene.button.xpath"));
	
		
		return this;
	}

public PaymentTypePage clickTransferChannelButton(){


	clickByXpathExplict(prop.getProperty("click.otherbank.TransferChannel.xpath"));
	
		
		return this;
	}


public PaymentTypePage clickNPSBTransferChannel(){


	clickByXpathExplict(prop.getProperty("click.otherbank.NPSB.TransferChannel.xpath"));
	
		
		return this;
	}

public PaymentTypePage SelectBeneficiaryBankdropdown(String BankName) throws InterruptedException{

//String str= "EXIM";
	
clickByXpathExplict(prop.getProperty("Click.Beneficiarybank.dropdown.xpath"));
//ContextHandlingNative();
System.out.println(BankName);
enterValue(prop.getProperty("Enter.searchtab.xpath"),BankName);
clickByXpathExplict(prop.getProperty("click.search.button.xpath"));
//Thread.sleep(2000);
clickByXpathExplict(".//label[contains(.,'"+BankName+"')]");



//WebElement ele = driver.findElement(By.xpath("//*[.='"+BankName+"']"));
//WebElement ele =  driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+BankName+"\").instance(0))");
////Thread.sleep(4000);
////Thread.sleep(4000);
////	selectVisibileTextByXPath(prop.getProperty("Click.Beneficiarybank.dropdown.xpath"),BankName);
//	
//	System.out.println(ele.isDisplayed()+"value is displaying");
//	ele.click();
//	
	
		return this;
	}

public PaymentTypePage SelectBeneficiaryBranchdropdown(String Bankbranch) throws InterruptedException{


clickByXpathExplict(prop.getProperty("Click.Beneficiarybranch.dropdown.xpath"));
enterValue(prop.getProperty("Enter.searchtab.xpath"),Bankbranch);
clickByXpathExplict(prop.getProperty("click.search.button.xpath"));
Thread.sleep(2000);
clickByXpathExplict(".//label[contains(.,'"+Bankbranch+"')]");



//WebElement ele =  driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+Bankbranch+"\").instance(0))");
//Thread.sleep(4000);
//Thread.sleep(4000);
//	selectVisibileTextByXPath(prop.getProperty("Click.Beneficiarybank.dropdown.xpath"),BankName);
	
//	System.out.println(ele.isDisplayed()+"value is displaying");
//	ele.click();




//System.out.println(Bankbranch);

//scrolltoElement();

//WebElement ele = driver.findElement(By.xpath("//*[.='"+BankName+"']"));


	
		return this;
	}

public PaymentTypePage EnterAccountnum(String accno) throws InterruptedException{
	String regAccnum=regvalue(accno);
	enterByXpathExplict(prop.getProperty("Enter.Otherbank.Accountnumber.xpath"),regAccnum);
//Thread.sleep(6000);

	
		return this;
	}



public PaymentTypePage EnterAccountName(String accname) throws InterruptedException{

	enterByXpathExplict(prop.getProperty("Enter.Otherbank.Accountname.xpath"),accname);
//Thread.sleep(6000);
		return this;
	}

public PaymentTypePage EnterShortName(String shortname) throws InterruptedException{

	enterByXpathExplict(prop.getProperty("Enter.Otherbank.Shortname.xpath"),shortname);

		return this;
	}

public PaymentTypePage EnterEmail(String entermail) throws InterruptedException{

	enterByXpathExplict(prop.getProperty("Enter.Otherbank.Email.xpath"),entermail);

		return this;
	}

public PaymentTypePage EnterEmailWallet(String entermail) throws InterruptedException{

	enterByXpathExplict(prop.getProperty("Enter.Wallet.Email.xpath"),entermail);

		return this;
	}

public PaymentTypePage clickMobileWalletLink(){
	
	clickByXpathExplict(prop.getProperty("click.MobileWallet.link.xpath"));

	
	return this;
}	

public PaymentTypePage EnterMobileno(String Mobno) throws InterruptedException{
	String regMobno=regvalue(Mobno);
	
	enterByXpathExplict(prop.getProperty("Enter.mobnumber.xpath"),regMobno);

		return this;
	}

public PaymentTypePage clickWalletsubModule(String Walletname) throws InterruptedException{
	
	
	clickByXpathExplict(".//span[text()='"+Walletname+"']");
				
	return this;
}

public PaymentTypePage EnterRemark(String remark) throws InterruptedException{

	enterByXpathExplict(prop.getProperty("Enter.remark.xpath"),remark);

		return this;
	}


}
