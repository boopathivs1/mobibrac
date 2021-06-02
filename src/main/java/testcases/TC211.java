package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.ProjectWrappers;

public class TC211 extends ProjectWrappers{
	
	@BeforeClass()
	public void setData() {
		testCaseName="TC211,212,213";
		testDescription="Bill Maintainance Add, Edit and delete DPDC Bill";
		browserName="chrome";
		dataSheetName="BracTestData";
		category="Smoke";
		authors="Sreejith";
		testKeyword="TC211";
				}
	@Test(groups={"Smoke"},dataProvider="fetchData")
	public void login(String TestcaseName,String Devicename,String versionName,String udid,String portnumber,String username,String password,String Billername,String Billerno,String sevice,String shortname,String otp,String Updatedshortname,String data1,String data2,String data3,String data4,String data5,String data6) throws Exception{

		
		String Billernumber=regvalue(Billerno);		
		try{
		
		new LoginPage(driver, test)
		.getStartApp(Devicename, versionName, udid, portnumber)
		.LoginApp(username, password)
.clickToggleLink()
.clickManageBeneficiaryLink()
.ClickUtilitybiller()
.clickbillerNextbutton()
.clickbillersubModule(Billername)
.clickbillerNextbutton()
.deletebeneficiary(Billernumber)
.clickAddBiller()
.SelectbillerService(sevice)
.EnterbillNo(Billernumber)
.Entershortname(shortname)
.ClickConnectionType()
.ClickAutheticationMail()
.fillbillerForm("Nextbutton", null)
.fillbillerForm("confirmbutton",null)
.EnterOtp()
.submitAddBeneOtpconfirm()
.clickViewBeneButton()
.ClickBillerno(Billerno)
.editBillerbeneform(Billernumber,Updatedshortname)
//.EnterOtp()
//.submitAddBeneOtpconfirm()
.clickViewSuccessBeneButton()	
.Billnumberverify(Billernumber)
.clickback()
.clickback();
//.clickback();
//.logoutApp();
		
  }
		
		catch (Exception e) {
			//logoutApp();
			throw new Exception();
		}
		}
}

