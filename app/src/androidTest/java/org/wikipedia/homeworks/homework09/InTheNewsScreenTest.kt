package org.wikipedia.homeworks.homework09

import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.kaspersky.components.alluresupport.withForcedAllureSupport
import com.kaspersky.kaspresso.kaspresso.Kaspresso
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Rule
import org.junit.Test
import org.wikipedia.R
import org.wikipedia.homeworks.homework07.ExploreScreen
import org.wikipedia.homeworks.homework07.NewsViewItem
import org.wikipedia.homeworks.homework08.OnboardingScreen
import org.wikipedia.main.MainActivity

class InTheNewsScreenTest : TestCase(Kaspresso.Builder.withForcedAllureSupport { }) {

    @get:Rule
    val activityScenarioRule: ActivityScenarioRule<MainActivity> =
        ActivityScenarioRule(MainActivity::class.java)

//    @After
//    fun tearDown() {
//        device.files.pull("/sdcard/Documents/allure-results", "app/build")
//    }

    // Реализовать такой сценарий теста:
    // - Скипаем онбординг
    // - Находим блок In the news (по тексту заголовка)
    // - Листаем до третьей картинки и кликаем по ней
    // - Кликаем по второй статье из списка
    // - Проверяем, что отображается элемент с ID page_web_view
    @Test
    fun checkElements() {
        run {
            step("Скипаем онбординг") {
                OnboardingScreen.skipButton.click()
            }

            //"Находим блок In the news (по тексту заголовка)"
            ExploreScreen.items.childWith<NewsViewItem> {
                withDescendant { R.string.view_card_news_title }
            }.perform {
                step("Листаем до третьей картинки и кликаем по ней") {
                    newsRecycler.childAt<NewsCardViewItem>(2) {
                        click()
                    }

//                    InTheNewsScreen.items.childAt<InTheNewsCardItem>(1) {
//                        InTheNewsScreen.items.swipeUp()
//                        step("Кликаем по второй статье из списка") {
//                            click()
//                        }
//                    }

//                    step("Проверяем, что отображается элемент с ID page_web_view") {
//                        InTheNewsArticleScreen.webView.isDisplayed()
//                    }
                }


            }


        }

    }
}