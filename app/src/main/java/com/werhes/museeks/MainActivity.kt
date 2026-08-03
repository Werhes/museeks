package com.werhes.museeks

import android.os.Bundle
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.werhes.museeks.ui.nextdock.NextDockView
import com.werhes.museeks.ui.home.HomeFragment
import com.werhes.museeks.ui.search.SearchFragment
import com.werhes.museeks.ui.library.LibraryFragment
import com.werhes.museeks.ui.profile.ProfileFragment

class MainActivity : AppCompatActivity() {

    private lateinit var dockView: NextDockView
    private lateinit var fragmentContainer: FrameLayout
    private val fragmentCache = mutableMapOf<String, Fragment>()

    private val fragmentTags = listOf("home", "search", "library", "profile")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app)

        fragmentContainer = findViewById(R.id.base_frag)
        dockView = findViewById(R.id.bottom_navigation)

        setupBottomNavigation()

        if (savedInstanceState == null) {
            navigateTo("home")
        }
    }

    private fun setupBottomNavigation() {
        dockView.setItems(NextDockView.DEFAULT_ITEMS)
        dockView.setOnItemClickListener { index ->
            if (index in fragmentTags.indices) {
                navigateTo(fragmentTags[index])
            }
        }
    }

    private fun navigateTo(tag: String) {
        val index = fragmentTags.indexOf(tag)
        if (index >= 0) dockView.setSelected(index)

        val fragment = getOrCreateFragment(tag) ?: return

        supportFragmentManager.beginTransaction()
            .replace(R.id.base_frag, fragment, tag)
            .commit()
    }

    private fun getOrCreateFragment(tag: String): Fragment? {
        val existing = supportFragmentManager.findFragmentByTag(tag)
        if (existing != null) return existing

        return fragmentCache.getOrPut(tag) {
            when (tag) {
                "home" -> HomeFragment()
                "search" -> SearchFragment()
                "library" -> LibraryFragment()
                "profile" -> ProfileFragment()
                else -> return null
            }
        }
    }
}