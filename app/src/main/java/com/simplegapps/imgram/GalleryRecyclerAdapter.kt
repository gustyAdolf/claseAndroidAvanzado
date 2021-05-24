package com.simplegapps.imgram

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.simplegapps.imgram.databinding.GalleryItemBinding

class GalleryRecyclerAdapter : RecyclerView.Adapter<GalleryViewHolder>() {

    private val imageList: List<Image> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GalleryViewHolder  =
        GalleryItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            .run {
                GalleryViewHolder(this)
            }


    override fun onBindViewHolder(holder: GalleryViewHolder, position: Int) {
        val image: Image = imageList[position]
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}

data class GalleryViewHolder(val binding: GalleryItemBinding) : RecyclerView.ViewHolder(binding.root) {

}