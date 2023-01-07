package test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilities.BaseCrossBrowserTest;
import utilities.JSUtils;

public class Day06_C02_JSUtils extends BaseCrossBrowserTest {
    @Test
    public void test() throws InterruptedException {

        driver.get("https://www.amazon.com");
        JSUtils.scrollIntoViewJS(driver.findElement(By.partialLinkText("Amazon Ignite")));
        //Debug amaçlı
        Thread.sleep(4000);

        JSUtils.scrollAllUpByJS();
        Thread.sleep(4000);

        JSUtils.flash(driver.findElement(By.id("twotabsearchtextbox")));
        Thread.sleep(4000);
    }

}
