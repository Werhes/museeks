package com.werhes.museeks.ui.settings

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.werhes.museeks.R

class SettingsAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val items = mutableListOf<SettingsItem>()

    override fun getItemViewType(position: Int): Int = items[position].type

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            SettingsItem.TYPE_PREFERENCE -> PreferenceViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.mdc_preference, parent, false)
            )
            SettingsItem.TYPE_SWITCH -> SwitchViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.mdc_switch, parent, false)
            )
            else -> SeparatorViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.c3_separator, parent, false)
            )
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = items[position]
        when (holder) {
            is PreferenceViewHolder -> holder.bind(item)
            is SwitchViewHolder -> holder.bind(item)
        }
    }

    override fun getItemCount(): Int = items.size

    fun submitList(newItems: List<SettingsItem>) {
        items.clear()
        items.addAll(newItems)
        notifyDataSetChanged()
    }

    class PreferenceViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val icon: ImageView = view.findViewById(R.id.preference_icon)
        private val title: TextView = view.findViewById(R.id.preference_title)
        fun bind(item: SettingsItem) {
            item.iconRes?.let { icon.setImageResource(it) }
            item.titleRes?.let { title.setText(it) }
        }
    }

    class SwitchViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val icon: ImageView = view.findViewById(R.id.switch_icon)
        private val title: TextView = view.findViewById(R.id.switch_title)
        fun bind(item: SettingsItem) {
            item.iconRes?.let { icon.setImageResource(it) }
            item.titleRes?.let { title.setText(it) }
        }
    }

    class SeparatorViewHolder(view: View) : RecyclerView.ViewHolder(view)
}