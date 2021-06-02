package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.ProjectWrappers;

public class TC116 extends ProjectWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="TC116";
		testDescription="GuardianLife(Beneficiary Payment)";
		browserName="chrome";
		dataSheetName="BracTestData";
		category="Smoke";
		authors="Boopathi";
		testKeyword="TC116";
				}
	
	@Test(groups={"Smoke"},dataProvider="fetchData")
	public void login(String TestcaseName,String Devicename,String versionName,String udid,String portnumber,String username
			,String password,String Billername,String insuranceno,String fromAcc,String amount,String Remark,String Purpose,String transtype,String Benetype,
			String channelid,String toaccHistory,String otp,String data6,String data7) throws Exception{
		
		try
		{
			new LoginPage(driver, test)
			.getStartApp(Devicename, versionName, udid, portnumber)
			.LoginApp(username, password)
	.clickToggleLink()
	.clickBillandFeesLink()
	. clickInsurancebiller()
	.clickbillerNextbutton()
	.clickbillersubModule(Billername)
	.clickbillerNextbutton()
	.clickToBiller()
	.selectBiller(insuranceno)
	.selectBillerNextbtn(insuranceno)
	.fillbillerForm("fromAccount", fromAcc)
	.getAccountBalance()
	.singleScroll()
	.singleScroll()
	//.fillbillerForm("enteramount", amount)

	.fillbillerForm("EnterRemarks", Remark)
	.singleScroll()
	.fillbillerForm("Purpose", Purpose)
	.singleScroll()
	.singleScroll()
	.clickAgreecheckboxbutton()
	.singleScroll()
	//.fillbillerForm("confirmbutton", null)
	.fillbillerForm("Nextbutton", null)
	.getamt()
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

