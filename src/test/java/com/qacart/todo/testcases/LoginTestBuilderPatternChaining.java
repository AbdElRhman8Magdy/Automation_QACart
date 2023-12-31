package com.qacart.todo.testcases;

import com.qacart.todo.base.BaseTest;
import com.qacart.todo.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestBuilderPatternChaining extends BaseTest {


    @Test
    public void shouldBeAbleToLoginWithEmailAndPassword(){

        LoginPage loginPage = new LoginPage(driver);
        boolean IsWelcomeMessageDisplayed = loginPage
                .Load()
                .login("abdelrhman88magdy@gmail.com","12345678")
                .IsWelcomeMessageDisplayed();

        Assert.assertTrue(IsWelcomeMessageDisplayed);
    }
}
