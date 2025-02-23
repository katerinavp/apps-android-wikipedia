package org.wikipedia.homeworks.homework07

import android.view.View
import io.github.kakaocup.kakao.common.views.KView
import io.github.kakaocup.kakao.image.KImageView
import io.github.kakaocup.kakao.recycler.KRecyclerItem
import io.github.kakaocup.kakao.text.KButton
import io.github.kakaocup.kakao.text.KTextView
import org.hamcrest.Matcher
import org.wikipedia.R

class CustomizeViewItem(matcher: Matcher<View>) :
    KRecyclerItem<CustomizeViewItem>(matcher) {
    val headerImage = KImageView(matcher) {
        withId(R.id.view_announcement_header_image)
    }

    val announcementText = KTextView(matcher) {
        withId(R.id.view_announcement_text)
    }

    val positiveButton = KButton(matcher) {
        withId(R.id.view_announcement_action_positive)
    }

    val negativeButton = KButton(matcher) {
        withId(R.id.view_announcement_action_negative)
    }

    val negativeDialogButton = KButton(matcher) {
        withId(R.id.view_announcement_dialog_action_negative)
    }

    val positiveDialogButton = KButton(matcher) {
        withId(R.id.view_announcement_dialog_action_positive)
    }
    val dividerView = KView(matcher) {
        withId(R.id.view_announcement_footer_border)
    }
    val footerText = KTextView(matcher){
        withId(R.id.view_announcement_footer_text)
    }
}

