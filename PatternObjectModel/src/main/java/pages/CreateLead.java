package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{
	
	public CreateLead() {		
		PageFactory.initElements(driver,this);
	}	
	
	//Type Company name
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompanyName;
	@And("Enter CompanyName as (.*)")
	public CreateLead typeCompanyName(String data){
		type(eleCompanyName,data);
		return this;
	}
	//Type firstName
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstName;
	@And("Enter FirstName as (.*)")
	public CreateLead typeFirstName(String data){
		type(eleFirstName,data);
		return this;
	}
	//Type lastName
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastName;
	@And("Enter LastName as (.*)")
	public CreateLead typeLastName(String data){
		type(eleLastName,data);
		return this;
	}
	
	//Click on Create lead
	@FindBy(how=How.ID_OR_NAME,using="submitButton")
	private WebElement eleCreateLead;
	@When("Click create lead button")
	public ViewLeadPage clickCreateLead(){
		click(eleCreateLead);
		return new ViewLeadPage();
	}
	@But("Login failed")
	public void loginFailed()
	{
		System.out.println("Login Failed");
	}
	
	
	
	

}
