package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import pages.LoginPage;
import wrappers.ProjectWrappers;

public class TC136 extends ProjectWrappers {
	
	
	@BeforeClass()
	public void setData() {
		testCaseName="TC136";
		testDescription="Transfer between my Cards More than minimum amount";
		browserName="chrome";
		dataSheetName="BracTestData";
		category="Smoke";
		authors="Sreejith";
		testKeyword="TC136";
				}
	@Test(groups={"Smoke"},dataProvider="fetchData")
	public void login(String TestcaseName,String Devicename,String versionName,String udid,String portnumber,String username
			,String password,String selectCardno,String fromAcc,String Paymenttype,String amount,String Remarks,
			String Message,String transtype,String Benetype,
			String channelid,String otp,String data6,String data7) throws Exception{
		
		try
		{
			new LoginPage(driver, test)
			.getStartApp(Devicename, versionName, udid, portnumber)
			.LoginApp(username, password)
	.clickToggleLink()
	.clickTransferLink()
	.clickownCardMenu()
	.clickTransNextbutton()
	.selectBeneficiaryCard(selectCardno)
	.ClickOwncardNextbutton(selectCardno)
	.fillTransferForm("OwncardFromAcc",fromAcc)
	.fillTransferForm("Paymentype",Paymenttype)
	.fillTransferForm("enteramount",amount)
	.fillTransferForm("Remarks",Remarks)
	.verifyTransactionLimitWarning(Message);
	
	
	
		}
		catch (Exception e) {
			// TODO: handle exception
			throw new Exception();
		}
}
}

 