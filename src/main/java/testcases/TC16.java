package testcases;

import org.testng.annotations.Test;
import org.springframework.expression.spel.ast.Projection;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import wrappers.ProjectWrappers;

public class TC16 extends ProjectWrappers {


	@BeforeClass()
	public void setData() {
		testCaseName="TC16";
		testDescription="Verifying Deposit Summary";
		browserName="chrome";
		dataSheetName="BracTestData";
		category="Smoke";
		authors="Boopathi";
		testKeyword="TC16";
				}
	
	@Test(groups={"Smoke"},dataProvider="fetchData")
	public void login(String TestcaseName,String Devicename,String versionName,String udid,String portnumber,String username,
			String password,String nickname,String Beneficiaryname,String FromAccNo,String ToAccNo,String CurrencyType,
			String Amount,String Remarks,String BankName,String TransAppType,String FilterFromAmount,String FilterToAmount,
			String LastTrans) throws Exception{
	//test
		try{
		
		new LoginPage(driver, test)
		.getStartApp(Devicename, versionName, udid, portnumber)
		.LoginApp(username, password)
		.clickdeposittabmenuLink()
		.clickDepositSummary()
		.clickMoreDetails()
		.singleScroll()
		.singleScroll();
//		.clickAccback()
//		.clickAccback()
//		.logoutApp();
		}
		catch (Exception e) {
//			logoutApp();
			
			throw new Exception();
		
		}
		
		
	//.//input[@id='loginaskno']	
	}
}