package com.RunnerClass;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.baseclass.Base_Class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Admin\\eclipse-workspace\\AutomationExercise\\src\\test\\java\\com\\FeatureFile\\Exercise.feature", glue = "com.Step_Definition",

		dryRun = false,

//tags = " @Login",

		plugin = {

				"pretty",

				"html:target/CucumberReport.html",

				"json:target/Cucumber.json",

				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"

		},

		monochrome = false

)

public class Runner_Class extends Base_Class {
	@BeforeClass

	public static void Start() {
		browserLaunch();
		maximize();
	}

	@AfterClass
	public static void end() {
		// driver.quit();
	}

}
