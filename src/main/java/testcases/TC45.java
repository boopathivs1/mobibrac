package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.ProjectWrappers;

public class TC45  extends ProjectWrappers{
	
	@BeforeClass()
	public void setData() {
		testCaseName="TC45,46,47";
		testDescription="Wallet Maintainance Add, Edit and delete BKash Wallet";
		browserName="chrome";
		dataSheetName="BracTestData";
		category="Smoke";
		authors="Sreejith";
		testKeyword="TC45";
				}
	
	@Test(groups={"Smoke"},dataProvider="fetchData")
	public void login(String TestcaseName,String Devicename,String versionName,String udid,String portnumber,String username,String password,String Walletname,String accno,String shortname,String Mobno,String entermail,String Remarks,String otp,String UpdatedRemarks,String data1,String data2,String data3,String data4) throws Exception{

		
		String accountnumber=regvalue(accno);		
		try{
		
		new LoginPage(driver, test)
		.getStartApp(Devicename, versionName, udid, portnumber)
		.LoginApp(username, password)
.clickToggleLink()
.clickManageBeneficiaryLink()
.clickMobileWalletLink()
.clickNextLink()
.clickWalletsubModule(Walletname)
.clickNextLink()
.deletebeneficiary(accountnumber)
.clickAddBeneficiaryButton()
.EnterAccountnum(accountnumber)
.EnterShortName(shortname)
.EnterMobileno(Mobno)
.EnterEmailWallet(entermail)
.EnterRemark(Remarks)
.clickSmsNextButton()
.clickconfirm()
.EnterOtp()
.submitAddBeneOtpconfirm()
.clickViewBeneButton()
.clickAddbeneNum(accountnumber)
.editWalletbeneform(accountnumber,UpdatedRemarks)
//.EnterOtp()
//.submitEditOtp()
.clickOK()
.accnunmberverify(accountnumber)
.clickback()
.clickback();
//.clickback()
//.logoutApp();

		
  }
		catch (Exception e) {
			// TODO: handle exception
			//.logoutApp();
			throw new Exception();
		}
}
}
