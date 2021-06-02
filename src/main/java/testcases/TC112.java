package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.ProjectWrappers;

public class TC112 extends ProjectWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="TC112";
		testDescription="Carnival(Beneficiary Payment)";
		browserName="chrome";
		dataSheetName="BracTestData";
		category="Smoke";
		authors="Boopathi";
		testKeyword="TC112";
				}
	
	@Test(groups={"Smoke"},dataProvider="fetchData")
	public void login(String TestcaseName,String Devicename,String versionName,String udid,String portnumber,String username
			,String password,String Billername,String insuranceno,String fromAcc,String amount,String Remark,String transtype,String Benetype,
			String channelid,String toaccHistory,String otp,String data6,String data7) throws Exception{
		
		try
		{
			new LoginPage(driver, test)
			.getStartApp(Devicename, versionName, udid, portnumber)
			.LoginApp(username, password)
	.clickToggleLink()
	
	
	
	.clickBillandFeesLink()
	. clickInternetbiller()
	.clickbillerNextbutton()
	.clickbillersubModule(Billername)
	.clickbillerNextbutton()
	.clickToBiller()
	.selectBiller(insuranceno)
	.selectBillerNextbtn(insuranceno)
	.fillbillerForm("fromAccount", fromAcc)
	.getAccountBalance()
	//.fillbillerForm("enteramount", amount)
	//.fillbillerForm("Purpose", Purpose)
	.singleScroll()
	.fillbillerForm("EnterRemarks", Remark)
	.singleScroll()
	.clickAgreecheckboxbutton()
	.fillbillerForm("Nextbutton", null)
	.getamt()
	.singleScroll()
	.singleScroll()
	.fillbillerForm("confirmbutton", null)
	.EnterOtp()
	.submitAddBeneOtpconfirm()
	
	.clickmenu()
	
	
	
	//.clickMoreMenu()
		.clickTransactionMenu()
	.clickMoreMenuNext()
	.filterTransactionHistoryValue(fromAcc,toaccHistory,transtype,Benetype,channelid,Devicename)
	.verifyTransactionHistoryBillers(BillDueAmount)
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

