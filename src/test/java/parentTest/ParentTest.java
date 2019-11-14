package parentTest;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ParentTest {

    WebDriver webDriver;
    @Before
    public void setUp(){
        //set ChromeDriver and path to file
        System.setProperty("webdriver.chrome.driver", "F://Automation/comsolocrm/src/drivers/chromedriver_0711.exe");
        webDriver = new ChromeDriver();
        //for opening window of browser in maximum size
        webDriver.manage().window().maximize();
        //for waiting before each action
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public void tearDown(){
        webDriver.quit();
    }

}
