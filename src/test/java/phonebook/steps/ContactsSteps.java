package phonebook.steps;

import io.cucumber.java.en.Then;

public class ContactsSteps extends BaseSteps{


    @Then("I see {} button")
    public void iSeeButtonButton(String textBtn) {
        contactsPage.checkExitButton(textBtn);
    }
}
