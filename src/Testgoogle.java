import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;




public class Testgoogle {
	
	
	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Selenium Softwares/chromedriver.exe");
		 //WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://localhost:100/");
		 driver.findElement(By.name("Login")).click();
	}
	
	 
	 

}
