package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class ViewLeadEditPage extends OpentapsWrappers {
	public ViewLeadEditPage() {
		if(!verifyTitle("View Lead | opentaps CRM")){
			Reporter.reportStep("This is NOT EditLead Page", "FAIL");

		// TODO Auto-generated constructor stub
	}
	}

	public EditLeadPage ClickEdit(){
		
		clickByXpath(prop.getProperty("ViewLeadEditPage.ClickEdit.Xpath"));
		return new EditLeadPage();
	}
}
