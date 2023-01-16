package phonebook.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static phonebook.Constants.ADD_CONTACT_LASTNAME;
import static phonebook.Constants.ADD_CONTACT_NAME;

/**
 * This class contains all Contacts page locators and methods.
 */
public class ContactsPage {
    //locators
    protected static By exitButton = By.xpath("//div/button[2][contains(@class, 'btn btn-outline-warning text-white')]");
    protected static By addNewContactButton = By.cssSelector(".nav-item:nth-child(2) > .nav-link");
    protected static By addContactWindow = By.xpath("//*[@id='add-contact-modal']/h4");
    protected static By firstNameField = By.xpath("//*[@id='form-name']");
    protected static By lastNameField = By.xpath("//*[@id='form-lastName']");
    protected static By saveButton = By.xpath("//*[@id='add-contact-form']/div[4]/button[2]");
    protected static By contactFirstName = By.xpath("//*[@id='contact-first-name']");
    protected static By contactLastName = By.xpath("//*[@id='contact-last-name']");


    //methods
    public void checkExitButton(String textBtn) {
        $(exitButton).shouldHave(Condition.text(textBtn));
    }

    public void clickOnAddNewContact() {
        $(addNewContactButton).click();
    }

    public void checkAddContactWindow(String text) {
        $(addContactWindow).shouldHave(Condition.text(text));
    }

    public void createContact() {
        $(firstNameField).setValue(ADD_CONTACT_NAME);
        $(lastNameField).setValue(ADD_CONTACT_LASTNAME);
        $(saveButton).click();
    }

    public void checkNameAndLastNameOfContact() {
        $(contactFirstName).shouldHave(Condition.text(ADD_CONTACT_NAME));
        $(contactLastName).shouldHave(Condition.text(ADD_CONTACT_LASTNAME));
    }
}
