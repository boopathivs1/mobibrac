package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.ProjectWrappers;

public class TC192 extends ProjectWrappers {
	@BeforeClass
	public void setData() {
		testCaseName="TC192";
		testDescription="Pay Utility(One Time Pay) More than minimum amount";
		browserName="chrome";
		dataSheetName="BracTestData";
		category="Smoke";
		authors="Sreejith";
		testKeyword="TC192";
				}
	
	@Test(groups={"Smoke"},dataProvider="fetchData")
	public void login(String TestcaseName,String Devicename,String versionName,String udid,String portnumber,String username
			,String password,String Billername,String fromAcc,String billno,String subcat,String formBillName,String Remark,
			String Message,String Benetype,
			String channelid,String toaccHistory,String otp,String amount) throws Exception{
			
		try
		{
			new LoginPage(driver, test)
			.getStartApp(Devicename, versionName, udid, portnumber)
			.LoginApp(username, password)
	.clickToggleLink()
	.clickBillandFeesLink()
	. ClickUtilitybiller()
	.clickbillerNextbutton()
	.clickbillersubModule(Billername)
	.clickbillerNextbutton()
	.clickOnetimeBiller()
	.fillbillerForm("frombillonePay", fromAcc)
	.getAccountBalance()
	.fillbillerForm("BracSubcat",subcat)
	.fillbillerForm("BracBiller", formBillName)
	
	.fillbillerForm("enterPolicyno", billno)
	//.fillbillerForm("enteramount", amount)
	//.fillbillerForm("Purpose", Purpose)
	.singleScroll()
//	.fillbillerForm("Onetimenext", null)
	.singleScroll()
	.singleScroll()
	.fillbillerForm("EnterRemarks", Remark)
	.verifyTransactionLimitWarning(Message);
			
		}
		catch (Exception e) {
			throw new Exception();
		}
		
	
	}
}