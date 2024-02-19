package com.testng;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Grouping {
	
	@Test(groups = "a")
	public void facebookLogin() {
		System.out.println("Fac Login");
	}

	@Test(groups = "b")
	public void myntraLogin() {
		System.out.println("Myn Login");
	}

	@Test(groups = "a")
	public void amazonLogin() {
		System.out.println("AMa Login");
	}

	@Test(groups = "b")
	public void meeshoLogin() {
		//Assert.fail();
		System.out.println("Mee Login");
	}

	@Test(groups = {"a","b"})
	public void instaLogin() {
		System.out.println("Ins Login");
	}

}
