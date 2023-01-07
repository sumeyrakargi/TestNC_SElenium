package test;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import utilities.BaseTestReport;

public class Day05_C01_HTMLReport extends BaseTestReport {
    @Test
    public void test01(){
        extentTest = extentReports.createTest("test01");
        driver.get("https://www.google.com/");
        Assert.fail();
    }

    @Test
    public void test02(){
        extentTest = extentReports.createTest("test02");
        driver.get("https://www.google.com/");

    }


    }


