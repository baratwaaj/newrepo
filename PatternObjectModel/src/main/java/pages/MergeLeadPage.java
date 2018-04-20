package pages;

import org.apache.commons.collections4.functors.SwitchClosure;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeLeadPage extends ProjectMethods {
	public void MergeLead(){
		PageFactory.initElements(driver, this);
	}	

	//Click on From Lead Icon
	@FindBy(how=How.XPATH,using="//img[@alt='Lookup'][1]")
	private WebElement eleFromLeadIcon;
	public FindLeadsPage clickFromLeadIcon() throws InterruptedException {
		click(eleFromLeadIcon);
		switchToWindow(1);
		Thread.sleep(2000);
		return new FindLeadsPage();
	}

	//Type First Name
	@FindBy(how=How.XPATH,using="(//label[text()='First name:'])/../div/input")
	private WebElement eleFirstName;
	public void typeFirstName(String data) {
		type(eleFirstName, data);
	}
	
	//Click Find Leads
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleFindLeads;
	public void clickFindLeads() throws InterruptedException {
		click(eleFindLeads);
		Thread.sleep(1000);
	}
	
	//Click Lead ID
	@FindBy(how=How.XPATH,using="(//div[contains(@class,'x-grid3-col-partyId')])[1]/a")
	private WebElement eleLeadID;
	public MergeLeadPage clickLeadID() throws InterruptedException{
		click(eleLeadID);
		switchToWindow(0);
		Thread.sleep(2000);
		return this;
	}
	
	//Click on To Lead Icon
	@FindBy(how=How.XPATH,using="//img[@alt='Lookup'][2]")
	private WebElement eleToLeadIcon;
	public FindLeadsPage clickToLeadIcon() throws InterruptedException {
		click(eleToLeadIcon);
		switchToWindow(1);
		Thread.sleep(2000);
		return new FindLeadsPage();
	}
	
	//Type First Name
	@FindBy(how=How.XPATH,using="(//label[text()='First name:'])[3]/../div/input")
	private WebElement eleToFirstName;
	public void typeToFirstName(String data) {
		type(eleToFirstName, data);
	}
	
	//Click Find Leads
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleToFindLeads;
	public void clickToFindLeads() throws InterruptedException {
		click(eleToFindLeads);
		Thread.sleep(1000);
	}
	
	//Click Lead ID
	@FindBy(how=How.XPATH,using="(//div[contains(@class,'x-grid3-col-partyId')])[1]/a")
	private WebElement eleToLeadID;
	public MergeLeadPage clickToLeadID() throws InterruptedException{
		click(eleToLeadID);
		switchToWindow(0);
		Thread.sleep(2000);
		return this;
	}
	
	//Click Merge
	@FindBy(how=How.XPATH,using="(//a[contains(text(),'Merge')])[2]")
	private WebElement eleMerge;
	public ViewLeadPage clickMerge() throws InterruptedException {
		click(eleMerge);
		acceptAlert();
		Thread.sleep(1000);
		return new ViewLeadPage();
	}	
}
