package org.wikipedia.homeworks.homework08

import android.view.View
import io.github.kakaocup.kakao.image.KImageView
import io.github.kakaocup.kakao.pager2.KViewPagerItem
import io.github.kakaocup.kakao.recycler.KRecyclerView
import io.github.kakaocup.kakao.text.KTextView
import org.hamcrest.Matcher
import org.wikipedia.R

//для описания списка блока
class OnboardingPagerItem(matcher: Matcher<View>) : KViewPagerItem<OnboardingPagerItem>(matcher) {
    val image = KImageView(matcher) {
        withId((R.id.imageViewCentered))
    }
    val primaryTextView = KTextView(matcher) {
        withId((R.id.primaryTextView))
    }

    val secondaryTextView = KTextView(matcher){
        withId(R.id.secondaryTextView)
    }

    val languages = KRecyclerView(
        parent = matcher,
        builder = {
            withId(R.id.languageList)
        },
        itemTypeBuilder = { itemType(::LanguageViewItem) }
    )
}
