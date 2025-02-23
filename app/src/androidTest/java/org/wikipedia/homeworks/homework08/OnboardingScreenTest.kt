package org.wikipedia.homeworks.homework08

import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Rule
import org.junit.Test
import org.wikipedia.main.MainActivity

class OnboardingScreenTest : TestCase() {

    @get:Rule
    val activityScenarioRule: ActivityScenarioRule<MainActivity> =
        ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun simpleTest() {
        run {   // функция run в которую передается сценарий

            step("Skipping") {
                OnboardingScreen.skipButton.click()
            }
            step("click forwardButton") {
                OnboardingScreen.forwardButton.click()
            }
            step("Проверяет отображение tab indicator") {
                OnboardingScreen.pageIndicator.isDisplayed()
            }
            step("Проверяет отображение кнопки doneButton.is"){
                OnboardingScreen.doneButton.isDisplayed()
            }


            step("слайды экрана в пейджере KViewPager2, список языков в ресайклере.") {
                OnboardingScreen.slider.isDisplayed()
                OnboardingScreen.slider.childAt<OnboardingPagerItem>(3) {
                    step("OnboardingPagerFirstItem.isDisplayed()") {
                        isDisplayed()
                    }

                    languages.childAt<LanguageViewItem>(1) {
                        text.isDisplayed()
                    }
                }
            }


        }

    }
}