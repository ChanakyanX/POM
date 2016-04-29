package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC03_EditLead extends OpentapsWrappers {
	@BeforeClass
	public void startTestCase(){
		browserName 	= "chrome";
		dataSheetName 	= "Editlead";
		testCaseName 	= "TC03 - EditLead";
		testDescription = "EditLead POM framework (Negative Testcase)";
	}
	
	
	@Test(dataProvider="fetchData")
	public void createLead(String username,String password,String leadname,String leadid,String Source,String Campaign) throws InterruptedException {
		new LoginPage()
		.enterUserName(username)
		.enterPassword(password)
		.clickLogin()
		.clickCRMSFAbutton()
		.clickLeads()
		.clickFindLeads()
	    .EnterFirstname(leadname)
	    .SearchFindLead()
	    .ClickLead(leadid)
	    .ClickEdit()
	    .EnterSource(Source)
	    .ClickAddSource()
	    .EnterMarketingCampaign(Campaign)
	    .ClickAddCampaign()
	    .ClickUpdate();
	    //.VerifySource(Source)
	    //.VerifyMarketingCampaign(Campaign);
	    
	}
}
