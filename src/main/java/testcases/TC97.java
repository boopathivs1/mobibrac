package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.ProjectWrappers;

public class TC97 extends ProjectWrappers{
	
	@BeforeClass()
	public void setData() {
		testCaseName="TC97,98,99";
		testDescription="Bill Maintainance Add, Edit and delete Brac University Bill";
		browserName="chrome";
		dataSheetName="BracTestData";
		category="Smoke";
		authors="Sreejith";
		testKeyword="TC97";
				}
	@Test(groups={"Smoke"},dataProvider="fetchData")
	public void login(String TestcaseName,String Devicename,String versionName,String udid,String portnumber,String username,String password,String Billername,String StudentID,

String Billerno,String sevice,String shortname,String otp,String Updatedshortname,String data1,String data2,String data3,String data4,String data5) throws Exception{

		
		
		String Billernumber=regvalue(Billerno);	
		String StdID = regvalue(StudentID);
			
		try{
		
		new LoginPage(driver, test)
		.getStartApp(Devicename, versionName, udid, portnumber)
		.LoginApp(username, password)
.clickToggleLink()
.clickManageBeneficiaryLink()
.clicktuitionfees()
.clickbillerNextbutton()
.clickbillersubModule(Billername)
.clickbillerNextbutton()
.deletebeneficiary(StdID)
.clickAddBiller()
.SelectbillerService(sevice)
.EnterbillNo(Billernumber)
.Entershortname(shortname)
.singleScroll()
.singleScroll()
.ClickAutheticationMail()
.fillbillerForm("Nextbutton", null)
.singleScroll()
.singleScroll()
.fillbillerForm("confirmbutton",null)
.EnterOtp()
.submitAddBeneOtpconfirm()
.clickViewBeneButton()
.ClickBillerno(StdID)
.editBillerbeneform(Billernumber,Updatedshortname)
//.EnterOtp()
//.submitAddBeneOtpconfirm()
.clickViewSuccessBeneButton()	
.Billnumberverify(StdID)
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

