package org.wikipedia.homeworks.homework21.Assertions

import io.github.kakaocup.kakao.image.ImageViewAssertions

fun ImageViewAssertions.hasAnyDrawable(){
    view.check(HasDrawableAssertion())
}

fun ImageViewAssertions.noDrawable(){
    view.check(HasNoDrawableAssertion())
}