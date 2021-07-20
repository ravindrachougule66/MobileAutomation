

	
	
	//package <set your test package>;
	import io.appium.java_client.remote.AndroidMobileCapabilityType;
	import io.appium.java_client.android.AndroidDriver;
	import io.appium.java_client.android.AndroidElement;
	import io.appium.java_client.TouchAction;
	import java.time.Duration;
	import io.appium.java_client.remote.MobileCapabilityType;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.openqa.selenium.By;
	import org.testng.annotations.*;
	import java.net.URL;
	import java.net.MalformedURLException;
	import java.util.logging.Level;

	public class Sampledemo {
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
	        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.selendroid.testapp");
	        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".HomeScreenActivity");
	        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
	        driver.setLogLevel(Level.INFO);
	    }

	    @Test
	    public void testUntitled() throws InterruptedException {
	    	
	    	//driver.findElement(By.xpath("//*[@id='my_text_field']")).sendKeys("Hello");
	    	driver.findElement(By.xpath("//*[@id='startUserRegistration']")).click();
	    	Thread.sleep(5000);


	    }

	    @AfterMethod
	    public void tearDown() {
	     //   driver.quit();
	    }
	}


