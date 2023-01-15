package phonebook.steps;

import io.cucumber.docstring.DocString;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import phonebook.pages.ContactsPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static phonebook.Constants.*;

public class LoginSteps extends BaseSteps {

    @Given("I am on the Login page")
    public void iamOnTheLoginPage() {
        open(LOGIN_URL);
    }

    @When("I input {} email")
    public void iInputEmail(String email) {
        loginPage.enterEmail(email);
    }

    @When("I input {} password")
    public void iInputPassword(String password) {
        loginPage.enterPassword(password);
    }

    @When("I click on Login button")
    public void iClickOnLoginButton() {
        loginPage.clickOnLoginBtn();
    }

    @Then("I see email error message")
    public void iSeeErrorMessage(DocString errorMessage) {
        String message = errorMessage.getContent();
        loginPage.checkEmailErrorMessage(message);
    }

    @Then("I see short password error")
    public void iSeeShortPasswordError(DocString errorMessage) {
        String message = errorMessage.getContent();
        loginPage.checkPassErrorMessWithMinNumOfChar(message);
    }

    @Then("I see long password error")
    public void iSeeLongPasswordError(DocString errorMessage) {
        String message = errorMessage.getContent();
        loginPage.checkPassErrorMessWithMaxNumOfChar(message);
    }

    @Given("I am logged in")
    public ContactsPage iAmLoggedIn() {
        open(LOGIN_URL);
        loginPage.enterEmail(USER_EMAIL);
        loginPage.enterPassword(USER_PASSWORD);
        loginPage.clickOnLoginBtn();
        return page(ContactsPage.class);
    }
}
