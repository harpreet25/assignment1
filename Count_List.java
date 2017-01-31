import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Count_List {
	
 public void count_a()
 {
	 
 
	String url=System.getProperty("user.dir")+"\\src\\geckodriver.exe";
	System.out.println(url);
	
	System.setProperty("webdriver.gecko.driver", url);
	
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/login/");
	
	java.util.List<WebElement>links=driver.findElements(By.tagName("a"));

	System.out.println(links.size());

	for(int i=0; i<links.size();i++)
	{
		
		System.out.println(links.get(i).getText());
	}
 }

	public static void main(String[] args)
	{
		Count_List oo=new Count_List();
		oo.count_a();
		
		
	}

	
}