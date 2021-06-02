package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.ProjectWrappers;

public class TC150 extends ProjectWrappers{
	@BeforeClass()
	public void setData() {
		testCaseName="TC150";
		testDescription="Pay Rocket(One Time pay) less than minimum amount";
		browserName="chrome";
		dataSheetName="BracTestData";
		category="Smoke";
		authors="Sreejith";
		testKeyword="TC150";
				}
	
	
	@Test(groups={"Smoke"},dataProvider="fetchData")
	public void login(String TestcaseName,String Devicename,String versionName,String udid,String portnumber,String username
			,String password,String Walletname,String fromAcc,String accno,String accname,String amount,String purpose,String Message,String Benetype,
			String channelid,String toaccHistory,String otp,String data1) throws Exception{

		try
		{
		
		new LoginPage(driver, test)
		.getStartApp(Devicename, versionName, udid, portnumber)
		.LoginApp(username, password)
.clickToggleLink()
.clickTransferLink()
.clickMobilewalletLink()
.clickWalletnextBtn()
.clickWalletsubModule(Walletname)
.clickWalletnextBtn()
.clickWalletOnetimepayBtn()
.fillTransferForm("fromAcc",fromAcc)
.getAccountBalance()
.fillTransferForm("enteraccountno",accno)
.fillTransferForm("enteraccountname", accname)
.fillTransferForm("enteramount",amount)
.fillTransferForm("Remarks",purpose)
.verifyTransactionLimitWarning(Message);		}
  
		catch (Exception e) {
			// TODO: handle exception
			//logoutApp();
			throw new Exception();
		}
}
}