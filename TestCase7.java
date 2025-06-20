package AutomationExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase7 {
	public static void main(String[] args) {
		//configure the browser
		WebDriverManager.chromedriver().setup();
		
		//lauch the browser 
		WebDriver driver=new ChromeDriver();
		
		//navigate to the url
		driver.get("https://automationexercise.com/");
		
		//verify that home page is visible sucessfully
		System.out.println("home page is visible sucessfully");
		
		//click on test case button
		driver.findElement(By.xpath("//a[@href='/test_cases']")).click();
		
		//verify user is navigated test case page sucessfully
		System.out.println(" navigated test case page sucessfully");
		
	}

}
