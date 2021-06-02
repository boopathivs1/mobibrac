package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.ProjectWrappers;

public class TC186 extends ProjectWrappers {
	@BeforeClass
	public void setData() {
		testCaseName="TC186";
		testDescription="Robi (One Time Pay) More than minimum amount";
		browserName="chrome";
		dataSheetName="BracTestData";
		category="Smoke";
		authors="Sreejith";
		testKeyword="TC186";
				}
	
	@Test(groups={"Smoke"},dataProvider="fetchData")
	public void login(String TestcaseName,String Devicename,String versionName,String udid,String portnumber,String username
			,String password,String Billername,String fromAcc,String Mobno,String amount,String contype,String Remark,String Message,
			String Benetype,
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
	.fillbillerForm("ConnectionType", contype)
	.singleScroll()
	.fillbillerForm("EnterRemarks", Remark)
	.verifyTransactionLimitWarning(Message);
			
		}
		catch (Exception e) {
			// TODO: handle exception
			throw new Exception();
		}
		
	
	}
}





