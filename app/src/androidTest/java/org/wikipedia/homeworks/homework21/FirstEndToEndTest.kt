package org.wikipedia.homeworks.homework21
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Assert
import org.junit.Rule
import org.junit.Test
import org.wikipedia.homeworks.homework07.ExploreScreen
import org.wikipedia.homeworks.homework07.ExploreScreen.items
import org.wikipedia.homeworks.homework07.NewsCardViewItem
import org.wikipedia.homeworks.homework07.NewsViewItem
import org.wikipedia.homeworks.homework08.OnboardingScreen
import org.wikipedia.homeworks.homework09.InTheNewsArticleScreen
import org.wikipedia.homeworks.homework09.InTheNewsCardItem
import org.wikipedia.homeworks.homework09.InTheNewsScreen
import org.wikipedia.main.MainActivity

const val EXPLORE_SCREEN_ITEM = 3
const val ARTICLES_SCREEN_ITEM = 1

class FirstEndToEndTest : TestCase() {
    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun inTheNewsTest() = run {
        step("Click skip button on onboarding screen") {
//            OnboardingScreen.skipBtn.view.check(CustomViewAssertion("Skip"))
            OnboardingScreen.skipButton.customCheckText("Skip")
            val text = OnboardingScreen.skipButton.getText()
            Assert.assertEquals("Skip", text)
//            OnboardingScreen.skipBtn.view.perform(CustomViewAction())
            OnboardingScreen.skipButton.customClick()
        }
        step("Find In The News block and click to $EXPLORE_SCREEN_ITEM item") {
            ExploreScreen.items.childWith<NewsViewItem> {
                withDescendant {
                    withText("In the news")
                }
            }.perform {
                step("Swipe to $EXPLORE_SCREEN_ITEM item") {
                    items.childAt<NewsCardViewItem>(EXPLORE_SCREEN_ITEM) {
                        step("Click to item") {
                            click()
                        }
                    }
                }
            }
        }
        step("Find and click to $ARTICLES_SCREEN_ITEM article") {
            InTheNewsScreen.items.childAt<InTheNewsCardItem>(ARTICLES_SCREEN_ITEM) {
                step("Click to $ARTICLES_SCREEN_ITEM item") {
                    click()
                }
            }
        }
        step("Check page view was open") {
            /*
             * KView doesn't have an `isEnabled()` matcher, which Kaspresso tries to use internally with `isDisplayed()`.
             * To avoid this issue, use `isCompletelyDisplayed()`, `isVisible()` or `isNotGone()`
             */
            InTheNewsArticleScreen.webView.isCompletelyDisplayed()
        }
    }
}