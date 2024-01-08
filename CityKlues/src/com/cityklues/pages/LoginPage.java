package com.cityklues.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;

	String phoneNumber = "9444409275";

	public LoginPage(WebDriver driver) {

		this.driver = driver;

	}

	By userName = By.id("//input[@id='input-19']");
	
	By password = By.xpath("//div[@class='v-input v-input--hide-details v-input--dense theme--light v-text-field v-text-field--single-line v-text-field--solo-flat v-text-field--filled v-text-field--is-booted v-text-field--enclosed']//div[@class='v-text-field__slot']");
	
	By login = By.xpath("//span[@class='text-capitalize medium-inter-family']");
	
	public void login() {
		
		driver.findElement(userName).sendKeys("admin@klues.ai");
		
		driver.findElement(password).sendKeys("Demo$123");
		
		driver.findElement(login).click();
		
	}
}
