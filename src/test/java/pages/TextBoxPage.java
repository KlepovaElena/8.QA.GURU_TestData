package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class TextBoxPage {

    SelenideElement
            userNameInput = $("#userName"),
            userEmailInput = $("#userEmail"),
            userCurrentAddressInput = $("#currentAddress"),
            userPermanentAddressInput = $("#permanentAddress"),
            submitButton = $("#submit"),
            outputBox = $("#output");

    public TextBoxPage openPage() {
        open("/text-box");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        return this;
    }

    public TextBoxPage setUserName(String value) {
        userNameInput.setValue(value);

        return this;
    }

    public TextBoxPage setUserEmail(String value) {
        userEmailInput.setValue(value);

        return this;
    }

    public TextBoxPage setUserCurrentAddress(String value) {
        userCurrentAddressInput.setValue(value);

        return this;
    }

    public TextBoxPage setUserPermanentAddress(String value) {
        userPermanentAddressInput.setValue(value);

        return this;
    }

    public TextBoxPage submitPage() {
        submitButton.click();

        return this;
    }

    public TextBoxPage checkResult(String value) {
        outputBox.shouldHave(text(value));

        return this;
    }
}
