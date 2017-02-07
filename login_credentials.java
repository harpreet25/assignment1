import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class login_credentials {
	
	public void login()
	{
		
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("dasharivallabh@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("test12345");
		driver.findElement(By.id("u_0_o")).click();
	}
	
	public static void main(String[] args) {
		
		login_credentials ab= new login_credentials();
		ab.login();
		
	}

}
