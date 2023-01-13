package phonebook.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * This class contains all Contacts page locators and methods.
 */
public class ContactsPage {
    //locators
    protected static By exitButton = By.xpath("//div/button[2][contains(@class, 'btn btn-outline-warning text-white')]");

    //methods
    public void checkExitButton(String textBtn) {
        $(exitButton).shouldHave(Condition.text(textBtn));
    }
}
