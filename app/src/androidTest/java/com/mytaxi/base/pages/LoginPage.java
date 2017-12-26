package com.mytaxi.base.pages;

import com.mytaxi.android_demo.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class LoginPage {

    public LoginPage enterLoginName(String loginName) {
        onView(withId(R.id.edt_username)).perform(typeText(loginName));
        return this;
    }

    public LoginPage enterUserPassword(String password) throws InterruptedException {
        onView(withId(R.id.edt_password)).perform(typeText(password));
        return this;
    }

    public SearchPage clickOnLoginButton() throws InterruptedException {
        onView(withId(R.id.btn_login)).perform(click());
        Thread.sleep(3000);
        return new SearchPage();
    }
}
