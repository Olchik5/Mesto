package com.telran.mesto.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class   HomePageTests extends TestBase{

    @Test
    public void openHomePageTest() {
        app.getHelper().isAuthorizationFormPresent();
        Assert.assertTrue(app.getHelper().isAuthorizationFormPresent());
    }

}
