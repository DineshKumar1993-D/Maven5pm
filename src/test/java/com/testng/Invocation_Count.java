package com.testng;

import org.testng.annotations.Test;

public class Invocation_Count {
	
	@Test(priority = 1)
	public void facebookLogin() {
		System.out.println("Fac Login");
	}

	@Test(priority = 4,invocationCount = 2)
	public void myntraLogin() {
		System.out.println("Myn Login");
	}

	@Test(priority = -2)
	public void amazonLogin() {
		System.out.println("AMa Login");
	}

	@Test(priority = 5,invocationCount = 3)
	public void meeshoLogin() {
		System.out.println("Mee Login");
	}

	@Test(priority = 0)
	public void instaLogin() {
		System.out.println("Ins Login");
	}

}
