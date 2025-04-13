package org.wikipedia.homeworks.homework13

import androidx.test.espresso.web.webdriver.Locator
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.kaspersky.components.alluresupport.withForcedAllureSupport
import com.kaspersky.kaspresso.kaspresso.Kaspresso
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Rule
import org.junit.Test
import org.wikipedia.homeworks.homework03.OnboardingScreen
import org.wikipedia.homeworks.homework07.ExploreScreen
import org.wikipedia.homeworks.homework07.NewsViewItem
import org.wikipedia.homeworks.homework07.SearchCardViewItem
import org.wikipedia.homeworks.homework19.Steps
import org.wikipedia.main.MainActivity

class WebViewTest : TestCase(Kaspresso.Builder.withForcedAllureSupport { }) {
    @get:Rule
    val activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun webViewTest() {
        run {
            val steps = Steps(this)
//            OnboardingScreen.skipButton.click()
            steps.click(OnboardingScreen.skipButton)
            ExploreScreen.items.childWith<SearchCardViewItem> {
                withDescendant { withText("Featured article") }
            }.perform {
                click()
            }
            ArticleViewScreen {
                webView {
//                    withElement(Locator.CSS_SELECTOR, ".mw-page-title-main")
                    withElement(Locator.XPATH, "//span[@class='mw-page-title-main']") {
                        hasText("Five ponds (gold coin)")
                    }

                }
            }
        }
    }

    @Test
    fun webViewReferencesTest() {
        run {
            OnboardingScreen.skipButton.click()

            ExploreScreen.items.childWith<NewsViewItem> {
                withDescendant { withText("Featured article") }
            }.perform {
                click()
            }
            step("References") {
                ArticleViewScreen {
                    webView {
                        withElement(Locator.ID, "References") {
                            scroll()
                            hasText("References")
                        }
                    }
                }
            }
            step("click 5") {
                ArticleViewScreen {
                    webView {
                        withElement(
                            Locator.XPATH, "//sup[@id='cite_ref-Universal_5-0']"
                        ) {
                            scroll()
                            click()
                        }
                    }
                }
            }


        }
    }
}