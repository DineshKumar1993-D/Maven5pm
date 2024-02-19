package com.pageobjectmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom.LoginAdactin;

public class PageObjectManager5Pm {

	public WebDriver driver;

	// Declare the object page as private
	// Generate the getters

	private LoginAdactin loginadac;

	public LoginAdactin getLoginadac() {

		loginadac = new LoginAdactin(driver);

		return loginadac;
	}

	public PageObjectManager5Pm(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(this.driver, this);
	}

}
