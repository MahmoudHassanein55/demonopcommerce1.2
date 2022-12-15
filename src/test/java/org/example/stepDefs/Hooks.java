package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks
{
    public static WebDriver driver = null;

    @Before
    public static void OpenBrowser()
    {
        // 1 - Bridge
        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.out.println(chromePath);
        System.setProperty("webdriver.chrome.driver",chromePath);

        // 2- create object from Chrome browser
        driver = new ChromeDriver();

        //3- Configurations
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 4- navigate to url
        driver.get("https://demo.nopcommerce.com/");
    }
    @After
    public static void  quitDriver() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
