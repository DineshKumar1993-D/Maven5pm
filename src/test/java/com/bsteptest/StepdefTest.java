package com.bsteptest;

import com.baseclass.Base___Class;
import com.configura.ConFigClass;
import com.filreadm.FileReadMangerClass;
import com.pageobjectmanager.PageObjectManager5Pm;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepdefTest extends Base___Class {

	public static ConFigClass con;

	public static PageObjectManager5Pm pom;

	@Given("^launch The Adactin Url Of The Application$")
	public void launch_The_Adactin_Url_Of_The_Application() throws Throwable {

		// driver.get("https://adactinhotelapp.com/");
		// con = new ConFigClass();

		pom = new PageObjectManager5Pm(driver);

		// launchUrl("https://adactinhotelapp.com/");

		String url = FileReadMangerClass.getInstanceFR().getInstanceCR().getUrl();

		launchUrl(url);

	}

//	@When("^user Enters The Username In The Respective Field$")
//	public void user_Enters_The_Username_In_The_Respective_Field() throws Throwable {
//
//		driver.findElement(By.id("username")).sendKeys("Dinesh1993");
//	}
//
//	@When("^user Enters The Password In The Respective Field$")
//	public void user_Enters_The_Password_In_The_Respective_Field() throws Throwable {
//		driver.findElement(By.id("password")).sendKeys("811BWB");
//	}

	// Scenario

//	@When("^user Enters The Username <\"([^\"]*)\"> In The Respective Field$")
//	public void user_Enters_The_Username_In_The_Respective_Field(String username) throws Throwable {
//		driver.findElement(By.id("username")).sendKeys(username);
//	}
//
//	@When("^user Enters The Password <\"([^\"]*)\"> In The Respective Field$")
//	public void user_Enters_The_Password_In_The_Respective_Field(String password) throws Throwable {
//		driver.findElement(By.id("password")).sendKeys(password);
//	}

	// Scenario Outline

//	@When("^user Enters The Username \"([^\"]*)\" In The Respective Field$")
//	public void user_Enters_The_Username_In_The_Respective_Field(String username) throws Throwable {
//
//		driver.findElement(By.id("username")).sendKeys(username);
//	}
//
//	@When("^user Enters The Password \"([^\"]*)\" In The Respective Field$")
//	public void user_Enters_The_Password_In_The_Respective_Field(String password) throws Throwable {
//		driver.findElement(By.id("password")).sendKeys(password);
//	}

	// Data Table

	@When("^user Enters The Following Credentials In The Respective Field$")
	public void user_Enters_The_Following_Credentials_In_The_Respective_Field(DataTable dataTable) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)

//		List<Map<String, String>> asMaps = dataTable.asMaps(String.class, String.class);
//
//		String username = asMaps.get(1).get("Username");
//		String password = asMaps.get(1).get("Password");

//		driver.findElement(By.id("username")).sendKeys(username);
//		driver.findElement(By.id("password")).sendKeys(password);

		String username = FileReadMangerClass.getInstanceFR().getInstanceCR().getUsername();

		String password = FileReadMangerClass.getInstanceFR().getInstanceCR().getPassword();
		sendValues(pom.getLoginadac().getUsername(), username);
		sendValues(pom.getLoginadac().getPassword(), password);
	}

	@Then("^user Clicks The Loginbutton and Its Navigates To The Search Hotel Page$")
	public void user_Clicks_The_Loginbutton_and_Its_Navigates_To_The_Search_Hotel_Page() throws Throwable {
		// driver.findElement(By.id("login")).click();

		clickOnElement(pom.getLoginadac().getLoginbutton());
	}

}
