package testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.CreateLead;
import pages.LoginPage;
import pages.ViewLeadPage;
import wdMethods.ProjectMethods;

public class TC006_EditLead extends ProjectMethods {
	@BeforeTest
	public void setData() {
		testCaseName="TC006_EditLead";
		testDescription="Editing a Lead";
		testNodes="Edit_Leads";
		category="Smoke";
		authors="Dhanya";
		browserName="chrome";
		dataSheetName="CreateLead";
	}
	@Test(dataProvider="fetchData")
		public void EditLead(String cName, String fName, String lName) {
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
			.clickEditLead()
			.typeEditCName("hello")
			.clickUpdate();	
		
		}
		
		
	}
	

