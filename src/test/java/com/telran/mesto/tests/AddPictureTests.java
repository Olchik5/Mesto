package com.telran.mesto.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddPictureTests extends TestBase{

    @Test
    public void addPicturePositiveTest() {
        app.getUser().login();
        app.getUser().clickOnThePlusButton();
        app.getUser().addNewPicture();
        Assert.assertTrue(app.getUser().isPicturePresent());
    }
}



