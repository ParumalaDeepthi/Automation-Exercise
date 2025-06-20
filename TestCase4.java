package AutomationExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase4 {
	public static void main(String[] args) {
		//configure the browser
		WebDriverManager.chromedriver().setup();
		
		//launch the browser 
		WebDriver driver=new ChromeDriver();
		
		//navigate to the url
		driver.get("https://automationexercise.com/");
		 
	   //verify the home page is displayed
		String expected_title="https://automationexercise.com/";
		String actual_title=driver.getCurrentUrl();
		
		//basic validation
		if(expected_title.equals(actual_title)) {
			System.out.println("test is passed");
		}else {
			System.out.println("test is failed");
		}
		//click on the sign up button or login button
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		 
		//verify 'login to your account' is visible
		System.out.println("login account is visible");
		 
		//enter correct email and address
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("deepthiparamala56@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("vishu123");
		
		//click login button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//verify that 'logged in as user name' is visible
		System.out.println( "logged in as username");
		
		//click on logout button
		driver.findElement(By.xpath("//a[@href='/logout']")).click();
		
		//verify that user is navigated to login page
		System.out.println("user is navigated to login page");
		

		
	}

}
