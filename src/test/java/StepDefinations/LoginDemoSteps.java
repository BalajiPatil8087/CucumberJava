package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDemoSteps 
{
	WebDriver driver=null;
	
/*	@Given("browser is open")
	public void browser_is_open() 
	{
       System.out.println("Inside Step- browser is open");
		
		String ProjectPath= System.getProperty("user.dir");
		System.out.println("Project path is :"+ProjectPath);
		
		System.setProperty("Webdriver.edge.driver", ProjectPath+"/src/test/resources/drivers/msedgedriver.exe");
		driver= new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();    
	}*/

	@And("user is on login page")
	public void user_is_on_login_page() 
	{
	   driver.navigate().to("");
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() 
	{
	    
	}
	
	@And("user clicks on login")
	public void user_clicks_on_login() 
	{
	   
	}

	@Then("user navigated to home page")
	public void user_navigated_to_home_page() 
	{
	    
	}




}
