package com.werhes.museeks.ui.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import coil.Coil
import coil.request.ImageRequest
import com.werhes.museeks.MuseeksApplication
import com.werhes.museeks.R
import com.werhes.museeks.auth.VkAuthManager
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ProfileFragment : Fragment() {

    private lateinit var authManager: VkAuthManager
    private lateinit var avatar: ImageView
    private lateinit var nameText: TextView
    private lateinit var tracksCountText: TextView
    private lateinit var playlistsCountText: TextView
    private lateinit var friendsCountText: TextView
    private lateinit var loginBtn: Button
    private lateinit var logoutBtn: Button
    private lateinit var loginPrompt: View
    private lateinit var profileContent: View

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_profile, container, false)
        authManager = VkAuthManager(requireContext())

        avatar = view.findViewById(R.id.profile_avatar)
        nameText = view.findViewById(R.id.profile_name)
        tracksCountText = view.findViewById(R.id.profile_tracks_count)
        playlistsCountText = view.findViewById(R.id.profile_playlists_count)
        friendsCountText = view.findViewById(R.id.profile_friends_count)
        loginBtn = view.findViewById(R.id.profile_login)
        logoutBtn = view.findViewById(R.id.profile_logout)
        loginPrompt = view.findViewById(R.id.profile_login_prompt)
        profileContent = view.findViewById(R.id.profile_content)

        loginBtn.setOnClickListener {
            // TODO: Open phone auth dialog
        }

        logoutBtn.setOnClickListener {
            CoroutineScope(Dispatchers.IO).launch {
                authManager.logout()
                requireActivity().runOnUiThread { updateUI(false) }
            }
        }

        return view
    }

    override fun onResume() {
        super.onResume()
        CoroutineScope(Dispatchers.IO).launch {
            val loggedIn = authManager.isLoggedIn()
            requireActivity().runOnUiThread { updateUI(loggedIn) }
        }
    }

    private fun updateUI(loggedIn: Boolean) {
        if (loggedIn) {
            loginPrompt.visibility = View.GONE
            profileContent.visibility = View.VISIBLE
            loadProfile()
        } else {
            loginPrompt.visibility = View.VISIBLE
            profileContent.visibility = View.GONE
        }
    }

    private fun loadProfile() {
        val app = requireContext().applicationContext as MuseeksApplication
        CoroutineScope(Dispatchers.IO).launch {
            val userId = app.userPreferences.getUserId() ?: return@launch
            val result = app.apiClient.getProfile(userId)
            result.onSuccess { profiles ->
                val profile = profiles.firstOrNull() ?: return@onSuccess
                requireActivity().runOnUiThread {
                    nameText.text = profile.fullName
                    profile.photoUrl?.let { url ->
                        val request = ImageRequest.Builder(requireContext())
                            .data(url).target(avatar).build()
                        Coil.imageLoader(requireContext()).enqueue(request)
                    }
                }
            }
        }
    }
}