package com.telran.mesto.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageHelper extends HelperBase {
    public HomePageHelper(WebDriver driver) {
        super(driver);
    }

    public boolean isAuthorizationFormPresent() {
        return driver.findElements(By.cssSelector(".auth__form")).size()>0;
    }
}
