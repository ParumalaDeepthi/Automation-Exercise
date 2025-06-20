package AutomationExercise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase12 {
	public static void main(String[] args) {
		//configure the browser
		WebDriverManager.chromedriver().setup();
		
		//launch the browser 
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
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
		//click on product button
		driver.findElement(By.xpath("//a[@href='/products']")).click();
		//click on view product of first product and click 'ADD TO CART'
		driver.findElement(By.xpath("//p[text()='Blue Top']")).click();
		driver.findElement(By.xpath("//a[@class='btn btn-default add-to-cart']")).click();
		
		//click 'continue shopping' button
		driver.findElement(By.xpath("//button[@class='btn btn-success close-modal btn-block']")).click();
		
		//hover over second product and click 'add to cart'
		driver.findElement(By.xpath("//p[text()='Men Tshirt']")).click();
		driver.findElement(By.xpath("//a[@data-product-id='2']")).click();
		//click 'view cart ' button
		driver.findElement(By.xpath("//u[text()='View Cart']")).click();
		
		//verify both products are added to cart
		WebElement productincart=driver.findElement(By.xpath("//li[@class='active']"));
		if(productincart.isDisplayed())
		{
			System.out.println("products is visible :"+productincart.getText());
		}else
		{
			System.out.println("products is not visible");
		}
		//verify their prices,quantity and total price
		//price
		List<WebElement> price=driver.findElements(By.xpath("//td[@class='price']"));
		for (int i = 0; i <price.size() ; i++) {
			price.get(i).getText();
		}
		
		if((WebElement)
		{
			System.out.println("price is visible :"+price.get(0));
		}else
		{
			System.out.println("price is not visible");
		}
		
		//quantity
		
		//List<WebElement> quantity=driver.findElement(By.xpath("//td[@class='quantity']"));
		if(((WebElement) quantity).isDisplayed())
		{
			System.out.println("quantity is visible :"+getText());
		}else
		{
			System.out.println("quantity is not visible");
		}
		
		//total price
		WebElement totalprice=driver.findElement(By.xpath("//td[@class='total']"));
		if(totalprice.isDisplayed())
		{
			System.out.println("totalprice is visible :"+totalprice.getText());
		}else
		{
			System.out.println("totalprice is not visible");
		}
		
	}


}
