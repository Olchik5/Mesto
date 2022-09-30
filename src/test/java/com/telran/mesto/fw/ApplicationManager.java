package com.telran.mesto.fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    WebDriver driver;

    UserHelper user;

    HomePageHelper helper;

    public UserHelper getUser() {
        return user;
    }

    public HomePageHelper getHelper() {
        return helper;
    }

    public void init() {
        driver = new ChromeDriver();
        driver.get("https://mesto.om.nomoredomains.xyz");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        user = new UserHelper(driver);
        helper = new HomePageHelper(driver);
    }

    public void stop() {
        driver.quit();
    }
}
