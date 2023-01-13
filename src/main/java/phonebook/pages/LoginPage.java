package phonebook.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

/**
 * This class contains all Login page locators and methods.
 */
public class LoginPage {

    //locators
    protected static By emailField = By.xpath("//*[@id='defaultRegisterFormEmail']");
    protected static By passwordField = By.xpath("//*[@id='login-form']/div[2]/div[1]/div/input");
    protected static By loginButton = By.xpath("//*[@id='login-form']/div[3]/div[1]/button");
    protected static By emailErrorMessage = By.xpath("//*[@id='email-error-invalid']");
    protected static By passErrMessageMin = By.xpath("//*[@id='password-error-minlength']");
    protected static By passErrMessageMax = By.xpath("//*[@id='password-error-maxlength']");

    //methods
    public void enterEmail(String email) {
        $(emailField).setValue(email);
    }

    public void enterPassword(String password) {
        $(passwordField).setValue(password);
    }

    public ContactsPage clickOnLoginBtn() {
        $(loginButton).click();
        return page(ContactsPage.class);
    }

    public void checkEmailErrorMessage(String errorMess) {
        $(emailErrorMessage).shouldHave(Condition.text(errorMess));
    }


    public void checkPassErrorMessWithMinNumOfChar(String errorMessage) {
        $(passErrMessageMin).shouldHave(Condition.text(errorMessage));

    }

    public void checkPassErrorMessWithMaxNumOfChar(String errorMessage) {
        $(passErrMessageMax).shouldHave(Condition.text(errorMessage));
    }

}
