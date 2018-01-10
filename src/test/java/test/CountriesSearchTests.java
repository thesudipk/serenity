package test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;


//@RunWith(SerenityRunner.class)
@RunWith(CucumberWithSerenity.class)
//@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features", glue= {"definitions"}, 
plugin = {"pretty", "html:target/cucumber-html-report"})
public class CountriesSearchTests {
	/*@Steps
	CountriesSearchSteps countriesSearchSteps;

	@Test
	public void verifyThatWeCanFindUnitedStatesOfAmericaCountryUsingTheCodeUS() {
		countriesSearchSteps.searchCountryByCode("US");
		countriesSearchSteps.searchIsExecutedSuccesfully();
		countriesSearchSteps.iShouldFindCountry("United States of America");
	}

	@Test
	public void verifyThatWeCanFindIndiaCountryUsingTheCodeIN() {
		countriesSearchSteps.searchCountryByCode("IN");
		countriesSearchSteps.searchIsExecutedSuccesfully();
		countriesSearchSteps.iShouldFindCountry("India");
	}

	@Test
	public void verifyThatWeCanFindBrazilCountryUsingTheCodeBR() {
		countriesSearchSteps.searchCountryByCode("BR");
		countriesSearchSteps.searchIsExecutedSuccesfully();
		countriesSearchSteps.iShouldFindCountry("Brazil");
	}*/
	
}