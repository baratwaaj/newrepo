package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeadsPage extends ProjectMethods{
	
	public FindLeadsPage() {		
		PageFactory.initElements(driver,this);
	}	
	
	//Type First name
	@FindBy(how=How.XPATH,using="(//label[text()='First name:'])[3]/../div/input")
	private WebElement eleFirstName;
	public FindLeadsPage typeFirstName(String data){
		type(eleFirstName,data);
		return this;
	}

	
	//Click on Find lead
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleFindLead;
	public FindLeadsPage clickFindLead() throws InterruptedException{
		click(eleFindLead);
		Thread.sleep(1000);
		return this;
	}
	
	 @FindBy(how=How.XPATH,using="(//div[contains(@class,'x-grid3-col-partyId')])[1]/a")
	 WebElement eleClickLeadId;
	 public ViewLeadPage ClickLeadID() {
		 click(eleClickLeadId);
		 return new ViewLeadPage();
		 
	 }
	
	
	

}
