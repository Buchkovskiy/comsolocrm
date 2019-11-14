package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends ParentPage{

    public LoginPage(WebDriver webDriver) {
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

    public void openPage(){
        try{
            webDriver.get("https://test.solo-crm.com/#/login/");
        }catch (Exception e){
            System.out.println("Can't open  LoginPage");
            Assert.fail("Can't open LoginPage");

        }

    }

}
