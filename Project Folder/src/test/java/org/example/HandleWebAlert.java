package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandleWebAlert extends DriverSetup {

    @Test
    public void testAlert() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

       driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
       Thread.sleep(3000);

       Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        Thread.sleep(3000);

        driver.findElement(By.xpath("(//button[normalize-space()='Click for JS Confirm'])[1]")).click();
        alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.dismiss();
        Thread.sleep(3000);

        By jsPrompt = (By.xpath("//button[normalize-space()='Click for JS Prompt']"));
        driver.findElement(jsPrompt).click();
        alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.sendKeys("Hello");
        alert.accept();
        Thread.sleep(3000);

    }



}

