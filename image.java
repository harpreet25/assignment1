import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class image {
	
	public void imag()
	{
		
	
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://punjab.chitkara.edu.in//Interface/index.php");
		java.util.List<WebElement>links=driver.findElements(By.tagName("img"));

		System.out.println(links.size());

		for(int i=0; i<links.size();i++)
		{
			
			System.out.println(links.get(i).getAttribute("src"));
		}
	 }
	
public static void main(String[] args)
{
	image oo=new image();
	oo.imag();
	
	
}


}

