package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.ProjectWrappers;

public class TC201 extends ProjectWrappers {
	
	
	@BeforeClass()
	public void setData() {
		testCaseName="TC201,202,203";
		testDescription="Beneficiary Maintainance Add, Edit and delete Other Brac bank NPSB Accounts";
		browserName="chrome";
		dataSheetName="BracTestData";
		category="Smoke";
		authors="Sreejith";
		testKeyword="TC201";
				}
	@Test(groups={"Smoke"},dataProvider="fetchData")
	public void login(String TestcaseName,String Devicename,String versionName,String udid,String portnumber,String username,String password,String accno,String BankName,String Bankbranch,String accname,String shortname,String entermail,String otp,String UpdatedShortname,String data3,String data4,String data5,String data6) throws Exception{
		String accountnumber=regvalue(accno);
		try
		{

			new LoginPage(driver, test)
			.getStartApp(Devicename, versionName, udid, portnumber)
			.LoginApp(username, password)
	.clickToggleLink()
	.clickManageBeneficiaryLink()
	.clickOtherbankLink()
	.clickNextLink()
	.deletebeneficiary(accountnumber)
	.clickOtherBankAddBeneficiaryButton()
	.clickBeneTypeButton()
	.clickNPSBTransferChannel()
	.SelectBeneficiaryBankdropdown(BankName)
	//.SelectBeneficiaryBranchdropdown(Bankbranch)
	.singleScroll()
	.EnterAccountnum(accountnumber)
	.EnterAccountName(accname)
	.EnterShortName(shortname)
	.EnterEmail(entermail)
	.clickSmsNextButton()
	.singleScroll()
	.clickconfirm()
	.EnterOtp()
	.submitAddBeneOtpconfirm()
	.clickViewBeneButton()
	.clickAddbeneNum(accountnumber)
	.Otherbankeditbeneform(accountnumber,UpdatedShortname)
	.EnterOtp()
	.submitAddBeneOtpconfirm()
	.clickOK()
	.accnunmberverify(accountnumber)
	.clickback();
	//.clickback();
			
		}
		catch (Exception e) {
			// TODO: handle exception
			throw new Exception();
		}
		}
}
