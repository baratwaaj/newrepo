package testcases;

import org.testng.annotations.*;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_FindLeads extends ProjectMethods {
	
	@BeforeTest
	public void setData() {
		testCaseName="TC004_FindLead";
		testDescription="Finding lead";
		testNodes="Find_lead";
		authors="Barat";
		category="smoke";
		dataSheetName="FindLead";
		browserName="chrome";

	}
	@Test(dataProvider="fetchData")
	public void findLead(String fName) throws InterruptedException {
		new LoginPage().enterUserName("DemoSalesManager")
		.enterPassword("crmsfa")
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads()
		.typeFirstName(fName)
		.clickFindLead()
		.ClickLeadID()
		.verifyViewLeadFirstName(fName);

		

}
}
