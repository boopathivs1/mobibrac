package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.ProjectWrappers;

public class TC144 extends ProjectWrappers {
	

	@BeforeClass()
	public void setData() {
		testCaseName="TC144";
		testDescription="Pay transfer to Other bank(OneTimepay) via Credit card more than maximum amount";
		browserName="chrome";
		dataSheetName="BracTestData";
		category="Smoke";
		authors="Sreejith";
		testKeyword="TC144";
				}
	
	
	@Test(groups={"Smoke"},dataProvider="fetchData")
	public void login(String TestcaseName,String Devicename,String versionName,String udid,String portnumber,String username
			,String password,String fromAcc,String selectBeneAccno,String accname,String bankname,String amount,String purpose,
			String Message,String toaccHistory,String otp,String acc1name,String banname,String branchname) throws Exception{

		try
		{
		
		new LoginPage(driver, test)
		.getStartApp(Devicename, versionName, udid, portnumber)
		.LoginApp(username, password)
.clickToggleLink()
.clickTransferLink()
.clickotherAccMenu()
.clickTransNextbutton()
.clickonetimepayOther()
.fillTransferForm("OtherfromAccOnepay",fromAcc)
.getAccountBalance()
.fillTransferForm("OtherbankCardLabel",null)
.fillTransferForm("othertoaccOnepay",selectBeneAccno)
.fillTransferForm("othertoaccName",accname)
.SelectBeneficiaryBankdropdown(bankname)
.fillTransferForm("enteramount",amount)
.fillTransferForm("Remarks",purpose)
.verifyTransactionLimitWarning(Message);
		}
  
		catch (Exception e) {
			// TODO: handle exception
			//logoutApp();
			throw new Exception();
		}
}
}