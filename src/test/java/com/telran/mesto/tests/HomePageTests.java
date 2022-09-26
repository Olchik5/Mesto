package com.telran.mesto.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HomePageTests extends TestBase{

    @Test
    public void openHomePageTest() {
        System.out.println("Site opened!");
//        isAuthorizationFormPresent();
//        System.out.println("Authorization Form: " + isAuthorizationFormPresent());
        //isElementPresent(By.cssSelector(".auth__form"));
        isElementPresent2(By.cssSelector(".auth__form"));
    }

}
