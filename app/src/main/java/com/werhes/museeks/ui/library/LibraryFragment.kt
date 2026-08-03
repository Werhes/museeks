package com.werhes.museeks.ui.library

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.werhes.museeks.R
import com.werhes.museeks.ui.home.CatalogAdapter

class LibraryFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private val adapter = CatalogAdapter()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_library, container, false)
        recyclerView = view.findViewById(R.id.library_recycler)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = adapter
        return view
    }
}