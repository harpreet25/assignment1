import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class gmail {
	static String get_Title;
	
	
	public static void main(String[] args) throws InterruptedException  {
		String url=System.getProperty("user.dir")+"\\src\\geckodriver.exe";
		System.out.println(url);
		
		System.setProperty("webdriver.gecko.driver", url);
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/ServiceLogin?sacu=1&scc=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&hl=en&service=mail#identifier");
		driver.getTitle();
		get_Title=driver.getTitle();
		if(get_Title.equals("gmail"))
		{
			System.out.println("success");
			
		}
		driver.findElement(By.name("Email")).sendKeys("dasharivallabh");
		driver.findElement(By.id("next")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("Passwd")).sendKeys("12345");
		driver.findElement(By.id("signIn")).click();
		
		

	}
}
