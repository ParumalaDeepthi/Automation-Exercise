package AutomationExercise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase8 {
	public static void main(String[] args) {
		//configure the browser
				WebDriverManager.chromedriver().setup();
				
				//lauch the browser 
				WebDriver driver=new ChromeDriver();
				
				//navigate to the url
				driver.get("https://automationexercise.com/");
				
				//verify that home page is visible sucessfully
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
				
				//verify user is navigated to ALL PRODUCTS page sucessfully
				System.out.println("navigated to ALL PRODUCTS page sucessfully");
				
				//the product list is visible
				
				//click on view product of first product
				driver.findElement(By.xpath("//a[@href='/product_details/1']")).click();
				
				//user is landed to product detail page
				//verify that detail detail is visible:product name,category,price,availability
				//prodct name
				WebElement productname=driver.findElement(By.xpath("//h2[text()='Blue Top']"));
				if(productname.isDisplayed())
				{
					System.out.println("product name is visible :"+productname.getText());
				}else
				{
					System.out.println("product name is not visible");
				}
				//price
				List<WebElement> price=driver.findElements(By.xpath("//span[text()='Rs. 500']"));
				if(productname.isDisplayed())
				{
					System.out.println("price is visible :"+price.get(0));
				}else
				{
					System.out.println("price is not visible");
				}
				//category
				WebElement category=driver.findElement(By.xpath("//p[text()='Category: Women > Tops']"));
				if(productname.isDisplayed())
				{
					System.out.println("category is visible :"+category.getText());
				}else
				{
					System.out.println("category is not visible");
				}
				//availability
				WebElement availability=driver.findElement(By.xpath("//h2[text()='Blue Top']"));
				if(productname.isDisplayed())
				{
					System.out.println("availability is visible :"+availability.getText());
				}else
				{
					System.out.println("availability is not visible");
				}
				
				
				
				
				
	}

}
