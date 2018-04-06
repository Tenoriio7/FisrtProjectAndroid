package com.example.viniciustenorio.minhacalculadora;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.runner.AndroidJUnitRunner;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.hasBackground;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by viniciustenorio on 10/17/17.
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> rule = new ActivityTestRule(MainActivity.class);

    @Test
    public void testaSeOBotaoEstaVisivel(){
//        onView(withId(R.id.et_nota1)).perform(typeText("1"));
//        onView(withId(R.id.button)).perform(click());
//        onView(withId(R.id.button)).check(matches(hasBackground(R.color.colorAccent)));
        MainActivityRobot robot = new MainActivityRobot(rule);
        robot.preencheNotas("6","0","0")
                .clickCalcular();

    }
}
