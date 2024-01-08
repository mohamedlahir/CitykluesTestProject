package com.cityklues.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.html5.WebStorage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.cityklues.pages.LoginPage;

public class LoginTest {
	
	


	LoginPage loginPage;

	private WebDriver driver;

	private String loginPageURL = "https://mvnrepository.com/artifact/org.testng/testng/7.8.0";

	@BeforeTest
	public void browserConfiguration() throws InterruptedException {

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(loginPageURL);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@Test
	public void login() {
		
	}

}
