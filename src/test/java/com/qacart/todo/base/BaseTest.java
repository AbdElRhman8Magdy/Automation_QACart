package com.qacart.todo.base;

import com.qacart.todo.factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
//    private WebDriver driver;
    //private would be only shown to this class
    //protected would be shown to any class inhirit this class
    protected WebDriver driver;

    @BeforeMethod
    public void Setup(){
        driver = new DriverFactory().DriverInitialize();

    }

    @AfterMethod
    public void Close() throws InterruptedException {

        Thread.sleep(2000);

        driver.quit();
    }
}
