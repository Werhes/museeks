package com.werhes.museeks.ui.nextdock

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.werhes.museeks.R

class NextDockView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    private val items = mutableListOf<DockItem>()
    private var selectedIndex = 0
    private var itemClickListener: ((Int) -> Unit)? = null

    private val itemViews = mutableListOf<View>()

    init {
        orientation = HORIZONTAL
        layoutParams = LayoutParams(
            LayoutParams.MATCH_PARENT,
            context.resources.getDimensionPixelSize(R.dimen.dock_height)
        )
        setBackgroundResource(R.drawable.rounded_card_dock)
    }

    fun setItems(items: List<DockItem>) {
        this.items.clear()
        this.items.addAll(items)
        rebuild()
    }

    fun setOnItemClickListener(listener: (Int) -> Unit) {
        itemClickListener = listener
    }

    fun setSelected(position: Int) {
        if (position in items.indices) {
            selectedIndex = position
            updateAllItems()
        }
    }

    private fun rebuild() {
        removeAllViews()
        itemViews.clear()

        items.forEachIndexed { index, item ->
            val view = createDockItemView(item, index == selectedIndex)
            addView(view)
            itemViews.add(view)

            val layoutParams = view.layoutParams as LayoutParams
            layoutParams.weight = 1f
            view.layoutParams = layoutParams
        }
    }

    private fun createDockItemView(item: DockItem, isSelected: Boolean): FrameLayout {
        val view = LayoutInflater.from(context).inflate(R.layout.nav_dock_item, this, false) as FrameLayout
        val icon = view.findViewById<ImageView>(R.id.dock_icon)
        val label = view.findViewById<TextView>(R.id.dock_label)

        icon.setImageResource(item.iconRes)
        label.text = context.getString(item.labelRes)

        if (isSelected) {
            icon.setColorFilter(context.getColor(R.color.dock_icon_selected))
            label.setTextColor(context.getColor(R.color.dock_label_selected))
        } else {
            icon.setColorFilter(context.getColor(R.color.dock_icon_default))
            label.setTextColor(context.getColor(R.color.dock_label_default))
        }

        view.setOnClickListener {
            val idx = itemViews.indexOf(view)
            if (idx >= 0) {
                selectedIndex = idx
                updateAllItems()
                itemClickListener?.invoke(idx)
            }
        }

        return view
    }

    private fun updateAllItems() {
        itemViews.forEachIndexed { index, view ->
            val icon = view.findViewById<ImageView>(R.id.dock_icon)
            val label = view.findViewById<TextView>(R.id.dock_label)
            val isSelected = index == selectedIndex

            if (isSelected) {
                icon.setColorFilter(context.getColor(R.color.dock_icon_selected))
                label.setTextColor(context.getColor(R.color.dock_label_selected))
            } else {
                icon.setColorFilter(context.getColor(R.color.dock_icon_default))
                label.setTextColor(context.getColor(R.color.dock_label_default))
            }
        }
    }

    data class DockItem(
        val iconRes: Int,
        val labelRes: Int
    )

    companion object {
        val DEFAULT_ITEMS = listOf(
            DockItem(R.drawable.ic_headphones_outline_24, R.string.odin_tab_foryou),
            DockItem(R.drawable.ic_search_outline_28, R.string.search_hint_2),
            DockItem(R.drawable.ic_playlist_32, R.string.odin_tab_library),
            DockItem(R.drawable.ic_profile_28, R.string.menu_account)
        )
    }
}