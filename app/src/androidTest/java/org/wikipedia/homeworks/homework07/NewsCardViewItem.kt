package org.wikipedia.homeworks.homework07

import android.view.View
import io.github.kakaocup.kakao.image.KImageView
import io.github.kakaocup.kakao.recycler.KRecyclerItem
import org.hamcrest.Matcher
import org.wikipedia.R

class NewsCardViewItem(matcher: Matcher<View>) :
    KRecyclerItem<NewsCardViewItem>(matcher) {

    val image = KImageView(matcher) {
        withId(R.id.horizontal_scroll_list_item_image)
    }
    val text = KImageView(matcher) {
        withId(R.id.horizontal_scroll_list_item_text)
    }


}

