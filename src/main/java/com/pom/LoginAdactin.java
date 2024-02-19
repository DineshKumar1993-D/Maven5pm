package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginAdactin {
	
	public WebDriver driver;

	// Declare the element as private by using
	// @FindBy annotation
	// Generate the getters
	// Create constructor and 
			//Using pagfactory to initialize the element and driver

	// WebElement element = driver.findElement(By.locator("value"));
	// xpath("//a[@id='username']"

	@FindBy(id = "username")
	private WebElement username;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(id = "login")
	private WebElement loginbutton;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
	public LoginAdactin(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(this.driver, this);
	}

}
