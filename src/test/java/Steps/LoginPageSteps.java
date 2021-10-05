package Steps;

import UIPages.LoginPage;
import net.thucydides.core.annotations.Step;


public class LoginPageSteps {

    private LoginPage loginPage;

    @Step
    public void isOnLoginPage(){
      loginPage.open();
    }

    @Step
    public void LoginAsUser(){
        loginPage.doLogin("Admin","admin123");
    }

    @Step
    public void validateLogoExist(){
        loginPage.isLogoVisible();
    }




}
