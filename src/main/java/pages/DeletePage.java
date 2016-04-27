package pages;


import utils.Reporter;

import wrappers.OpentapsWrappers;

public class DeletePage extends OpentapsWrappers{

	public DeletePage() {

		if(!verifyTitle("My Home | opentaps CRM")){
			Reporter.reportStep("This is NOT CRMHome page", "FAIL");
		}

	}
	
	public MyLeadPage clickdeletebtn(){
		clickByLink(prop.getProperty("Delete.deletebtn.link"));
		return new MyLeadPage();
	}

	


}
