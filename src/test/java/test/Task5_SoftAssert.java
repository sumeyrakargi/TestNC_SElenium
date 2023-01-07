package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.BaseTest;
/*Test Case3: Negative Password Test
        Open page https://practicetestautomation.com/practice-test-login/
        Type username student into Username field.
        Type password incorrectPassword into Password field.
        Puch Submit button.
        Verify error message is displayed.
        Verify error message text is Your password is invalid!*/
public class Task5_SoftAssert extends BaseTest {

    @Test
    public void testSoftAssert(){
        driver.get("https://practicetestautomation.com/practice-test-login/");
        //Type username student into Username field.
        driver.findElement(By.id("username")).sendKeys("student");
        //Type password incorrectPassword into Password field.
        driver.findElement(By.id("password")).sendKeys("1111111");
        //Puch Submit button.
        WebElement button = driver.findElement(By.id("submit"));
        button.click();
        //Verify error message is displayed.
        SoftAssert softAssert = new SoftAssert();
        WebElement message = driver.findElement(By.id("error"));
        softAssert.assertTrue(message.isDisplayed(),"");
        //Verify error message text is Your username is invalid!
        softAssert.assertTrue(message.getText().contains("Your password is invalid!"));
    }

}
