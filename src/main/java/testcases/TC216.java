package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.ProjectWrappers;

public class TC216 extends ProjectWrappers {
	

	@BeforeClass
	public void setData() {
		testCaseName="TC216";
		testDescription="Airtel( One-off Payment)Phonebook";
		browserName="chrome";
		dataSheetName="BracTestData";
		category="Smoke";
		authors="Sreejith";
		testKeyword="TC216";
				}
	
	@Test(groups={"Smoke"},dataProvider="fetchData")
	public void login(String TestcaseName,String Devicename,String versionName,String udid,String portnumber,String username
			,String password,String Billername,String fromAcc,String contactname,String amount,String contype,String Remark,String transtype,String Benetype,
			String channelid,String toaccHistory,String otp,String data6) throws Exception{
		
		try
		{
			new LoginPage(driver, test)
			.getStartApp(Devicename, versionName, udid, portnumber)
			
			//.getStartApp("Xiaomi Redmi Note 8","9.0", udid, portnumber)
			
			
			.LoginApp(username, password)
	.clickToggleLink()
	.clickBillandFeesLink()
	. clickMobilebiller()
	.clickbillerNextbutton()
	.clickbillersubModule(Billername)
	.clickbillerNextbutton()
	.clickOnetimeBiller()
	.fillbillerForm("OTPfromAccount", fromAcc)
	.getAccountBalance()
//	.fillbillerForm("EnterMobNo", Mobno)
	.SelectContact(contactname)
	.fillbillerForm("enteramount", amount)
	.fillbillerForm("ConnectionType", contype)
	.fillbillerForm("EnterRemarks", Remark)
	.singleScroll()
	.clickAgreecheckboxbutton()
	.singleScroll()
	.fillbillerForm("Nextbutton", null)
	.doubleScroll()
	.fillbillerForm("confirmbutton", null)
	.EnterOtp()
	.submitAddBeneOtpconfirm()
	.clickmenu()
	//.clickMoreMenu()
	.clickTransactionMenu()
	.clickMoreMenuNext()
	.filterTransactionHistoryValue(fromAcc,toaccHistory,transtype,Benetype,channelid,Devicename)
	.verifyTransactionHistoryBillers(amount)
	.clickBacktoDashboard()
	
	
	.clickToggleLink()
	
	
	.clickProductMenu()
	.clickAccountMenu()
	.verifyAccountsPagebalance(fromAcc)
	.verifyMiniStatementbalance(amount);
	
			
		}
		catch (Exception e) {
			// TODO: handle exception
			throw new Exception();
		}
		
	
	}
}



