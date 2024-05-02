package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import com.kenai.constantine.platform.WaitFlags;
import org.apache.tools.ant.types.resources.comparators.Exists;

public class ImageFind
{
	public static void main(String[] args) throws InterruptedException, FindFailed
     {

         EdgeDriver driver = new EdgeDriver();
         driver.manage().window().maximize();
       
         driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
         

         driver.switchTo().newWindow(WindowType.TAB);

         //driver.url = "https://www.flipkart.com/";
         
         driver.navigate().to("https://www.flipkart.com/");
         Thread.sleep(500);

         
         driver.findElement(By.name("q")).sendKeys("sunglasses for men");
         driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
         //Thread.Sleep(1000);
         driver.findElement(By.xpath("//option[text()='Min']")).click();

         driver.findElement(By.xpath("//option[text()='₹1000']")).click();

         Thread.sleep(500);

         driver.findElement(By.xpath("//input[@placeholder='Search Brand']")).sendKeys("john jacobs");
         driver.findElement(By.xpath("//input[@placeholder='Search Brand']")).sendKeys(Keys.ENTER);

         driver.findElement(By.xpath("//input[@value='john jacobs']")).click();

         driver.findElement(By.xpath("(//input[@type='checkbox']/following::div[text()='john jacobs'][1])")).click();

         JavascriptExecutor jse = (JavascriptExecutor)driver;
         jse.executeScript("window.scrollBy(0,500)");

         Thread.sleep(1000);

         driver.findElement(By.xpath("//div[text()='Lens Color']")).click();
         

         driver.findElement(By.xpath("//div[text()='Grey']")).click();

         JavascriptExecutor jsee = (JavascriptExecutor)driver;
         jsee.executeScript("window.scrollBy(0,1000)");

         Thread.sleep(1000);
         
         Screen screen = new Screen();
         
         String imagePath = System.getProperty("user.dir") + "\\";
		
         
         System.out.println("Element is present0");
		//Buttons
		 Pattern goggle = new Pattern(imagePath + "C:/Users/patilbs/Desktop/Image/123hg.png");
		// Pattern goggle = new Pattern(screen.getImageFromTarget("C:/Users/patilbs/Desktop/Image/123hg.png"));
		
         
         System.out.println("Element is present1");
             try 
               {
            	   System.out.println("Element is present11");
            	  
            	 screen.wait(goggle, 2000);
            	 //screen.getImageFromTarget("goggle");
            	 System.out.println("Element is present12");
		          screen.click(goggle);
		          screen.click(goggle);
		       } 
            catch (FindFailed e) 
               {
		          e.printStackTrace();
               }
             
            // screen.wait(goggle, 1000);
             
             if (screen.exists("C:/Users/patilbs/Desktop/Image/123hg.png")!=null) 
             {
                 System.out.println("Element is present1.1"); //screen.click(logout);
             }
             else
             {
            	 System.out.println("test case is fail") ;
             }
             
         
     }
}
             
      




/*
    Screen screen = new Screen();
 
   Pattern loginlink = new Pattern("C:/Users/patilbs/Desktop/Image/123hg.png");
   screen.wait(loginlink, 1000);
  
   if (screen.exists("C:/Users/patilbs/Desktop/Image/123hg.png")!=null) {
   System.out.println("Element is present"); //screen.click(logout);
  
 
 */



