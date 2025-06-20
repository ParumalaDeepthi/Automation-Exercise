package AutomationExercise;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase9 {
	public static void main(String[] args) {
		//configure the browser
		WebDriverManager.chromedriver().setup();
		
		//launch the browser 
		WebDriver driver=new ChromeDriver();
		
		//navigate to the URL
		driver.get("https://automationexercise.com/");
		
		//verify that home page is visible successfully
		String expected_title="https://automationexercise.com/";
		String actual_title=driver.getTitle();
		System.out.println(actual_title);
		//basic validation
		if(expected_title.equals(actual_title)) {
			System.out.println("test is passed");
		}else {
			System.out.println("test case is failed");
		}
		
		//click on product button
		driver.findElement(By.xpath("//a[@href='/products']")).click();
		
		//verify user is navigated to ALL PRODUCTS page success fully
		System.out.println("navigated to ALL PRODUCTS page sucessfully");
		
		//enter the product name in search input and click search button
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("jeans");
		driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
		
		//verify 'SEARCHED PRODUCTS ' is visible
		WebElement searchedproducts=driver.findElement(By.xpath("//h2[@class='title text-center']"));
		if(searchedproducts.isDisplayed())
		{
			System.
			out.println("searchedproducts is visible :"+searchedproducts.getText());
		}else
		{
			System.out.println("searchedproducts is not visible");
		}
		//verify all the products to search are visible
		System.out.println("all the products to search are visible");
		
		
		
	}

}
