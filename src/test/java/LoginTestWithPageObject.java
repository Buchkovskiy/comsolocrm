import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import parentTest.ParentTest;

public class LoginTestWithPageObject  extends ParentTest {

    @Test
    public void validLogin(){
        loginPage.openPage();
        loginPage.checkCurrentURL();
        loginPage.enterTextInToInputLogin("admin_qaa");
        loginPage.enterTextInToInputPassword("c>s<d6rp6h");
        loginPage.clickOnButtonSubmit();

        homePage.checkCurrentURL();
        checkExpectedResult("Logo isn't displayed", true, homePage.isElementVisible());
    }

    @Test
    public void unvalidLogin(){
        loginPage.singInWithCredation("admin_test", "1");
        checkExpectedResult("Logo isn't displayed", false, homePage.isElementVisible());
    }
}
