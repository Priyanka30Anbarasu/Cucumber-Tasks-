package com.cts.automation.flyus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cts.automation.base.BaseClass;

public class SearchResultPage {
	public SearchResultPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//span[text()='Select'])[1]")
	public WebElement btnSelect;

	public void select()
	{		
		WebDriverWait wait = new WebDriverWait(BaseClass.driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[@class='thumb'])[1]"))).click();
		btnSelect.click();
	}
}
