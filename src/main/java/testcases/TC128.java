package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.ProjectWrappers;

public class TC128 extends ProjectWrappers {
	@BeforeClass()
	public void setData() {
		testCaseName="TC128";
		testDescription="Pay transfer within Brac bank(Existing Benef) via Credit card less than minimum amount";
		browserName="chrome";
		dataSheetName="BracTestData";
		category="Smoke";
		authors="Sreejith";
		testKeyword="TC128";
				}

	@Test(groups={"Smoke"},dataProvider="fetchData")
	public void login(String TestcaseName,String Devicename,String versionName,String udid,String portnumber,String username
			,String password,String selectCardno,String fromAcc,String amount,String purpose,String Message,String transtype,String Benetype,
			String channelid,String otp,String data6,String data7,String data8) throws Exception{
		//String Cardnumber=regvalue(Cardno);
		try
		{
			new LoginPage(driver, test)
			.getStartApp(Devicename, versionName, udid, portnumber)
			.LoginApp(username, password)
	.clickToggleLink()

	.clickTransferLink()
	.clickWithinBankMenu()
	.clickWithinBankTransNextbutton()
	.selectBeneficiaryCard(selectCardno)
	.clickWithinBankTransferNextbutton(selectCardno)
	.fillTransferForm("WithinBankFromAcc",fromAcc)
	.getAccountBalance()
	.fillTransferForm("enteramount",amount)
	.fillTransferForm("Remarks",purpose)
	.verifyTransactionLimitWarning(Message);
	
		}
			
				catch (Exception e) {
					// TODO: handle exception
					throw new Exception();
				}
		}
			
			
}
