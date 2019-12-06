import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ParentPage;
import parentTest.ParentTest;

public class LoginTestWithPageObject  extends ParentTest {

    @Test
    public void validLogin(){
        loginPage.openPage();
        loginPage.checkCurrentURL1();
        loginPage.enterTextInToInputLogin("admin_qaqa");
        loginPage.enterTextInToInputPassword("jf0a<u}e%4");
        loginPage.clickOnButtonSubmit();


        homePage.checkCurrentURL2();

        checkExpectedResult("Logo isn't displayed", true, homePage.isElementVisible());
        homePage.checkCurrentURL2();
    }

    @Test
    public void unvalidLogin(){
        loginPage.singInWithCredation("admin_test", "1");
        checkExpectedResult("Logo isn't displayed", false, homePage.isElementVisible());
    }
}
