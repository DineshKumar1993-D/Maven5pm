package com.baseclass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base___Class {

	public static WebDriver driver;

	public static void browserLaunch(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\pdine\\eclipse-workspace\\CHEMaven5Pm\\Driver121\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("edge")) {

			System.setProperty("webdriver.chrome.driver", "path od edge driver");
			driver = new EdgeDriver();
		}

	}

	public static void launchUrl(String url) {

		driver.get(url);

	}

	public static void sendValues(WebElement element, String value) {

		element.sendKeys(value);
	}

	public static void clickOnElement(WebElement element) {
		
		element.click();
	}
	
	public static void printScreen(String filename) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destin=new File
				("C:\\Users\\pdine\\eclipse-workspace"
						+ "\\CHEMaven5Pm\\target\\"+filename+".png");
		FileUtils.copyFile(source, destin);
	}
	
	
}
