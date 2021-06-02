package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.ProjectWrappers;

public class TC210 extends ProjectWrappers {
	

	@BeforeClass()
	public void setData() {
		testCaseName="TC210";
		testDescription="One-Off Payment Transfer To Other Bank(RTGS With card)";
		browserName="chrome";
		dataSheetName="BracTestData";
		category="Smoke";
		authors="Sreejith";
		testKeyword="TC210";
				}
	
	
	@Test(groups={"Smoke"},dataProvider="fetchData")
	public void login(String TestcaseName,String Devicename,String versionName,String udid,String portnumber,String username
			,String password,String selectBeneAccno,String fromAcc,String amount,String purpose,String transtype,String Benetype,
			String channelid,String toaccHistory,String otp,String accname,String bankname,String branchname) throws Exception{
		//String Cardnumber=regvalue(Cardno);
//	AccountBalance="100";
		try
		{
			
		
		new LoginPage(driver, test)
		.getStartApp(Devicename, versionName, udid, portnumber)
		.LoginApp(username, password)
.clickToggleLink()

.clickTransferLink()

.clickotherAccMenu()

.clickTransNextbutton()
.clickonetimepayOther()

//.selectBeneficiary(selectBeneAccno)
//.otherBeneNextbutton()
//.selectBeneNextbutton()
.clickRTGS()
.fillTransferForm("OtherfromAccOnepay",fromAcc)
.getAccountBalance()
.singleScroll()
.fillTransferForm("OtherbankCardLabel",null)
.SelectBeneficiaryBankdropdown(bankname)
.fillTransferForm("othertoaccOnepay",selectBeneAccno)
.fillTransferForm("othertoaccName",accname)
.singleScroll()
.SelectBeneficiaryBranchdropdown(branchname)
//.fillTransferForm("otherBankName",bankname)
//.fillTransferForm("otherBranchName",branchname)


.fillTransferForm("enteramount",amount)
.fillTransferForm("Remarks",purpose)
.singleScroll()
.singleScroll()
.clickAgreecheckboxbutton()
.fillTransferForm("confirmbutton",null)
//.clickTransferbutton()
.singleScroll()
.singleScroll()
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
			/// TODO: handle exception
			logoutApp();
			throw new Exception();
		}
}
}