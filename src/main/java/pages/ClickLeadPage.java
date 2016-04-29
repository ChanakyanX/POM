package pages;


import utils.Reporter;
import wrappers.OpentapsWrappers;

public class ClickLeadPage extends OpentapsWrappers{

	public ClickLeadPage() {

		if(!verifyTitle("My Leads | opentaps CRM")){
			Reporter.reportStep("This is NOT Click Lead page", "FAIL");
		}
	}	
	public MergeLeadPage clickMergeLead() throws InterruptedException{
		clickByLink(prop.getProperty("CRMSFA.click.mergeLead"));
		Thread.sleep(1000);
		return new MergeLeadPage();
	}
	
	public FindLeadPage clickFindLeads() throws InterruptedException{
		clickByLink(prop.getProperty("Lead.MergeLead.clickFindLeadToVerifyMerge"));
		Thread.sleep(1000);
		return new FindLeadPage();
	}
	
	
	

}


