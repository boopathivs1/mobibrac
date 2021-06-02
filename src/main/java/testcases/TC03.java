package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.ProjectWrappers;

public class TC03 extends ProjectWrappers{
	@BeforeClass
	public void setData() {
		testCaseName="TC03";
		testDescription="Forgot User Name Credit card";
		browserName="chrome";
		dataSheetName="BracTestData";
		category="Smoke";
		authors="Sreejith";
		testKeyword="TC03";
				}
	@Test(groups={"Smoke"},dataProvider="fetchData")
	public void login(String TestcaseName,String Devicename,String versionName,String udid,String portnumber,
			String Cardtype,String card,
			String PinNo,String Username,String Fromacc
,String newpin,String Confirmpin,String Year,String month,String Purpose,String insuranceno,String data1,String data2,String data3) throws Exception{
		
		try
		{
			new LoginPage(driver, test)
			.getStartApp(Devicename, versionName, udid, portnumber)
			.clickforgotusername()
			.ClickCardtype(Cardtype)
			.Entercardno(card)
			.EnterPinno(PinNo)
			.clickAuthSmsbutton()
			.clickValidatebutton()
			.EnterOtp()
			.submitAddBeneOtpconfirm()
			.VerifyUser(Username);
			
			
	
	
	//.clickback();
	
			
		}
		catch (Exception e) {
			// TODO: handle exception
			throw new Exception();
		}
		
	
	}
}

