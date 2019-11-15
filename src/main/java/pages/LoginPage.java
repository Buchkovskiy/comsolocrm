package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends ParentPage{

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }





    public void openPage(){
        try{
            webDriver.get("https://test.solo-crm.com/#/login/");
            logger.info("LoginPage was opened");
        }catch (Exception e){
            logger.info("Can't open LoginPage");
            Assert.fail("Can't open LoginPage");
        }
    }

    public void enterTextInToInputLogin(String login) {
        //input login to "Login" field
        try{
            WebElement loginField = webDriver.findElement(By.xpath(".//input[@aria-label='Login']"));
            loginField.clear();
            loginField.sendKeys(login);
            logger.info(login+" was inputted into LoginField");
        } catch (Exception e){
            logger.error("Element is not worked");
            Assert.fail("Element is not worked");
        }
    }


    public void enterTextInToInputPassword(String password) {
        //input login to "Login" field
        try{
            WebElement passwordField = webDriver.findElement(By.xpath(".//input[@aria-label='Password']"));
            passwordField.clear();
            passwordField.sendKeys(password);
            logger.info(password+" was inputted into LoginField");
        } catch (Exception e){
            logger.error("Element is not worked");
            Assert.fail("Element is not worked");
        }
    }

    public void clickOnButtonSubmit() {
        try{
            WebElement submitButton = webDriver.findElement(By.xpath(".//*[contains(text(), 'Sign in')]"));
            submitButton.click();
            logger.info("Submit was clicked");
        }catch (Exception e){
            logger.error("Submit wasn't worked");
            Assert.fail("Submit wasn't worked");
        }
    }


}
