package com.cts.automation.stepdef;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;

import com.cts.automation.base.BaseClass;
import com.cts.automation.flyus.PrintPrice;
import com.cts.automation.flyus.SearchPage;
import com.cts.automation.flyus.SearchResultPage;
import com.cts.automation.flyus.SeatSelectPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class FlyUsStepDef extends BaseClass{
	@Given("User launches chrome and navigate to url")
	public void user_launches_chrome_and_navigate_to_url() {
		launchChrome();
		driver.get("https://www.flyus.com/");
	}
	@When("User enters the required information")
	public void user_enters_the_required_information(DataTable dataTable) 
	{
		List<Map<String, String>> allData = dataTable.asMaps(String.class, String.class);
		SearchPage obj = new SearchPage(driver);
		for(Map<String, String> table : allData)
		{
			String from = table.get("from");
			String to = table.get("to");
			obj.home(from, to);
		}
	}
	@When("User selects flight")
	public void user_selects_flight() {
		SearchResultPage result = new SearchResultPage(driver);
		result.select();
	}
	@When("User enters passengers info")
	public void user_enters_passengers_info(DataTable dataTable) throws InterruptedException
	{
		List<Map<String, String>> allData = dataTable.asMaps(String.class, String.class);
		SeatSelectPage seat = new SeatSelectPage(driver);
		for(Map<String, String> table : allData)
		{
			String first = table.get("first");
			String last = table.get("last");
			String dob = table.get("dob");
			seat.selectPage(first, last,dob);
		}
	}
	@When("User selects seat")
	public void user_selects_seat() throws InterruptedException
	{
		SeatSelectPage seat = new SeatSelectPage(driver);
		seat.selectSeat();
	}
	@Then("Print the price")
	public void print_the_price() {
		PrintPrice total = new PrintPrice(driver);
		total.price();
	}
}
