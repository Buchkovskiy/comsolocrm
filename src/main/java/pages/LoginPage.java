package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends ParentPage{

    public LoginPage(WebDriver webDriver) {
        super(webDriver, "/login");
    }

    @FindBy (xpath = (".//input[@aria-label='Login']"))
    private WebElement loginInput;

    @FindBy (xpath = (".//input[@aria-label='Password']"))
    private WebElement passwordInput;

    @FindBy (xpath = (".//*[contains(text(), 'Sign in')]"))
    private WebElement submitButton;

    //method for open page
    public void openPage(){
        try{
            webDriver.get("https://test.solo-crm.com/#/login");
            logger.info("LoginPage was opened");
        }catch (Exception e){
            logger.info("Can't open LoginPage");
            Assert.fail("Can't open LoginPage");
        }
    }

    //method for input login
    public void enterTextInToInputLogin(String login) {
        actions.enterTextToInput(loginInput, login);
    }

    //method for input password
    public void enterTextInToInputPassword(String password) {
        actions.enterTextToInput(passwordInput, password);
    }

    //method for submit enter
    public void clickOnButtonSubmit() {
        try{
            submitButton.click();
            logger.info("Submit was clicked");
        }catch (Exception e){
            logger.error("Submit wasn't worked");
            Assert.fail("Submit wasn't worked");
        }
    }

    public void singInWithCredation (String login, String password){
        openPage();
        enterTextInToInputLogin(login);
        enterTextInToInputPassword(password);
        clickOnButtonSubmit();
    }



}
