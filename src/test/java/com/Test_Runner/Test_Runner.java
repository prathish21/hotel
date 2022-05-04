package com.Test_Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.Cucumber_Frame.BaseClass;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\Feature_File" , glue = "com.Step_Definition" ,
			monochrome = true, dryRun = false, strict = true,
			//tags = ("@logout"),
            plugin = {"html:Report" , "json:Report/adact.json" , "pretty",
            		"com.cucumber.listener.ExtentCucumberFormatter:Report/Adactin.html"})
public class Test_Runner {
	
	public static WebDriver driver;
	@BeforeClass
	public static void setUp() {
		
		driver = BaseClass.browserLaunch("chrome");
	}
	
	@AfterClass
	public static void tear_Down() {
		
		BaseClass.closeBrowser();
	}

}
