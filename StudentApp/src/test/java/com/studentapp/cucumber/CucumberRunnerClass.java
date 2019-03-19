package com.studentapp.cucumber;

import net.serenitybdd.cucumber.CucumberWithSerenity;

import org.junit.runner.RunWith;

import com.studentapp.testbase.TestBase;

import cucumber.api.CucumberOptions;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/features/",
		tags="@create_multiple_students"
		
		)
public class CucumberRunnerClass extends TestBase{
	

}
