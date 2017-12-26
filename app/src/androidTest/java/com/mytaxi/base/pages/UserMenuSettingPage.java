package com.mytaxi.base.pages;

import android.support.test.espresso.assertion.ViewAssertions;

import com.mytaxi.android_demo.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class UserMenuSettingPage {

    public UserMenuSettingPage checKPresenceUserName(String userName) throws InterruptedException {
        onView(withId(R.id.nav_username)).check(ViewAssertions.matches(withText(userName)));
        return this;
    }

    public UserMenuSettingPage clickOnLogoutButton() {
        onView(withText("Logout")).perform(click());
        return this;
    }

}
