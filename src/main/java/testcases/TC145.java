package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.ProjectWrappers;

public class TC145 extends ProjectWrappers{
	@BeforeClass()
	public void setData() {
		testCaseName="TC145";
		testDescription="Pay Bkash (with Beneficiaries) less than minimum amount";
		browserName="chrome";
		dataSheetName="BracTestData";
		category="Smoke";
		authors="Sreejith";
		testKeyword="TC145";
				}
	
	
	@Test(groups={"Smoke"},dataProvider="fetchData")
	public void login(String TestcaseName,String Devicename,String versionName,String udid,String portnumber,String username
			,String password,String Walletname,String selectBeneAccno,String fromAcc,String amount,String purpose,String Message,String Benetype,
			String channelid,String toaccHistory,String otp,String accname,String bankname) throws Exception{

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
.clickWalletToBeneBtn()
.selectBeneficiary(selectBeneAccno)
.clickWallettonextbtn(selectBeneAccno)
.fillTransferForm("fromAcc",fromAcc)
.getAccountBalance()
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