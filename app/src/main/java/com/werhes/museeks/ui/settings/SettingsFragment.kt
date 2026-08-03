package com.werhes.museeks.ui.settings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.werhes.museeks.R

class SettingsFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private val adapter = SettingsAdapter()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_settings, container, false)
        recyclerView = view.findViewById(R.id.settings_recycler)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = adapter
        adapter.submitList(getSettingsItems())
        return view
    }

    private fun getSettingsItems(): List<SettingsItem> {
        return listOf(
            SettingsItem(SettingsItem.TYPE_PREFERENCE, R.string.settings_audio_quality, R.drawable.ic_equalizer_24),
            SettingsItem(SettingsItem.TYPE_PREFERENCE, R.string.settings_storage, R.drawable.ic_storage_outline_28),
            SettingsItem(SettingsItem.TYPE_SEPARATOR),
            SettingsItem(SettingsItem.TYPE_SWITCH, R.string.settings_notifications, R.drawable.ic_notification_bell_28),
            SettingsItem(SettingsItem.TYPE_SEPARATOR),
            SettingsItem(SettingsItem.TYPE_PREFERENCE, R.string.settings_theme, R.drawable.ic_palette_outline_28),
            SettingsItem(SettingsItem.TYPE_PREFERENCE, R.string.settings_language, R.drawable.ic_language_outline_28),
            SettingsItem(SettingsItem.TYPE_SEPARATOR),
            SettingsItem(SettingsItem.TYPE_PREFERENCE, R.string.settings_about, R.drawable.ic_info_outline_28),
            SettingsItem(SettingsItem.TYPE_PREFERENCE, R.string.settings_vkx_plus, R.drawable.ic_vkx_plus_28),
            SettingsItem(SettingsItem.TYPE_SEPARATOR),
            SettingsItem(SettingsItem.TYPE_PREFERENCE, R.string.settings_debug, R.drawable.ic_bug_outline_28)
        )
    }
}

data class SettingsItem(
    val type: Int,
    val titleRes: Int? = null,
    val iconRes: Int? = null
) {
    companion object {
        const val TYPE_PREFERENCE = 0
        const val TYPE_SWITCH = 1
        const val TYPE_SEPARATOR = 2
    }
}