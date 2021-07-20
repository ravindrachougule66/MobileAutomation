
//package <set your test package>;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.testng.annotations.*;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.logging.Level;

public class Eribank {
  private String reportDirectory = "reports";
  private String reportFormat = "xml";
  private String testName = "Untitled";
  protected AndroidDriver<AndroidElement> driver = null;

  DesiredCapabilities dc = new DesiredCapabilities();
  
  @BeforeMethod
  public void setUp() throws MalformedURLException {
      dc.setCapability("reportDirectory", reportDirectory);
      dc.setCapability("reportFormat", reportFormat);
      dc.setCapability("testName", testName);
      dc.setCapability(MobileCapabilityType.UDID, "RZ8N82YLQ5V");
      dc.setCapability(MobileCapabilityType.APP, "C:\\Users\\Ravindra\\AppData\\Roaming\\appiumstudio\\apk\\com.experitest.ExperiBank.LoginActivity.2.apk");
      dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.experitest.ExperiBank");
      dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".LoginActivity");
      dc.setCapability(MobileCapabilityType.NO_RESET, true);
      dc.setCapability("instrumentApp", true);
      driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
      driver.setLogLevel(Level.INFO);
  }

  @Test
  public void testUntitled() throws InterruptedException { 
      driver.findElement(By.xpath("//*[@id='usernameTextField']")).click();
      //Thread.sleep(5000);
      driver.findElement(By.xpath("//*[@id='usernameTextField']")).sendKeys("company");
      Thread.sleep(5000);
      driver.findElement(By.xpath("//*[@id='passwordTextField']")).click();
     //Thread.sleep(5000);
      driver.findElement(By.xpath("//*[@id='passwordTextField']")).sendKeys("company");
      Thread.sleep(5000);
      //driver.findElement(By.xpath("//*[@text='Login']")).click();
     // Thread.sleep(5000);
      driver.findElement(By.xpath("//*[@id='loginButton']")).click();
      Thread.sleep(5000);
      //driver.findElement(By.xpath("//*[@id='logoutButton']")).click();
      //Thread.sleep(5000);
  }

  @AfterMethod
  public void tearDown() {
      driver.quit();
  }
}