package pages;

import libs.Actions;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

abstract public class ParentPage {

    WebDriver webDriver;
    //add logger for code
    Logger logger = Logger.getLogger(getClass());
    Actions actions;
    final String BASE_URL = "https://test.solo-crm.com/#";
    String expectedURL;

    public ParentPage(WebDriver webDriver, String partURL) {
        this.webDriver = webDriver;
        //initialization elements FindBy
        PageFactory.initElements(webDriver, this);
        actions = new Actions(webDriver);
        expectedURL = BASE_URL + partURL;
    }

     public void checkCurrentURL() {
        try {
            Assert.assertEquals("URL is not expected", expectedURL, webDriver.getCurrentUrl());
            logger.info( expectedURL+" is opened");
        } catch (Exception e) {
            logger.error("Can't open "+expectedURL+" "+ e);
            Assert.fail("Can't open "+expectedURL);
        }
    }


    public void checkCurrentURL2() {
        try {
            (new WebDriverWait(webDriver, 10))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//div[contains(text(), 'Main Page')]")));

            Assert.assertEquals("URL is not expected", expectedURL, webDriver.getCurrentUrl());
            logger.info( expectedURL+" is opened");
        } catch (Exception e) {
            logger.error("Can't open "+expectedURL+" "+ e);
            Assert.fail("Can't open "+expectedURL);
        }
    }

    public void checkCurrentURL3() {
       WebElement dynamicElement = (new WebDriverWait(webDriver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//div[contains(text(), 'Main Page')]")));
            if (expectedURL.equals(webDriver.getCurrentUrl())){
                System.out.println("Expected URL: "+expectedURL+" = " + " Current URL: "+webDriver.getCurrentUrl());

            } else{
                System.out.println("Expected URL - "+expectedURL+" != "+"Current URL - "+webDriver.getCurrentUrl());
            }
    }

}
