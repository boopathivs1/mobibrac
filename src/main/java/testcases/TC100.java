package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.ProjectWrappers;

public class TC100 extends ProjectWrappers {
	
	
	@BeforeClass
	public void setData() {
		testCaseName="TC100";
		testDescription="Airtel ( Beneficiary Payment)";
		browserName="chrome";
		dataSheetName="BracTestData";
		category="Smoke";
		authors="Sreejith";
		testKeyword="TC100";
				}
	
	@Test(groups={"Smoke"},dataProvider="fetchData")
	public void login(String TestcaseName,String Devicename,String versionName,String udid,String portnumber,String username
			,String password,String Billername,String Mobno,String fromAcc,String amount,String Remark,String transtype,String Benetype,
			String channelid,String toaccHistory,String otp,String data6,String data7) throws Exception{
		
		try
		{
			new LoginPage(driver, test)
			.getStartApp(Devicename, versionName, udid, portnumber)
			//.getStartApp("Xiaomi Redmi Note 8","9.0", udid, portnumber)
			
			
			.LoginApp(username, password)
	.clickToggleLink()

	.clickBillandFeesLink()
	.clickMobilebiller()
	.clickbillerNextbutton()
	.clickbillersubModule(Billername)
	.clickbillerNextbutton()
	.clickToBiller()
	.selectBiller(Mobno)
	.selectBillerNextbtn(Mobno)
.fillbillerForm("fromAccount", fromAcc)
	.getAccountBalance()
	.fillbillerForm("enteramount", amount)
	.fillbillerForm("EnterRemarks", Remark)
	.singleScroll()
	.clickAgreecheckboxbutton()
	.singleScroll()
	//.fillbillerForm("confirmbutton", null)
	.fillbillerForm("Nextbutton", null)
	.singleScroll()
	.fillbillerForm("confirmbutton", null)
	.singleScroll()

	//.fillbillerForm("confirmbutton", null)
	//.getOtp()
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