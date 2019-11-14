import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import parentTest.ParentTest;

import java.util.concurrent.TimeUnit;


public  class firstTest extends ParentTest {



    @Test
    public void test() {
        webDriver.get("https://test.solo-crm.com/#/");

        //input login to "Login" field
        WebElement loginField = webDriver.findElement(By.xpath(".//input[@aria-label='Login']"));
        loginField.clear();
        loginField.sendKeys("admin_test");

        //input password to "Password" field
        WebElement passField = webDriver.findElement(By.xpath(".//input[@aria-label='Password']"));
        passField.clear();
        passField.sendKeys("132465798");

        WebElement submitButton = webDriver.findElement(By.xpath(".//*[contains(text(), 'Sign in')]"));
        submitButton.click();

        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertTrue("MainPage isn't present", loginPage.isElementVisible());
    }


}
