package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.ProjectWrappers;

public class TC135 extends ProjectWrappers {
	

	@BeforeClass()
	public void setData() {
		testCaseName="TC135";
		testDescription="Transfer between my Accounts more than maximum amount";
		browserName="chrome";
		dataSheetName="BracTestData";
		category="Smoke";
		authors="Sreejith";
		testKeyword="TC135";
				}
	
	
	@Test(groups={"Smoke"},dataProvider="fetchData")
	public void login(String TestcaseName,String Devicename,String versionName,String udid,String portnumber,String username
			,String password,String selectBeneAccno,String fromAcc,String amount,String Remarks,String Message,String Benetype,
			String channelid,String toaccHistory,String otp,String data6,String data7,String data8) throws Exception{

		try
		{
		new LoginPage(driver, test)
	.getStartApp(Devicename, versionName, udid, portnumber)
		
	.LoginApp(username, password)
.clickToggleLink()

.clickTransferLink()
.clickTransNextbutton()
.selectBeneficiary(selectBeneAccno)
.selectBeneNextbutton(selectBeneAccno)
.fillTransferForm("fromAcc",fromAcc)
.fillTransferForm("enteramount",amount)
.doubleScroll()
.fillTransferForm("Remarks",Remarks)
.verifyTransactionLimitWarning(Message);
		}
  
		catch (Exception e) {
			// TODO: handle exception
			//logoutApp();
			throw new Exception();
		}
}
}