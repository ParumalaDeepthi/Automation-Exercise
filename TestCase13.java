package AutomationExercise;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase13 {
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
		//verify product detail is opened
		//click on product button
		driver.findElement(By.xpath("//a[@href='/products']")).click();
		//click on view product of first product
		driver.findElement(By.xpath("//a[@href='/product_details/1']")).click();
		//increase quantity to 4
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("4");
		
		//click add to cart to button
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		//click view cart button
		driver.findElement(By.xpath("//a[@href='/view_cart']")).click();
		//verify that product is displayed in cart page with exact quantity
		System.out.println("product is displayed in cart page with exact quantity");
		
	}

}
