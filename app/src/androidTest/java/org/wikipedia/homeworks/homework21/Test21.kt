package org.wikipedia.homeworks.homework21

import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Rule
import org.junit.Test
import org.wikipedia.homeworks.homework08.OnboardingScreen
import org.wikipedia.main.MainActivity

class Test21 : TestCase() {
    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun test() = run {
        run {
            step("Check text") {
                OnboardingScreen.skipButton.customCheckText("Skip")
            }

            val text = OnboardingScreen.skipButton.getText()
            println(text)
            step("custom click"){
                OnboardingScreen.skipButton.customClick()
            }
        }
    }
}