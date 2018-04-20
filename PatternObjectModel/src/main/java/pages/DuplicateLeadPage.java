package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class DuplicateLeadPage extends ProjectMethods {
	public DuplicateLeadPage() {
	PageFactory.initElements(driver, this);
	}
	//Click Create Lead button
	@FindBy(how=How.XPATH,using="//input[contains(@class,'smallSubmit')]")
	private WebElement eleCreateLeadbtn;
	public ViewLeadPage clickCreateLead() {
		click(eleCreateLeadbtn);
		return new ViewLeadPage();
	}
}
