package org.wikipedia.homeworks.homework20

import com.kaspersky.kaspresso.testcases.core.testcontext.TestContext
import org.wikipedia.homeworks.homework19.Steps

private val stepContextCache = mutableMapOf<TestContext<*>, Steps>()
private val namedStepContextCache = mutableMapOf<TestContext<*>, NamedSteps>()

val TestContext<*>.steps: Steps
    get() = stepContextCache.getOrPut(this) { Steps(this) }

val TestContext<*>.namedSteps: NamedSteps
    get() = namedStepContextCache.getOrPut(this) { NamedSteps(this) }