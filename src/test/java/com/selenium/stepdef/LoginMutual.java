package com.selenium.stepdef;



	
	import org.junit.Assert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
	import io.github.bonigarcia.wdm.WebDriverManager;

	public class LoginMutual {

		WebDriver w;

		@Given("Browser should be with login page")
		public void browser_should_be_with_login_page() {

			WebDriverManager.chromedriver().setup();
			w = new ChromeDriver();
			w.get("https://demo.testfire.net/login.jsp");
		}

		@When("User should logs in using Username and Password")
		public void user_should_logs_in_using_username_and_password() {

			w.findElement(By.id("uid")).clear();
			w.findElement(By.id("uid")).sendKeys("admin");

			w.findElement(By.id("passw")).clear();
			w.findElement(By.id("passw")).sendKeys("admin");

		}

		@When("Click on Login button")
		public void click_on_login_button() {

			w.findElement(By.name("btnSubmit")).click();

		}

		@Then("Home Page should get open and verify page title.")
		public void home_page_should_get_open_and_verify_page_title() throws Exception {

			Thread.sleep(2000);

			String pageTitle = w.getTitle();

			Assert.assertEquals("Altoro Mutual", pageTitle);
		}

		@Then("Close browser")
		public void close_browser() {

			w.quit();
		}


}
