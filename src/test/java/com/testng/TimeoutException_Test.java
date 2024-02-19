package com.testng;

import org.testng.annotations.Test;

public class TimeoutException_Test {

	@Test(timeOut = 1000)
	public void myntraLogin() throws InterruptedException {
		Thread.sleep(500);
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
