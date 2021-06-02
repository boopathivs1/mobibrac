package pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.Duration;

import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;
import wrappers.ProjectWrappers;

public class BillPaymentPage extends ProjectWrappers{
	
	public BillPaymentPage (AndroidDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	
}
	
	public BillPaymentPage clickMobilebiller() throws InterruptedException{
		clickByXpathExplict(prop.getProperty("click.mobilebiller.xpath"));

		return this;
	}
		
	public BillPaymentPage clickbillerNextbutton() throws InterruptedException{
		
		clickByXpathExplict(prop.getProperty("click.biller.next.button.xpath"));

		return this;
	}
	

	public BillPaymentPage clickbillersubModule(String Billername) throws InterruptedException{
		
		
	clickByXpathExplict(".//span[text()='"+Billername+"']");
		

			return this;
		}	
	
	public BillPaymentPage clickToBiller() throws InterruptedException{
		clickByXpathExplict(prop.getProperty("click.ToBiller.xpath"));

		return this;
	}
	
	
	public BillPaymentPage ClickMobno(String Mobno) {

	clickByXpathExplict(".//*[text()="+Mobno+"]");
				return this;
				}
	
	
	public BillPaymentPage ClickBillerno(String Billerno) {
		String billernumber = regvalue(Billerno);

		clickByXpathExplict(".//*[text()="+billernumber+"]");
					return this;
					}
	public BillPaymentPage deletebeneficiary(String Mobno) throws InterruptedException{

	System.out.println(Mobno);
	Thread.sleep(4000);
			Boolean a=driver.getPageSource().contains(Mobno);
			
			
			if(a){
			
			clickByXpathExplict(".//*[text()="+Mobno+"]");
			Thread.sleep(4000);
			clickByXpathExplict("//input[@billnum="+Mobno+"]//following::a[contains(@id,'Delete')]");
			clickByXpathExplict(prop.getProperty("click.delete.confirm.button.xpath"));
			clickByXpathExplict(prop.getProperty("click.viewbene.button.xpath"));
		
		}
		else{
			booleanNoElementPresentResult(a,"Beneficiary has not Present for deletion");
			
		}
		return this;
		}
	
	public BillPaymentPage clickAddBiller() throws InterruptedException{
		clickByXpathExplict(prop.getProperty("click.Addbiller.xpath"));

		return this;
	}
	
	public BillPaymentPage SelectbillerbenContype(String contype) throws InterruptedException{
		
		selectVisibileTextByXPath((prop.getProperty("selct.billerbene.contye.xpath")),contype);

		return this;
	}

public BillPaymentPage SelectbillerService(String service) throws InterruptedException{
		
		selectVisibileTextByXPath((prop.getProperty("selct.billerbene.service.xpath")),service);

		return this;
	}

	
public BillPaymentPage EnterMobNo(String Mobno) throws InterruptedException{
	
	enterByXpathExplict((prop.getProperty("enter.billerbene.mobno.xpath")), Mobno);
		
		return this;
	}

public BillPaymentPage EnterbillNo(String Billno) throws InterruptedException{
	
	enterByXpathExplict((prop.getProperty("enter.billno.xpath")),Billno);
		
		return this;
	}

public BillPaymentPage EnterCustomername(String Customername) throws InterruptedException{
	
	enterByXpathExplict((prop.getProperty("enter.customername.xpath")), Customername);
		
		return this;
	}

public BillPaymentPage Entershortname(String shortname) throws InterruptedException{
	
	enterByXpathExplict((prop.getProperty("enter.billerbene.shortname.xpath")), shortname);
		
		return this;
	}


public BillPaymentPage ClickConnectionType() throws InterruptedException{
	
	clickByXpathExplict(prop.getProperty("click.postpaid.connectiontype.xpath"));
		
		return this;
	}
public BillPaymentPage ClickAutheticationMail() throws InterruptedException{
	
	clickByXpathExplict(prop.getProperty("click.billerbene.mail.xpath"));
		
		return this;
	}
	
	public BillPaymentPage selectBiller(String Mobno) throws InterruptedException{	
		
		
		

		clickByXpathExplict(prop.getProperty("click.addbillbuton.xpath"));
		clickByXpathExplict(prop.getProperty("click.transhistorybackbutton.xpath"));
		
		
		String Mobnumber=regvalue(Mobno);
		clickByXpathExplict(".//span[text()='"+Mobnumber+"']");
			
		


		
		
	//	Thread.sleep(6000);			
		
	//	tapByElement(".//span[text()='"+Mobnumber+"']");
	
		
		return this;
	}	
	
public BillPaymentPage selectBillerNextbtn(String Mobno) throws InterruptedException{	
		
		String Mobnumber=regvalue(Mobno);
		clickByXpathExplict(".//input[@billnum='"+Mobnumber+"']//following::*[contains(@id,'extBtn')]");
	
		
		return this;
	}	
	
	public BillPaymentPage clickbackBiller(){	
			
	clickByXpathExplict(prop.getProperty("click.transhistorybackbutton.xpath"));
	return this;
	}	
	
	
	
	
	
	public BillPaymentPage clickInsurancebiller() throws InterruptedException{
		clickByXpathExplict(prop.getProperty("click.insurancebiller.xpath"));

		return this;
	}

	

	public BillPaymentPage clicktuitionfees() throws InterruptedException{
		clickByXpathExplict(prop.getProperty("click.tuitionfee.xpath"));

		return this;
	}
	
	
	public BillPaymentPage clickInternetbiller() throws InterruptedException{
		clickByXpathExplict(prop.getProperty("click.internet.biller.xpath"));

		return this;
	}	
	
	
	
	public BillPaymentPage clickMetlifebiller() throws InterruptedException{
		clickByXpathExplict(prop.getProperty("click.metlife.xpath"));

		return this;
	}
	
	public BillPaymentPage getamt() throws InterruptedException{
	//	Thread.sleep(3000);
		BillDueAmount=getTextByXpath(prop.getProperty("insurance.getamt.xpath"));
		return this;

	}		
	public BillPaymentPage getAccountBalance(){


Boolean a=VerifyElementpresentreturn(prop.getProperty("get.currentacc.balance.xpath"));
if(a){
	
	AccountBalance=getTextByXpath(prop.getProperty("get.currentacc.balance.xpath"));
	System.out.println(AccountBalance);

	reportStep("Balanec has displaying "+AccountBalance+"", "PASS");
}
else{
booleanResultFail(a, "Balanec has not displaying "+AccountBalance+"");

}
return this;
	}
	
	public BillPaymentPage SelectContact(String billername) throws InterruptedException{
		
		clickByXpathExplict(prop.getProperty("click.phonebook.xpath"));
		enterByXpathExplict((prop.getProperty("enter.phonebook.search.xpath")), billername);
		clickByXpathExplict(prop.getProperty("click.phonebook.search.xpath"));
		clickByXpathExplict("//p[.='"+billername+"']");
					
						return this;
					}
	
	
	
	
	public BillPaymentPage EnterOtp() throws InterruptedException{
		
enterValue(prop.getProperty("enter.otp.xpath"),DBOTP_function_transfer());
			
			
				return this;
			}
	public BillPaymentPage submitAddBeneOtpconfirm(){
		
		clickByXpathExplict(prop.getProperty("otp.submit.xpath"));
	
			return this;
		}
	
	public BillPaymentPage clickViewBeneButton(){

	clickByXpathExplict(prop.getProperty("click.Viewbillerbene.xapth"));
	return this;
}
	
	public BillPaymentPage clickViewSuccessBeneButton(){

		clickByXpathExplict(prop.getProperty("click.ViewSuccessbene.xapth"));
		return this;
	}
		
	
	public BillPaymentPage clickback() throws InterruptedException{

		clickByXpathExplict(prop.getProperty("click.Managebene.Back.button.xpath"));


	return this;
	}

public BillPaymentPage Mobnunmberverify(String Mobno) throws InterruptedException{

verifyTextByXpath(".//*[text()="+Mobno+"]",Mobno);
return this;



}
	
public BillPaymentPage Billnumberverify(String Billno) throws InterruptedException{
	
	System.out.println(Billno);

verifyTextByXpath(".//*[text()="+Billno+"]",Billno);
return this;



}
	
	public BillPaymentPage editBillerbeneform(String Mobno,String Updatedshortname) throws InterruptedException{
		clickByXpathExplict("//input[@billnum="+Mobno+"]//following::a[contains(@id,'Edit')]");
		enterByXpathExplict(prop.getProperty("enter.editbiller.shortname.xpath"),Updatedshortname);
		clickByXpathExplict(prop.getProperty("click.within.edit.save.xpath"));
		clickByXpathExplict(prop.getProperty("Click.Edit.Confirm.button.xpath"));


		return this;
		}

	
	
	
public BillPaymentPage clickAgreecheckboxbutton(){

		
		clickByXpathExplict(prop.getProperty("click.agree.checkbox"));
		//clickByXpathExplict(prop.getProperty("click.agreebutton.xpath"));

	return this;	
		
		}
public BillPaymentPage clickAgreebutton(){

	
	clickByXpathExplict(prop.getProperty("click.agree.checkbox"));
	
return this;	
	
	}
	
public BillPaymentPage clickSMSbutton(){

	
	clickByXpathExplict(prop.getProperty("click.sms.button.xpath"));
	

return this;	
	
	}
public BillPaymentPage clickBillamount(){

	
	clickByXpathExplict(prop.getProperty("click.billamount.xpath"));
	

return this;	
	
	}

	
public BillPaymentPage verifyTransactionLimitWarning(String message){

	verifyTextContainsByXpath(prop.getProperty("verify.transactionamount.warning"), message);
		
	return this;	
		
		}	


public BillPaymentPage fillbillerForm(String fieldname,String value) throws InterruptedException{
		
		switch(fieldname){  
	    //Case statements  
	    case  "fromAccount":
	    	Thread.sleep(1000);
	    	String fromAcc=regvalue(value);
	    	
	    	selectVisibileTextByXPath(prop.getProperty("select.fromaccdrop.biller.xpath"),fromAcc);
	break;
	  
	    case  "OTPfromAccount":
	    	String otpfromAcc=regvalue(value);
	    	
	    	selectVisibileTextByXPath(prop.getProperty("select.onetime.fromacc.xpath"),otpfromAcc);
	break;
	 

	    case  "EnterMobNo":
	    	enterByXpathExplict(prop.getProperty("Enter.mobNo.xpath"),value);


	break;
	
	    case  "EnterRemarks":
	    	enterByXpathExplict(prop.getProperty("Enter.remark.xpath"),value);


	break;
	    case  "ConnectionType":
	    	String conType=regvalue(value);
	    	selectVisibileTextByXPath(prop.getProperty("select.contype.xpath"),conType);
	break;

	    case  "Nextbutton":
	    	clickByXpathExplict(prop.getProperty("click.next.button"));
	
	break;
	  
	 
	    case  "enteramount":
	    	String amount=regvalue(value);
	    	
	    	enterByXpathExplict(prop.getProperty("enter.biller.amount.xpath"),amount);
	break;
	    case  "Purpose":
	    	selectVisibileTextByXPath(prop.getProperty("select.purpose.xpath"),value);
	break;
	    case  "enterPolicyno":
	    	String Policyno=regvalue(value);
	    	
	    	enterByXpathExplict(prop.getProperty("Enter.policynumber.xpath"),Policyno);
	break;

	    case  "clickPolicyno":
	    
	    clickByXpathExplict(prop.getProperty("Enter.policynumber.xpath"));	
	break;	    
	    case  "confirmbutton":
	  clickByXpathExplict(prop.getProperty("biller.confirmbutton.xpath"));
	break;
    
    case  "onetimFinalconfirmbutton":
  clickByXpathExplict(prop.getProperty("click.onetimepay.final.confirm.xpath"));
break;
	
	
	//insurance.getamt.xpath
	
	    case  "frombillonePay":
	    	String fromacconeBill=regvalue(value);
	    	selectVisibileTextByXPath(prop.getProperty("select.frombill.onetimepay.xpath"),fromacconeBill);
	break;
	    case  "Onetimenext":
	  clickByXpathExplict(prop.getProperty("click.onetime.nxt.xpath"));
	break;
	
	    case  "BracSubcat":
	    	selectVisibileTextByXPath(prop.getProperty("brac.subcat.xpath"),value);
	break;
	    case  "BracBiller":
	    	selectVisibileTextByXPath(prop.getProperty("brac.billername.xpath"),value);
	break;
	
	    case  "EnterUtilityNo":
	    	enterByXpathExplict(prop.getProperty("Enter.utilitynumber.xpath"),value);


	break;
	
	    //Default case statement  
	    default:System.out.println("method has not matched");  
	    }  
		
		
				return this;
	}
	  

public DashboardPage clickmenu(){

	clickByXpathExplict(prop.getProperty("click.home.menu.xpath"));		
clickByXpathExplict(prop.getProperty("click.togglemenu.dashboard.xpath"));

return new DashboardPage(driver, test);	

}
	
	public BillPaymentPage clickOnetimeBiller() throws InterruptedException{
		clickByXpathExplict(prop.getProperty("click.Onetimebiller.xpath"));

		return this;
	}
	
	public BillPaymentPage doubleScroll() throws InterruptedException{
		bottomverticalSwipeByPercentages();
		bottomverticalSwipeByPercentages();
		System.out.println("Scrolled successfully");		  
		return this;
	}
	
public BillPaymentPage singleScroll() throws InterruptedException{
		//scrolldown();
		//scrolldown();
		//Thread.sleep(3000);
		bottomverticalSwipeByPercentages();
		Thread.sleep(1000);
		System.out.println("Scrolled successfully");		  
		return this;
	}

public BillPaymentPage ClickUtilitybiller() throws InterruptedException{
	clickByXpathExplict(prop.getProperty("click.utility.xpath"));

	return this;
}

public BillPaymentPage clickUtilityBillamount() throws InterruptedException{
	clickByXpathExplict(prop.getProperty("click.uti;ity.billamout"));

	return this;
}
}

