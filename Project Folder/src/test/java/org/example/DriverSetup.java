package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class DriverSetup {

    WebDriver driver;

    //open a browser
    @BeforeSuite
    public void openABrowser(){

        driver = new ChromeDriver();
    }


    //close a browser
    @AfterSuite
    public void closeBrowser(){

        driver.quit();

    }

    public WebElement getElement(By locator){
        return driver.findElement(locator);
    }

    public void clickOnElement(By locator){
        getElement(locator).click();
    }

}
