package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.ProjectWrappers;

public class TC195 extends ProjectWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="TC195";
		testDescription="Metlife (with Beneficiaries) More than minimum amount";
		browserName="chrome";
		dataSheetName="BracTestData";
		category="Smoke";
		authors="Sreejith";
		testKeyword="TC195";
				}
	
	@Test(groups={"Smoke"},dataProvider="fetchData")
	public void login(String TestcaseName,String Devicename,String versionName,String udid,String portnumber,String username
			,String password,String Billername,String insuranceno,String fromAcc,String amount,String Remark,String Message,String transtype,String Benetype,
			String channelid,String toaccHistory,String otp,String data6) throws Exception{
		
		try
		{
			new LoginPage(driver, test)
			.getStartApp(Devicename, versionName, udid, portnumber)
			.LoginApp(username, password)
	.clickToggleLink()
	
	.clickBillandFeesLink()
	. clickInsurancebiller()
	.clickbillerNextbutton()
	.clickbillersubModule(Billername)
	.clickbillerNextbutton()
	.clickToBiller()
	.selectBiller(insuranceno)
	.selectBillerNextbtn(insuranceno)
	.fillbillerForm("fromAccount", fromAcc)
	.getAccountBalance()
	.fillbillerForm("enteramount", amount)
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

