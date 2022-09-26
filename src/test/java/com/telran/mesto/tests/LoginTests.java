package com.telran.mesto.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @Test
    public void loginUserPositiveTest() {
        //fill login form
        //click the Login button
        login();
        //assert SignOut button
        Assert.assertTrue(isElementPresent(By.xpath("//button[contains(text(),'Log out')]")));
        click(By.xpath("// button[contains(text(),'Log out')]"));
    }

}

