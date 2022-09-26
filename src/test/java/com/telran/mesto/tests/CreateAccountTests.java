package com.telran.mesto.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase{


    @Test
    public void registrationPositiveTest() {
        //click on the link Register
        click(By.xpath("//*[@href='/sign-up']"));
        //fill registration form
        type(By.cssSelector("[placeholder='Email']"), "mes@gmail.com");
        type(By.cssSelector("[placeholder='Password']"), "1234");
        //click on the Register button
        click(By.xpath("//button[contains(text(),'Register')]"));
        Assert.assertTrue(isElementPresent(By.xpath("//button[contains(text(),'Log in')]")));
    }


 }
