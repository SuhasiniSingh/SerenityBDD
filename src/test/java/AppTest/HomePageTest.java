package AppTest;

import Steps.LoginPageSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import Steps.HomePageSteps;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class HomePageTest {
    @Steps
    LoginPageSteps loginPagesteps;

    @Steps
    HomePageSteps homePageSteps;

    @Managed()
    WebDriver browser;
    @Before
    public void setup(){
        loginPagesteps.isOnLoginPage();
        loginPagesteps.LoginAsUser();
    }

    @Test
    public void createUserTest(){
        homePageSteps.usershouldbeCreated();
        homePageSteps.userSearch();
        homePageSteps.userExist();
        homePageSteps.deleteUser();
    }

}
