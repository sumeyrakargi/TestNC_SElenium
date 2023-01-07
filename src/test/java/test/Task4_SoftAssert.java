package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.BaseTest;
/*Test Case2: Negative Username Test
        Open page https://practicetestautomation.com/practice-test-login/
        Type username incorrectUser into Username field.
        Type password Password123 into Password field.
        Puch Submit button.
        Verify error message is displayed.
        Verify error message text is Your username is invalid!*/

public class Task4_SoftAssert extends BaseTest {
    @Test
    public void nativeUsernameTest(){
        driver.get("https://practicetestautomation.com/practice-test-login/");
        //Type username incorrectUser into Username field.
        driver.findElement(By.id("username")).sendKeys("111111");
        //Type password Password123 into Password field
        driver.findElement(By.id("password")).sendKeys("Password123");
        //Puch Submit button.
        WebElement button = driver.findElement(By.id("submit"));
        button.click();
        //Verify error message is displayed.
        SoftAssert softAssert = new SoftAssert();
        WebElement message = driver.findElement(By.id("error"));
        softAssert.assertTrue(message.isDisplayed());
        //Verify error message text is Your username is invalid!
        softAssert.assertTrue(message.getText().contains("Your username is invalid!"));

    }

}
