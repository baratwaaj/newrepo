package testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.CreateLead;
import pages.LoginPage;
import pages.ViewLeadPage;
import wdMethods.ProjectMethods;

public class TC007_DuplicateLead extends ProjectMethods {
	@BeforeTest
	public void setData() {
		testCaseName="TC007_DuplicateLead";
		testDescription="Duplciating a Lead";
		testNodes="Duplicate_Leads";
		category="Smoke";
		authors="Dhanya";
		browserName="chrome";
		dataSheetName="CreateLead";
	}
	@Test(dataProvider="fetchData")
		public void DuplicateLead(String cName, String fName, String lName) {
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
			.clickDuplciateLead()
			.clickCreateLead();
		}
		
		
	}
	

