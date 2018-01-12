package com.mytaxi;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.IdlingPolicies;
import android.support.test.espresso.IdlingResource;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.mytaxi.android_demo.activities.MainActivity;
import com.mytaxi.utils.ElapsedTimeIdlingResource;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

@RunWith(AndroidJUnit4.class)
public abstract class BaseTest {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityRule = new ActivityTestRule<>(
            MainActivity.class);
    public static MainActivity mainActivity = null;


    @Before
    public void setUp() {
        mainActivity = mainActivityRule.getActivity();
        IdlingPolicies.setMasterPolicyTimeout(60, TimeUnit.SECONDS);
        IdlingPolicies.setIdlingResourceTimeout(26, TimeUnit.SECONDS);
        IdlingResource idlingResource = new ElapsedTimeIdlingResource(10);
        Espresso.registerIdlingResources(idlingResource);
    }

    @After
    public void tearDown() {
        mainActivityRule.finishActivity();
    }

}
