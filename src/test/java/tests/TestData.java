package tests;

import utils.RandomUtils;

public class TestData {

    RandomUtils randomUtils = new RandomUtils();

    public String userFirstName = randomUtils.getRandomFirstName(),
            userLastName = randomUtils.getRandomLastName(),
            userStreetAddress = randomUtils.getRandomStreetAddress(),
            userPhoneNumber = randomUtils.getRandomPhoneNumber(),
            userEmailAddress = randomUtils.getRandomEmailAddress(),
            userGender = randomUtils.getRandomGender(),
            userSubject = randomUtils.getRandomSubject(),
            userHobby = randomUtils.getRandomHobby(),
            userPicture = randomUtils.getRandomPicture(),
            userState = randomUtils.getRandomState(),
            userCity = randomUtils.getRandomCity(),
            userBirthdayDay = Integer.toString(randomUtils.getRandomDay()),
            userBirthdayMonth = randomUtils.getRandomMonth(),
            userBirthdayYear = Integer.toString(randomUtils.getRandomYear()),
            userFullName = randomUtils.getRandomFullName(),
            userCurrentAddress = randomUtils.getRandomCurrentAddress(),
            userPermanentAddress = randomUtils.getRandomPermanentAddress();
}
