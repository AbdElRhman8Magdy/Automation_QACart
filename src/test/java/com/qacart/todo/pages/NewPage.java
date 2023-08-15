package com.qacart.todo.pages;

import com.qacart.todo.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewPage extends BasePage {
    public NewPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@data-testid='welcome']")
    private WebElement WelcomeMessage;

    @FindBy(xpath = "//*[@data-testid='add']")
    private WebElement AddToDo;
    @FindBy(xpath = "//*[@data-testid='todo-item']")
    private WebElement AdedItem;
    @FindBy(xpath = "//*[@data-testid='delete']")
    private WebElement DeleteItem;
    @FindBy(xpath = "//*[@data-testid='no-todos']")
    private WebElement DeletedItem;

    public boolean IsWelcomeMessageDisplayed(){
          return   WelcomeMessage.isDisplayed();
    }

    public NewTodoPage ClickOnAdd(){

        AddToDo.click();
        return new  NewTodoPage(driver);
    }

    public String GetAdedTodo(){
        return AdedItem.getText();
    }
    public NewPage DeleteToDo(){
        DeleteItem.click();
        return this;
    }
    public boolean IsDeleted(){
       return DeletedItem.isDisplayed();
    }

}
