import java.util.List;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class check_elements {
	
	static WebElement username;
	WebElement password;
	public void check()
	{
	
		String url=System.getProperty("user.dir")+"\\src\\geckodriver.exe";
		System.out.println(url);
		
		System.setProperty("webdriver.gecko.driver", url);
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
	username=driver.findElement(By.id("email"));
	if (username.isDisplayed())
	{
		System.out.println("USer Field is available");
		
	}
	else
	{
		System.out.println("User field is not available");
	}
	}
	
	public void check_box()
	{
		
		String url=System.getProperty("user.dir")+"\\src\\geckodriver.exe";
		System.out.println(url);
		
		System.setProperty("webdriver.gecko.driver", url);
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		List<WebElement> boxes =
         driver.findElements(By.xpath("//input[@type='checkbox']"));
       for(int i=0;i<boxes.size();i++)
       {
         System.out.println("No of check boxes are:"+boxes.size()); 
       }
		
	}
	
	public void drop()
	{
		//String url=System.getProperty("user.dir")+"\\src\\geckodriver.exe";
		//System.out.println(url);
		
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println("opening Facebook");
		List<WebElement> abc= driver.findElements(By.tagName("select"));
		System.out.println("drop down");
		  for(int i=0;i<abc.size();i++)
	       {
			  System.out.println(abc.get(i).getText());
	       }
			
		}
	
		
	
	public static void main(String[] args) {
		
		check_elements ab= new check_elements();
		//ab.check();
		//ab.check_box();
		ab.drop();
		
	}

}
