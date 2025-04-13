package org.wikipedia.homeworks.homework20

import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Rule
import org.junit.Test
import org.wikipedia.homeworks.homework03.OnboardingScreen
import org.wikipedia.homeworks.homework07.ExploreScreen
import org.wikipedia.main.MainActivity

class ExploreTest : TestCase() {

    @get:Rule
    val activityScenarioRule: ActivityScenarioRule<MainActivity> =
        ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun simpleTest() {
        run {
            namedSteps.click(OnboardingScreen.skipButton)
//            "Проверяет отображение тулбара"
            namedSteps.isDisplayed(ExploreScreen.toolbarTitle)

        }
    }
}
