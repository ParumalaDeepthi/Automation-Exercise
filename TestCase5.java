package AutomationExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase5 {
	public static void main(String[] args) {
		//configure the browser
		WebDriverManager.chromedriver().setup();
		
		//lauch the browser 
		WebDriver driver=new ChromeDriver();
		
		//navigate to the url
		driver.get("https://automationexercise.com/");
		
		
		
		
	//click on the signup button or login button
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		//verify new user sign in visible
		System.out.println("new user sign in");
		//name
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vishu");
		//email
		driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("deepthiparamala56@gmail.com");
		//sign up
		driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();
		
		//verify error 'email address already exists' is visible
		System.out.println("email address already exists ");
		
		
	}

}
