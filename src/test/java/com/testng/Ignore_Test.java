package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Test {
	
	// Way 1

	@Ignore
	@Test(priority = 1)
	public void facebookLogin() {
		System.out.println("Fac Login");
	}

	@Test(priority = 4)
	public void myntraLogin() {
		System.out.println("Myn Login");
	}

	// Way 2
	@Test(priority = -2, enabled = false)
	public void amazonLogin() {
		System.out.println("AMa Login");
	}

	@Test(priority = 5)
	public void meeshoLogin() {
		System.out.println("Mee Login");
	}

	@Test(priority = 0)
	public void instaLogin() {
		System.out.println("Ins Login");
	}

}
