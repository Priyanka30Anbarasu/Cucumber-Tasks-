package com.cts.automation.flyus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

	public SearchPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@placeholder='From']")
	public WebElement txtFrom;
	@FindBy(xpath="//input[@placeholder='To']")
	public WebElement txtTo;
	@FindBy(xpath="(//td[@data-title='r3c0'])[1]")
	public WebElement txtFromDate;
	@FindBy(xpath="(//td[@data-title='r3c4'])[1]")
	public WebElement txtToDate;
	@FindBy(xpath="//a[@class='incr-btn incrase-adt disabled decrease-adt']")
	public WebElement txtAdult;
	@FindBy(xpath="//button[text()='Search']")
	public WebElement btnsearch;
	

	public void home(String from,String to)
	{
		txtFrom.sendKeys(from);
		txtTo.sendKeys(to);
		txtFromDate.click();
		txtToDate.click();
		txtAdult.click();
		btnsearch.click();
		
	}
}
