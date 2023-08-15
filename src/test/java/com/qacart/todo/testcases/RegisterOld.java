package com.qacart.todo.testcases;

import com.qacart.todo.base.BaseTest;
import com.qacart.todo.pages.LoginPage;
import com.qacart.todo.pages.NewPage;
import com.qacart.todo.pages.RegisterPage;
import org.testng.annotations.Test;

public class RegisterOld extends BaseTest {
    @Test
    public void shouldBeAbleToRegister() {


        LoginPage loginPage = new LoginPage(driver);
        loginPage
                .Load()
                .clickSignUp();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage
                .RegisterOld("Abd ElRhman",
                        "Magdy",
                        "1امنياا111magdy@gmail.com",
                        "12345678",
                        "12345678");

        NewPage newPage = new NewPage(driver);
        newPage.ClickOnAdd()
                .WriteToDoText("hey")
                .GetAdedTodo();


    }
}
