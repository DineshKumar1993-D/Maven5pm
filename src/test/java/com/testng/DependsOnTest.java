package com.testng;

import org.junit.Assert;
import org.testng.annotations.Test;

public class DependsOnTest {
	
	@Test(dependsOnMethods = "amazonLogin")
	public void facebookLogin() {
		System.out.println("Fac Login");
	}

	@Test(dependsOnMethods = "meeshoLogin")
	public void myntraLogin() {
		System.out.println("Myn Login");
	}

	@Test(dependsOnMethods = "instaLogin")
	public void amazonLogin() {
		System.out.println("AMa Login");
	}

	@Test
	public void meeshoLogin() {
		Assert.fail();
		//System.out.println("Mee Login");
	}

	@Test(dependsOnMethods = "myntraLogin")
	public void instaLogin() {
		System.out.println("Ins Login");
	}

}


