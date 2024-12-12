package ru.iteco.fmhandroid.ui.steps;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;

import io.qameta.allure.kotlin.Allure;
import ru.iteco.fmhandroid.ui.page.QuotesPage;


public class QuotesSteps {

    QuotesPage quotesPage = new QuotesPage();

    public void checkThatQuotesBlockContentIsFull() {
        Allure.step("Проверка блока с цитатами на полный контент");
        quotesPage.logo.check(matches(isDisplayed()));
        quotesPage.title.check(matches(isDisplayed()));
        quotesPage.ourMissionList.check(matches(isDisplayed()));
    }

    public void checkQuote(int number) {
        Allure.step("Свернуть/развернуть цитату");
        quotesPage.missionConstraintLayout.check(matches(isDisplayed()));
        quotesPage.missionConstraintLayout.perform(actionOnItemAtPosition(number, click()));
    }

    public void descriptionIsDisplay(String text) {
        Allure.step("Отображение дополнительной цитаты");
        quotesPage.getOurMissionItemDescription(text).check(matches(isDisplayed()));
    }

}
