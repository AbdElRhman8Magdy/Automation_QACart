package com.qacart.todo.pages;

import com.qacart.todo.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class LoginPage extends BasePage {
    public LoginPage Load(){
        driver.get("https://todo.qacart.com/login");
            return this;
    //instead of void use class name and return this to be able to call all methods on class at "test"
}


   //Moved from page--->>>> to BasePage by extents and create constructor -->>
   public LoginPage(WebDriver driver) {
       super(driver);
   }
    /*private WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
    }
*/


//Create constructor of page factory to be called in test clases

    // @FindBy(id = "submit")
    //    private WebElement SubmitButton;


    //Page factory --> sillinium class @FindBy  ( method = "value|") then rename element
    // @FindBy(css = "[data-testid=\"email\"]") WebElement element name
    // replace \"   \" with single quote '   '
    @FindBy(css = "[data-testid='email']")
    private WebElement EmailInput;
    @FindBy (xpath = "//*[@name='password']")
    private WebElement PasswordInput;
    @FindBy(id = "submit")
    private WebElement SubmitButton;
    @FindBy(linkText = "Signup")
    private WebElement SignupBtn;

//    public void login (String email, String password){
//        EmailInput.sendKeys(email);
//        PasswordInput.sendKeys(password);
//        SubmitButton.click();
//
//    }

    //instead of run each test individually let's add last step to return to next test
    public NewPage login (String email, String password){
        EmailInput.sendKeys(email);
        PasswordInput.sendKeys(password);
        SubmitButton.click();
//        SignupBtn.click();

        return new NewPage(driver);
    }
    public RegisterPage clickSignUp(){
        SignupBtn.click();
    return new RegisterPage(driver);
    }

    public void  clickSignUpOld(){
        SignupBtn.click();
//        return new RegisterPage(driver);
    }
}
