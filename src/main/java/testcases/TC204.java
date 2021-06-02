package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.ProjectWrappers;

public class TC204 extends ProjectWrappers {
	
	
	@BeforeClass()
	public void setData() {
		testCaseName="TC204,205,206";
		testDescription="Beneficiary Maintainance Add, Edit and delete Other Brac bank NPSB Card";
		browserName="chrome";
		dataSheetName="BracTestData";
		category="Smoke";
		authors="Sreejith";
		testKeyword="TC204";
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
	.clickNPSBTransferChannel()
	.SelectBeneficiaryBankdropdown(BankName)
	//.SelectBeneficiaryBranchdropdown(Bankbranch)
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
