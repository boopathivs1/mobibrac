package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.ProjectWrappers;

public class TC168 extends ProjectWrappers{
	@BeforeClass
	public void setData() {
		testCaseName="TC168";
		testDescription="Grameenphone (One Time Pay) less than minimum amount";
		browserName="chrome";
		dataSheetName="BracTestData";
		category="Smoke";
		authors="Sreejith";
		testKeyword="TC168";
				}
	
	@Test(groups={"Smoke"},dataProvider="fetchData")
	public void login(String TestcaseName,String Devicename,String versionName,String udid,String portnumber,String username
			,String password,String Billername,String fromAcc,String Mobno,String amount,String contype,String Remark,String Message,String Benetype,
			String channelid,String toaccHistory,String otp,String data6) throws Exception{
		
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
	.clickOnetimeBiller()
	.fillbillerForm("OTPfromAccount", fromAcc)
	.getAccountBalance()
	.fillbillerForm("EnterMobNo", Mobno)
	.fillbillerForm("enteramount", amount)
	.singleScroll()
	.fillbillerForm("ConnectionType", contype)
	.doubleScroll()
	.fillbillerForm("EnterRemarks", Remark)
	.verifyTransactionLimitWarning(Message);
			
		}
		catch (Exception e) {
			// TODO: handle exception
			throw new Exception();
		}
		
	
	}
}






