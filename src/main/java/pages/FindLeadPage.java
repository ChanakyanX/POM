package pages;


import utils.Reporter;
import wrappers.OpentapsWrappers;

public class FindLeadPage extends OpentapsWrappers{

	public FindLeadPage() {

		if(!verifyTitle("Find Leads | opentaps CRM")){
			Reporter.reportStep("This is NOT Find Lead page", "FAIL");
		}
	}	
	
	
	//Click phone tab
	public FindLeadPage clickphoneNo(){
		clickByLink(prop.getProperty("MyLead.FindLead.linktext"));
		return this;
	}
	// Enter the phone name
	public FindLeadPage enterPhoneNo(String phNo){
		enterByName(prop.getProperty("MyLead.phoneno.name"), phNo);
		return this;
	}

	// Click Find Lead btn
	public FindLeadPage ClickFindLeadBtn() throws InterruptedException{
		clickByXpath(prop.getProperty("MyLead.FindLeadBtn.xpath"));
		Thread.sleep(10000);
		return this;
	}

	public ViewLeadPage clickleadId(String leadId){
		clickByLink(leadId);
		return new ViewLeadPage();
	}
	
	public FindLeadPage enterLeadID(String name){
		enterByName(prop.getProperty("MyLead.LeadId.name"),name);
		return new FindLeadPage();
	}
	
	public FindLeadPage verifyText(String data){
		verifyTextContainsByXpath(prop.getProperty("MyLead.verifyText.xpath"),data);
		return new FindLeadPage();
	}
	
}


