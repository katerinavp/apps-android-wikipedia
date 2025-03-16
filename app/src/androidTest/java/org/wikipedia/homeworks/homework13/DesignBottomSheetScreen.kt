package org.wikipedia.homeworks.homework13

import com.kaspersky.kaspresso.screens.KScreen
import io.github.kakaocup.kakao.pager2.KViewPager2
import io.github.kakaocup.kakao.text.KTextView
import org.wikipedia.R

object DesignBottomSheetScreen : KScreen<DesignBottomSheetScreen>() {
    override val layoutId = null
    override val viewClass = null

    val referenceTitleText = KTextView {
        withId(R.id.reference_title_text)
    }

    val referencePager = KViewPager2(
        builder = {
            withId(R.id.reference_pager)
        },

        //
        itemTypeBuilder = {
            itemType(::ReferencesPagerItem)
        }
    )
}