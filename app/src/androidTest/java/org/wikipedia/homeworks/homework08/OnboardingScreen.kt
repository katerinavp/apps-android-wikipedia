package org.wikipedia.homeworks.homework08

import com.kaspersky.kaspresso.screens.KScreen
import io.github.kakaocup.kakao.pager2.KViewPager2
import io.github.kakaocup.kakao.tabs.KTabLayout
import io.github.kakaocup.kakao.text.KButton
import org.wikipedia.OnboardingScreen
import org.wikipedia.R


object OnboardingScreen : KScreen<OnboardingScreen>() {
    override val layoutId = R.layout.fragment_onboarding_pager
    override val viewClass = null

    val skipButton = KButton {
        withId(R.id.fragment_onboarding_skip_button)
    }

    val forwardButton = KButton {
        withId(R.id.fragment_onboarding_forward_button)
    }

    val doneButton = KButton {
        withId(R.id.fragment_onboarding_done_button)
    }

    val pageIndicator = KTabLayout {
        withId(R.id.view_onboarding_page_indicator)
    }

    val slider = KViewPager2(
        // передаем набор матчеров
        builder = {
            withId(R.id.fragment_pager)
        },

        //
        itemTypeBuilder = {
            itemType(::OnboardingPagerItem)
        }
    )

}
