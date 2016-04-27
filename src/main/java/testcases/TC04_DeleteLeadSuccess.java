package testcases;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC04_DeleteLeadSuccess extends OpentapsWrappers{
	
	@BeforeClass
	public void startTestCase(){
		browserName 	= "chrome";
		dataSheetName 	= "TC04_DeleteLead";
		testCaseName 	= "TC04 - delete Lead (POM)";
		testDescription = "Delete Lead in Opentaps using POM framework";
	}
	
	
	@Test(dataProvider="fetchData")
	public void createLeadSuccess(String userName, String Pwd, String phNo,String leadId, String data) throws InterruptedException {
		new LoginPage()
		.enterUserName(userName)
		.enterPassword(Pwd)
		.clickLogin()
		.clickCRMSFAbutton()
		.clickLeads()
		.clickFindLeads()
		.clickphoneNo()
		.enterPhoneNo(phNo)
		.ClickFindLeadBtn()
		.clickleadId(leadId)
		.clickdeletebtn()
		.clickFindLeads()
		.enterLeadID(leadId)
		.ClickFindLeadBtn()
		.verifyText(data)
		;
	}
}
