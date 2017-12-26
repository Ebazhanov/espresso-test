package com.mytaxi.tests;

import com.mytaxi.BaseTest;
import com.mytaxi.base.pages.LoginPage;
import com.mytaxi.base.pages.SearchPage;

import org.junit.Test;

import java.io.IOException;

public class TestTask extends BaseTest {

    private static final String LOGIN_NAME = "whiteelephant261";
    private static final String USER_PASSWORD = "video";
    private static final String DRIVER_NAME = "Sarah Friedrich";

    @Test
    public void loginCase() throws InterruptedException, IOException {
        new LoginPage()
                .enterLoginName(LOGIN_NAME)
                .enterUserPassword(USER_PASSWORD)
                .clickOnLoginButton()
                .clickOnUserMenuButton()
                .checKPresenceUserName(LOGIN_NAME);
    }

    @Test
    public void searchForDriverName() throws InterruptedException {
        new SearchPage()
                .enterTextIntoSearchField("SA")
                .checkPresenceOfDriverNameInTheList(DRIVER_NAME)
                .clickOnDriverNameInTheList(DRIVER_NAME)
                .checkPresenceOfDriverNameOnProfilePage(DRIVER_NAME)
                .clickOnCallButton();
    }

}
