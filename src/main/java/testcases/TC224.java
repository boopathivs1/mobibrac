package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.ProjectWrappers;

public class TC224 extends ProjectWrappers {
	@BeforeClass()
	public void setData() {
		testCaseName="TC224";
		testDescription="One-Off Payment Transfer To OKWallet Transfer(OKWallet account)Phonebook";
		browserName="chrome";
		dataSheetName="BracTestData";
		category="Smoke";
		authors="Sreejith";
		testKeyword="TC224";
				}
	
	
	@Test(groups={"Smoke"},dataProvider="fetchData")
	public void login(String TestcaseName,String Devicename,String versionName,String udid,String portnumber,String username
			,String password,String Walletname,String fromAcc,String contactname,String amount,String purpose,String transtype,String Benetype,
			String channelid,String toaccHistory,String otp,String data1,String data2) throws Exception{

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
.SelectContact(contactname)
//.fillTransferForm("enteraccountno",accno)
.fillTransferForm("enteramount",amount)
.fillTransferForm("Remarks",purpose)
.clickAuthSmsbutton()
.singleScroll()
.singleScroll()
.clickAgreecheckboxbutton()
.clickPaynowbutton()
.singleScroll()
.singleScroll()
//.clickWalletTransferNextbtn()
//.singleScroll()
.clickWalletSendMoneybtn()


.EnterOtp()
.submitAddBeneOtpconfirm()


//.clickTransferbutton()
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

///a
		}
  
		catch (Exception e) {
			// TODO: handle exception
			logoutApp();
			throw new Exception();
		}
}
}