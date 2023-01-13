package phonebook.steps;

import io.cucumber.docstring.DocString;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.open;
import static phonebook.Constants.PASSWORD_RECOVERY_URL;

public class PasswordRecoverySteps extends BaseSteps {

    @Given("I am on the Password recovery page")
    public void iAmOnThePasswordRecoveryPage() {
        open(PASSWORD_RECOVERY_URL);
    }

    @When("I input email")
    public void iInputEmail() {
        pwdRecoveryPage.inputEmail();
    }

    @When("I click on Send button")
    public void iClickOnSendButton() {
        pwdRecoveryPage.clickOnSendButton();
    }


    @Then("I see message")
    public void iSeeMessage(DocString successMessage) {
        String message = successMessage.getContent();
        pwdRecoveryPage.checkSuccessMessage(message);
    }

    @When("I introduce email")
    public void iIntroduceEmail() {
        pwdRecoveryPage.inputNonExistingEmail();

    }

    @Then("I see error message")
    public void iSeeErrorMessage(DocString errorMess) {
        String message = errorMess.getContent();
        pwdRecoveryPage.checkErrorMessage(message);

    }
}
