package OrangeBasepkg;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class OrangeBaseclass {
public static WebDriver driver;
@BeforeTest
public void setUp()
{
	driver= new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	
}
@AfterTest
public void tearDown() {
    
    if (driver != null) {
        driver.quit();

} 
}
}
	


