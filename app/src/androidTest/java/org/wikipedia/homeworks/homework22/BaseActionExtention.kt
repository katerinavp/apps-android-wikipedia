package org.wikipedia.homeworks.homework22

import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import io.github.kakaocup.kakao.common.actions.BaseActions

fun BaseActions.hasIdAction(targetId :Int): Boolean{
    val checker = HasIdAction(targetId)
    view.perform(checker)
    return  checker.isMatched()
}
