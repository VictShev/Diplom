package ru.iteco.fmhandroid.ui.steps;

import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static ru.iteco.fmhandroid.ui.activity.DataHelper.elementWaiting;

import io.qameta.allure.kotlin.Allure;
import ru.iteco.fmhandroid.ui.page.DownloadPage;

public class DownloadSteps {

    DownloadPage downloadPage = new DownloadPage();

    public void checkThatDownloadPageContentIsFull() {
        Allure.step("Наличие всех элементов экрана загрузки");
        downloadPage.splashImage.check(matches(isDisplayed()));
        downloadPage.splashProgressIndicator.check(matches(isDisplayed()));
        downloadPage.splashText.check(matches(isDisplayed()));
    }

    public void appDownload() {
        Allure.step("Загрузка приложения");
        elementWaiting(downloadPage.splashImageMatcher, 10000);
    }
}
