package org.wikipedia.homeworks.homework21.Assertions

import android.view.View
import android.widget.ImageView
import androidx.test.espresso.NoMatchingViewException
import androidx.test.espresso.ViewAssertion
import org.junit.Assert

class HasDrawableAssertion:ViewAssertion {
    override fun check(view: View?, noViewFoundException: NoMatchingViewException?) {
        if (view is ImageView) {
            Assert.assertNull("Should have drawable", view.drawable)
        } else {
            throw (noViewFoundException ?: AssertionError("View is not text"))
        }
    }
}