package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class OpenTapsCRMpage extends ProjectMethods {
	public OpenTapsCRMpage() {
		PageFactory.initElements(driver, this);
	}
	//Edit the Company Name
	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	private WebElement eleEditCompanyName;
	public OpenTapsCRMpage typeEditCName(String data) {
		type(eleEditCompanyName, data);
		return this;
	}
	//Click Update button
	@FindBy(how=How.XPATH,using="//input[contains(@class,'smallSubmit')][1]")
	private WebElement eleUpdatebtn;
	public ViewLeadPage clickUpdate() {
		click(eleUpdatebtn);
		return new ViewLeadPage();
	}
	
}
