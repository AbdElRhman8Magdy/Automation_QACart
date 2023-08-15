package com.qacart.todo.testcases;

import com.qacart.todo.base.BaseTest;
import com.qacart.todo.pages.LoginPage;
import com.qacart.todo.pages.NewPage;
import com.qacart.todo.pages.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {


@Test(priority = 1)
    public void shouldBeAbleToRegister(){


        LoginPage loginPage = new LoginPage(driver);
        boolean IsWelcomeMessageDisplayed = loginPage
                .Load()
                .clickSignUp()
                .Register("Abd ElRhman",
                        "Magdy",
                        "abdelrhman88magdy+1@gmail.com",
                        "12345678",
                        "12345678").
                IsWelcomeMessageDisplayed();

        Assert.assertTrue(IsWelcomeMessageDisplayed);

    }

    @Test(priority = 2)
    public void shouldBeAbleToRegisterOLd() {


        LoginPage loginPage = new LoginPage(driver);
        loginPage
                .Load()
                .clickSignUp();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage
                .RegisterOld("Abd ElRhman",
                        "Magdy",
                        "1111magdy@gmail.com",
                        "12345678",
                        "12345678");

        NewPage newPage = new NewPage(driver);
        newPage.ClickOnAdd()
                .WriteToDoText("hello")
                .GetAdedTodo();


    }
}
