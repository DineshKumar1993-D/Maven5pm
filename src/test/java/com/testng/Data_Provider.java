package com.testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseclass.Base___Class;
import com.pageobjectmanager.PageObjectManager5Pm;

public class Data_Provider extends Base___Class {
	public static PageObjectManager5Pm pom;

	@BeforeClass
	public void browse() {

		browserLaunch("chrome");
		launchUrl("https://adactinhotelapp.com/");
	}

	@Test(dataProvider = "testdata")
	public void login(String username, String password) {
		pom = new PageObjectManager5Pm(driver);

		sendValues(pom.getLoginadac().getUsername(), username);
		sendValues(pom.getLoginadac().getPassword(), password);
		clickOnElement(pom.getLoginadac().getLoginbutton());

	}

	@DataProvider(name="testdata")
	public Object[][] testData() {

		return new Object[][] { 
				{ "dhgdh", "hdfdsjfh" },

				{ "dhjdshj", "3247673987" },

				{ "djkhkj", "34876743" }

		};
	}

}
