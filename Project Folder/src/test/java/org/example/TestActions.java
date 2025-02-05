package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.naming.ldap.Control;

public class TestActions extends DriverSetup{

    By mouse_hover_section = By.xpath("//button[@id='mousehover']");
    By iFrame_section = By.xpath("//legend[normalize-space()='iFrame Example']");
    By hover_button = By.xpath("//button[@id='mousehover']");
    By top_button = By.xpath("//a[normalize-space()='Top']");
    By autocomplete_input = By.xpath("//input[@id='autocomplete']");
    By switch_alert_name_input = By.xpath("//input[@id='name']");

    @Test

    public void TestAction() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        Actions actions = new Actions(driver);
       // actions.scrollByAmount(0, 1000).build().perform();
        actions.scrollToElement(getElement(iFrame_section)).build().perform();
        Thread.sleep(5000);

        actions.moveToElement(getElement(hover_button)).build().perform();
        Thread.sleep(5000);

        clickOnElement(top_button);
        Thread.sleep(5000);

        getElement(autocomplete_input).sendKeys("Bangladesh");
        Thread.sleep(5000);

        actions.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
        Thread.sleep(5000);

        actions.keyDown(Keys.CONTROL).sendKeys("x").build().perform();
        Thread.sleep(5000);

        actions.click(getElement(switch_alert_name_input)).keyDown(Keys.CONTROL).sendKeys("v").build().perform();
        Thread.sleep(5000);



    }
}
