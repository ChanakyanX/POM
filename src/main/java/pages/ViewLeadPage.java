package pages;


import utils.Reporter;

import wrappers.OpentapsWrappers;

public class ViewLeadPage extends OpentapsWrappers{

	public ViewLeadPage() {

		if(!verifyTitle("View Lead | opentaps CRM")){
			Reporter.reportStep("This is NOT View Lead page", "FAIL");
		}

	}


	public ViewLeadPage verifyFirstName(String fname){
		if(verifyTextContainsByXpath(prop.getProperty("Lead.ViewLead.Xpath"),fname )){
			Reporter.reportStep("First Name is correct", "PASS");
			
		}
		return this;
	}
	
	public LoginPage clickLogout(){
		clickByClassName(prop.getProperty("Home.Logout.Class"));
		return new LoginPage();
	}

	public MyLeadPage clickdeletebtn(){
		clickByLink(prop.getProperty("Delete.deletebtn.link"));
		return new MyLeadPage();
	}
}
