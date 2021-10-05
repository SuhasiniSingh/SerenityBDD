package UIPages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

import static java.time.temporal.ChronoUnit.SECONDS;


//@DefaultUrl("https://opensource-demo.orangehrmlive.com/index.php/auth/login")
public class LoginPage extends PageObject {

public void doLogin(String username,String password){
    $("//input[@id='txtUsername']").sendKeys(username);
    $("//input[@id='txtPassword']").sendKeys(password);
    clickOn($("//input[@id='btnLogin']"));
    //$("//input[@id='btnLogin']").click();
    setImplicitTimeout(20, SECONDS);
}

public void isLogoVisible(){
   shouldBeVisible(By.xpath("//body/div[@id='wrapper']/div[@id='branding']/a[1]/img[1]"));

}


}
