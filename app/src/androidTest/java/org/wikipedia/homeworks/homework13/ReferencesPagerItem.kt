package org.wikipedia.homeworks.homework13

import android.view.View
import io.github.kakaocup.kakao.image.KImageView
import io.github.kakaocup.kakao.pager2.KViewPagerItem
import io.github.kakaocup.kakao.text.KTextView
import org.hamcrest.Matcher
import org.wikipedia.R


class ReferencesPagerItem(matcher: Matcher<View>) : KViewPagerItem<ReferencesPagerItem>(matcher) {
    val referenceId = KImageView(matcher) {
        withId((R.id.reference_id))
    }
    val referenceText = KTextView(matcher) {
        withId((R.id.reference_text))
    }

    val referenceExtLink = KImageView(matcher){
        withId(R.id.reference_ext_link)
    }

}
