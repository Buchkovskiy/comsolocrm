package parentTest;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class ParentTest {

    WebDriver webDriver;
    protected LoginPage loginPage;
    protected HomePage homePage;


    @Before
    public void setUp(){
        //set ChromeDriver and path to file
        System.setProperty("webdriver.chrome.driver", "F://Automation/comsolocrm/src/drive/chromedriver_0711.exe");
        webDriver = new ChromeDriver();

        //Created new pages
        loginPage = new LoginPage(webDriver);
        homePage = new HomePage(webDriver);

        //for opening window of browser in maximum size
        webDriver.manage().window().maximize();
        //for waiting before each action
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    }

    @After
    public void tearDown(){
        webDriver.quit();
    }

    public  void checkExpectedResult (String message, boolean expectedResult, boolean actualResult){
        Assert.assertEquals(message, expectedResult, actualResult);
    }

}
