package tests;

import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

public class DemoQAFormTests extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();


    @Test
    void fillFormTest() {
        registrationPage.openPage()
                .setFirstName("Ivan")
                .setLastName("Ivanov")
                .setUserEmail("Ivanovivan@gmail.com")
                .setGender("Male")
                .setUserNumber("8911018552")
                .setBirthDate("03", "March", "1990")
                .setSubject("English")
                .setHobby("Sports")
                .setPicture("test.jpg")
                .setUserAddress("Saint Petersburg, Russia")
                .setState("NCR")
                .setCity("Delhi")
                .submitForm();

        registrationPage.checkTableTitle("hanks for submitting the form")
                .checkResult("Ivan Ivanov")
                .checkResult("Ivanovivan@gmail.com")
                .checkResult("Male")
                .checkResult("8911018552")
                .checkResult("03 March,1990")
                .checkResult("English")
                .checkResult("Sports")
                .checkResult("test.jpg")
                .checkResult("Saint Petersburg, Russia")
                .checkResult("NCR Delhi");
    }
}
