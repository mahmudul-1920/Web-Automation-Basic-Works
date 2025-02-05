package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class DiffTypeWait extends DriverSetup {

    By click_me = By.xpath("//input[@name='commit']");
    By h2_text = By.xpath("//h2[@id='two']");
    By try_me = By.xpath("//input[@name='commit1']");
    By loader_delay_text = By.xpath("//h2[@id='delay']");
    By start = By.xpath("//input[@id='loaderStart']");
    By loading_text = By.xpath("//h2[@id='loaderdelay']");

    @Test

    public void testWait() throws InterruptedException {
        driver.get("https://qavbox.github.io/demo/delay/");
        clickOnElement(try_me);
        //Thread.sleep(10000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println(getElement(loader_delay_text).getText());

        clickOnElement(click_me);
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.textToBePresentInElementLocated(h2_text,"I am here!"));
        System.out.println(getElement(h2_text).getText());

    }
}
