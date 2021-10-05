package UIPages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends PageObject {

    @FindBy(xpath="//select[@id='systemUser_userType']")
    WebElement userRole;

    @FindBy(xpath="//input[@id='systemUser_employeeName_empName']")
    WebElement Employee;

    @FindBy(id="systemUser_userName")
    WebElement userName;

    @FindBy(id="systemUser_status")
    WebElement Status;

    @FindBy(id="systemUser_password")
    WebElement passWord;

    @FindBy(xpath="//input[@id='systemUser_confirmPassword']")
    WebElement confirmPwd;

    @FindBy(xpath="//input[@id='searchSystemUser_userName']")
    WebElement uName;

    @FindBy (xpath= "//b[contains(text(),'Admin')]")
    WebElement Admin;

   public void createUser(){
       $("//b[contains(text(),'Admin')]").click();
       $("//input[@name='btnAdd']").click();
        element(userRole).selectByVisibleText("ESS").click();
       Employee.sendKeys("David Morris");
       userName.sendKeys("naveen123");
       element(Status).selectByVisibleText("Enabled").click();
       passWord.sendKeys("selenium$99");
       confirmPwd.sendKeys("selenium$99");
       $("#btnSave").click();
   }

    public void searchUser(){
       // $("//b[contains(text(),'Admin')]").click();
        uName.sendKeys("naveen123");
        $("//input[@id='searchBtn']").click();
    }

    public void isUserExist(){
       // $("//b[contains(text(),'Admin')]").click();
        $("//a[contains(text(),'naveen123')]").isDisplayed();
    }

    public void deleteUser(){
     WebElementFacade checkbox= $("//input[@name='chkSelectRow[]']");
     checkbox.click();
     checkbox.isSelected();
     WebElementFacade deletebtn= $("//input[@id='btnDelete']");
     deletebtn.click();
     WebElementFacade okButton= $("//input[@id='dialogDeleteBtn']");
     okButton.click();

    }
}
