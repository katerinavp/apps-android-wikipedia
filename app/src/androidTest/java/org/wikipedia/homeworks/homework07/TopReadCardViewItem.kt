package org.wikipedia.homeworks.homework07

import android.view.View
import io.github.kakaocup.kakao.image.KImageView
import io.github.kakaocup.kakao.recycler.KRecyclerItem
import io.github.kakaocup.kakao.text.KTextView
import org.hamcrest.Matcher
import org.wikipedia.R

class TopReadCardViewItem(matcher: Matcher<View>) :
    KRecyclerItem<TopReadCardViewItem>(matcher) {

    val number = KTextView(matcher) {
        withId(R.id.numberView)
    }
    val title = KTextView(matcher) {
        withId(R.id.view_list_card_item_title)
    }

    val subtitle = KTextView(matcher) {
        withId(R.id.view_list_card_item_subtitle)
    }

    val graph = KTextView(matcher) {
        withId(R.id.view_list_card_item_graph)
    }

    val pageviews = KTextView(matcher) {
        withId(R.id.view_list_card_item_pageviews)
    }

    val image = KImageView(matcher) {
        withId(R.id.view_list_card_item_image)
    }


}

