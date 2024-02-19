package com.testng;

import org.testng.annotations.Test;

public class ExpectedException {

	@Test(expectedExceptions = ArithmeticException.class)
	public void myntraLogin() throws InterruptedException {

		int a = 10 / 0;
		System.out.println(a);
		System.out.println("Myn Login");
	}

	@Test
	public void amazonLogin() {
		System.out.println("AMa Login");
	}

	@Test
	public void meeshoLogin() throws InterruptedException {
		// Assert.fail();
		Thread.sleep(1500);
		System.out.println("Mee Login");
	}

	@Test
	public void instaLogin() {
		System.out.println("Ins Login");
	}

}
