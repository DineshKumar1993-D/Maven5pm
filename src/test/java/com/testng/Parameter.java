package com.testng;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.baseclass.Base___Class;
import com.pageobjectmanager.PageObjectManager5Pm;

public class Parameter extends Base___Class {
	
	public static PageObjectManager5Pm pom;
	
	@BeforeClass
	public void browse() {
		
		browserLaunch("chrome");
		launchUrl("https://www.facebook.com/login/");
	}
	
	@Parameters({"Usernam","Passwor"})
	@Test
	public void login(@Optional("Selenium") String username,@Optional("564564") String password) {
		
//		driver.findElement(By.id("email")).sendKeys(username);
//		driver.findElement(By.id("pass")).sendKeys(password);
//		driver.findElement(By.id("loginbutton")).click();
		
		 
		 
		sendValues(pom.getLoginadac().getUsername(), username);
	}

}
