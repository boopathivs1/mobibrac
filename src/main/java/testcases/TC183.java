package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.ProjectWrappers;

public class TC183 extends ProjectWrappers {
	@BeforeClass
	public void setData() {
		testCaseName="TC183";
		testDescription="Teletalk (with Beneficiaries) More than minimum amount";
		browserName="chrome";
		dataSheetName="BracTestData";
		category="Smoke";
		authors="Sreejith";
		testKeyword="TC183";
				}
	
	@Test(groups={"Smoke"},dataProvider="fetchData")
	public void login(String TestcaseName,String Devicename,String versionName,String udid,String portnumber,String username
			,String password,String Billername,String Mobno,String fromAcc,String amount,String Remark,String Message,String Benetype,
			String channelid,String toaccHistory,String otp,String data6,String data7) throws Exception{
		
		try
		{
			new LoginPage(driver, test)
			.getStartApp(Devicename, versionName, udid, portnumber)
			.LoginApp(username, password)
	.clickToggleLink()
	.clickBillandFeesLink()
	. clickMobilebiller()
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
	.verifyTransactionLimitWarning(Message);
		
			
		}
		catch (Exception e) {
			// TODO: handle exception
			throw new Exception();
		}
		
	
	}
}
