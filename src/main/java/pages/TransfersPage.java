package pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;
import wrappers.ProjectWrappers;

public class TransfersPage  extends ProjectWrappers {

	
	public TransfersPage (AndroidDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	
	}

	
	
	
	

	
	public TransfersPage clickownAccMenu(){
		
	clickByXpathExplict(prop.getProperty("click.ownacc.menu.xpath"));
	
	return this;
}	
	
	
	
	public TransfersPage clickotherAccMenu(){
		
		clickByXpathExplict(prop.getProperty("click.brac.otherbank.menu.xpath"));
		
		return this;
	}	
	
	
	
	public TransfersPage clickTransNextbutton(){
		
	clickByXpathExplict(prop.getProperty("click.trans.next.button.xpath"));
	
	return this;
}	
	
	
	public TransfersPage clickonetimepayOther() throws InterruptedException{
		
		clickByXpathExplict(prop.getProperty("click.onetimepay.other.tab.xpath"));
		Thread.sleep(3000);
		return this;
	}	
	
	
	
	public TransfersPage selectBeneficiary(String accno){
		String accnumber=regvalue(accno);
		clickByXpathExplict(".//p[text()="+accnumber+"]");
					
		return this;
	}	
	
	
	public TransfersPage selectBeneNextbutton(String accno){
		String accnumber=regvalue(accno);
		clickByXpathExplict(".//p[text()="+accnumber+"]//following::*[contains(@id,'extBtn')]");
	
	return this;
}
	
	public TransfersPage otherBeneNextbutton(String accno) throws InterruptedException{
		
	
	singleScroll();
	String accnumber=regvalue(accno);
	clickByXpathExplict(".//p[text()="+accnumber+"]//following::*[contains(@id,'extBtn')]");
	
	return this;
}	
	
public TransfersPage clickTransferChannel(){
		
		clickByXpathExplict(prop.getProperty("click.Transferchannel.other.xpath"));
		
		return this;
	}	
	
	
			public TransfersPage clickNPSB(){
		
		clickByXpathExplict(prop.getProperty("click.npsb.other.xpath"));
		
		return this;
	}	
	
	public TransfersPage clickBEFTN(){
		
	clickByXpathExplict(prop.getProperty("click.beftn.other.xpath"));
	
	return this;
}	
	
	
	public TransfersPage clickRTGS(){
		
		clickByXpathExplict(prop.getProperty("click.RTGS.other.xpath"));
		
		return this;
	}	
	
	public TransfersPage SelectBeneficiaryBankdropdown(String BankName) throws InterruptedException{

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
////			selectVisibileTextByXPath(prop.getProperty("Click.Beneficiarybank.dropdown.xpath"),BankName);
		//	
//			System.out.println(ele.isDisplayed()+"value is displaying");
//			ele.click();
		//	
			
				return this;
			}

		public TransfersPage SelectBeneficiaryBranchdropdown(String Bankbranch) throws InterruptedException{


		clickByXpathExplict(prop.getProperty("Click.Beneficiarybranch.dropdown.xpath"));
		enterValue(prop.getProperty("Enter.searchtab.xpath"),Bankbranch);
		clickByXpathExplict(prop.getProperty("click.search.button.xpath"));
		Thread.sleep(2000);
		clickByXpathExplict(".//label[contains(.,'"+Bankbranch+"')]");



		//WebElement ele =  driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+Bankbranch+"\").instance(0))");
		//Thread.sleep(4000);
		//Thread.sleep(4000);
//			selectVisibileTextByXPath(prop.getProperty("Click.Beneficiarybank.dropdown.xpath"),BankName);
			
//			System.out.println(ele.isDisplayed()+"value is displaying");
//			ele.click();




		//System.out.println(Bankbranch);

		//scrolltoElement();

		//WebElement ele = driver.findElement(By.xpath("//*[.='"+BankName+"']"));


			
				return this;
			}

		public TransfersPage EnterAccountnum(String accno) throws InterruptedException{
			String regAccnum=regvalue(accno);
			enterByXpathExplict(prop.getProperty("Enter.Otherbank.Accountnumber.xpath"),regAccnum);
		//Thread.sleep(6000);

			
				return this;
			}

	
	
	
	public TransfersPage fillTransferForm(String fieldname,String value){
			
	switch(fieldname){  
    //Case statements  
    case  "fromAcc":
    	String fromaccount=regvalue(value);
    	
    	
    	selectVisibileTextByXPath(prop.getProperty("click.fromaccdrop.trans.xpath"),fromaccount);
break;
    case  "OwncardFromAcc":
    	String fromacc=regvalue(value);
    	
    	selectVisibileTextByXPath(prop.getProperty("click.fromaccdrop.Owncard.xpath"),fromacc);
break;


    case  "OtherbankCardLabel":
clickByXpathExplict(prop.getProperty("click.onetime.pay.card.xpath"));


break;
    case  "OtherfromAcc":
    	String otherfromacc=regvalue(value);
    	
    	
    	selectVisibileTextByXPath(prop.getProperty("other.from.acc.npsb.xpath"),otherfromacc);
break;



    case  "OtherfromAccOnepay":
    	String otherfromacconepay=regvalue(value);
    	
    	
    	selectVisibileTextByXPath(prop.getProperty("select.otherbank.onepay.fromacc.xpath"),otherfromacconepay);
break;
    case  "Otherbanknameonepay":
    	
    	
    	selectVisibileTextByXPath(prop.getProperty("select.onetime.otherbank.xpath"),value);
break;

case  "Otherbranchonepay":
    	
    	
    	selectVisibileTextByXPath(prop.getProperty("other.branch.name.xpath"),value);
break;

case  "BankFromAcc":
	String Bankfromacc=regvalue(value);
	
	selectVisibileTextByXPath(prop.getProperty("select.withinbank.onetimepay.xpath"),Bankfromacc);
break;

case  "WithinBankFromAcc":
	String withinBankfromacc=regvalue(value);
	
	selectVisibileTextByXPath(prop.getProperty("click.fromaccdrop.WithinBank.xpath"),withinBankfromacc);
break;

  case  "Paymentype":
        
        	selectVisibileTextByXPath(prop.getProperty("click.Paymenttype.Owncard.xpath"),value);
    break;

    case  "enteramount":
    	String amount=regvalue(value);
    	
    	enterByXpathExplict(prop.getProperty("enter.ownacc.payamt.xpath"),amount);
break;
    case  "othertoaccOnepay":
    	String toaccOnepay=regvalue(value);
    	
    	enterByXpathExplict(prop.getProperty("other.onepay.toacc.xpath"),toaccOnepay);
break;
    case  "othertoaccName":
    	
    	enterByXpathExplict(prop.getProperty("other.onepay.acc.name.xpath"),value);
break;

    case  "enteraccountno":
    	String accno=regvalue(value);
    	
    	enterByXpathExplict(prop.getProperty("Enter.paytoAccount"),accno);
break;

    case "Remarks":
    	
    	enterByXpathExplict(prop.getProperty("Enter.Remarks.trans.xpath"),value);
break;

    case  "OTPpurpose":
        //	String amount=regvalue(value);
        	selectVisibileTextByXPath(prop.getProperty("select.onetimepay.TransferReason.xpath"),value);
//        	enterByXpathExplict(prop.getProperty("enter.ownacc.payamt.xpath"),value);
    break;

    case  "purpose":
    //	String amount=regvalue(value);
    	selectVisibileTextByXPath(prop.getProperty("ownacc.purpose.trans.xpath"),value);
//    	enterByXpathExplict(prop.getProperty("enter.ownacc.payamt.xpath"),value);
break;
    case  "confirmbutton":
  clickByXpathExplict(prop.getProperty("ownacc.confirmbutton.xpath"));
break;



//click.fromaccdrop.trans.xpath=.//select[@id='OwnAcc_FromAccNum']
//1508101009971001
//enter.ownacc.payamt.xpath=.//input[@id='paymentAmount']
//ownacc.purpose.trans.xpath=.//select[@id='purposetransfer']
//Monthly Swap
//
//ownacc.confirmbutton.xpath=.//button[contains(@id,'confirm')]
//ownacc.transfer.button.xpath=.//button[@id='OwnAcc_TransferBtn']






    //Default case statement  
    default:System.out.println("method has not matched");  
    }  
	
	
	
	
			return this;
}
    
	

	public TransfersPage singleScroll() throws InterruptedException{
		
		bottomverticalSwipeByPercentages();
		Thread.sleep(3000);
		System.out.println("Scrolled successfully");		  
		return this;
	}
	
	
	public WalletPaymentPage single_Scroll() throws InterruptedException{
		
		bottomverticalSwipeByPercentages();
		Thread.sleep(3000);
		System.out.println("Scrolled successfully");		  
		return new WalletPaymentPage(driver, test);
	}	
	
	
	
	
	public TransfersPage doubleScroll() throws InterruptedException{
		bottomverticalSwipeByPercentages();
		System.out.println("next scroll");
		Thread.sleep(1000);
		bottomverticalSwipeByPercentages();
		System.out.println("Scrolled successfully");		  
		return this;
	}
	
	public TransfersPage getAccountBalance(){


Boolean a=VerifyElementpresentreturn(prop.getProperty("get.currentacc.balance.xpath"));
if(a){
	
	AccountBalance=getTextByXpath(prop.getProperty("get.currentacc.balance.xpath"));
	System.out.println(AccountBalance);

	reportStep("Balanec has displaying "+AccountBalance+"", "PASS");
}
else{
booleanResultFail(a, "Balanec has not displaying ");

}
return this;
	}
	
//	public TransfersPage OtherBankgetAccountBalance(){
//
//
//Boolean a=VerifyElementpresentreturn(prop.getProperty("get.OtherBankcurrentacc.balance.xpath"));
//if(a){
//	
//	AccountBalance=getTextByXpath(prop.getProperty("get.OtherBankcurrentacc.balance.xpath"));
//	System.out.println(AccountBalance);
//
//	reportStep("Balanec has displaying "+AccountBalance+"", "PASS");
//}
//else{
//booleanResultFail(a, "Balanec has not displaying "+AccountBalance+"");
//
//}
//return this;
//	}
	public TransfersPage clickSendMoneybutton(){

		
	clickByXpathExplict(prop.getProperty("click.Within.sendmoney.button"));

return this;	
	
	}
	
	public TransfersPage clickAgreecheckboxbutton(){

		
		clickByXpathExplict(prop.getProperty("click.agree.checkbox"));
		//clickByXpathExplict(prop.getProperty("click.agreebutton.xpath"));

	return this;	
		
		}
	
public TransfersPage verifyTransactionLimitWarning(String message){

	verifyTextContainsByXpath(prop.getProperty("verify.transactionamount.warning"), message);
		
	return this;	
		
		}
	
	
	public TransfersPage clickVerifyTransferbutton(){
	
		clickByXpathExplict(prop.getProperty("click.Withinbank.transfer.button"));

	return this;	
		
		}
	
	
	
	public TransfersPage clickTransferbutton(){

	clickByXpathExplict(prop.getProperty("ownacc.transfer.button.xpath"));

return this;	
	
	}
	
	
	 public TransfersPage  getOtp()
	  {
		 
	  try{  
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			
			System.out.println("------------------------------------");
			Connection con =  DriverManager.getConnection(DB_URL,USER,PASS);
			Statement stmt=con.createStatement();  
			
//			ResultSet rs=stmt.executeQuery("select * from user_otp_maintenance where status_id='PENDING' order by generated_datetime desc");  

ResultSet rs=stmt.executeQuery("select otp_number from user_otp_maintenance where cif_number='01862752'and status_id='PENDING' order by id desc");

			
			//ResultSet rs=stmt.executeQuery("select * from user_otp_maintenance where cif_number='00117434'and status_id='PENDING' and ROWNUM <= 1 order by id desc");  
			
			System.out.println(rs +"value");
			System.out.println("------Result fetched---------");
			for (int i =0 ; i<1; i++)
			while(rs.next())  {
				
				String DBotp =rs.getString("otp_number");
				System.out.println(DBotp+"finalvalue");
				
				if(i == 1)
				{
					
					break;
				}
			}
			
			stmt.close();
			con.close(); 
		}
	  
	catch(Exception e){
		System.out.println(e);
	}
	return this;  
	
	 
	}  


	 public TransfersPage EnterOtp() throws InterruptedException{
			
		 enterValue(prop.getProperty("enter.otp.xpath"),DBOTP_function_transfer());
		 			
		 			
		 				return this;
		 			}
		public TransfersPage submitAddBeneOtpconfirm(){
			
						clickByXpathExplict(prop.getProperty("otp.submit.xpath"));
					
							return this;
						}
		
	
	public DashboardPage clickmenu(){

		clickByXpathExplict(prop.getProperty("click.home.menu.xpath"));		
	clickByXpathExplict(prop.getProperty("click.togglemenu.dashboard.xpath"));

return new DashboardPage(driver, test);	
	
	}
	public TransfersPage clickownCardMenu(){
		
		clickByXpathExplict(prop.getProperty("click.ownCard.menu.xpath"));
		
		return this;
	}	
	
	public TransfersPage selectBeneficiaryCard(String cardno){
		String Cardnumber=regvalue(cardno);
		clickByXpathExplict(".//p[text()='"+Cardnumber+"']");
					
		return this;
	}	
	public TransfersPage ClickOwncardNextbutton(String cardno){
		
		String cardnumber=regvalue(cardno);
		clickByXpathExplict(".//p[text()="+cardnumber+"]//following::*[contains(@id,'extBtn')]");
		
		return this;
	}
	
	public TransfersPage clickOwncardTransferbutton(){

		 scrolldown();
		clickByXpathExplict(prop.getProperty("click.Owncard.transfer.button.xpath"));

	return this;	
		
		}
	public TransfersPage clickOwncardVerifyTransferbutton(){

		 scrolldown();
		clickByXpathExplict(prop.getProperty("click.Owncard.Verifytransfer.button.xpath"));
	
		System.out.println("ooooooooooooooooooooo");
	return this;
	
	
		
		}
	
public TransfersPage clickWithinBankMenu(){
		
		clickByXpathExplict(prop.getProperty("click.Withinbank.menu.xpath"));
		
		return this;
	}	

public TransfersPage clickWithinBankTransNextbutton(){
	
	clickByXpathExplict(prop.getProperty("click.Withinbank.Next.xpath"));
	
	return this;
}
	
public TransfersPage clickWithinBankBenfTypebutton(){
	
	clickByXpathExplict(prop.getProperty("click.Withinbank.Beneftype.xpath"));
	
	return this;
}
public TransfersPage clickWithinBankTransferNextbutton(String accno){
	
	String accnumber=regvalue(accno);
	clickByXpathExplict(".//p[text()="+accnumber+"]//following::*[contains(@id,'extBtn')]");
	
	return this;
}

public TransfersPage clickPaynowbutton(){
	
	clickByXpathExplict(prop.getProperty("click.paynow.xpath"));
	
	return this;
}

public TransfersPage clickConfirmbutton(){

	clickByXpathExplict(prop.getProperty("click.confirm.button"));
	
	return this;
}

public TransfersPage clickAuthSmsbutton(){
	
	clickByXpathExplict(prop.getProperty("click.sms.xpath"));
	
	return this;
}

public TransfersPage ClickVerifybutton(){
	
	clickByXpathExplict(prop.getProperty("click.verify.button"));
					
		return this;
	}

public TransfersPage clickWithinBankOnetimeTypebutton(){
	
	clickByXpathExplict(prop.getProperty("click.Onetimepay.xpath"));
	
	return this;
}

public TransfersPage clickBenefAccountTypebutton(){
	
	clickByXpathExplict(prop.getProperty("click.benefAccounttype.xpath"));
	
	return this;
}

public TransfersPage EnterAccountnumber(String accno){
	
		String regAccnum=regvalue(accno);
		ContextHandlingWeb();
		enterByXpathExplict(prop.getProperty("Enter.paytoAccount"),regAccnum);
	

		
			return this;

		}

public TransfersPage clickBenefCardTypebutton(){
	
	clickByXpathExplict(prop.getProperty("click.benefCardtype.xpath"));
	
	return this;
}

public WalletPaymentPage clickMobilewalletLink(){
	
	clickByXpathExplict(prop.getProperty("click.mobilewallet.xpath"));

	
	return new WalletPaymentPage(driver, test);
}	

	
}
