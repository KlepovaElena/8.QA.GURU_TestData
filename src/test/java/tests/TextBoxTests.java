package tests;

import org.junit.jupiter.api.Test;
import pages.TextBoxPage;

public class TextBoxTests extends TestBase {

    TextBoxPage textBoxPage = new TextBoxPage();

    @Test
    void fillTextBox() {
        textBoxPage.openPage()
                .setUserName("Elena Klepova")
                .setUserEmail("ElenaKlepova@gmail.com")
                .setUserCurrentAddress("Saint Petersburg, Russia")
                .setUserPermanentAddress("Sevastopol, Russia")
                .submitPage();

        textBoxPage.checkResult("Name:Elena Klepova")
                .checkResult("Email:ElenaKlepova@gmail.com")
                .checkResult("Current Address :Saint Petersburg, Russia")
                .checkResult("Permananet Address :Sevastopol, Russia");
    }
}
