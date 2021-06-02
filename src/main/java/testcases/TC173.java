package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.ProjectWrappers;

public class TC173 extends ProjectWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="TC173";
		testDescription="Pay Internet(Regular payment) less than minimum amount";
		browserName="chrome";
		dataSheetName="BracTestData";
		category="Smoke";
		authors="Sreejith";
		testKeyword="TC173";
				}
	
	@Test(groups={"Smoke"},dataProvider="fetchData")
	public void login(String TestcaseName,String Devicename,String versionName,String udid,String portnumber,String username
			,String password,String Billername,String insuranceno,String fromAcc,String amount,String Remark,String Message,String Benetype,
			String channelid,String toaccHistory,String otp,String data6,String data7) throws Exception{
		
		try
		{
			new LoginPage(driver, test)
			.getStartApp(Devicename, versionName, udid, portnumber)
			.LoginApp(username, password)
	.clickToggleLink()
	
	
	
	.clickBillandFeesLink()
	. clickInternetbiller()
	.clickbillerNextbutton()
	.clickbillersubModule(Billername)
	.clickbillerNextbutton()
	.clickToBiller()
	.selectBiller(insuranceno)
	.selectBillerNextbtn(insuranceno)
	.fillbillerForm("fromAccount", fromAcc)
	.getAccountBalance()
	//.fillbillerForm("enteramount", amount)
	//.fillbillerForm("Purpose", Purpose)
	.singleScroll()
	.fillbillerForm("EnterRemarks", Remark)
	.verifyTransactionLimitWarning(Message);
			
		}
		catch (Exception e) {
			// TODO: handle exception
			throw new Exception();
		}
		
	
	}
}

