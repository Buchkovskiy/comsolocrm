import org.junit.Test;
import parentTest.ParentTest;

public class LoginTestWithPageObject  extends ParentTest {

    @Test
    public void validLogin(){
        loginPage.openPage();
        loginPage.checkCurrentURL();
        loginPage.enterTextInToInputLogin("login");
        loginPage.enterTextInToInputPassword("password");
        loginPage.clickOnButtonSubmit();
        homePage.checkCurrentURL2();

        checkExpectedResult("Logo isn't displayed", true, homePage.isLogoMainPagePresent());
        homePage.checkCurrentURL3();
    }

    @Test
    public void unvalidLogin(){
        loginPage.singInWithCredation("admin_test", "1");
        checkExpectedResult("Logo isn't displayed", false, homePage.isLogoMainPagePresent());
    }
}
