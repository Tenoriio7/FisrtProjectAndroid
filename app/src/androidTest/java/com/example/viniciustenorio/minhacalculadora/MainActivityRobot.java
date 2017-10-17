package com.example.viniciustenorio.minhacalculadora;

import android.support.test.rule.ActivityTestRule;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by viniciustenorio on 10/17/17.
 */

public class MainActivityRobot {

    public MainActivityRobot(ActivityTestRule<MainActivity> rule) {

    }

    public MainActivityRobot preencheNota1ComValor(String valor){
        onView(withId(R.id.et_nota1)).perform(typeText(valor));
        return this;
    }

    public MainActivityRobot clickCalcular(){
        onView(withId(R.id.button)).perform(click());
        return this;
    }

    public MainActivityRobot checaCorBotao(){
        onView(withId(R.id.button));
        return this;
    }
}
