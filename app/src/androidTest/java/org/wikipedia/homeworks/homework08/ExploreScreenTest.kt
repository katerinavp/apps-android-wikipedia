package org.wikipedia.homeworks.homework08

import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.kaspersky.components.alluresupport.withForcedAllureSupport
import com.kaspersky.kaspresso.kaspresso.Kaspresso
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Rule
import org.junit.Test
import org.wikipedia.homeworks.homework03.OnboardingScreen
import org.wikipedia.homeworks.homework07.ExploreScreen
import org.wikipedia.homeworks.homework07.SearchCardViewItem
import org.wikipedia.homeworks.homework07.TopReadCardViewItem
import org.wikipedia.homeworks.homework07.TopReadViewItem
import org.wikipedia.main.MainActivity

class ExploreScreenTest : TestCase(Kaspresso.Builder.withForcedAllureSupport{}) {

    @get:Rule
    val activityScenarioRule: ActivityScenarioRule<MainActivity> =
        ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun simpleTest() {
        run {   // функция run в которую передается сценарий
            step("Skipping") {
                OnboardingScreen.skipButton.click()
            }
            step("Проверяет отображение тулбара") {
                ExploreScreen.toolbarTitle.isDisplayed()
            }
            step("Checking logo of mic in search") {
                ExploreScreen.items.childAt<SearchCardViewItem>(0) {
                    voiceIcon.isDisplayed()
                }
            }
            step("Checking has logo in 2nd child in topRead") {
                ExploreScreen.items.swipeUp()
                ExploreScreen.items.childAt<TopReadViewItem>(3) {
                    step("TopReadViewItem.isDisplayed()") {
                        isDisplayed()
                    }

                    items.childAt<TopReadCardViewItem>(1) {
                        image.isDisplayed()
                    }
                }
            }
        }
    }
}