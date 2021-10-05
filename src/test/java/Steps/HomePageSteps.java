package Steps;

import UIPages.HomePage;
import net.thucydides.core.annotations.Step;

public class HomePageSteps {

    private HomePage homePage;

    @Step
    public void usershouldbeCreated(){
        homePage.createUser();
    }

    @Step
    public void userSearch(){
        homePage.searchUser();
    }

    @Step
    public void userExist(){
        homePage.isUserExist();
    }

    @Step
    public void deleteUser(){
        homePage.deleteUser();
    }

}
