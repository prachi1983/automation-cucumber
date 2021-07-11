package com.selenium.stepdef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CalculatorTest {

	WebDriver w;
	Select sel;

	@Before
	public void preCondition() {
		WebDriverManager.chromedriver().setup();
		w = new ChromeDriver();

	}

	@Given("Application url for testing")
	public void application_url_for_testing() {

		w.get("https://juliemr.github.io/protractor-demo/");

	}

	@When("User should enter two enter and perform Addition operation")
	public void user_should_enter_two_enter_and_perform_addition_operation() {

		w.findElement(By.cssSelector("input[ng-model='first']")).sendKeys("7");

		WebElement operator = w.findElement(By.cssSelector("select[ng-model='operator']"));
		sel = new Select(operator);
		sel.selectByVisibleText("+");

		w.findElement(By.cssSelector("input[ng-model='second']")).sendKeys("3");

		w.findElement(By.id("gobutton")).click();

	}

	@Then("Result should get display and verify output value for Addition.")
	public void result_should_get_display_and_verify_output_value_for_addition() throws Exception {

		Thread.sleep(2000);

		String actualOutput = w.findElement(By.cssSelector("h2.ng-binding")).getText();

		Assert.assertEquals("10", actualOutput);

	}

	@When("User should enter two enter and perform Subtraction operation")
	public void user_should_enter_two_enter_and_perform_subtraction_operation() {

		w.findElement(By.cssSelector("input[ng-model='first']")).sendKeys("4");

		WebElement operator = w.findElement(By.cssSelector("select[ng-model='operator']"));
		sel = new Select(operator);
		sel.selectByVisibleText("-");

		w.findElement(By.cssSelector("input[ng-model='second']")).sendKeys("2");

		w.findElement(By.id("gobutton")).click();

	}

	@Then("Result should get display and verify output value for Subtraction.")
	public void result_should_get_display_and_verify_output_value_for_subtraction() throws Exception {

		Thread.sleep(2000);

		String actualOutput = w.findElement(By.cssSelector("h2.ng-binding")).getText();

		Assert.assertEquals("2", actualOutput);

	}

	@When("User should enter two enter and perform Multiplication operation")
	public void user_should_enter_two_enter_and_perform_multiplication_operation() {

		w.findElement(By.cssSelector("input[ng-model='first']")).sendKeys("3");

		WebElement operator = w.findElement(By.cssSelector("select[ng-model='operator']"));
		sel = new Select(operator);
		sel.selectByVisibleText("*");

		w.findElement(By.cssSelector("input[ng-model='second']")).sendKeys("4");

		w.findElement(By.id("gobutton")).click();

	}

	@Then("Result should get display and verify output value for Multiplication.")
	public void result_should_get_display_and_verify_output_value_for_multiplication() throws Exception {

		Thread.sleep(2000);

		String actualOutput = w.findElement(By.cssSelector("h2.ng-binding")).getText();

		Assert.assertEquals("12", actualOutput);

	}

	@When("User should enter two enter and perform Division operation")
	public void user_should_enter_two_enter_and_perform_division_operation() {

		w.findElement(By.cssSelector("input[ng-model='first']")).sendKeys("4");

		WebElement operator = w.findElement(By.cssSelector("select[ng-model='operator']"));
		sel = new Select(operator);
		sel.selectByVisibleText("/");

		w.findElement(By.cssSelector("input[ng-model='second']")).sendKeys("2");

		w.findElement(By.id("gobutton")).click();

	}

	@Then("Result should get display and verify output value for Division.")
	public void result_should_get_display_and_verify_output_value_for_division() throws Exception {

		Thread.sleep(2000);

		String actualOutput = w.findElement(By.cssSelector("h2.ng-binding")).getText();

		Assert.assertEquals("2", actualOutput);

	}

	@After
	public void postCondition() {

		w.quit();

	}
}

