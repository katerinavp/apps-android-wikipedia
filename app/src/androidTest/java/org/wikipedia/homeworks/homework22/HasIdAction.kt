package org.wikipedia.homeworks.homework22

import android.view.View
import androidx.test.espresso.UiController
import androidx.test.espresso.ViewAction
import androidx.test.espresso.matcher.ViewMatchers
import org.hamcrest.Matcher

class HasIdAction(val nameId: Int) : ViewAction {
    var result: Boolean = false
    override fun getConstraints(): Matcher<View> {
        return ViewMatchers.isAssignableFrom(View::class.java)
    }

    override fun getDescription(): String {
        return "Perform id"
    }

    override fun perform(uiController: UiController?, view: View?) {
        if (view == null) {
            throw RuntimeException("нет объекта")
        }
        if (nameId == view.id) {
            result = true
        } else {
            val foundView = view.findViewById<View>(nameId)
            if (foundView != null) {
                result = foundView != null
            }
        }
    }

    fun getResult() = result
}