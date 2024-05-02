package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps
{
	WebDriver driver=null;
	
	@Given("browser is open")
	public void browser_is_open() 
	{
		System.out.println("Inside Step- browser is open");
		
		String ProjectPath= System.getProperty("user.dir");
		System.out.println("Project path is :"+ProjectPath);
		
		System.setProperty("Webdriver.edge.driver", ProjectPath+"/src/test/resources/drivers/msedgedriver.exe");
		driver= new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page()
	{
		System.out.println("Inside Step- user is on google search page");
		driver.navigate().to("https://www.google.com/");
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() throws InterruptedException 
	{
		System.out.println("Inside Step- user enters a text in search box");
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		Thread.sleep(2000);
	}

	@And("hits enter")
	public void hits_enter() throws InterruptedException 
	{
		System.out.println("Inside Step- hits enter");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

	@Then("user is navigate to search result")
	public void user_is_navigate_to_search_result() 
	{
		System.out.println("Inside Step- user is navigated to search result");
		driver.getPageSource().contains("Online Course");
		driver.close();
		driver.quit();
	}



}

