package definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import net.thucydides.core.annotations.Steps;
import steps.CountriesSearchSteps;

public class StepDefinitions {

	private String ISO_CODE_SEARCH = "http://services.groupkt.com/country/get/iso2code/";
	private Response response;
	//@Steps
	CountriesSearchSteps countriesSearchSteps = new CountriesSearchSteps();

	@Given("^country code$")
	public void country_code() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Given");
		// response = SerenityRest.get(ISO_CODE_SEARCH + "IN");
		// response = RestAssured.get(ISO_CODE_SEARCH + "IN");
		response = RestAssured.when().get(ISO_CODE_SEARCH + "IN").then().contentType(ContentType.JSON).extract()
				.response();

		System.out.println(response.asString());
		countriesSearchSteps.searchCountryByCode("");

	}

	@Then("^return statuc code (\\d+)$")
	public void return_statuc_code(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Then 1");

	}

	@Then("^return country name$")
	public void return_country_name() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Then 2");

	}

}
