package org.wikipedia.homeworks.homework06

import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.Matchers.allOf
import org.hamcrest.TypeSafeMatcher


data class Shape(val length: Float, val countOfSides: Int, val color: Color)

enum class Color {
    RED, BLUE, GREEN, YELLOW, BLACK, WHITE
}

//Проверка длины стороны в заданном диапазоне (например, от 0.1 до 100.0).+
class ShapeLengthInRangeMatcher(
    private val minLength: Float,
    private val maxLength: Float
) : TypeSafeMatcher<Shape>() {
    override fun describeTo(description: Description) {
        description.appendText("length is between $minLength and $maxLength")
    }

    override fun matchesSafely(activity: Shape): Boolean {
        return activity.length in minLength..maxLength
    }

}

//Проверка на чётное количество сторон
class CountOfSidesInMatcher : TypeSafeMatcher<Shape>() {
    override fun describeTo(description: Description) {
        description.appendText("count should be even")
    }

    override fun matchesSafely(activity: Shape): Boolean {
        return activity.countOfSides % 2 == 0
    }

    override fun describeMismatchSafely(item: Shape?, mismatchDescription: Description?) {
        super.describeMismatchSafely(item, mismatchDescription)
    }

}

//Проверка цвета фигуры.
class ColorInMatcher(
    private val colors: List<Color>
) : TypeSafeMatcher<Shape>() {
    override fun describeTo(description: Description) {
        description.appendText("color is one of $colors")
    }

    override fun matchesSafely(activity: Shape): Boolean {
        return activity.color in colors
    }

}

//Проверка на наличие отрицательной длины стороны (недопустимо).+
class NoNegativeLengthOfSideInMatcher(
) : TypeSafeMatcher<Shape>() {
    override fun describeTo(description: Description) {
        description.appendText("length should be positive ")
    }

    override fun matchesSafely(activity: Shape): Boolean {
        return activity.length >= 0
    }

}

//Проверка на наличие отрицательного количества сторон (недопустимо).
class NoNegativeCountOfSideInMatcher(
) : TypeSafeMatcher<Shape>() {
    override fun describeTo(description: Description) {
        description.appendText("count should be positive ")
    }

    override fun matchesSafely(activity: Shape): Boolean {
        return activity.countOfSides >= 0
    }

}

class MatcherBuilder() {
    val listOfMatchers = mutableListOf<Matcher<Shape>>()
    operator fun invoke(function: MatcherBuilder.() -> Unit) {
        function()
    }

    //создадим под каждый матчер метод
    fun length(minLength: Float, maxLength: Float) {
        listOfMatchers.add(ShapeLengthInRangeMatcher(minLength, maxLength))
    }

    fun evenCount() {
        listOfMatchers.add(CountOfSidesInMatcher())
    }

    fun color(validColors: List<Color>) {
        listOfMatchers.add(ColorInMatcher(validColors))
    }

    fun negativeLength() {
        listOfMatchers.add(NoNegativeLengthOfSideInMatcher())
    }

    fun negativeCountOfSide() {
        listOfMatchers.add(NoNegativeCountOfSideInMatcher())
    }

    // объеденит все матчеры и вернет их .
    //  выполнить все проверки и выдаст обобщенный результат
    fun buildAllMatchers() = allOf(listOfMatchers)

}


fun main() {
    val activities = listOf(
        Shape(10f, 3, Color.RED), Shape(5f, 4, Color.BLUE), Shape(7f, 2, Color.GREEN),
        Shape(0.5f, 1, Color.YELLOW), Shape(-3f, 5, Color.BLACK), Shape(8f, -2, Color.WHITE),
        Shape(12f, 6, Color.RED), Shape(15f, 8, Color.BLUE), Shape(20f, 4, Color.GREEN),
        Shape(9f, 5, Color.YELLOW), Shape(2f, 3, Color.BLACK), Shape(11f, 7, Color.WHITE),
        Shape(6f, 10, Color.RED), Shape(3f, 2, Color.BLUE), Shape(4f, 1, Color.GREEN),
        Shape(25f, 12, Color.YELLOW), Shape(30f, 14, Color.BLACK), Shape(35f, 16, Color.WHITE),
        Shape(40f, 18, Color.RED), Shape(50f, 20, Color.BLUE)
    )

    val matchers = allOf(
        ShapeLengthInRangeMatcher(0.1f, 6.0f),
        CountOfSidesInMatcher(),
        ColorInMatcher(listOf(Color.RED, Color.BLUE)),
        NoNegativeLengthOfSideInMatcher(),
        NoNegativeCountOfSideInMatcher()
    )

    val result = activities.filter { matchers.matches(it) }
    val builder = MatcherBuilder()

    //доступны набор методов
    builder {
        length(5f,12f)
        evenCount()
        color(listOf(Color.WHITE, Color.BLACK))
        negativeLength()
        negativeCountOfSide()
    }

    println("result " + result + " size " + result.size )

}





