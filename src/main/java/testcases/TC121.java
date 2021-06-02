package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.ProjectWrappers;

public class TC121 extends ProjectWrappers{
	@BeforeClass
	public void setData() {
		testCaseName="TC121";
		testDescription="FX Rate";
		browserName="chrome";
		dataSheetName="BracTestData";
		category="Smoke";
		authors="Sreejith";
		testKeyword="TC121";
				}
	@Test(groups={"Smoke"},dataProvider="fetchData")
	public void login(String TestcaseName,String Devicename,String versionName,String udid,String portnumber,String username
			,String password,String fromAcc,String transtype,String Benetype,
			String channelid,String toaccHistory,String otp,String data6,String data7,String Billername,String amount,String Purpose,String insuranceno) throws Exception{
		
		try
		{
			new LoginPage(driver, test)
			.getStartApp(Devicename, versionName, udid, portnumber)
			.LoginApp(username, password)
	.clickToggleLink()
	.clickMoreMenu()
	.clickFXRate()
	.clickMoreMenuNext()
	.VerifyFxRate()
	.clickback();
	
			
		}
		catch (Exception e) {
			// TODO: handle exception
			throw new Exception();
		}
		
	
	}
}

