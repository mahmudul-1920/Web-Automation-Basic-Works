package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest extends DriverSetup {

    @Test
    public void testTitle(){

        //load google url
        driver.get("https://web.facebook.com/?_rdc=1&_r");

        //Get Title
        String actualTitle = driver.getTitle();

        //assert actual result with expected result
        Assert.assertEquals(actualTitle, "Facebook – log in or sign up" );

        //System.out.println(actualTitle);
    }

    @Test
    public void testUrl(){

        //load google url
        driver.get("https://web.facebook.com/?_rdc=1&_r");

        //Get Url
        String actualUrl = driver.getCurrentUrl();

        //assert actual result with expected result
        Assert.assertEquals(actualUrl,"https://web.facebook.com/?_rdc=1&_r" );

        //System.out.println(actualTitle);


    }


}
