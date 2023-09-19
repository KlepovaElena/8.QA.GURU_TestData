package tests;

import org.junit.jupiter.api.Test;
import pages.TextBoxPage;

public class TextBoxTests extends TestBase {

    TextBoxPage textBoxPage = new TextBoxPage();
    TestData testData = new TestData();

    @Test
    void fillTextBox() {
        textBoxPage.openPage()
                .setUserName(testData.userFullName)
                .setUserEmail(testData.userEmailAddress)
                .setUserCurrentAddress(testData.userCurrentAddress)
                .setUserPermanentAddress(testData.userPermanentAddress)
                .submitPage();

        textBoxPage.checkResult("Name:"+testData.userFullName)
                .checkResult("Email:"+testData.userEmailAddress)
                .checkResult("Current Address :"+testData.userCurrentAddress)
                .checkResult("Permananet Address :"+testData.userPermanentAddress);
    }
}
