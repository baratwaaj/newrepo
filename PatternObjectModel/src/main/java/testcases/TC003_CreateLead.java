package testcases;

import org.testng.annotations.*;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
		testCaseName="TC003_CreateLead";
		testDescription="Creating lead";
		testNodes="Create_Lead";
		authors="Barat";
		category="smoke";
		dataSheetName="CreateLead";
		browserName="chrome";

	}
	@Test(dataProvider="fetchData")
	public void CreateLead(String cName, String fName, String lName) {
		String userName="DemoSalesManager";
		String passWord="crmsfa";
		new LoginPage()
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogIn().clickCRMSFA().clickLeads().clickCreateLead()
		.typeCompanyName(cName)
		.typeFirstName(fName)
		.typeLastName(lName)
		.clickCreateLead()
		.verifyViewLeadFirstName(fName);
	}
	

}
