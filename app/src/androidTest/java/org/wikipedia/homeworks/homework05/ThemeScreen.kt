package org.wikipedia.homeworks.homework05

import android.widget.LinearLayout
import com.google.android.material.R as materialR
import io.github.kakaocup.kakao.common.views.KView
import io.github.kakaocup.kakao.image.KImageView
import io.github.kakaocup.kakao.progress.KProgressBar
import io.github.kakaocup.kakao.progress.KSeekBar
import io.github.kakaocup.kakao.switch.KSwitch
import io.github.kakaocup.kakao.text.KButton
import io.github.kakaocup.kakao.text.KTextView
import org.wikipedia.R

val dialogBottomSheet = KView{
    withId(materialR.id.design_bottom_sheet)

}
val progressBar = KProgressBar {
    withId(R.id.font_change_progress_bar)

}
val titleText = KTextView {
    withId(R.string.theme_category_reading)
    withId(R.id.textSettingsCategory)
    withParent {
        isInstanceOf(LinearLayout::class.java)
    }

    val sizeText = KTextView {
        withId(R.id.text_size_percent)
    }

    val buttonTextSize = KTextView {
        withId(R.id.buttonDecreaseTextSize)
    }

    val textSizeSeekBar = KSeekBar {
        withId(R.id.text_size_seek_bar)
    }

    val syntaxHighlightSwitch = KSwitch {
        withId(R.id.syntax_highlight_switch)
        withText(R.string.editing_syntax_highlight_label)
    }
    val typingSuggestionsSwitch = KSwitch {
        withId(R.id.typing_suggestions_switch)
        withText(R.string.editing_typing_suggestions)
    }

    val showLineNumbersSwitch = KSwitch {
        withId(R.id.show_line_numbers_switch)
        withText(R.string.editing_line_numbers_label)
    }

    val monospaceFontSwitch = KSwitch {
        withId(R.id.monospace_font_switch)
        withText(R.string.editing_monospace_font_label)
    }

    val fontContainer = KView {
        withId(R.id.fontFamilyContainer)
    }

    val buttonFontFamilySansSerif = KButton {
        withId(R.id.button_font_family_sans_serif)
        withText(R.string.font_family_sans_serif)
    }

    val buttonFontFamilySerif = KButton {
        withId(R.id.button_font_family_serif)
        withText(R.string.font_family_serif)
    }

    val readingFocusModeContainer = KView {
        withId(R.id.readingFocusModeContainer)
    }

    val iconReadingFocusMode = KImageView {
        withDrawable(R.drawable.ic_icon_reading_focus_mode)
    }
    val themeChooserReadingFocusModeSwitch = KView {
        withId(R.id.theme_chooser_reading_focus_mode_switch)
        withText(R.string.reading_focus_mode)
    }

    val themeChooserReadingFocusModeDescription = KTextView {
        withId(R.id.theme_chooser_reading_focus_mode_description)
    }

    val textTheme = KTextView {
        isDescendantOfA {  withId(materialR.id.design_bottom_sheet) }
        withId(R.string.color_theme_select)
    }
    val buttonThemeLight = KButton {
        withId(R.id.button_theme_light)
    }
    val buttonThemeSepia = KButton {
        withId(R.id.button_theme_sepia)
    }
    val buttonThemeDark = KButton {
        withId(R.id.button_theme_dark)
    }
    val button_theme_black = KButton {
        withId(R.id.button_theme_black)
    }
    val systemThemeSwitch = KSwitch {
        withId(R.id.theme_chooser_match_system_theme_switch)
        withText(R.string.theme_chooser_dialog_match_system_theme_switch_label)
    }
    val darkModeDimImagesSwitch = KSwitch {
        withId(R.id.theme_chooser_dark_mode_dim_images_switch)
        withText(R.string.theme_chooser_dialog_image_dimming_switch_label)
    }

}


