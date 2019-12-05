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
            String currentURL = webDriver.getCurrentUrl();
            if (expectedURL.equals(webDriver.getCurrentUrl())){
                System.out.println("Expected URL: "+expectedURL+" = " + " Current URL: "+webDriver.getCurrentUrl());

            } else{
                System.out.println("Expected URL - "+expectedURL+" != "+"Current URL - "+webDriver.getCurrentUrl());
            };
    }

   /* public void checkCurrentURL() {
        try {
            if (expectedURL==webDriver.getCurrentUrl()){
                System.out.println("expected URL - "+expectedURL+"/="+"currentUrl - "+webDriver.getCurrentUrl());
            };

           // Assert.assertEquals("URL is not expected", expectedURL, webDriver.getCurrentUrl());
        } catch (Exception e) {
            logger.error("Can't get URL" + e);
            Assert.fail("Can't get URL");
        }
    }*/


}
