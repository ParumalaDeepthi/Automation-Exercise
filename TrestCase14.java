package AutomationExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TrestCase14 {
	public static void main(String[] args) {
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
				
				//add products to cart
				//click on product button
				driver.findElement(By.xpath("//a[@href='/products']")).click();
				//click on view product of first product and click 'ADD TO CART'
				driver.findElement(By.xpath("//p[text()='Blue Top']")).click();
				driver.findElement(By.xpath("//a[@class='btn btn-default add-to-cart']")).click();
				
				
				//hover over second product and click 'add to cart'
				driver.findElement(By.xpath("//p[text()='Men Tshirt']")).click();
				driver.findElement(By.xpath("//a[@data-product-id='2']")).click();
				
				//continue shopping
				
				
				
				//click cart button
				driver.findElement(By.xpath("//a[@href='/view_cart']")).click();
				//verify that  cart page is displayed
				WebElement cartpage=driver.findElement(By.xpath("//a[@href='/view_cart']"));
				if(cartpage.isDisplayed())
				{
					System.out.println("cartpage is visible :"+cartpage.getText());
				}else
				{
					System.out.println("cartpage is not visible");
				}

				
				//click proceed to checkout
				driver.findElement(By.xpath("//a[@class='btn btn-default check_out']")).click();
				
				//click 'register/login' button
				
				//fill all details in signup and create account
				driver.findElement(By.xpath("//input[@type='email']")).sendKeys("deepthiparamala56@gmail.com");
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys("vishu123");
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				
				//verify 'account created' and click 'continue button'
				System.out.println("account created");
				
				//verify 'logged in as username' at top
				WebElement username=driver.findElement(By.xpath("//i[@class='fa fa-user']"));
				if(username.isDisplayed())
				{
					System.out.println("username is visible :"+username.getText());
				}else
				{
					System.out.println("username is not visible");
				}
				//click cart button
				driver.findElement(By.xpath("//a[@href='/view_cart']")).click();
                //click proceed to checkout button
				driver.findElement(By.xpath("//a[@class='btn btn-default check_out']")).click();
				
				//verify address details and review your order
				WebElement address=driver.findElement(By.xpath("//h2[@class='heading']"));
				if(address.isDisplayed())
				{
					System.out.println("address is visible :"+address.getText());
				}else
				{
					System.out.println("address is not visible");
				}
				WebElement review=driver.findElement(By.xpath("//h2[text()='Review Your Order']"));
				if(review.isDisplayed())
				{
					System.out.println("review is visible :"+review.getText());
				}else
				{
					System.out.println("review is not visible");
				}
				//enter description in comment text area and click place order
				
				
				
				
				
				
				
				
	
	
	}

}
