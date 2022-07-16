package com.cts.automation.flyus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrintPrice {
	public PrintPrice(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//span[@id='flyus-grand-total'])[2]")
	public WebElement txtPrice;
	
	public void price()
	{
		System.out.println("Sales Total = " + txtPrice.getText());
	}
}
