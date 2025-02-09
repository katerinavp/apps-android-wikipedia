package org.wikipedia.homeworks.homework03

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.widget.NestedScrollView
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.button.MaterialButton
import com.google.android.material.tabs.TabLayout
import org.wikipedia.views.AppTextView


val wikiLogo = listOf(
    ImageView::class.java, //class
    "imageViewCentered",//id
    null//ID текста
)

val viewPager = listOf(
    ViewPager2::class.java,
    "fragment_pager",
    null
)

val primaryTextView = listOf(
    AppTextView::class.java,
    "primaryTextView",
    null
)

val secondaryTextView = listOf(
    AppTextView::class.java,
    "secondaryTextView",
    null
)
val languagesList = listOf(
    RecyclerView::class.java,
    "languagesList",
    null
)

val labelItem = listOf(
    AppTextView::class.java,
    "option_label",
    null
)

val addLanguageButton = listOf(
    MaterialButton::class.java,
    "option_label",
    "onboarding_multilingual_add_language_text"
)

val skipButton = listOf(
    MaterialButton::class.java,
    "fragment_onboarding_skip_button",
    "onboarding_skip"
)

val forwardButton = listOf(
    MaterialButton::class.java,
    "fragment_onboarding_forward_button",
    "onboarding_continue"
)

val doneButton = listOf(
    MaterialButton::class.java,
    "fragment_onboarding_done_button",
    "onboarding_get_started"
)

val pageIndicator = listOf(
    TabLayout::class.java,
    "view_onboarding_page_indicator",
    null
)

val scrollView = listOf(
    NestedScrollView::class.java,
    "scrollView",
    null
)

val imageSecondPage = listOf(
    ImageView::class.java,
    "imageViewCentered",
    null
)

val primaryTextViewSecondPage = listOf(
    AppTextView::class.java,
    "primaryTextView",
    null
)

val secondaryTextViewSecondPage = listOf(
    AppTextView::class.java,
    "secondaryTextView",
    null
)

val thankImage = listOf(
    ImageView::class.java,
    "thankImage",
    null
)

val thankTitle = listOf(
    TextView::class.java,
    "thankTitle",
    "patroller_onboarding_two_thank_title"
)

val thankContent = listOf(
    TextView::class.java,
    "thankContent",
    "patroller_onboarding_two_thank_content"
)

val watchImage = listOf(
    ImageView::class.java,
    "watchImage",
    null
)

val watchTitle = listOf(
    TextView::class.java,
    "watchTitle",
    "patroller_onboarding_two_watch_title",

    )

val watchContent =
    listOf(
        TextView::class.java,
        "watchContent",
        "patroller_onboarding_two_watch_content"
    )

val talkImage = listOf(
    ImageView::class.java,
    "talkImage",
    null
)

val talkTitle = listOf(
    TextView::class.java,
    "talkTitle",
    "patroller_onboarding_two_talk_title"
)

val talkContent = listOf(
    TextView::class.java,
    "talkContent",
    "patroller_onboarding_two_talk_content"
)

val undoImage = listOf(
    ImageView::class.java,
    "undoImage",
    null
)

val undoTitle = listOf(
    TextView::class.java,
    "undoTitle ",
    "patroller_onboarding_two_undo_title"
)

val undoContent = listOf(
    TextView::class.java,
    "undoContent",
    "patroller_onboarding_two_undo_content"
)

val goneIfEmptyTextView = listOf(
    TextView::class.java,
    "tertiaryTextView",
    "description_edit_tutorial_promise"
)

val bottomOffset = listOf(
    View::class.java,
    "bottomOffset",
    "description_edit_tutorial_promise"
)