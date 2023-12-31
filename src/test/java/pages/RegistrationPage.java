package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class RegistrationPage {

    CalendarComponent calendar = new CalendarComponent();

    SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmailInput = $("#userEmail"),
            genderWrapper = $("#genterWrapper"),
            userNumberInput = $("#userNumber"),
            userCurrentAddress = $("#currentAddress"),
            birthDateInput = $("#dateOfBirthInput"),
            userSubjectInput = $("#subjectsInput"),
            hobbiesWrapper = $("#hobbiesWrapper"),
            userPictureInput = $("#uploadPicture"),
            userStateInput = $("#state"),
            userCityInput = $("#city"),
            submitButton = $("#submit"),
            outputTable = $(".table-responsive"),
            tableTitle = $("#example-modal-sizes-title-lg");

    public RegistrationPage openPage() {
        open("/automation-practice-form");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        return this;
    }

    public RegistrationPage setFirstName(String value) {
        firstNameInput.setValue(value);

        return this;
    }

    public RegistrationPage setLastName(String value) {
        lastNameInput.setValue(value);

        return this;
    }

    public RegistrationPage setUserEmail(String value) {
        userEmailInput.setValue(value);

        return this;
    }

    public RegistrationPage setUserNumber(String value) {
        userNumberInput.setValue(value);

        return this;
    }

    public RegistrationPage setUserAddress(String value) {
        userCurrentAddress.setValue(value);

        return this;
    }

    public RegistrationPage setBirthDate(String day, String month, String year) {
        birthDateInput.click();
        calendar.setDate(day, month, year);

        return this;
    }

    public RegistrationPage setGender(String value) {
        genderWrapper.$(byText(value)).click();

        return this;
    }

    public RegistrationPage setHobby(String value) {
        hobbiesWrapper.$(byText(value)).click();

        return this;
    }

    public RegistrationPage setSubject(String value) {
        userSubjectInput.setValue(value).pressEnter();

        return this;
    }

    public RegistrationPage setPicture(String value) {
        userPictureInput.uploadFromClasspath(value);

        return this;
    }

    public RegistrationPage setState(String value) {
        userStateInput.click();
        userStateInput.$(byText(value)).click();

        return this;
    }

    public RegistrationPage setCity(String value) {
        userCityInput.click();
        userCityInput.$(byText(value)).click();

        return this;
    }

    public RegistrationPage submitForm() {
        submitButton.click();

        return this;
    }

    public RegistrationPage checkTableTitle(String value) {
        tableTitle.shouldHave(text(value));

        return this;
    }

    public RegistrationPage checkResult(String value) {
        outputTable.shouldHave(text(value));

        return this;
    }
}