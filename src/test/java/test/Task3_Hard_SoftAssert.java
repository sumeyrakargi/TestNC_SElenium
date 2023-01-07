package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.BaseTest;
/*Test Case1: Positive Login Test
    Open page https://practicetestautomation.com/practice-test-login/
    Type username student into Username field
    Type password Password123 into Password field
    Puch Submit button.
            Verify new page URL contains practicetestautomation.com/logged-in-successfully/
    Verify new page contains expected text ('Congratulations' or 'successfully logged in')
    Verify button Log out is displayed on the new page*/


public class Task3_Hard_SoftAssert extends BaseTest {
   @Test
    public void test(){
       //Open page https://practicetestautomation.com/practice-test-login/
       driver.get("https://practicetestautomation.com/practice-test-login/");
       // Type username student into Username field
       driver.findElement(By.id("username")).sendKeys("student");
       //Type password Password123 into Password field
       driver.findElement(By.id("password")).sendKeys("Password123");
       //Puch Submit button.
       WebElement button = driver.findElement(By.id("submit"));
       button.click();
      SoftAssert softAssert=new SoftAssert();
       //Verify new page URL contains practicetestautomation.com/logged-in-successfully/
       softAssert.assertTrue(driver.getCurrentUrl().contains("practicetestautomation.com/logged-in-successfully/"));
      //Verify new page contains expected text ('Congratulations' or 'successfully logged in')
       WebElement body=driver.findElement(By.tagName("body"));
       softAssert.assertTrue(body.getText().contains("Congratulations")||body.getText().contains("successfully logged in"));
       //Verify button Log out is displayed on the new page*/
       Assert.assertTrue(driver.findElement(By.xpath("//a[text()=\"Log out\"]")).isDisplayed());
   }

}
