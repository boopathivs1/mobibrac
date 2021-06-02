package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.ProjectWrappers;

public class TC82 extends ProjectWrappers{
	
	@BeforeClass()
	public void setData() {
		testCaseName="TC82,83,84";
		testDescription="Bill Maintainance Add, Edit and delete Banglalink Bill";
		browserName="chrome";
		dataSheetName="BracTestData";
		category="Smoke";
		authors="Sreejith";
		testKeyword="TC82";
				}
	@Test(groups={"Smoke"},dataProvider="fetchData")
	public void login(String TestcaseName,String Devicename,String versionName,String udid,String portnumber,String username,String password,String Billername,String Mobno,String contype,String shortname,String otp,String Updatedshortname,String data1,String data2,String data3,String data4,String data5,String data6) throws Exception{

		
		String Mobilenumber=regvalue(Mobno);		
		try{
		
		new LoginPage(driver, test)
		.getStartApp(Devicename, versionName, udid, portnumber)
		.LoginApp(username, password)
.clickToggleLink()
.clickManageBeneficiaryLink()
.clickMobilebiller()
.clickbillerNextbutton()
.clickbillersubModule(Billername)
.clickbillerNextbutton()
.deletebeneficiary(Mobilenumber)
.clickAddBiller()
.SelectbillerbenContype(contype)
.EnterMobNo(Mobilenumber)
.Entershortname(shortname)
.ClickAutheticationMail()
.fillbillerForm("Nextbutton", null)
.fillbillerForm("confirmbutton",null)
.EnterOtp()
.submitAddBeneOtpconfirm()
.clickViewBeneButton()
.ClickMobno(Mobilenumber)
.editBillerbeneform(Mobilenumber,Updatedshortname)
//.EnterOtp()
//.submitAddBeneOtpconfirm()
.clickViewSuccessBeneButton()	
.Mobnunmberverify(Mobilenumber)
.clickback()
.clickback();
//.clickback()
//.logoutApp();
		
  }
		
		catch (Exception e) {
			//logoutApp();
			throw new Exception();
		}
		}
}

