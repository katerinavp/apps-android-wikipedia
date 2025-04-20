package org.wikipedia.homeworks.homework21

import io.github.kakaocup.kakao.common.assertions.BaseAssertions
import org.wikipedia.homeworks.homework21.Assertions.CustomViewAssertion

fun BaseAssertions.customCheckText(text: String) {
    view.check(CustomViewAssertion(text))
}