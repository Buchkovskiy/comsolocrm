package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage  extends ParentPage{
    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isElementVisible() {
        try {
            return webDriver.findElement(By.xpath(".//*[contains(text(), 'Main Page')]")).isDisplayed();
        }
        catch(Exception e) {
            return false;
        }
    }
}
