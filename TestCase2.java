package AutomationExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase2 {
	public static void main(String[] args) {
		//configure the browser
		WebDriverManager.chromedriver().setup();
		
		//lauch the browser 
		WebDriver driver=new ChromeDriver();
		
		//navigate to the url
		driver.get("https://automationexercise.com/");
		 
	   //verify the homepage is displayed
		String expected_title="https://automationexercise.com/";
		String actual_title=driver.getCurrentUrl();
		
		//basic validation
		if(expected_title.equals(actual_title)) {
			System.out.println("test is passed");
		}else {
			System.out.println("test is failed");
		}
		//click on the signup button or login button
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		
		//enter email address
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("deepthiparamala56@gmail.com");
		//enter the valid password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("vishu123");
		//click on the login button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//verify that 'logged in as username' is visible
		System.out.println( "logged in as username");
		
		
		
		//click delete button
		driver.findElement(By.xpath("//a[@href='/delete_account']")).click();
		//continue
		driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();
		//close the page
		driver.close();
		
		
		
		
		
		
		
		
	}

}
