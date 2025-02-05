package org.example;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class InteractingWithWebBrowser extends DriverSetup {

    @Test
    public void testInteractionBrowser() throws InterruptedException {
        driver.get("https://www.google.com/");
        String title = driver.getTitle();
        System.out.println(title);

       String url = driver.getCurrentUrl();
        System.out.println(url);

        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.manage().window().minimize();
        Thread.sleep(2000);

        driver.manage().window().fullscreen();
        Thread.sleep(2000);

        driver.navigate().to("https://web.facebook.com/?_rdc=1&_r");
        Thread.sleep(2000);

        driver.navigate().back();
        Thread.sleep(2000);

        driver.navigate().forward();
        Thread.sleep(2000);

        driver.navigate().refresh();
        Thread.sleep(2000);

        driver.switchTo().newWindow(WindowType.TAB);
        Thread.sleep(2000);

        driver.switchTo().newWindow(WindowType.WINDOW);
        Thread.sleep(2000);

        String windowHandle = driver.getWindowHandle();
        System.out.println(windowHandle);

        List<String> windowHandles = new ArrayList<>(driver.getWindowHandles());
        for (String handle : windowHandles){
            System.out.println(handle);
        }

        driver.switchTo().window(windowHandles.get(0));
        Thread.sleep(2000);

        driver.close();


    }
}

