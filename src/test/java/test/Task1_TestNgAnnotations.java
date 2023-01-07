package test;

import org.testng.annotations.*;
/*Create a class.
    Create 2 test methods.
    Use TestNG annotations that can be used in the class.
    Interpret output in console.*/

public class Task1_TestNgAnnotations {
    @Test
    public void Test01() {
        System.out.println("--->Test01 den selamlar<---");
    }
    @Test
    public void Test02() {
        System.out.println("--->Test02 den selamlar---<");
    }
    @BeforeTest
    public void beforeTest() {
        System.out.println("BeforeTest den selamlar");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("AfterTest den selamlar");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("BeforeMethod dan selamlar");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("AfterMethod dan selamlar");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("BeforeClass dan selamlar");
    }
    @AfterClass
    public void afterClass() {
        System.out.println("AfterClass dan selamlar");
    }
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("BeforeSuite den selamlar");
    }
    @AfterSuite
    public void afterSuite() {
        System.out.println("AfterSuite den selamlar");
    }
/*----------------------------------------------------
BeforeSuite den selamlar
BeforeTest den selamlar
BeforeClass dan selamlar
BeforeMethod dan selamlar
--->Test01 den selamlar<---
AfterMethod dan selamlar
BeforeMethod dan selamlar
--->Test02 den selamlar---<
AfterMethod dan selamlar
AfterClass dan selamlar
AfterTest den selamlar
AfterSuite den selamlar

 */

}