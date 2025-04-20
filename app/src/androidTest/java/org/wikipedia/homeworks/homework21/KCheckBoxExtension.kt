package org.wikipedia.homeworks.homework21

import io.github.kakaocup.kakao.check.KCheckBox

fun KCheckBox.toggle() {
    view.perform(ToggleCheckBoxAction())
}
