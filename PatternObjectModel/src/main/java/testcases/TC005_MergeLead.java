package testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.CreateLead;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_MergeLead extends ProjectMethods {
	@BeforeTest
	public void setData() {
		testCaseName="TC004_MergeLead";
		testDescription="Merging Lead";
		testNodes="Merge_Leads";
		category="Smoke";
		authors="Dhanya";
		browserName="chrome";
		//dataSheetName="MergeLead";
	}
	@Test()
		public void mergeLead() throws InterruptedException {
			new LoginPage()
			.enterUserName("DemoSalesManager")
			.enterPassword("crmsfa")
			.clickLogIn()
			.clickCRMSFA()
			.clickLeads()
			.clickMergeLeads()
			.clickFromLeadIcon()
			.typeFirstName("Dhanya")
			.clickFindLeads()
			.clickLeadID();
			
		}
		
		
	}
	

