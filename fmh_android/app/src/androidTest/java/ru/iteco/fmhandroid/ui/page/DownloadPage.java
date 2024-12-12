package ru.iteco.fmhandroid.ui.page;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import android.view.View;

import androidx.test.espresso.ViewInteraction;

import org.hamcrest.Matcher;

import ru.iteco.fmhandroid.R;

public class DownloadPage {

    public ViewInteraction splashImage;
    public ViewInteraction splashText;
    public ViewInteraction splashProgressIndicator;
    public Matcher<View> splashImageMatcher;

    public DownloadPage() {
        splashImageMatcher = withId(R.id.splashscreen_image_view);
        splashImage = onView(splashImageMatcher);
        splashText = onView(withId(R.id.splashscreen_text_view));
        splashProgressIndicator =
                onView(withId(R.id.splash_screen_circular_progress_indicator));
    }
}
