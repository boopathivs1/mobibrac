package testcases;

import org.testng.annotations.Test;
import org.springframework.expression.spel.ast.Projection;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import wrappers.ProjectWrappers;

public class TC07 extends ProjectWrappers {


	@BeforeClass()
	public void setData() {
		testCaseName="TC07,TC08,TC09,TC10,TC11";
		testDescription="Verifying Account,Prepaid card,credit card,loan,Deposit Summary";
		browserName="chrome";
		dataSheetName="BracTestData";
		category="Smoke";
		authors="Boopathi";
		testKeyword="TC07";
				}
	
	@Test(groups={"Smoke"},dataProvider="fetchData")
	public void login(String TestcaseName,String Devicename,String versionName,String udid,String portnumber,String username,String password,String nickname,String Beneficiaryname,String FromAccNo,String ToAccNo,String CurrencyType,String Amount,String Remarks,String BankName,String TransAppType,String FilterFromAmount,String FilterToAmount,String LastTrans) throws Exception{
	//a
		
		try{
		
		new LoginPage(driver, test)
		.getStartApp(Devicename, versionName, udid, portnumber)
		.LoginApp(username, password)
		.verifyAccSummary()
		.clickcreditCardtabMenuLink()
		.verifyCreditCardSummary()
		.clickdeposittabmenuLink()
		.verifyDepositSummary()
		.clickloantabLink()
		.verifyLoanSummary()
		.clickPrepaidCardTabLink()
		.verifyPrepaidCardSummary();
		//.logoutApp();
		}
		catch (Exception e) {
		
		//logoutApp();
		throw new Exception();
		
		}
		
	//.//input[@id='loginaskno']	
	}

}