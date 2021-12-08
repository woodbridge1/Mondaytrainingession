package ProtrainingTech.AutomstionTrianingCourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

public class facebook {
	
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\brook\\eclipse-workspace\\AutomstionTrianingCourse\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
	driver.navigate().to("https://www.facebook.com");
 Thread.sleep(6000);
 WebElement emailorphone=driver.findElement(By.id("email"));
 	emailorphone.click();
 	WebElement fieldof=driver.findElement(By.name("emkzkskKAKSail"));
 			fieldof.sendKeys                                                                                                     ("chaudry@yahoo.com");
 			
 	WebElement pass=driver.findElement(By.id("pass"));
 		pass.click();
 		WebElement passfield=driver.findElement(By.name("pass") );
 			passfield.sendKeys("123456");
 			
 	//WebElement logbutton=driver.findElement( By.name("login"));
 	//logbutton.click();//
 	//driver.navigate().refresh();
 	//driver.navigate().back();
 	
 	WebElement Forgotpassword=driver.findElement(By.linkText("Forgot password?"));
 	Forgotpassword.click();
 			WebElement phonefield=driver.findElement(By.id("identify_email"));
 			phonefield.sendKeys("7031234567");
 			
 	WebElement searchbutton=driver.findElement(By.name("did_submit"));
 	searchbutton.click();
 	
 	WebElement cancelbutton=driver.findElement(By.linkText("Cancel"));
 		cancelbutton.click();
 		
 	WebElement createaccount=driver.findElement(By.linkText("Create new account"));
 		createaccount.click();
 	
 	WebElement firstname=driver.findElement(By.name("firstname"));
 			firstname.click();
 			firstname.sendKeys("Sarah");
 	WebElement lastname=driver.findElement(By.className("lastname"));
 			//lastname.click();
 			lastname.sendKeys("Malik");
 			
 	WebElement phonenumber=driver.findElement(By.id("u_0_o_WA"));
 	//	phonenumber.click();
 		phonenumber.sendKeys("123456789");
 		
 	WebElement newpass=driver.findElement(By.id("password_step_input"));
 		//newpass.click();
 		newpass.sendKeys("newpassword");
 		
 			
 	
 	
 			
 			
 			
	}			
	
}