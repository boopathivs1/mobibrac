package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.ProjectWrappers;

public class TC94 extends ProjectWrappers{
	
	@BeforeClass()
	public void setData() {
		testCaseName="TC94,95,96";
		testDescription="Bill Maintainance Add, Edit and delete Insurance Guardian Bill";
		browserName="chrome";
		dataSheetName="BracTestData";
		category="Smoke";
		authors="Sreejith";
		testKeyword="TC94";
				}
	@Test(groups={"Smoke"},dataProvider="fetchData")
	public void login(String TestcaseName,String Devicename,String versionName,String udid,String portnumber,String username,String password,String Billername,String Billerno,String sevice,String Customername,String shortname,String otp,String Updatedshortname,String data1,String data2,String data3,String data4,String data5) throws Exception{

		
		
		String Billernumber=regvalue(Billerno);		
		try{
		
		new LoginPage(driver, test)
		.getStartApp(Devicename, versionName, udid, portnumber)
		.LoginApp(username, password)
.clickToggleLink()
.clickManageBeneficiaryLink()
.clickInsurancebiller()
.clickbillerNextbutton()
.clickbillersubModule(Billername)
.clickbillerNextbutton()
.deletebeneficiary(Billernumber)
.clickAddBiller()
.SelectbillerService(sevice)
.EnterbillNo(Billernumber)
.EnterCustomername(Customername)
.Entershortname(shortname)
.ClickAutheticationMail()
.fillbillerForm("Nextbutton", null)
.singleScroll()
.singleScroll()
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

