package AppTest;

import Steps.LoginPageSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginPageTest {

    @Steps
    LoginPageSteps loginPagesteps;

    @Managed()
    WebDriver browser;

    @Test
    public void appLoginTest(){
        loginPagesteps.isOnLoginPage();
        loginPagesteps.LoginAsUser();
        loginPagesteps.validateLogoExist();
    }
}
