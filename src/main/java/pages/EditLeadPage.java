package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class EditLeadPage extends OpentapsWrappers{
	public EditLeadPage() {
		if(!verifyTitle("opentaps CRM")){
			Reporter.reportStep("This is NOT EditLeadHome Page", "FAIL");

		// TODO Auto-generated constructor stub
	}
	}
	public EditLeadPage EnterSource(String data){
		selectById(prop.getProperty("EditLeadPage.EnterSource.Id"), data);
		return this;
	}
public EditLeadPage ClickAddSource(){
	clickByXpath(prop.getProperty("EditLeadPage.AddSource.Xpath"));
	return this;
}
public EditLeadPage EnterMarketingCampaign(String data){
	selectById(prop.getProperty("EditLeadPage.EnterMarketingCampaign.Id"), data);
	return this;
}
public EditLeadPage ClickAddCampaign(){
	clickByXpath(prop.getProperty("EditLeadPage.AddMarketingCampaign.Xpath"));
	return this;
}
public ViewEditLeadPage ClickUpdate(){
	clickByXpath(prop.getProperty("EditLeadPage.ClickUpdate.Xpath"));
	
	return new ViewEditLeadPage();
	
}

}
