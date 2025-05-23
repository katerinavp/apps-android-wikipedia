package org.wikipedia.homeworks.homework20

import com.kaspersky.kaspresso.screens.KScreen
import io.github.kakaocup.kakao.image.KImageView
import io.github.kakaocup.kakao.recycler.KRecyclerView
import org.wikipedia.R
import org.wikipedia.feed.view.FeedView
import org.wikipedia.homeworks.homework07.CustomizeViewItem
import org.wikipedia.homeworks.homework07.DateHeaderViewItem
import org.wikipedia.homeworks.homework07.NewsViewItem
import org.wikipedia.homeworks.homework07.SearchCardViewItem
import org.wikipedia.homeworks.homework07.TopReadViewItem

object ExploreScreenNew : NamedKScreen<ExploreScreenNew>() {
    override val screenName = "Главный экран"
    override val layoutId = R.layout.fragment_feed
    override val viewClass = FeedView::class.java

    val toolbarTitle: KImageView = KImageView {
        withId(R.id.main_toolbar_wordmark)
    }.name(withParent("Заголовок"))

    val items = KRecyclerView(
        builder = {
            withId(R.id.feed_view)
        },
        itemTypeBuilder = {
            itemType(::SearchCardViewItem)
            itemType(::CustomizeViewItem)
            itemType(::DateHeaderViewItem)
            itemType(::NewsViewItem)
            itemType(::TopReadViewItem)

        }
    ).name(withParent("Список блоков"))

    fun topReadItem(index: Int, function: TopReadItem.() -> Unit) {
        items.invokeAtIndex(index, function)
    }

    fun topReadItem(): TopReadItem {
        return items.childWith<TopReadItem> {
            withDescendant {
                withText("Top read")
            }
        }.name(items.getName().withParent("Top read"))
    }


}