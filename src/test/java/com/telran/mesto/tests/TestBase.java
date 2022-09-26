package com.telran.mesto.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver driver;

    @BeforeMethod
    public void SetUp() {
        driver = new ChromeDriver();
        driver.get("https://mesto.om.nomoredomains.xyz");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public boolean isAuthorizationFormPresent() {
        return driver.findElements(By.cssSelector(".auth__form")).size()>0;
    }

    public boolean isElementPresent(By locator) {
        return driver.findElements(locator).size() > 0;
    }

    public boolean isElementPresent2(By locator) {
        try {
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException exception) {
            return false;
        }
    }

    @AfterMethod(enabled = false)
    public void TearDown() {
        driver.quit();
    }

    public  void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void login() {
        type(By.cssSelector("[placeholder='Email']"), "mes@gmail.com");
        type(By.cssSelector("[placeholder='Password']"), "1234");
        click(By.xpath("//button[contains(text(),'Log in')]"));
    }

    public boolean isLogOutButtonPresent() {
        return isElementPresent(By.xpath("//button[contains(text(),'Log out')]"));
    }
}
