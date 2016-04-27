package testcases;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC03_CreateLeadSuccess extends OpentapsWrappers{
	
	@BeforeClass
	public void startTestCase(){
		browserName 	= "chrome";
		dataSheetName 	= "TC03_CreateLead";
		testCaseName 	= "TC03 - Create Lead (POM)";
		testDescription = "Create Lead in Opentaps using POM framework";
	}
	
	
	@Test(dataProvider="fetchData")
	public void createLeadSuccess(String userName, String Pwd, String compName,String fName, String lName) {
		new LoginPage()
		.enterUserName(userName)
		.enterPassword(Pwd)
		.clickLogin()
		.clickCRMSFAbutton()
		.clickCreateLead()
		.enterCompany(compName)
		.enterfName(fName)
		.enterlName(lName)
		.clickCreateLeadButton()
		.verifyFirstName(fName)
		;
	}
}
