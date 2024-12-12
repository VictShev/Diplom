package ru.iteco.fmhandroid.ui.page;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.withHint;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import android.view.View;

import androidx.test.espresso.ViewInteraction;

import org.hamcrest.Matcher;

import ru.iteco.fmhandroid.R;

public class AuthorizationPage {
    public ViewInteraction title;
    public ViewInteraction loginField;
    public ViewInteraction passwordField;
    public ViewInteraction loginButton;
    public Matcher<View> loginButtonMatcher;

    public AuthorizationPage() {
        title = onView(withText("Авторизация"));
        loginField = onView(withHint("Логин"));
        passwordField = onView(withHint("Пароль"));
        loginButtonMatcher = withId(R.id.enter_button);
        loginButton = onView(loginButtonMatcher);
    }

}
