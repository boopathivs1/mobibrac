package pages;

import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;
import wrappers.ProjectWrappers;

public class SeviceRequestPage extends ProjectWrappers {
	
	
	public SeviceRequestPage(AndroidDriver driver,ExtentTest test)
	{
		this.driver =driver;
		this.test =test;
	}
	
	public SeviceRequestPage clickCardManagement(){

		
		clickByXpathExplict(prop.getProperty("click.CardManage.xpath"));

		
	return this;
		
		}	
	
public SeviceRequestPage clickCardManageNextbtn(){

		
		clickByXpathExplict(prop.getProperty("click.Cardmanage.nextbtn.xpath"));

		
	return this;
		
		}	

public SeviceRequestPage SelectReason(String Reason) throws InterruptedException{

	selectVisibileTextByXPath(prop.getProperty("select.reason.xpath"),Reason);


return this;
}

public SeviceRequestPage ClickCardtype(String cardtype) throws InterruptedException{

	clickByXpathExplict(".//span[text()='"+cardtype+"']");


return this;
}

public SeviceRequestPage SelectCard(String card) throws InterruptedException{
	

	selectVisibileTextByXPath(prop.getProperty("select.cardlist.xpath"),card);


return this;
}

public SeviceRequestPage EnterCardNo(String PinNo) throws InterruptedException{
	String Pinnumber=regvalue(PinNo);

	enterByXpathExplict(prop.getProperty("enter.cardnumber.xpath"), Pinnumber);



return this;
}

public SeviceRequestPage EnterCVV(String CVV){
	String CVVnumber=regvalue(CVV);
	System.out.println(CVVnumber);
	
	enterValue(prop.getProperty("enter.otp.xpath"),CVVnumber);

					return this;
				}
//public SeviceRequestPage EnterCVV(String CVV) throws InterruptedException{
//
//	String Cvvnumber=regvalue(CVV);
//	enterByXpathExplict(prop.getProperty("enter.cvv.xpath"), Cvvnumber);
//
//
//
//return this;
//}

public SeviceRequestPage singleScroll() throws InterruptedException{
	//scrolldown();
	//scrolldown();
	//Thread.sleep(3000);
	bottomverticalSwipeByPercentages();
	Thread.sleep(1000);
	System.out.println("Scrolled successfully");		  
	return this;
}

public SeviceRequestPage SelectFromacc(String Fromacc) throws InterruptedException{
	
	String AccountNumber = regvalue(Fromacc);

	selectVisibileTextByXPath(prop.getProperty("select.fromacc.xpath"),AccountNumber);


return this;
}

public SeviceRequestPage EnterPinNo(String newpin, String Confirmpin) throws InterruptedException{

	String newpinnumber=regvalue(newpin);
	String Confirmpinnumber=regvalue(Confirmpin);
	
	enterByXpathExplict(prop.getProperty("enter.newpin.xpath"), newpinnumber);
	enterByXpathExplict(prop.getProperty("enter.confirmpin.xpath"), newpinnumber);



return this;
}


public SeviceRequestPage SelectExpiryDate(String Year,String month) throws InterruptedException{
	
	String Expiryyear = regvalue(Year);
	String ExpiryMonth = regvalue(month);

	selectVisibileTextByXPath(prop.getProperty("select.expyear.xpath"),Expiryyear);
	selectVisibileTextByXPath(prop.getProperty("select.expmonth.xpath"),Expiryyear);


return this;
}

}
