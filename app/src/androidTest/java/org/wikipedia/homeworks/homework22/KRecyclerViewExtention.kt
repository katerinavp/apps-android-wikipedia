package org.wikipedia.homeworks.homework22

import io.github.kakaocup.kakao.recycler.KRecyclerItem
import io.github.kakaocup.kakao.recycler.KRecyclerView
import org.wikipedia.homeworks.homework20.name
import org.wikipedia.homeworks.homework20.withParent

inline fun <reified T : KRecyclerItem<*>> KRecyclerView.invokeById(
    targetIndex: Int,
    targetId: Int,
    blockName: String,
    function: T.() -> Unit
) {
    val recycler = this
    var findBlockCounter = 0
    recycler.getSize()
    for (i in 0 until recycler.getSize()) {
        childAt<T>(i) {
            if (hasIdAction(targetId)) findBlockCounter++
        }
        if (findBlockCounter == targetIndex) {
            name(recycler.name().withParent("$targetIndex's block of $blockName"))
        }
    }

}

inline fun <reified T : KRecyclerItem<*>> KRecyclerView.invokeById() {

}