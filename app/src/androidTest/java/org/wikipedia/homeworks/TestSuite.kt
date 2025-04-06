package org.wikipedia.homeworks

import org.junit.runner.RunWith
import org.junit.runners.Suite
import org.wikipedia.homeworks.homework08.ExploreScreenTest
import org.wikipedia.homeworks.homework09.InTheNewsScreenTest

@RunWith(Suite::class)
@Suite.SuiteClasses(ExploreScreenTest::class,
    InTheNewsScreenTest::class)

class TestSuite {

}