package com.werhes.museeks.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.Coil
import coil.request.ImageRequest
import com.werhes.museeks.R
import com.werhes.museeks.api.model.music.AudioPlaylist
import com.werhes.museeks.api.model.music.AudioTrack

class CatalogAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val items = mutableListOf<CatalogItem>()

    companion object {
        const val TYPE_HEADER = 0
        const val TYPE_PLAYLIST = 1
        const val TYPE_TRACK = 2
        const val TYPE_BANNER = 3
        const val TYPE_SEPARATOR = 4
        const val TYPE_PLACEHOLDER = 5
    }

    data class CatalogItem(
        val type: Int,
        val title: String? = null,
        val subtitle: String? = null,
        val imageUrl: String? = null,
        val track: AudioTrack? = null,
        val playlist: AudioPlaylist? = null
    )

    override fun getItemViewType(position: Int): Int = items[position].type

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            TYPE_HEADER -> HeaderViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.c3_header, parent, false)
            )
            TYPE_PLAYLIST -> PlaylistViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.list_item_playlist, parent, false)
            )
            TYPE_TRACK -> TrackViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.list_item_track, parent, false)
            )
            TYPE_BANNER -> BannerViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.c3_catalog_banner, parent, false)
            )
            TYPE_SEPARATOR -> SeparatorViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.c3_separator, parent, false)
            )
            else -> PlaceholderViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.c3_placeholder, parent, false)
            )
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = items[position]
        when (holder) {
            is HeaderViewHolder -> holder.bind(item)
            is PlaylistViewHolder -> holder.bind(item)
            is TrackViewHolder -> holder.bind(item)
            is BannerViewHolder -> holder.bind(item)
        }
    }

    override fun getItemCount(): Int = items.size

    fun submitList(newItems: List<CatalogItem>) {
        items.clear()
        items.addAll(newItems)
        notifyDataSetChanged()
    }

    class HeaderViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val title: TextView = view.findViewById(R.id.header_title)
        fun bind(item: CatalogItem) {
            title.text = item.title ?: ""
        }
    }

    class PlaylistViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val title: TextView = view.findViewById(R.id.playlist_title)
        private val subtitle: TextView = view.findViewById(R.id.playlist_author)
        private val cover: ImageView = view.findViewById(R.id.playlist_image)
        fun bind(item: CatalogItem) {
            title.text = item.playlist?.title ?: item.title ?: ""
            subtitle.text = item.playlist?.artistName ?: item.subtitle ?: ""
            val url = item.playlist?.photoUrl ?: item.imageUrl
            if (url != null) {
                val request = ImageRequest.Builder(itemView.context)
                    .data(url).target(cover).build()
                Coil.imageLoader(itemView.context).enqueue(request)
            }
        }
    }

    class TrackViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val title: TextView = view.findViewById(R.id.song_title)
        private val artist: TextView = view.findViewById(R.id.song_author)
        private val cover: ImageView = view.findViewById(R.id.song_album)
        fun bind(item: CatalogItem) {
            val track = item.track
            title.text = track?.title ?: item.title ?: ""
            artist.text = track?.artist ?: item.subtitle ?: ""
            val url = track?.getAlbumArtUrl() ?: item.imageUrl
            if (url != null) {
                val request = ImageRequest.Builder(itemView.context)
                    .data(url).target(cover).build()
                Coil.imageLoader(itemView.context).enqueue(request)
            }
        }
    }

    class BannerViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val image: ImageView = view.findViewById(R.id.banner_image)
        fun bind(item: CatalogItem) {
            val url = item.imageUrl
            if (url != null) {
                val request = ImageRequest.Builder(itemView.context)
                    .data(url).target(image).build()
                Coil.imageLoader(itemView.context).enqueue(request)
            }
        }
    }

    class SeparatorViewHolder(view: View) : RecyclerView.ViewHolder(view)
    class PlaceholderViewHolder(view: View) : RecyclerView.ViewHolder(view)
}