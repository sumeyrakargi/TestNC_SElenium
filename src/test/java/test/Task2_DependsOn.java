package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
/*Create tests that depend on each other
    Create beforeClass and set up settings.
    By creating interdependent tests;
    First go to Facebook.
    Then go to Google depending on Facebook,
    Then go to Amazon depending on Google
    Close the driver*/

public class Task2_DependsOn {
    WebDriver driver;
    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    public void testFacebook(){
        driver.get("http://www.facebook.com");
    }
    @Test(dependsOnMethods = "testFacebook")
    public void testGoogle(){
        driver.get("http://www.google.com");
    }
    @Test(dependsOnMethods = "testGoogle")
    public void testAmazon(){
        driver.get("http://www.amazon.com");
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
