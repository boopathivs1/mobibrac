package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.ProjectWrappers;

public class TC208 extends ProjectWrappers {
	

	@BeforeClass()
	public void setData() {
		testCaseName="TC208";
		testDescription="Beneficiary Payment Transfer To Other Bank(RTGS With Card)";
		browserName="chrome";
		dataSheetName="BracTestData";
		category="Smoke";
		authors="Sreejith";
		testKeyword="TC208";
				}
	
	
	@Test(groups={"Smoke"},dataProvider="fetchData")
	public void login(String TestcaseName,String Devicename,String versionName,String udid,String portnumber,String username
			,String password,String selectBeneAccno,String fromAcc,String amount,String purpose,String transtype,String Benetype,
			String channelid,String toaccHistory,String otp,String data6,String data7,String data8) throws Exception{
		//String Cardnumber=regvalue(Cardno);
//	AccountBalance="100";
		try
		{
			
		
		new LoginPage(driver, test)
		.getStartApp(Devicename, versionName, udid, portnumber)
		.LoginApp(username,password)
.clickToggleLink()

.clickTransferLink()

.clickotherAccMenu()

.clickTransNextbutton()

.selectBeneficiary(selectBeneAccno)
.otherBeneNextbutton(selectBeneAccno)
//.selectBeneNextbutton()
.clickRTGS()
.fillTransferForm("OtherfromAcc",fromAcc)
.getAccountBalance()

.fillTransferForm("enteramount",amount)
.fillTransferForm("Remarks",purpose)
.singleScroll()
.singleScroll()
//.doubleScroll()
.clickAgreecheckboxbutton()
.fillTransferForm("confirmbutton",null)
//.clickTransferbutton()
.doubleScroll()
.clickSendMoneybutton()

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