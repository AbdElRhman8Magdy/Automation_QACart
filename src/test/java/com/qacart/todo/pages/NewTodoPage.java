package com.qacart.todo.pages;

import com.qacart.todo.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewTodoPage extends BasePage {
    /**
     * 
     * @param driver
     */
    public NewTodoPage (WebDriver driver){
        super(driver);
    }
    @FindBy (xpath = "//*[@data-testid='add']")
    private WebElement AddNewToDo;
    @FindBy(xpath = "//*[@data-testid='new-todo']")
    private WebElement ToDoText;
    @FindBy(xpath = "//*[@data-testid='submit-newTask']")
    private WebElement SubmitToDo;



    public void clickAddNewToDo(){
        AddNewToDo.click();
    }
    public  NewPage WriteToDoText (String TextToDo){
        ToDoText.sendKeys(TextToDo);
        SubmitToDo.click();
        return new NewPage(driver);
    }

}

