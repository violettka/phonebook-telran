package phonebook.steps;

import io.cucumber.docstring.DocString;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactsSteps extends BaseSteps {


    @Then("I see {} button")
    public void iSeeButtonButton(String textBtn) {
        contactsPage.checkExitButton(textBtn);
    }

    @When("I click on My profile button")
    public void iClickOnMyProfileButton() {

    }

    @When("I click on Add new contact button")
    public void iClickOnAddNewContactButton() {
        contactsPage.clickOnAddNewContact();
    }

    @Then("I see window with an inscription")
    public void iSeeWindowWithAnInscription(DocString text) {
        String addContactText = text.getContent();
        contactsPage.checkAddContactWindow(addContactText);
    }

    @And("I add a new contact")
    public void iAddANewContact() {
        contactsPage.createContact();
    }

    @Then("I see first and last name of contact")
    public void iSeeFirstNameAndLastName() {
        contactsPage.checkNameAndLastNameOfContact();
    }
}
