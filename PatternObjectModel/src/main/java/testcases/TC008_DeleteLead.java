package testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.CreateLead;
import pages.LoginPage;
import pages.ViewLeadPage;
import wdMethods.ProjectMethods;

public class TC008_DeleteLead extends ProjectMethods {
	@BeforeTest
	public void setData() {
		testCaseName="TC008_DeleteLead";
		testDescription="Deleting a Lead";
		testNodes="Delete_Leads";
		category="Smoke";
		authors="Dhanya";
		browserName="chrome";
		dataSheetName="CreateLead";
	}
	@Test(dataProvider="fetchData")
		public void DeleteLead(String cName, String fName, String lName) {
			String username="DemoSalesManager";
			String pwd="crmsfa";
			new LoginPage()
			.enterUserName(username)
			.enterPassword(pwd)
			.clickLogIn()
			.clickCRMSFA()
			.clickLeads()
			.clickCreateLead()
			.typeCompanyName(cName)
			.typeFirstName(fName)
			.typeLastName(lName)
			.clickCreateLead()
			.clickDeleteLead();
		}
		
		
	}
	

