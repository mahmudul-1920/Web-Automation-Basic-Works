package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class TestFrameElement extends DriverSetup {


    By mouse_hover_section = By.xpath("//button[@id='mousehover']");

    By registration_button = By.xpath("//a[normalize-space()='Register']");

    By iframe = By.id("courses-iframe");

    @Test

    public void testFrame() throws InterruptedException {

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        Actions actions = new Actions(driver);
        actions.scrollByAmount(0, 1000).build().perform();
        System.out.println(driver.findElement(mouse_hover_section).getText());

        driver.switchTo().frame("courses-iframe");
        //driver.switchTo().frame("iframe-name");
        // driver.switchTo().frame(0);
//        WebElement el = getElement(iframe);
//        driver.switchTo().frame(el);

        System.out.println(driver.findElement(registration_button).getText());
//        driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();
        System.out.println(driver.findElement(mouse_hover_section).getText());
        Thread.sleep(3000);

    }

}

