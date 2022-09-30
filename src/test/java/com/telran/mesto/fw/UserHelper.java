package com.telran.mesto.fw;

import com.telran.mesto.models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends HelperBase {

    public UserHelper(WebDriver driver) {
        super(driver);
    }

    public void registration() {
        click(By.xpath("//*[@href='/sign-up']"));
        fillLoginRegistrationForm(new User().setEmail("messe@gmail.com").setPassword("1234"));
        click(By.xpath("//button[contains(text(),'Register')]"));
    }

    public void fillLoginRegistrationForm(User user) {
        type(By.cssSelector("[placeholder='Email']"), user.getEmail());
        type(By.cssSelector("[placeholder='Password']"), user.getPassword());
    }

    public void login() {
        fillLoginRegistrationForm(new User().setEmail("messe@gmail.com").setPassword("1234"));
        click(By.xpath("//button[contains(text(),'Log in')]"));
    }


    public boolean isLogOutButtonPresent() {
        return isElementPresent(By.xpath("//button[contains(text(),'Log out')]"));
    }

    public void logOut() {
        click(By.xpath("// button[contains(text(),'Log out')]"));
    }

    public boolean isLogInButtonPresent() {
        return isElementPresent(By.xpath("//button[contains(text(),'Log in')]"));
    }

    public void clickOnThePlusButton() {
        click(By.className("profile__add-button"));
    }

    public void addNewPicture() {
        type(By.xpath("//*[@placeholder='Name']"),"Sunset");
        type(By.cssSelector("[placeholder='Picture link']"),"https://images.unsplash.com/photo-1663746393126-e783961041d0?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=387&q=80");
        click(By.xpath("//button[contains(.,'Create')]"));

    }

    public boolean isPicturePresent() {
        return isElementPresent(By.xpath("//*[text()='Sunset']"));
    }

}
