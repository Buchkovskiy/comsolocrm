package libs;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Actions {
    WebDriver webDriver;
    Logger logger = Logger.getLogger(getClass());

    public Actions(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void enterTextToInput(WebElement webElement, String inputText){
            try{
                webElement.clear();
                webElement.sendKeys(inputText);
                logger.info(inputText+" was inputted into field");
            } catch (Exception e){
                logger.error("Element is not worked");
                Assert.fail("Element is not worked");
            }
    }

}
