package com.telran.mesto.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @Test
    public void loginUserPositiveTest() {
        app.getUser().login();
        Assert.assertTrue(app.getUser().isLogOutButtonPresent());

    }

    @Test
    public void logOutUserTest() {
        app.getUser().login();
        app.getUser().logOut();
        Assert.assertTrue(app.getUser().isLogInButtonPresent());
    }
}

