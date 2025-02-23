package org.wikipedia.homeworks.homework07

import android.view.View
import io.github.kakaocup.kakao.recycler.KRecyclerItem
import io.github.kakaocup.kakao.text.KTextView
import org.hamcrest.Matcher
import org.wikipedia.R

class DateHeaderViewItem(matcher: Matcher<View>) : KRecyclerItem<DateHeaderViewItem>(matcher) {

    val headerText = KTextView(matcher){
        withId(R.id.day_header_text)
    }
}