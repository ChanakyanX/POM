package pages;


import utils.Reporter;
import wrappers.OpentapsWrappers;

public class MyLeadPage extends OpentapsWrappers{

	public MyLeadPage() {

		if(!verifyTitle("My Leads | opentaps CRM")){
			Reporter.reportStep("This is NOT MyLead page", "FAIL");
		}
	}	
	
	public FindLeadPage clickFindLeads(){
		clickByLink(prop.getProperty("CRMSFA.FindLead.LinkText"));
		return new FindLeadPage();
	}

	
	}


