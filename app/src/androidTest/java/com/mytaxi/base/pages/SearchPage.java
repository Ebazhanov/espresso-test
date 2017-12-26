package com.mytaxi.base.pages;

import com.mytaxi.android_demo.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.contrib.DrawerActions.open;
import static android.support.test.espresso.matcher.RootMatchers.withDecorView;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static com.mytaxi.BaseTest.mainActivity;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;

public class SearchPage {

    public UserMenuSettingPage clickOnUserMenuButton() {
        onView(withId(R.id.drawer_layout)).perform(open());
        return new UserMenuSettingPage();
    }

    public SearchPage enterTextIntoSearchField(String searchText) throws InterruptedException {
        Thread.sleep(1000);
        onView(withId(R.id.textSearch)).perform(typeText(searchText));
        return this;
    }

    public SearchPage checkPresenceOfDriverNameInTheList(String searchResult) {
        onView(withText(searchResult))
                .inRoot(withDecorView(not(is(mainActivity.getWindow().getDecorView()))))
                .check(matches(isDisplayed()));
        return this;
    }

    public DriverProfilePage clickOnDriverNameInTheList(String driverName) {
        onView(withText(driverName)).inRoot(withDecorView(not(is(mainActivity.getWindow()
                .getDecorView())))).perform(scrollTo()).perform(click());
        return new DriverProfilePage();
    }
}
