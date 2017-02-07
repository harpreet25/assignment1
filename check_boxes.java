import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class check_boxes {
	
	public void check_box()
	{
		
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\geckodriver.exe");
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
	
	public static void main(String[] args) {
		
		
		check_boxes abc=new check_boxes();
		abc.check_box();
		
	}

}
