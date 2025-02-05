package org.example;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class ExampleTestNG extends  DriverSetup{

    @Test (priority = 0)

    public void testCase2(){
        System.out.println("This is a normal test case 2!");
    }

    @Test (priority = 1)
    public void testCase1(){
        System.out.println("This is a normal test case 1!");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("This will execute before every method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("This will execute after every method");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("This will the execute before the class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("This will execute after the class");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("This will execute before the test");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("This will execute after the test");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("This will execute before the test suite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("This will execute after the test suite");
    }

    @Test
    public void testAssertion(){
        SoftAssert softAssert = new SoftAssert();

        System.out.println("sendKeys");
        Assert.assertEquals("one", "one");

        System.out.println("click");
        softAssert.assertEquals("one", "two");

        System.out.println("visible");
        System.out.println("enable");
        softAssert.assertTrue(true);
        System.out.println("click");

        softAssert.assertAll();
    }


}
