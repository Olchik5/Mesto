package com.telran.mesto.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase{


    @Test
    public void registrationPositiveTest() {
        app.getUser().registration();
        Assert.assertTrue(app.getUser().isLogInButtonPresent());
    }

}
