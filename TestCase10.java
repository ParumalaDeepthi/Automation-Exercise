package AutomationExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase10 {
	public static void main(String[] args) throws InterruptedException {
		//configure the browser
				WebDriverManager.chromedriver().setup();
				
				//launch the browser 
				WebDriver driver=new ChromeDriver();
				
				//navigate to the URL
				driver.get("https://automationexercise.com/");
				
				//verify that home page is visible sucess fully
				String expected_title="https://automationexercise.com/";
				String actual_title=driver.getTitle();
				System.out.println(actual_title);
				//basic validation
				if(expected_title.equals(actual_title)) {
					System.out.println("test is passed");
				}else {
					System.out.println("test case is failed");
				}
				//scroll down to footer
				JavascriptExecutor js=(JavascriptExecutor)driver;
				 js.executeScript("window.scrollBy(0,500)");
				 Thread.sleep(2000);
				 js.executeScript("window.scrollBy(0,500)");
				 
				 //VERIFY TEXT SUBRICPTION
				 WebElement subricption=driver.findElement(By.xpath("//h2[text()='Subscription']"));
					if(subricption.isDisplayed())
					{
						System.out.println("subricption is visible :"+subricption.getText());
					}else
					{
						System.out.println("subricption is not visible");
					}
				//enter email address in input and click arrow button
					driver.findElement(By.xpath("//input[@type='email']")).sendKeys("deepthiparamala56@gmail.com");
					driver.findElement(By.xpath("//i[@class='fa fa-arrow-circle-o-right']")).click();
					
					//verify success message'you have been success fully subscribed ' is visible
					System.out.println("you have been success fully subscribed ' is visible");
				
	}

}
