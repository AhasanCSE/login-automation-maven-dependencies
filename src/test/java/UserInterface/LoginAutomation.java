package UserInterface;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.java.swing.plaf.windows.resources.windows;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginAutomation {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		
		//driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.close();
		
		
		
	}
	
}
