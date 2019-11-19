import org.junit.Test;
import parentTest.ParentTest;

public class LoginTestWithPageObject  extends ParentTest {

    @Test
    public void validLogin(){
        loginPage.openPage();
        loginPage.enterTextInToInputLogin("admin_test");
        loginPage.enterTextInToInputPassword("rml(r$g$yi");
        loginPage. clickOnButtonSubmit();
        checkExpectedResult("Logo isn't displayed", true, homePage.isElementVisible());
    }

    @Test
    public void unvalidLogin(){
        loginPage.singInWithCredation("admin_test", "1");
        checkExpectedResult("Logo isn't displayed", false, homePage.isElementVisible());
    }
}
