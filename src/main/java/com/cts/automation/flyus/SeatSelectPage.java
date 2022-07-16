package com.cts.automation.flyus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeatSelectPage {
	
	public SeatSelectPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='fname-pax-0']")
	public WebElement txtFirst;
	@FindBy(xpath="//input[@id='lname-pax-0']")
	public WebElement txtLastName;
	@FindBy(xpath="//option[text()='Female']")
	public WebElement txtGen;
	@FindBy(xpath="//input[@id='paxes-ADULT-0-dob']")
	public WebElement txtDob;
	@FindBy(xpath="//div[@class='affirm-as-low-as sidebar']")
	public WebElement btnHeading;
	@FindBy(xpath="(//a[text()='Select'])[2]")
	public WebElement btnSupport;
	@FindBy(xpath="//span[text()='I need it!']")
	public WebElement btnPurchase;
	@FindBy(xpath="(//input[@name='flexBooking'])[2]")
	public WebElement btnFlexible;
	@FindBy(xpath="(//input[@name='xservices.AHLP'])[2]")
	public WebElement btnAhlp;
	@FindBy(xpath="(//input[@name='xservices.SMS'])[2]")
	public WebElement btnSms;
	@FindBy(xpath="(//input[@name='xservices.RFND'])[2]")
	public WebElement btnRefund;
	@FindBy(xpath="(//td[@role='button'])[9]")
	public WebElement btnSeat;
	
	public void selectPage(String first, String last,String dob) throws InterruptedException
	{
		txtFirst.sendKeys(first);
		txtLastName.sendKeys(last);
		txtGen.click();
		txtDob.click();
		txtDob.sendKeys(dob);
	}
		public void selectSeat() throws InterruptedException {
		Thread.sleep(2000);
		clickElement(btnHeading);
		clickElement(btnSupport);
		clickElement(btnPurchase);
		clickElement(btnFlexible);
		clickElement(btnAhlp);
		clickElement(btnSms);
		clickElement(btnRefund);
		clickElement(btnSeat);
		
	}

	private void clickElement(WebElement btnSupport2) {
		// TODO Auto-generated method stub
		
	}

	

}
