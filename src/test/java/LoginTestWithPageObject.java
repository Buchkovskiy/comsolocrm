import org.junit.Test;
import parentTest.ParentTest;

public class LoginTestWithPageObject  extends ParentTest {

    @Test
    public void validLogin(){
        loginPage.openPage();
        loginPage.enterTextInToInputLogin("admin_test");
        loginPage.enterTextInToInputPassword("132465798");
        loginPage.clickOnButtonSubmit();

        checkExpectedResult("Logo isn't displayed", true, homePage.isElementVisible());

    }

}
