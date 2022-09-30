package com.telran.mesto.tests;

import com.telran.mesto.fw.ApplicationManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    protected ApplicationManager app = new ApplicationManager();

    @BeforeMethod
    public void SetUp() {
        app.init();
    }

    @AfterMethod(enabled = false)
    public void TearDown() {
        app.stop();
    }

}
