package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage  extends ParentPage{
    public HomePage(WebDriver webDriver) {
        super(webDriver,"/");
    }

    @FindBy(xpath = (".//div[contains(text(), 'Main Page')]"))
    private WebElement logoMainPage;

    public boolean isLogoMainPagePresent() {
        try {
            return logoMainPage.isDisplayed();
        }
        catch(Exception e) {
            return false;
        }
    }



}
