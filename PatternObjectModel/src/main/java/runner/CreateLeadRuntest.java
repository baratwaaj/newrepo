package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(features="src/main/java/CreateLead.feature",glue= {"pages","steps"},tags= {"@Smoke,@Sanity"} ,monochrome=true)
@RunWith(Cucumber.class)
public class CreateLeadRuntest {

}
