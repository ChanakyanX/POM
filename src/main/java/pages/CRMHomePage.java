package pages;


import utils.Reporter;

import wrappers.OpentapsWrappers;

public class CRMHomePage extends OpentapsWrappers{

	public CRMHomePage() {

		if(!verifyTitle("My Home | opentaps CRM")){
			Reporter.reportStep("This is NOT CRMHome page", "FAIL");
		}

	}
	
	public CreateLeadPage clickCreateLead(){
		clickByLink(prop.getProperty("CRMSFA.CreateLead.LinkText"));
		return new CreateLeadPage();
	}

	public ClickLeadPage clickLeads(){
		clickByLink(prop.getProperty("CRMSFA.ClickLeads.LinkText"));
		return new ClickLeadPage();
	}
	
	public MergeLeadPage clickMergeLead() throws InterruptedException{
		clickByLink(prop.getProperty("CRMSFA.click.mergeLead"));
		Thread.sleep(1000);
		return new MergeLeadPage();
	}



}
