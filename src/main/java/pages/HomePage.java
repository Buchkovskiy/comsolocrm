package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage  extends ParentPage{
    public HomePage(WebDriver webDriver) {
        super(webDriver,"/");
    }

    public boolean isElementVisible() {
        try {

            return webDriver.findElement(By.xpath(".//div[contains(text(), 'Main Page')]")).isDisplayed();
        }
        catch(Exception e) {
            return false;
        }
    }

}
