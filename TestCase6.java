package AutomationExercise;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase6 {
public static void main(String[] args) {
	//configure the browser
			WebDriverManager.chromedriver().setup();
			
			//lauch the browser 
			WebDriver driver=new ChromeDriver();
			
			//navigate to the url
			driver.get("https://automationexercise.com/");
			
			//verify that home page is visible sucessfully
			System.out.println("home page is visible sucessfully");
			
			//click on 'contact us' button
			driver.findElement(By.xpath("//a[@href='/contact_us']")).click();
			
			//verify 'get in touch' is visible'
			System.out.println("get in touch' is visible");
			
			//enter name,email,subject,meesage
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("deepu");
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("deepthiparamala56@gmail.com");
			driver.findElement(By.xpath("//input[@data-qa='subject']")).sendKeys("problem with password");
			driver.findElement(By.xpath("//textarea[@data-qa='message']")).sendKeys("its showing wrong password");
			
			//upload file
			WebElement fileuploadpopup=driver.findElement(By.name("//input[@name='upload_file']"));
			fileuploadpopup.sendKeys("mnn");
			//create the object for file class
			File filesource=new File("./Data/DEEPTHICV.pdf");
			//call the nonstatic method---to fetch absolutepath
			String pathoffile=filesource.getAbsolutePath();
			//pass the path of file/Data-----using sendkeys
			fileuploadpopup.sendKeys(pathoffile);
			
			
			//click on submit button
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			
			//click ok button
			driver.switchTo().alert().accept();
			
		
		
			
			//verify success message 'success!your details have been submitted sucessfully' is visible
			System.out.println("success!your details have been submitted sucessfully");
			
			//click 'home' button and verify that landed to home page successfully
			driver.findElement(By.xpath("//a[@class='btn btn-success']")).click();
			System.out.println("landed to home page successfully");
}
}
