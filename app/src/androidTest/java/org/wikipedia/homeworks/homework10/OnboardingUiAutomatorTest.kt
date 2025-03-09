package org.wikipedia.homeworks.homework10

import androidx.compose.ui.test.hasText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Rule
import org.junit.Test
import org.wikipedia.main.MainActivity

class OnboardingUiAutomatorTest : TestCase() {
    @get:Rule
    val activityScenarioRule: ActivityScenarioRule<MainActivity> =
        ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun checkImageIsView() {
        run {
            OnboardingUiScreen.image.isEnabled()
        }


    }

    @Test
    fun checkButtonOnOnboardingScreen() {
        run {
            step(" проверка видимости  на экран кнопки скип и текста кнопки") {
                OnboardingUiScreen.skipButton.isDisabled()
                hasText("Skip")
            }
            step(" проверка видимости  на экран кнопки done и текста кнопки") {
                OnboardingUiScreen.doneButton.isDisabled()
                hasText("Get started")
            }
            step(" проверка видимости  на экран кнопки foward и текста кнопки") {
                OnboardingUiScreen.forwardButton.isDisabled()
                hasText("Get started")
            }


        }
    }

    @Test
    fun checkChangeOnboardingScreen() {
        run {
            step(" клик по индикатору переход на след экран") {
                OnboardingUiScreen.pageIndicator.setSelectedItemWithIndex(1)
            }
        }
    }


}