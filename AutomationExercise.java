+package AutomationExercise;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationExercise {

public static void main(String[] args) {
	
 
	//configure the browser
	WebDriverManager.chromedriver().setup();
	
	//lauch the browser 
	WebDriver driver=new ChromeDriver();
	
	//navigate to the url
	driver.get("https://automationexercise.com/");
	
	
	
	
//click on the signup button or login button
	driver.findElement(By.xpath("//a[@href='/login']")).click();
	//name
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Deepthi");
	//email
	driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("deepthiparamala12@gmail.com");
	//sign up
	driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();
	//gender
	driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
	//password
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Deepu@123");
	//day
	driver.findElement(By.xpath("//select[@data-qa='days']")).sendKeys("5");
	//month
	driver.findElement(By.xpath("//select[@data-qa='months']")).sendKeys("March");
	//year
	driver.findElement(By.xpath("//select[@data-qa='years']")).sendKeys("2003");
	//check box
	driver.findElement(By.xpath("//input[@id='newsletter']")).click();
	//first name
	driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Deepthi");
	//last name
	driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("paramala");
	//company
	driver.findElement(By.xpath("//input[@id='company']")).sendKeys("Qspiders");
	//address1
	driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("kphb");
	//address2
	driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("gadwal");
	//country
	driver.findElement(By.xpath("//select[@id='country']")).sendKeys("India");
	//state
	driver.findElement(By.xpath("//input[@id='state']")).sendKeys("telangana");
	//city
	driver.findElement(By.xpath("//input[@id='city']")).sendKeys("hyderabad");
	//zipcode
	driver.findElement(By.xpath("//input[@id='zipcode']")).sendKeys("500098");
	//mobile number
	driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("9392338384");
	//create account
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	//contiune
	driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();
	//delete account
	driver.findElement(By.xpath("//a[@href='/delete_account']")).click();
	//continue
	driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();
	//close the page
	driver.close();
	
	
	
}
}

