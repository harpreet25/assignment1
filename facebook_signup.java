import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class facebook_signup {
	
	public static void main(String[] args) {
		
		String url=System.getProperty("user.dir")+"\\src\\geckodriver.exe";
		System.out.println(url);
		
		System.setProperty("webdriver.gecko.driver", url);
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("u_0_1")).sendKeys("admin");
		driver.findElement(By.id("u_0_3")).sendKeys("test");
		driver.findElement(By.id("u_0_6")).sendKeys("harpreet@gmail.com");
		driver.findElement(By.id("u_0_9")).sendKeys("harpreet@gmail.com");

		driver.findElement(By.id("u_0_b")).sendKeys("harpreet@gmail.com");
		driver.findElement(By.id("u_0_9")).sendKeys("admin12345");	
		driver.findElement(By.id("day")).sendKeys("25");
		driver.findElement(By.id("month")).sendKeys("Feb");
		driver.findElement(By.id("year")).sendKeys("1993");
		driver.findElement(By.id("u_0_j")).click();
		driver.findElement(By.id("u_0_f")).click();
		
		
	}

}
