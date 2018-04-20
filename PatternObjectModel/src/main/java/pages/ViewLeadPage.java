package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods {
	public ViewLeadPage() {
		PageFactory.initElements(driver, this);
	}
	// Verify First Name
	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement eleViewLeadFirstName;
	public ViewLeadPage verifyViewLeadFirstName(String data) {
		verifyExactText(eleViewLeadFirstName, data);
		return this;
	}
	//Click Edit button
	@FindBy(how=How.XPATH,using="//a[text()='Edit']")
	private WebElement eleEditbtn;
	public OpenTapsCRMpage clickEditLead() {
		click(eleEditbtn);
		return new OpenTapsCRMpage();
	}
	//Click Duplicate Button
	@FindBy(how=How.XPATH,using="//a[text()='Duplicate Lead']")
	private WebElement eleDuplicatBtn;
	public DuplicateLeadPage clickDuplciateLead() {
		click(eleDuplicatBtn);
		return new DuplicateLeadPage();
	}
	//Click Delete Button
	@FindBy(how=How.XPATH,using="//a[contains(@class,'subMenuButtonDangerous')]")
	private WebElement eleDeleteBtn;
	public MyLeads clickDeleteLead() {
		click(eleDeleteBtn);
		return new MyLeads();
	}
	
}
