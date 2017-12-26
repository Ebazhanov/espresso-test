package com.mytaxi.base.pages;

import com.mytaxi.android_demo.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class DriverProfilePage {

    public DriverProfilePage checkPresenceOfDriverNameOnProfilePage(String driverName) {
        onView(withId(R.id.textViewDriverName)).check(matches(withText(driverName)));
        return this;
    }

    public PhoneCallsPage clickOnCallButton() {
        onView(withId(R.id.fab)).perform(click());
        return new PhoneCallsPage();
    }
}
