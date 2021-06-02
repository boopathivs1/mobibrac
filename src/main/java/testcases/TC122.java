package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.ProjectWrappers;

public class TC122 extends ProjectWrappers{
	@BeforeClass
	public void setData() {
		testCaseName="TC122";
		testDescription="Currency Converter";
		browserName="chrome";
		dataSheetName="BracTestData";
		category="Smoke";
		authors="Sreejith";
		testKeyword="TC122";
				}
	@Test(groups={"Smoke"},dataProvider="fetchData")
	public void login(String TestcaseName,String Devicename,String versionName,String udid,String portnumber,String username
			,String password,String fromacc,String Toacc,String amount,
			String channelid,String toaccHistory,String otp,String data6,String data7,String Billername,String amount1,String Purpose,String insuranceno) throws Exception{
		
		try
		{
			new LoginPage(driver, test)
			.getStartApp(Devicename, versionName, udid, portnumber)
			.LoginApp(username, password)
	.clickToggleLink()
	.clickMoreMenu()
	.clickCurrencyconverter()
	.clickMoreMenuNext()
	.CurrencySelectFromAcc(fromacc)
	.CurrencySelectToAcc(Toacc)
	.CurrencyEnteramt(amount)
	.ClickConvertButton()
	.VerifyConvertAmount();
	
	//.clickback();
	
			
		}
		catch (Exception e) {
			// TODO: handle exception
			throw new Exception();
		}
		
	
	}
}

