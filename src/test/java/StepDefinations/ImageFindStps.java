package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.sikuli.script.FindFailed;
//import org.sikuli.script.Pattern;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.cucumber.java.en.Given;




public class ImageFindStps
{

	@Given("open the browser")
	public void open_the_browser() throws FindFailed, InterruptedException 
	{
		 EdgeDriver driver = new EdgeDriver();
         driver.manage().window().maximize();
       
         driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
         

         driver.switchTo().newWindow(WindowType.TAB);

         //driver.url = "https://www.flipkart.com/";
         
         driver.get("https://www.youtube.com/watch?v=OtQAMoXYqes");
        // Thread.sleep(500);

         /*
         driver.findElement(By.name("q")).sendKeys("sunglasses for men");
         driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
         //Thread.Sleep(1000);
         driver.findElement(By.xpath("//option[text()='Min']")).click();

         driver.findElement(By.xpath("//option[text()='₹2000']")).click();

         Thread.sleep(500);

         driver.findElement(By.xpath("//input[@placeholder='Search Brand']")).sendKeys("john jacobs");
         driver.findElement(By.xpath("//input[@placeholder='Search Brand']")).sendKeys(Keys.ENTER);

         driver.findElement(By.xpath("//input[@value='john jacobs']")).click();

         driver.findElement(By.xpath("(//input[@type='checkbox']/following::div[text()='john jacobs'][1])")).click();

         JavascriptExecutor jse = (JavascriptExecutor)driver;
         jse.executeScript("window.scrollBy(0,1000)");

         Thread.sleep(1000);

         driver.findElement(By.xpath("//div[text()='Lens Color']")).click();
         

         driver.findElement(By.xpath("//div[text()='Grey']")).click();

         JavascriptExecutor jsee = (JavascriptExecutor)driver;
         jsee.executeScript("window.scrollBy(0,1000)");

         Thread.sleep(1000);
         System.out.println("present");*/
         Screen screen = new Screen();
         Pattern loginlink = new Pattern("C:\\Users\\patilbs\\Desktop\\CucumberJava\\target\\Play.png");
         System.out.println("present1");
         screen.wait(loginlink,2000);
         System.out.println("present1.1");
         screen.click();
        //screen.click();
        //screen.click();
        Thread.sleep(4000);
       // Screen screen1 = new Screen();
        System.out.println("present1");
        Pattern loginlink1 = new Pattern("C:\\Users\\patilbs\\Desktop\\CucumberJava\\target\\Volume.png");
        System.out.println("present2");
        screen.wait(loginlink1,500);
        System.out.println("present3");
        screen.click();
        screen.click();
         System.out.println("present1");
         if (screen.exists(loginlink1) != null)
         {
        	System.out.println("present");
        	// screen.doubleClick();
        
        }else
        {
        	System.out.println("test case fail");
        }
        // System.out.println("present2");
         


	}
}

