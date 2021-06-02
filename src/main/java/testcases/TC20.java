package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.ProjectWrappers;

public class TC20 extends ProjectWrappers {
	

	@BeforeClass()
	public void setData() {
		testCaseName="TC20,21,22";
		testDescription="Beneficiary Maintainance Add, Edit and delete Within Brac bank Credit card";
		browserName="chrome";
		dataSheetName="BracTestData";
		category="Smoke";
		authors="Sreejith";
		testKeyword="Tc20";
				}
	
	
	@Test(groups={"Smoke"},dataProvider="fetchData")
	public void login(String TestcaseName,String Devicename,String versionName,String udid,String portnumber,String username,String password,String Cardno,String Creditcard,
String nickname,String entermail,String otp,String shortname,String data1,String data2,String data3,String data4,String data5,String data6) throws Exception{
		String Cardnumber=regvalue(Creditcard);
		try
		{
			
		
		new LoginPage(driver, test)
		.getStartApp(Devicename, versionName, udid, portnumber)
		.LoginApp(username, password)
.clickToggleLink()
.clickManageBeneficiaryLink()
.clickWithinbankLink()
.clickNextLink()
.deleteCardbeneficiary(Cardno)
.clickAddBeneficiaryButton()
.clickCardTypeButton()
.fillAccountnum(Cardnumber)
.fillnickname(nickname)
.entermail(entermail)
.clickSmsNextButton()
.clickconfirm()
.EnterOtp()
.submitAddBeneOtpconfirm()
.clickViewBeneButton()
.clickAddCardbeneNum(Cardno)
.editbeneform(Cardno,shortname)
.EnterOtp()
.submitEditOtp()
.clickOK()
.Cardnunmberverify(Cardno)
.clickback();
//.clickback();


//.logoutApp();
  }
		catch (Exception e) {
			// TODO: handle exception
			
			//logoutApp();
	
			throw new Exception();
		}
}
}