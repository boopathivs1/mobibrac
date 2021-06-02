package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.ProjectWrappers;

public class TC123 extends ProjectWrappers{
	@BeforeClass
	public void setData() {
		testCaseName="TC123";
		testDescription="Forget Pin / Generate New pin debit card";
		browserName="chrome";
		dataSheetName="BracTestData";
		category="Smoke";
		authors="Sreejith";
		testKeyword="TC123";
				}
	@Test(groups={"Smoke"},dataProvider="fetchData")
	public void login(String TestcaseName,String Devicename,String versionName,String udid,String portnumber,String username
			,String password,String Reason,String Cardtype,String card,
			String PinNo,String CVV,String Fromacc
,String newpin,String Confirmpin,String Year,String month,String Purpose,String insuranceno) throws Exception{
		
		try
		{
			new LoginPage(driver, test)
			.getStartApp(Devicename, versionName, udid, portnumber)
			.LoginApp(username, password)
	.clickToggleLink()
	.clickServiceReqMenu()
	.clickCardManagement()
	.clickCardManageNextbtn()
	.SelectReason(Reason)
	.ClickCardtype(Cardtype)
	.SelectCard(card)
	.EnterCardNo(PinNo)
	.EnterCVV(CVV)
	.singleScroll()
	.SelectFromacc(Fromacc)
	.EnterPinNo(newpin, Confirmpin)
	.singleScroll()
	.SelectExpiryDate(Year,month);
			
	
	
	//.clickback();
	
			
		}
		catch (Exception e) {
			// TODO: handle exception
			throw new Exception();
		}
		
	
	}
}

