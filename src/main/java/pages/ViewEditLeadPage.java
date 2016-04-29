package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class ViewEditLeadPage extends OpentapsWrappers{
	public ViewEditLeadPage() {
		if(!verifyTitle("View Lead | opentaps CRM")){
			Reporter.reportStep("This is NOT ViewEditLeadHome Page", "FAIL");

		// TODO Auto-generated constructor stub
	}
	}
	public ViewEditLeadPage VerifySource(String data){
		verifyTextByID(prop.getProperty("ViewEditLeadPage.VerifySource.id"),data);
		return this;
	}

	public ViewEditLeadPage VerifyMarketingCampaign(String data){
		verifyTextByID(prop.getProperty("ViewEditLeadPage.VerifyMarketingCampaign.id"),data);
		return this;
	}
}
