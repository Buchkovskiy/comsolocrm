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


public  class LoginTest extends ParentTest {

    WebDriver webDriver;

    @Before
    public void setUp(){
        //set ChromeDriver and path to file
        System.setProperty("webdriver.chrome.driver", "F://Automation/comsolocrm/src/drivers/chromedriver_0711.exe");
        webDriver = new ChromeDriver();
        loginPage = new LoginPage(webDriver);

        //for opening window of browser in maximum size
        webDriver.manage().window().maximize();
        //for waiting before each action
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void test() {
        webDriver.get("https://test.solo-crm.com/#/login");

        //input password to "Login" field
        WebElement loginField = webDriver.findElement(By.xpath(".//input[@aria-label='Login']"));
        loginField.clear();
        loginField.sendKeys("admin_test");

        //input password to "Password" field
        WebElement passField = webDriver.findElement(By.xpath(".//input[@aria-label='Password']"));
        passField.clear();
        passField.sendKeys("rml(r$g$yi");

        WebElement submitButton = webDriver.findElement(By.xpath(".//*[contains(text(), 'Sign in')]"));
        submitButton.click();

        Assert.assertTrue("MainPage isn't present", webDriver.findElement(By.xpath(".//div[contains(text(), 'Main Page')]")).isDisplayed());
    }

    @After
    public void tearDown()
        {
            webDriver.quit();
        }

}
