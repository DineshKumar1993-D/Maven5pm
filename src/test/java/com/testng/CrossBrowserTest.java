package com.testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {

	@Parameters("browser")
	@BeforeClass
	public void browserMethods(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("chrome");
		} else if (browser.equalsIgnoreCase("edge")) {
			System.out.println("edge");
		}

	}

	@Test
	public void login() {
		System.out.println("Facebook");
	}

}
