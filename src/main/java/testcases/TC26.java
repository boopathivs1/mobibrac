package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.ProjectWrappers;

public class TC26 extends ProjectWrappers {
	
	
	@BeforeClass()
	public void setData() {
		testCaseName="TC26,27,28";
		testDescription="Beneficiary Maintainance Add, Edit and delete Other Brac bank BEFTN/RTGS Card";
		browserName="chrome";
		dataSheetName="BracTestData";
		category="Smoke";
		authors="Sreejith";
		testKeyword="TC26";
				}
	@Test(groups={"Smoke"},dataProvider="fetchData")
	public void login(String TestcaseName,String Devicename,String versionName,String udid,String portnumber,String username,String password,String cardno,String BankName,String Bankbranch,String accname,String shortname,String entermail,String otp,String UpdatedShortname,String data3,String data4,String data5,String data6) throws Exception{
		String Cardnumber=regvalue(cardno);
		try
		{

			new LoginPage(driver, test)
			.getStartApp(Devicename, versionName, udid, portnumber)
			.LoginApp(username, password)
	.clickToggleLink()
	.clickManageBeneficiaryLink()
	.clickOtherbankLink()
	.clickNextLink()
	.deletebeneficiary(Cardnumber)
	.clickOtherBankAddBeneficiaryButton()
	.clickBeneTypeCardButton()
	.clickTransferChannelButton()
	.SelectBeneficiaryBankdropdown(BankName)
	.SelectBeneficiaryBranchdropdown(Bankbranch)
	.singleScroll()
	.EnterAccountnum(Cardnumber)
	.EnterAccountName(accname)
	.EnterShortName(shortname)
	.EnterEmail(entermail)
	.clickSmsNextButton()
	.singleScroll()
	.singleScroll()
	.clickconfirm()
	.EnterOtp()
	.submitAddBeneOtpconfirm()
	.clickViewBeneButton()
	.clickAddbeneNum(Cardnumber)
	.Otherbankeditbeneform(Cardnumber,UpdatedShortname)
	.EnterOtp()
	.submitAddBeneOtpconfirm()
	.clickOK()
	.Cardnunmberverify(Cardnumber)
	.clickback();
	//.clickback();
			
		}
		catch (Exception e) {
			// TODO: handle exception
			throw new Exception();
		}
		}
}
