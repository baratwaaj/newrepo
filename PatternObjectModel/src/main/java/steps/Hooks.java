package steps;

import cucumber.api.Scenario;
import cucumber.api.java.*;
import wdMethods.ProjectMethods;

public class Hooks extends ProjectMethods{
	@Before
	public void before(Scenario sc) {
		startResult();
		startTestModule(sc.getName(), sc.getId());
		test = startTestCase(sc.getName());
		test.assignCategory("smoke");
		test.assignAuthor("Baratwap");
		startApp("chrome");
}
	@After
	public void after()
	{
		closeAllBrowsers();
		endResult();
	}

}
