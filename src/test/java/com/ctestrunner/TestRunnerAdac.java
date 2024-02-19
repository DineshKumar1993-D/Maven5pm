package com.ctestrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.baseclass.Base___Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactintestfeature", 
					 glue = "com.bsteptest",
					 plugin={"pretty",
							 "html:Reports/Cucumber_Html_Report",
							 "json:Reports/Cucumber_json_Report.json",
							 "com.cucumber.listener.ExtentCucumberFormatter:Reports/Extent_Report.html"},
							 
				monochrome=true,
				//strict=true,
			//	dryRun=true,
				tags={"@smoketest"}
				)
public class TestRunnerAdac extends Base___Class {

	@BeforeClass
	public static void setUp() {

		 browserLaunch("chrome");

	}

	@AfterClass
	public static void tearDown() {

		// Close Browser or delete cookies

	}
}
