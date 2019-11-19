package pages;

import libs.Actions;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

abstract public class ParentPage {

    WebDriver webDriver;
    Actions actions;
    //add logger for code
    Logger logger = Logger.getLogger(getClass());

    public ParentPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        //initialization elements FindBy
        PageFactory.initElements(webDriver, this);
        actions = new Actions(webDriver);
    }


}
