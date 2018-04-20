package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyLeads extends ProjectMethods{
	
	public MyLeads() {		
		PageFactory.initElements(driver,this);
	}	
	//Click Create lead
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	WebElement eleCreateLead;
	@And("Click Create lead button")
	public CreateLead clickCreateLead() {
		click(eleCreateLead);
		return new CreateLead();
		
	}
	//Click find lead
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	WebElement eleFindLeads;
	public FindLeadsPage clickFindLeads() {
		click(eleFindLeads);
		return new FindLeadsPage();
		
	}
	@FindBy(how=How.LINK_TEXT,using="Merge Leads")
	private WebElement eleMergeLeads;
	public MergeLeadPage clickMergeLeads() {
		click(eleMergeLeads);
		return new MergeLeadPage();
	}
	
	
	
	
	

}
